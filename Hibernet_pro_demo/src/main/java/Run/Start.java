package Run;

import javax.transaction.SystemException;

import net.prem.dao.DemoDao;
import net.prem.hibernet.Demo;

public class Start {
	public static void main(String[] args) throws IllegalStateException, SystemException {
		Demo ob = new Demo("Third","Third","Third@gmail.com");
		Demo ob3 = new Demo("Forth","Forth","Forth@gmail.com");
		
		DemoDao obj = new DemoDao();
		obj.save_demo(ob3);
		obj.save_demo(ob);
		//obj.search_demo(1);
				//ob.setUser_name("Prem");
				//obj.update_demo(ob);
				
				//Demo ob1 = obj.search_demo(ob.getId());
				//List<Demo> l1 = obj.showAll_demo();
				
				//l1.forEach(ob2 -> System.out.println(ob2.getId()));
				//obj.delete_demo(ob.getId());
	
}
}
