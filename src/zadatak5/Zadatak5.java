package zadatak5;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class Zadatak5 {

	public static void kreirajListuNajboljih(File fajl) throws IOException
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
			File novi=new File("najboljiMaratonci.txt");
			novi.createNewFile();
		PrintWriter writer=new PrintWriter(new FileWriter(novi));
			
			for(i=0;i<rezultati.length;i++)
			{
				Scanner input=new Scanner(fajl);
				boolean found=false;
				do
				{
				
				String temp=input.nextLine();
				String[] niz=temp.split(" ");
				if(rezultati[i]<300)
				{
				if(Integer.parseInt(niz[1])==rezultati[i])
				{
					System.out.println((i+1)+"."+niz[0]+" : "+niz[1]);
					writer.write(niz[0]+" "+niz[1]);
					writer.println();
					found=true;
				}
				}
				else
				{
					break;
				}
				}while(found==false);
				
			}
			writer.close();
	}
		public static void main(String[] args) throws IOException {
			// TODO Auto-generated method stub
			Scanner unos=new Scanner(System.in);
			System.out.println("Unesite ime fajla:");
			String file=unos.nextLine();
			File fajl=new File(file+".txt");
			kreirajListuNajboljih(fajl);
		}

}
