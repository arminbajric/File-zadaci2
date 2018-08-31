package zadatak2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak2 {
public static void ispisiPoNajboljemVremenu(File fajl) throws FileNotFoundException
{
	 Scanner unos;
		unos=new Scanner(fajl);
		int[] rezultati=new int[50];
		int i=0;
		do
		{
			String temp=unos.nextLine();
			String[] niz=temp.split(" ");
			rezultati[i]=Integer.parseInt(niz[1]);
			i++;
		}while(unos.hasNextLine());
		rezultati=Arrays.copyOfRange(rezultati, 0, i);
		
		Arrays.sort(rezultati);
	
		System.out.println("Poredak:");
		for(i=0;i<rezultati.length;i++)
		{
			Scanner input=new Scanner(fajl);
			boolean found=false;
			do
			{
			
			String temp=input.nextLine();
			String[] niz=temp.split(" ");
			if(Integer.parseInt(niz[1])==rezultati[i])
			{
				System.out.println((i+1)+"."+niz[0]+" : "+niz[1]);
				found=true;
			}
			}while(found==false);
			
		}
}
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
		ispisiPoNajboljemVremenu(fajl);
	}

}
