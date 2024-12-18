package pa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class h13 
{

	public static void main(String[] args) 
	{
		if(args.length != 1)
		{
			 System.out.println("請指定正確的檔案名稱");
			 System.exit(1);
		}
		
		try {
		      BufferedReader br = new BufferedReader(new FileReader(args[0]));
		      
		      String str;
		     while((str = br.readline()) != null)
		     {
		    	 System.out.println(str);
		     }
		      br.close();
		     }
		 
		 catch(IOException e)
		  {
			   System.out.println("輸出入錯誤");
		  }
		
		
		
		
		
		
		

	}

}
