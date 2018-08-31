package zadatak4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak4 {

	public static void ispisiProsjecnoVrijeme(File fajl) throws FileNotFoundException
	{
		 Scanner unos;
			unos=new Scanner(fajl);
			int[] rezultati=new int[50];
			int suma=0,i=0;
			double prosjek;
			do
			{
				String temp=unos.nextLine();
				String[] niz=temp.split(" ");
				suma+=Integer.parseInt(niz[1]);
				i++;
			}while(unos.hasNextLine());
			prosjek=suma/(double)i;
			
			System.out.println("Prosjecno vrijeme svih takmicara je: "+prosjek);
				
			}
	
		public static void main(String[] args) throws FileNotFoundException {
			// TODO Auto-generated method stub
			Scanner unos=new Scanner(System.in);
			System.out.println("Unesite ime fajla:");
			String file=unos.nextLine();
			File fajl=new File(file+".txt");
			ispisiProsjecnoVrijeme(fajl);
		}

}
