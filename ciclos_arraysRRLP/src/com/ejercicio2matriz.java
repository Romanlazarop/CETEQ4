package com;

import java.util.Arrays;

public class ejercicio2matriz {
	public static void main(String[] args) 
	{
		String[][] matriz1= {{"7","9","x","5"},
	                         {"3","f","2","g"},
	                         {"t","s","ñ","c"},
	                         {"6","3","7","8"}
	                         };
		String[][] matriz2= {{"5","a","z","3"},
                             {"m","z","6","2"},
                             {"3","6","6","2"},
                             {"6","5","7","8"}
                             };
		int[][] matriz3=new int[4][4];
		
		String num="1234567890";
		
		for(int i=0; i<matriz1.length; i++) {
			for(int j=0; j<matriz2[i].length;j++)
			{
				if(num.indexOf(matriz1[i][j])>=0 &&num.indexOf(matriz2[i][j])>=0 ) {
					matriz3[i][j]=Integer.parseInt(matriz1[i][j])+Integer.parseInt(matriz2[i][j]);
				}
				else {
					matriz3[i][j]=0;
				}
			}
		
		}
		System.out.println(Arrays.deepToString(matriz3));
	}

}
