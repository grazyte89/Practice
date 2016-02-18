package classChapter5;

public class StatisyDemo {

	public static void main(String[] args) {
		
		Statisy vae1 = new Statisy("on", 12);
		Statisy vae2 = new Statisy("on", 10000000);
		
		if(vae1.equals(vae2) == false)
		{
			if(vae1.lessvalue(vae2))
			{
				boolean temp = true;
				while(temp)
				{
					int ti = vae1.getvalue();
					vae1.setvalue(ti + 1000);
					System.out.println(Statisy.count = Statisy.count + 1);
					//System.out.println(ti);
					if(vae1.morethan(vae2))
					{
						System.out.println("end");
						break;
					}
				}
			}
		}
		
		vae2.loling();

	}

}
