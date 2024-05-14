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
    public static void main( String[] args )
    {
        
        Scanner sc=new Scanner(System.in);
        OnlineProduct product1=new OnlineProduct();
        OnlineProductDAO productDao=new OnlineProductDAO();
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
        
        
    }
}
