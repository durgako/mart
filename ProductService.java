import java.util.Scanner;

public class ProductService 
{

	public void test()
	 {
	Service s=new Service();
	System.out.println("1.electronics  2.clothes 3.bath 4.kitchen");
	System.out.println("enter your choice ");
	Scanner sc=new Scanner(System.in);
	int choice=sc.nextInt();
	if(choice==1)
			{
		s.displayelec();
			}else if(choice==2)
					{
				s.displaycloth();
					}else if(choice==3)
					{
						s.displaybath();
					}else if(choice==4)
					{
						s.displaykitchen();
					}
	
	System.out.println("if you want to shop more press 1 otherwise 2 for exit");
	int l=sc.nextInt();
	if(l==1)
	{
		test();
		
		
	}else
	{
		Service.sum();
		System.out.println("happy shopping");
	}
	 }public static void main(String[] args) {
		ProductService ps=new ProductService();
		ps.test();
		
		
	}
	 

}
