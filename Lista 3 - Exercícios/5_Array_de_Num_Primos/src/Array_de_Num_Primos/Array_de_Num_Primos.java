package Array_de_Num_Primos;

import java.util.ArrayList;

public class Array_de_Num_Primos {	
public static void main(String args[]) {
	
	ArrayList<Integer> lista = new ArrayList<>();
	int d = 0;
	
	for(int i=2; i<1000; i++)
	{
		d = 0;
		for(int c=1; c<=10; c++)
		{
			if(i % c == 0) 
			{
				d++;
			}
	    
		    if(i<10 && c==10 && d==2) 
		    {
		    	if(i%i==0) 
		    	{
		    		lista.add(i);
		    	}
		    }
		    
		    if(c==10 && d==1) 
		    {
		    	if(i%i==0) 
		    	{
		    		lista.add(i);
		    	}
		    }
		}
	}
	
	for(int t=0; t<lista.size(); t++)
	  {
		  System.out.println(lista.get(t));
	  }
	}
}