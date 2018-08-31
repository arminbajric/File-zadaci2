package zadatak7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Zadatak7 {
public static void ispisiSortiranaImena(File fajl) throws FileNotFoundException
{
	Scanner unos=new Scanner(fajl);
	ArrayList imena=new ArrayList();
	do
	{
		imena.add(unos.nextLine());
		
	}while(unos.hasNextLine());
	Collections.sort(imena);
	System.out.println("Sortirana imena:");
	for(int i=0;i<imena.size();i++)
	{
		System.out.println(imena.get(i));
	}
	}
	public static void main(String[] args) throws FileNotFoundException {
		Scanner unos=new Scanner(System.in);
		System.out.println("Unesite ime fajla:");
		String file=unos.nextLine();
		File fajl=new File(file+".txt");
		ispisiSortiranaImena(fajl);
	}

}
