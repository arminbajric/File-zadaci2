package zadatak1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak1 {

	public static void ispisiNajboljeVrijeme(File fajl) throws FileNotFoundException
	{
		 Scanner unos;
		 String ime = null;
		 int vrijeme;
			unos=new Scanner(fajl);
			int min=Integer.MAX_VALUE;
		
			do
			{
				String temp=unos.nextLine();
				String[] niz=temp.split(" ");
				if(Integer.parseInt(niz[1])<min)
				{
					min=Integer.parseInt(niz[1]);
					ime=niz[0];
				}
				
			}while(unos.hasNextLine());
		
			
			
		
			System.out.println("Najbolje vrijeme:");
			System.out.println(ime+" : "+min);
			
	}
		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
			Scanner unos=new Scanner(System.in);
			System.out.println("Unesite ime fajla:");
			String file=unos.nextLine();
			File fajl=new File(file+".txt");
			ispisiNajboljeVrijeme(fajl);
		}

}
