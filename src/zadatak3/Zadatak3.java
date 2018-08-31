package zadatak3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Zadatak3 {
public static void pronadjiVrijeme(File fajl,String ime) throws FileNotFoundException
{
	Scanner unos=new Scanner(fajl);
	boolean found=false;
	int vrijeme = 0;
	do
	{
		
		String temp=unos.nextLine();
		String [] niz=temp.split(" ");
		if(niz[0].equals(ime))
		{
			vrijeme=Integer.parseInt(niz[1]);
			found=true;
		}
	}while(unos.hasNextLine()&&found==false);
	if(found==false)
	{
		System.out.println("Ne postoji uneseni uèesnik!");
	}
	else
	{
	System.out.println("Ostvareno vrijeme "+vrijeme);
	}
	unos.close();
}
	public static void main(String[] args) throws FileNotFoundException {
	Scanner unos=new Scanner(System.in);
		File fajl=new File("maraton.txt");
		System.out.println("Unesite ime uèesnika za pretragu:");
		String ime=unos.nextLine();
		pronadjiVrijeme(fajl,ime);
	}

}
