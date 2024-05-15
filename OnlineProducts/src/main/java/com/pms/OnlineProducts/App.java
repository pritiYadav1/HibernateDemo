package com.pms.OnlineProducts;

import java.util.Scanner;

import com.pms.OnlineProducts.dao.OnlineProductDAO;
import com.pms.OnlineProducts.entity.OnlineProduct;

/**
 * Hello world!
 *
 */
public class App 
{
	Scanner sc=new Scanner(System.in);
    public static void main( String[] args )
    {
        
    	App obj=new App();
    	obj.Online_product_operation();
        
        
    }
    
    public void Online_product_operation()
    {
    	OnlineProduct product1=new OnlineProduct();
        OnlineProductDAO productDao=new OnlineProductDAO();
        int id;
        System.out.println("Enter your choice");
        System.out.println("1:Save product");
        System.out.println("2:Delete product");
        System.out.println("3:Update product");
        System.out.println("4:Get product By ID");
        int choice=sc.nextInt();
        
        switch(choice)
        {
        case 1:
	        System.out.println("Enter product name");
	        product1.setProductName(sc.next());
	        System.out.println("Enter product brand name");
	        product1.setProductBrand(sc.next());
	        System.out.println("Enter product catagory");
	        product1.setProductCatagory(sc.next());
	        System.out.println("Enter product Price");
	        product1.setProductPrice(sc.nextInt());
	        System.out.println("Enter product Quantity");
	        product1.setProductQuantity(sc.nextInt());
	        
	        productDao.saveProduct(product1);
	        
	        System.out.println(product1);
	        
	        break;
        case 2:
        		System.out.println("Enter Product ID");
        		 id=sc.nextInt();
        		productDao.deleteProduct(id);
        		
        	break;
        case 3:
        	productDao.updateProduct();
        	break;
        case 4:
        	System.out.println("Enter Product ID");
    			 id=sc.nextInt();
    			 productDao.getProductById(id);
        	break;
        	
        }
        
    }
    
}
