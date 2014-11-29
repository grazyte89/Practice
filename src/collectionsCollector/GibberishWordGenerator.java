package collectionsCollector;

import java.util.Random;

public class GibberishWordGenerator {
	
	public static char[] randomWordGenerator()
	{
		int letterLength = 0;
		char[] wordValue = new char[7];
		while(letterLength < 7)
		{
			wordValue[letterLength] = returnLetter(generateNumberValues(26));
			letterLength++;
		}
		return wordValue;
	}
	
	private static int generateNumberValues(int setLimit)
	{
		Random random = new Random();
		int numberValue = random.nextInt(setLimit) + 1;
		return numberValue;
	}

	private static char returnLetter(int NumberOrderofLetter)
	{
		char tempLetter = 'a';
		switch (NumberOrderofLetter) {
		case 1:
			tempLetter = 'a';
			break;
		case 2:
			tempLetter = 'b';
			break;
		case 3:
			tempLetter = 'c';
			break;
		case 4:
			tempLetter = 'd';
			break;
		case 5:
			tempLetter = 'e';
			break;
		case 6:
			tempLetter = 'f';
			break;
		case 7:
			tempLetter = 'g';
			break;
		case 8:
			tempLetter = 'h';
			break;
		case 9:
			tempLetter = 'i';
			break;
		case 10:
			tempLetter = 'j';
			break;
		case 11:
			tempLetter = 'k';
			break;
		case 12:
			tempLetter = 'l';
			break;
		case 13:
			tempLetter = 'm';
			break;
		case 14:
			tempLetter = 'n';
			break;
		case 15:
			tempLetter = 'o';
			break;
		case 16:
			tempLetter = 'p';
			break;
		case 17:
			tempLetter = 'q';
			break;
		case 18:
			tempLetter = 'r';
			break;
		case 19:
			tempLetter = 's';
			break;
		case 20:
			tempLetter = 't';
			break;
		case 21:
			tempLetter = 'u';
			break;
		case 22:
			tempLetter = 'v';
			break;
		case 23:
			tempLetter = 'w';
			break;
		case 24:
			tempLetter = 'x';
			break;
		case 25:
			tempLetter = 'y';
			break;
		case 26:
			tempLetter = 'z';
			break;
		default:
			System.out.println("Error");
			break;
		}
		return tempLetter;
	}
}
