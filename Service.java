import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Service implements CartDao1
{
static int  sum=0;
	
	

	@Override
	public void displayelec() {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver"); 
	     Connection		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root","root");
				
				Statement statement=connection.createStatement();
		System.out.println("welcome to store available items are:");
		ResultSet rs=statement.executeQuery("SELECT * FROM db.electronics");
		Scanner sc=new Scanner(System.in);
		while(rs.next())
		{
			
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		}
			System.out.println("enter your choice");
			int c=sc.nextInt();
			
				ResultSet rs11=statement.executeQuery("select * from db.electronics where id='"+c+"'");
			
				while(rs11.next())
				{
				
				System.out.println("enter required quantity");
					int r=sc.nextInt();
					
				int price=rs11.getInt(4);
				
				int cost=r*price;
				System.out.println("cost is:"+cost);
				sum+=cost;
				}
		}catch (Exception e) {
				System.out.println(e);
				}
			
				}
			



	public void displaycloth() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver"); 
     Connection		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root","root");
			
			Statement statement=connection.createStatement();
	System.out.println("welcome to store available items are:");
	ResultSet rs=statement.executeQuery("SELECT * FROM db.clothes");
	Scanner sc=new Scanner(System.in);
	while(rs.next())
	{
		
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
	}System.out.println("enter your choice");
	int c=sc.nextInt();
			ResultSet rs11=statement.executeQuery("select * from db.clothes where id='"+c+"'");
		
			while(rs11.next())
			{
			
			System.out.println("enter required quantity");
				int r=sc.nextInt();
				
			int price=rs11.getInt(4);
			
			int cost=r*price;
			System.out.println("cost is:"+cost);
			sum+=cost;
			}
	}catch (Exception e) {
				System.out.println(e);
			}
		
			}
		
	
		
	

	

	@Override
	public void displaybath() {
	try {
	Class.forName("com.mysql.cj.jdbc.Driver"); 
     Connection		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root","root");
			
			Statement statement=connection.createStatement();
	System.out.println("welcome to store available items are:");
	ResultSet rs=statement.executeQuery("SELECT * FROM db.bath");
	
	while(rs.next())
	{
	
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
		
	}System.out.println("enter your choice");
	Scanner sc=new Scanner(System.in);
	int c=sc.nextInt();
	ResultSet rs11=statement.executeQuery("select * from db.clothes where id='"+c+"'");
	
	while(rs11.next())
	{
	
	System.out.println("enter required quantity");
		int r=sc.nextInt();
		
	int price=rs11.getInt(4);
	
	int cost=r*price;
	System.out.println("cost is:"+cost);
	sum+=cost;
	}
}catch (Exception e) {
		System.out.println(e);
	}
	}

	


	

	@Override
	public void displaykitchen() {
		
	try {
	Class.forName("com.mysql.cj.jdbc.Driver"); 
     Connection		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "root","root");
			
			Statement statement=connection.createStatement();
	System.out.println("welcome to store available items are:");
	ResultSet rs=statement.executeQuery("SELECT * FROM db.Kitchen");
	Scanner sc=new Scanner(System.in);
	while(rs.next())
	{
	
		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getInt(4));
	}
	
		System.out.println("enter your choice");
	int c=sc.nextInt();
	ResultSet rs11=statement.executeQuery("select * from db.clothes where id='"+c+"'");
	
	while(rs11.next())
	{
	
	System.out.println("enter required quantity");
		int r=sc.nextInt();
		
	int price=rs11.getInt(4);
	
	int cost=r*price;
	System.out.println("cost is:"+cost);
	sum+=cost;
	}
}catch (Exception e) {
		System.out.println(e);
	}}
	public static void sum()
	{
		System.out.println("total bill is:="+sum);
	}

	
		
	}
	
	


	

	
