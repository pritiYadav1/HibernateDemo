package com.pms.OnlineProducts.dao;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.pms.OnlineProducts.entity.OnlineProduct;
import com.pms.OnlineProducts.utility.HibernateUtility;
public class OnlineProductDAO 
{
	public void saveProduct(OnlineProduct onlineProduct)
	{
		Transaction transaction=null;
		try(Session session=HibernateUtility.getSessionFactory().openSession()) 
		{
			transaction=session.beginTransaction();
			session.save(onlineProduct);
			transaction.commit();
			session.close();
		} 
		catch (Exception e) 
		{
			if(transaction!=null)
			{
				transaction.rollback();
			}
		}
		
	}
}
