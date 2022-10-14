package Run;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import Dao.DemoDao;
import Hibernet.Demo;

public class Car_Start {
	String Owner_name,Brand_name,Model_name,price;
	 int ch,choice;
	 Demo ob = new Demo();
	 DemoDao dao= new DemoDao();
	 Method_Class ms= new Method_Class();
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	 
	public static void main(String[] args)
	{
		Car_Start ss = new Car_Start();
		ss.call();
	}
	
	
    public void call()
    {
    	
    		
    	 	while(true) {
        	try {
                System.out.println("==== CAR DETAILS FORM ====");
                System.out.println("PRESS 1. Add car a Details ");
                System.out.println("PRESS 2. Search a Car details");
                System.out.println("PRESS 3. See All the car Details");
                System.out.println("PRESS 4. Update a Car Information");
                System.out.println("PRESS 5. Delete a Car details1");
                System.out.println("PRESS 6. Exit");
                System.out.print("Enter your choice : ");
                choice = Integer.valueOf(input.readLine());
                switch(choice) {
        	        case 1:
        	        {
        	        	ms.addStudent();
        	        	break;
        	        }
        	        case 2:
        	        {
        	        	
        	        	System.out.print("Enter the Reg_no : ");
        	        	long id = Long.valueOf(input.readLine());
        	        	System.out.println(dao.search_demo(id));
        	        	break;
        	        }
        	        case 3:
        	        {
        	        	List<Demo> l1 = dao.showAll_demo();
        	        	System.out.println("Reg_No. \tOwner_ Name \tBrand_name \tModel_Name  \tPrice \n");
        				l1.forEach(ob5 -> System.out.println(ob5.getReg_No() +"\t\t"+ ob5.getOwner_Name()+"\t\t "+ ob5.getBrand_Name()+"\t\t "
        				+ ob5.getModel_Name()+"\t\t "+ ob5.getPrice()));
				System.out.println("**=============**=================**=============**=============**=================**=============**");
        			
        			
        	        	break;
        	        }
        	        case 4:
        	        {
        	        	ms.update();
        	        }
        	       break; 
        	        case 5:
        	        {
        	        	System.out.print("Enter the Reg no : ");
        	        	long id = Long.valueOf(input.readLine());
        	        	System.out.println("Deleting the Car details.......");
        	        	dao.delete_demo(id);
        	        	System.out.println("car detail deleted successfully!");
        	        	break;
        	        }
        	        case 6:
        	        	System.exit(0);
                }
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
        }
    }
}
