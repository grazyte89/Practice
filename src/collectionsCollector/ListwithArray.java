package collectionsCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListwithArray {

	private List<Student[]> list = new ArrayList<Student[]>();
	private Random random = new Random();
	
	public ListwithArray()
	{
		this.makeData(10);
	}
	
	private void makeData(int numberIteration)
	{
		for(int index = 0; index < numberIteration; index++)
		{
			Student[] students = new Student[3];
			students[0] = new Student(this.generateWord(10), random.nextInt(50));
			students[1] = new Student(this.generateWord(10), random.nextInt(50));
			students[2] = new Student(this.generateWord(10), random.nextInt(50));
			list.add(students);
		}
	}
	
	public void display()
	{
		for(int index = 0; index < list.size(); index++)
		{
			Student[] stu = list.get(index);
			for(Student st : stu)
			{
				System.out.print(st + " ");
			}
			System.out.println(" ");
		}
	}
	
	private String generateWord(int number)
	{
		char[] charaters = new char[number];
		for(int index = 0; index < charaters.length; index++)
		{
			int randonPoint = random.nextInt(26);
			char letter = 'a';
			for(int numberUntil = 0; numberUntil < randonPoint; numberUntil++)
			{
				if(numberUntil != randonPoint)
				{
					letter++;
					continue;
				}
				break;
			}
			charaters[index] = letter;
		}
		String word = String.valueOf(charaters);
		return word;
	}
	
	public class Student {
		
		private String name;
		private int ID;
		
		public Student(String name, int ID)
		{
			this.name = name;
			this.ID = ID;
		}
		
		public String getName()
		{
			return name;
		}

		public void setName(String name)
		{
			this.name = name;
		}

		public int getID()
		{
			return ID;
		}

		public void setID(int iD)
		{
			ID = iD;
		}	
		
		public String toString()
		{
			return this.name + " " + this.ID;
		}
	}
	
	public static void main(String[] args)
	{
		ListwithArray array = new ListwithArray();
		String word = array.generateWord(10);
		array.display();
		System.out.println(word);
	}
}
