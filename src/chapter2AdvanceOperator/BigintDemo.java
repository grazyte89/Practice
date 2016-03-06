package chapter2AdvanceOperator;

import java.math.BigInteger;

public class BigintDemo
{

	public static void main(String[] args)
	{
		BigInteger num = new BigInteger("2");
		BigInteger value = num.pow(2);
		for(int i =0; i < 100; i++)
		{
			value = value.pow(2);
		}
		System.out.println(value);
	}
}
