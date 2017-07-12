package com.rene;
import java.util.Scanner;

public class Main {
	public static void main( String[] args )
	{
		Scanner laps = new Scanner( System.in );
		Scanner laptotal = new Scanner( System.in );
		Scanner lapnotaverage = new Scanner( System.in );
		int x;
		double averageoriginal = 0;
		double averagemod1;
		double lapoutaverage;

		System.out.print( "how many laps to count : " );
		x = laptotal.nextInt();

		double[] laptimes = new double[x];
		double[] laptimemod = new double[x];

		System.out.print( "Give limit for laps out of average : " );
		lapoutaverage = lapnotaverage.nextDouble();

		for( int i = 0 ; i < laptimes.length ; i++ )
		{
			System.out.print( "Please enter Laptime " + (i + 1) + " : " );
			laptimes[ i ] = laps.nextDouble();
		}

		for( int i = 0 ; i < laptimes.length ; i++ )
		{
			averageoriginal = averageoriginal + laptimes[ i ];
		}

		averageoriginal = averageoriginal / x;
		System.out.println( "average : " + averageoriginal );
		averagemod1 = averageoriginal;

		for( int repeat = 0 ; repeat < 4 ; repeat++ )
		{

			for( int i = 0 ; i < laptimes.length ; i++ )
			{
				if( laptimes[ i ] - averageoriginal > lapoutaverage
						|| laptimes[ i ] - averageoriginal < -lapoutaverage )
				{
					laptimemod[ i ] = averagemod1;
					System.out.println( laptimemod[ i ] );

				}
				else
				{
					laptimemod[ i ] = laptimes[ i ];
					System.out.println( laptimemod[ i ] );
				}
			}

			averagemod1 = 0;
			for( int i = 0 ; i < laptimes.length ; i++ )
			{
				averagemod1 = (averagemod1 + laptimemod[ i ]);

			}
			averagemod1 = averagemod1 / x;
			System.out.println( " average laptime mod : " + averagemod1 );

		}
	}
}
