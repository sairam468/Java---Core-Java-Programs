package sai;

import java.io.*;
import java.util.Scanner;

public class Text_files {
	public static void main(String[] args) throws IOException {
		File file =new File("./sample.txt");
		if(!file.exists())
			file.createNewFile();
		System.out.println("Reading Data From Text Files: outputs:");
		System.out.println();
		//Reading Data From Text Files
		//1.)FileInputStream
		//2.)Scanner
		//3.)FileReader
		//4.)BufferedReader

		//1.)FileInputStream
		FileInputStream fis=new FileInputStream(file);
		int ass;
		String S=new String();
		while((ass = fis.read())!=-1) {
			S += String.valueOf((char)ass);
			System.out.print((char)ass); 
		}
		System.out.println();
		//System.out.println(S);
		System.out.println();


		//2.)Scanner
		//Scanner sc=new Scanner(fis);
		Scanner sc=new Scanner(file);
		while(sc.hasNext()) {
			System.out.print(sc.nextLine());
		}
		System.out.println();
		System.out.println();


		//3.)FileReader
		FileReader fr=new FileReader(file);
		String St=new String();
		while((ass = fr.read())!=-1) {
			St += String.valueOf((char)ass);
			System.out.print((char)ass); 
		}
		System.out.println();
		System.out.println();
		//System.out.println(St);


		//4.)BufferedReader
		FileReader fre=new FileReader(file);
		BufferedReader br =new BufferedReader(fre);
		//System.out.println(br.readLine());
		String line = new String();
		while((line = br.readLine())!=null) {
			System.out.print(line); 
		}
		System.out.println();

		br.close();
		fre.close();
		fr.close();
		sc.close();
		fis.close();


		//*********************************************************************************


		File filee =new File("./samplee.txt");
		if(filee.exists())
			filee.delete();
		filee.createNewFile();
		//Writing Data to Text Files
		//1.)FileOutputStream
		//2.)FileWriter
		//3.)BufferedWriter

		//1.)FileOutputStream
		FileOutputStream fos =new FileOutputStream(filee);
		String str="Ganta";
		for(char ch:str.toCharArray())
			fos.write(ch);


		//2.)FileWriter
		FileWriter fw=new FileWriter(filee);
		String str1="Lakshman naga";
		fw.write(str1);


		//3.)BufferedWriter
		FileWriter fww=new FileWriter(filee);
		BufferedWriter bw =new BufferedWriter(fww);
		String str2="Durga sairam";
		bw.write(str2);

		fw.close();
		fos.flush();
		fos.close();
		fww.close();
		//bw.flush();
		//bw.close();
	}
}