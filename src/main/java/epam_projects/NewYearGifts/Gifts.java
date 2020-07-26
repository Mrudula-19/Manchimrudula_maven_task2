package epam_projects.NewYearGifts;
import java.util.Scanner;
interface chocolate {
	void eating();
}
class Sweets implements chocolate
{
    public void eating()
    {
        int x,y,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of chocolates:");
	    int tot = sc.nextInt();
	    System.out.println("Enter price of chocolates:");
	    int cho[] = new int[tot];
	    for(x=0;x<tot;x++) 
	    {
	        cho[x] = sc.nextInt();
	    }
	    for (x = 0; x < tot; x++) 
        {
            for (y = x + 1; y < tot; y++) { 
                if (cho[x] > cho[y]) 
                {
                    t = cho[x];
                    cho[x] = cho[y];
                    cho[y] = t;
                }
            }
        }
    
    for(x=0;x<tot;x++)
    {
    	System.out.println(cho[x]);
    }
    int m=cho[0];
    for(x=0;x<tot;x++)
    {
    	m=cho[x];
    		if(cho[x]>m)
    		{
    			m=cho[x];
    		}
    }
    System.out.println("Chocolate with high price:"+" "+m);
    }
    void enjoy()
    {
    	System.out.println("I am eating Biscuits...!!!!");
    }
    
}
class Biscuits extends Sweets
{
	void enjoy()
	{
		System.out.println("Enjoy new year gifts....!!!!");
	}
}
public class Gifts {
    public static void main (String[] args) {
        Sweets s=new Sweets();
        s.eating();
        Biscuits r=new Biscuits();
        r.enjoy();
    }
}
