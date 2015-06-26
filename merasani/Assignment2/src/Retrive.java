
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Retrive {
	public static void main(String[] args) throws Exception {
	

		String fname="d://git/Sorted1.csv";
		System.out.println("enter the value of id");

		Scanner input = new Scanner(System.in);
		String id = input.nextLine();
		//System.out.println(id);
		String thisLine = null;

		BufferedReader bufferedReader = new BufferedReader(new FileReader(fname));


		while ((thisLine = bufferedReader.readLine()) != null) 
		{
			//System.out.println(thisLine);
			String strar[] = thisLine.split(",");
			//System.out.println(strar[1]);
			if(id.equalsIgnoreCase(strar[0]))
			{
				System.out.println("Found row :"+thisLine);
			}
		}
		bufferedReader.close();
		FileWriter pw = new FileWriter("d://git/sorted1.csv",true);
		 //String fname="c:/Users/merasani/desktop/sorted.csv";
		 //  System.out.print("enter yes");
	      // Scanner input = new Scanner(System.in);
	      // String record=input.nextLine();
	  
	       System.out.println("do u want to add a recordp press yes r no");
	       String add=input.nextLine();
	       if(add=="no")
	       { 
	    	   System.out.println("u cant append the record ");
	       }
	       else
	       {
	    	   System.out.println("u can append the record ");
	    	       
	           System.out.println("enter id ");
	    	   String id2=input.nextLine();
	    	   System.out.println("enter firstname ");
	    	   String Firstname=input.nextLine();
	    	   System.out.println("enter lastanme");
	    	   String lastname=input.nextLine();
	     	   System.out.println("enter age");
	     	  String age=input.nextLine();
	    	   System.out.println("email");
	    	   String email=input.nextLine();
	    	   System.out.println("ipaddress ");
	    	   String ipaddress=input.nextLine();
	    	   System.out.println("country ");
	    	   String country=input.nextLine();
	    	   System.out.println("order ");
	    	   String order=input.nextLine();
	    	   System.out.println("color ");
	    	   String color=input.nextLine();
	    	   System.out.println("your record is appended in csv file ");
	    	   
	    	   pw.write(id2);
	    	   pw.write(",");
	    	   pw.write(Firstname);
	    	   pw.write(",");
	    	   pw.write(lastname);
	    	  pw.write(",");
	    	   pw.write(age);
	    	   pw.write(",");
	    	   pw.write(email);
	    	   pw.write(",");
	    	   pw.write(ipaddress);
	    	   pw.write(",");
	    	   pw.write(country);
	    	   pw.write(",");
	    	   pw.write(order);
	    	   pw.write(",");
	    	   pw.write(color);
	    	   pw.flush();
	    	   
	    	  input.close(); 
	    	   
	 
	pw.close();}
	}
		
			
		
		
}

