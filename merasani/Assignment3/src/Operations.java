//import java.io.*;
//import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.File;
//addimport
//import java.io.FileWriter;
public class Operations { 	
	



	public static void main(String args[]) throws Exception,FileNotFoundException,IOException{
		System.out.println("to retrive the record:show ");
		System.out.println("to add the record:add ");
		System.out.println("to delete the record :del ");
		
		System.out.println("enter the choice");
Operations o=new Operations();
		Scanner choice=new Scanner(System.in);
		String descion=choice.nextLine();


		File infile=new File("D:/sorted1.csv");


		//String [][]  array= new String[102][10];
		switch (descion)
		{
			case "show":	
			String fname="d://git/MOCK_DATA.csv";
			//System.out.println("enter the value of id");
		//	String id = choice.nextLine();
			//System.out.println(id);
			String thisLine = null;

			BufferedReader bufferedReader = new BufferedReader(new FileReader(fname));
			  System.out.println("Enter ID to show record  that record from CSV File type word byid");
			   System.out.println("if u want show entire csvfile totalrecord");
			String showrow=choice.nextLine();
			switch (showrow)
			{
			case "byid":
				System.out.println("enter the value of id");
				String id = choice.nextLine();
			
		while ((thisLine = bufferedReader.readLine()) != null) 
			{
				
				String strar[] = thisLine.split(",");

				
				if(id.equalsIgnoreCase(strar[0]))
				{
					System.out.println("Found row :"+thisLine);
				}
			}
				break;
			case "totalrecord":
				while ((thisLine = bufferedReader.readLine()) != null) 
				{
					
					String mock[] = thisLine.split(",");
					System.out.println("mock[id = " + mock[0] 
                            + " ,first name=" + mock[1] + ",lastname="+mock[2]+",age="+ mock[3] + ",email="+ mock[4] + ",country=" + mock[5] +",ipaddress=" + mock[6] +",order=" + mock[7] +",colour=" + mock[8] + "]" );
		
				}
			}
			break;
			case "add":
				   System.out.println("Enter ID to add  that record from CSV File");
				   System.out.println("if u want to add the row below type word below");
					System.out.println("if u want to add the row above type word above");
					System.out.println("if u want to add on that particular position type position");
					String addrow= choice.nextLine();
					switch (addrow)
					{
					case "above":
						System.out.println("Enter the id no above which you want to enter the record");
						String id3=choice.nextLine();
						System.out.println("enter id ");
						String id4=choice.nextLine();
						System.out.println("enter firstname ");
						String Firstname=choice.nextLine();
						System.out.println("enter lastanme");
						
						String lastname=choice.nextLine();
						System.out.println("enter age");
						String age=choice.nextLine();
						System.out.println("email");
						String email=choice.nextLine();
						System.out.println("ipaddress ");
						String ipaddress=choice.nextLine();
						System.out.println("country ");
						String country=choice.nextLine();
						System.out.println("order ");
						String order=choice.nextLine();
						System.out.println("color ");
						String color=choice.nextLine();
						try 
						{
						o.addingAbove(infile, id3, id4,Firstname,lastname,age,email,country,ipaddress,order,color);
					    }
						
						catch (Exception e) 
						{
						   e.printStackTrace();
					    }

						break;
						
					case "below":
						System.out.println("Enter the id no below which you want to enter the record");
						String id7=choice.nextLine();
						System.out.println("enter id ");
						String id5=choice.nextLine();
						System.out.println("enter firstname ");
						String Firstname1=choice.nextLine();
						System.out.println("enter lastanme");
						
						String lastname1=choice.nextLine();
						System.out.println("enter age");
						String age1=choice.nextLine();
						System.out.println("email");
						String email1=choice.nextLine();
						System.out.println("ipaddress ");
						String ipaddress1=choice.nextLine();
						System.out.println("country ");
						String country1=choice.nextLine();
						System.out.println("order ");
						String order1=choice.nextLine();
						System.out.println("color ");
						String color1=choice.nextLine();
					try 
						{
						o.addingBelow(infile, id7, id5,Firstname1,lastname1,age1,email1,country1,ipaddress1,order1,color1);
					    }
							
						catch (Exception e) 
						{
						   e.printStackTrace();
					    }
						break;
					case "position":
						System.out.println("Enter the line no at which you want to enter the record");
						int lineno;
						String lineno1;
						lineno1=choice.nextLine();
						lineno=Integer.parseInt(lineno1);
						lineno++;
						System.out.println("enter id ");
						String id6=choice.nextLine();
						System.out.println("enter firstname ");
						String Firstname2=choice.nextLine();
						System.out.println("enter lastanme");
						
						String lastname2=choice.nextLine();
						System.out.println("enter age");
						String age2=choice.nextLine();
						System.out.println("email");
						String email2=choice.nextLine();
						System.out.println("ipaddress ");
						String ipaddress2=choice.nextLine();
						System.out.println("country ");
						String country2=choice.nextLine();
						System.out.println("order ");
						String order2=choice.nextLine();
						System.out.println("color ");
						String color2=choice.nextLine();
						try 
						{
						o.addingLineno(infile, lineno, id6,Firstname2,lastname2,age2,email2,country2,ipaddress2,order2,color2);
					    }
							
						catch (Exception e) 
						{
						   e.printStackTrace();
					    }
						
						break;
			
		case "del":
	   System.out.println("Enter ID to remove that record from CSV File");
 		String id10 = choice.nextLine();
 		//File infile=new File("d:/general/MOCK_DATA.csv");
 		File tempFile = new File(infile + "temp.csv");
 		BufferedReader br= new BufferedReader (new FileReader(infile));
 		PrintWriter Pwr = new PrintWriter(new FileWriter (tempFile));
 		String line = null;

 		//read from original, write to temporary and trim space, while Id not found
 		while((line = br.readLine()) !=null) 
 		{
 			if(line.trim().startsWith(id10))
 			{
 				continue;   
 			}
 			else
 			{
 				Pwr.println(line);
 				Pwr.flush();
 			}
 		}
 		
 		br.close();
 		Pwr.close();
 		//.close();

 		infile.delete();

 		
 		if(tempFile.renameTo(infile))
 		{
        System.out.println("Update succesful");
 		}
 		else
 		{
        System.out.println("Update failed");
 		}

		break;
					}}}
	public void addingAbove(File inFile, String idno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
		       throws Exception {
		 
			 // temp file
		     File outFile = new File("$$$$$$$$.tmp");
		
		     // input
		     FileInputStream fis  = new FileInputStream(inFile);
		     BufferedReader in = new BufferedReader
		         (new InputStreamReader(fis));
		 
		     // output        
		     FileOutputStream fos = new FileOutputStream(outFile);
		     PrintWriter out = new PrintWriter(fos);
		 
		     String thisLine = "";
		     //int i =1;
		     while ((thisLine = in.readLine()) != null) {
		    	 String strar[] = thisLine.split(",");
		    	 if(idno.equalsIgnoreCase(strar[0])) 
		    	  
		    	 {
		    		out.print(id);
		    	   out.print(",");
		    	   out.print(firstname);
		    	   out.print(",");
		    	   out.print(lastname);
		    	   out.print(",");
		    	   out.print(age);
		    	   out.print(",");
		    	   out.print(email);
		    	   out.print(",");
		    	   out.print(country);
		    	   out.print(",");
		    	   out.print(ipaddress);
		    	   out.print(",");
		    	   out.print(order);
		    	   out.print(",");
		    	   out.print(color);
		    	   out.println(",");
		    	  
		    	   }
		    	
		       out.println(thisLine);
		    	
		       //i++;
		       }
		    out.flush();
		    out.close();
		    in.close();
		     
		    inFile.delete();
		    outFile.renameTo(inFile);
		  }
	public void addingLineno(File inFile, int lineno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
		       throws Exception {
		 
			 // temp file
		     File outFile = new File("$$$$$$$$.tmp");
		
		     // input
		     FileInputStream fis  = new FileInputStream(inFile);
		     BufferedReader in = new BufferedReader
		         (new InputStreamReader(fis));
		 
		     // output        
		     FileOutputStream fos = new FileOutputStream(outFile);
		     PrintWriter out = new PrintWriter(fos);
		 
		     String thisLine = "";
		     int i =1;
		     while ((thisLine = in.readLine()) != null) {
		       if(i == lineno) 
		    	   {
		    	   out.print(id);
		    	   out.print(",");
		    	   out.print(firstname);
		    	   out.print(",");
		    	   out.print(lastname);
		    	   out.print(",");
		    	   out.print(age);
		    	   out.print(",");
		    	   out.print(email);
		    	   out.print(",");
		    	   out.print(country);
		    	   out.print(",");
		    	   out.print(ipaddress);
		    	   out.print(",");
		    	   out.print(order);
		    	   out.print(",");
		    	   out.print(color);
		    	   out.println(",");
		    	   
		    	   }
		       
		       out.println(thisLine);
		       i++;
		       }
		    out.flush();
		    out.close();
		    in.close();
		     
		    inFile.delete();
		    outFile.renameTo(inFile);
		  }
	public void addingBelow(File inFile, String idno, String id,String firstname,String lastname,String age,String email,String country,String ipaddress,String order,String color)
		       throws Exception {
		 
			 // temp file
		     File outFile = new File("$$$$$$$$.tmp");
		
		     // input
		     FileInputStream fis  = new FileInputStream(inFile);
		     BufferedReader in = new BufferedReader
		         (new InputStreamReader(fis));
		 
		     // output        
		     FileOutputStream fos = new FileOutputStream(outFile);
		     PrintWriter out = new PrintWriter(fos);
		 
		     String thisLine = "";
		     //int i =1;
		     while ((thisLine = in.readLine()) != null) {
		    	 String strar[] = thisLine.split(",");
		    	 if(idno.equalsIgnoreCase(strar[0])) 
		    	   {
		       	   out.println(thisLine);
		    	   out.print(id);
		    	   out.print(",");
		    	   out.print(firstname);
		    	   out.print(",");
		    	   out.print(lastname);
		    	   out.print(",");
		    	   out.print(age);
		    	   out.print(",");
		    	   out.print(email);
		    	   out.print(",");
		    	   out.print(country);
		    	   out.print(",");
		    	   out.print(ipaddress);
		    	   out.print(",");
		    	   out.print(order);
		    	   out.print(",");
		    	   out.print(color);
		    	   out.println(",");
		    	   
		    	   }
		    	 else
		    	 {
		       out.println(thisLine);
		    	 }
		       //i++;
		       }
		    out.flush();
		    out.close();
		    in.close();
		     
		    inFile.delete();
		    outFile.renameTo(inFile);
		  }


}


	