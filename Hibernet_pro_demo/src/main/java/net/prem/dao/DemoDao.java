package net.prem.dao;

import java.util.List;


import org.hibernate.Session;


import net.prem.hibernet.Demo;
import net.prem.session.Session_Factory;

public class DemoDao {
	public void save_demo(Demo ob ) 
	{
		org.hibernate.Transaction t =null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t=s.beginTransaction();
			s.save(ob);
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
		
		
	}
	
	public void update_demo(Demo ob ) 
	{
		org.hibernate.Transaction t =null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			s.update(ob);
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
	}
	
	public Demo search_demo(long id) 
	{
		org.hibernate.Transaction t =null;
		Demo d = null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			d = s.get(Demo.class,id);
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
		return d;
	}
	@SuppressWarnings({ "unchecked", "unused" })
	public List<Demo> showAll_demo() 
	{
		
		org.hibernate.Transaction t =null;
		List<Demo> l = null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			l = s.createQuery("from Demo").list();
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
		return l;
	}
	
	public  void delete_demo(Long id) 
	{
		
		org.hibernate.Transaction t =null;
		Demo d = null;
		try(Session s = Session_Factory.getSessionFactory().openSession())
		{
			t = s.beginTransaction();
			d = s.get(Demo.class, id);
			t.commit();
		}
		catch(Exception e )
		{
			if(t != null)
			{
				t.rollback();
			}
			e.printStackTrace();
		}
	
	}}
