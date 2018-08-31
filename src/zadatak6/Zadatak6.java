package zadatak6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Zadatak6 {
public static void izbrojiLinije(URL fajl) throws IOException
{
	Scanner unos;
	unos=new Scanner(fajl.openStream());
	int[] rezultati=new int[50];
	int i=0;
	do
	{
		String temp=unos.nextLine();
		String[] niz=temp.split(" ");
	
		i++;
	}while(unos.hasNextLine());
	System.out.println("Fajl ima "+i+" linija.");
}
	public static void main(String[] args) throws IOException {
		URL fajl = new URL("http://www.textfiles.com/science/astronau.txt\r\n" );
		Scanner s = new Scanner(fajl.openStream());
		izbrojiLinije(fajl);

	}

}
