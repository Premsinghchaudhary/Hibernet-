package Run;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import Dao.DemoDao;
import Hibernet.Demo;

public class Method_Class {
	 String Owner_name,Brand_name,Model_name,price;
	 BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	 Demo ob = new Demo();
	 DemoDao dao = new DemoDao();
	 
	 
	public void addStudent() throws Exception
	{
			System.out.print("Enter the Owner Name : ");
		   	Owner_name = input.readLine().trim();
		   	System.out.print("Enter the Brand Name : ");
		   	Brand_name = input.readLine().trim();
		   	System.out.print("Enter the Model Name : ");
		   	Model_name = input.readLine().trim();
		   	System.out.print("Enter the Price of Car : ");
		   	price = input.readLine().trim();
		   	ob = new Demo( null, Owner_name, Brand_name,Model_name,price);
		   	System.out.println("Adding the user.........");
		   	dao.save_demo(ob);
		   	System.out.println("car detail added successfully!");
   	
	}
	
	public void update() throws Exception
	{
    	  System.out.println("PRESS 1. Update Owner Name of car ");
          System.out.println("PRESS 2.Update Brand Name of car");
          System.out.println("PRESS 3. Update Model Name of car");
          System.out.println("PRESS 4. Update Price of car");
          System.out.println("PRESS 5. exit");
          System.out.print("Enter your choice  : ");
         int ch = Integer.valueOf(input.readLine());        
         
         switch(ch) 
         {
	        case 1:
	        {
					  	System.out.print("Enter the Reg_No : ");
					  	long id = Long.valueOf(input.readLine());
					  	
					    ob = dao.search_demo(id);
					    System.out.println("Reg_no \tOwner_ Name \tBrand_name \tModel_name\tprice \n");
					    
					  	if(ob == null)
					  	{
					  		System.out.println("Sorry! The car detail does not exit.");
					  		break;
					  	}
					  	System.out.print("Enter the Owner Name : ");
					  	String Owner_name = input.readLine().trim();
						        
					  	if(Owner_name != "")
					  	{
					  	 ob.setOwner_Name(Owner_name);
					  	 System.out.println("\nUpdating the user.........");
					   	 dao.update_demo(ob);
					   	 System.out.println("User updated successfully!");
				}
	        
	        }
	        break;
	        
	        	        case 2:
	        {
			      	System.out.print("Enter the Reg no: ");
			      	long id = Long.valueOf(input.readLine());
			      	
			      	ob = dao.search_demo(id);
			      	if(ob == null) {
			      		System.out.println("Sorry! The car detail does not exit.");
			      		break;
			      	}
				  	System.out.print("Enter the Brand name : ");
				  	String Brand_name = input.readLine().trim();
				  	if(Brand_name != "")
				  	{
				  		ob.setBrand_Name(Brand_name);
					 	System.out.println("\nUpdating the Brand name.........");
					  	dao.update_demo(ob);
					  	System.out.println("Brand name updated successfully!");
				  	}
				  	
		}
	    break;
	    
	    case 3:
	    {

	    	System.out.print("Enter the Reg no: ");
	      	long id = Long.valueOf(input.readLine());
	      	
	      	ob = dao.search_demo(id);
	      	if(ob == null) {
	      		System.out.println("Sorry! The car detail does not exit.");
	      		break;
	      	}
		  	System.out.print("Enter the Model name : ");
		  	String Model_name = input.readLine().trim();
		  	if(Model_name != "")
		  	{
		  		ob.setModel_Name(Model_name);
			 	System.out.println("\nUpdating the Model name.........");
			  	dao.update_demo(ob);
			  	System.out.println("Model name updated successfully!");
		  	}
	    }
	    break;
	    
	    case 4:
	    {

	    	System.out.print("Enter the Reg no: ");
	      	long id = Long.valueOf(input.readLine());
	      	
	      	ob = dao.search_demo(id);
	      	if(ob == null) {
	      		System.out.println("Sorry! The car detail does not exit.");
	      		break;
	      	}
		  	System.out.print("Enter the Price of car: ");
		  	String price = input.readLine().trim();
		  	if(price != "")
		  	{
		  		ob.setPrice(price);
			 	System.out.println("\nUpdating the price.........");
			  	dao.update_demo(ob);
			  	System.out.println("price updated successfully!");
		  	}  	    }	       
	  break;
	  
	  case 5:
	  {
		  System.exit(0);
	  }
	  break;
     }
}}
