import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.remote.server.handler.ExecuteAsyncScript;

import java.lang.reflect.*;

public class main {
	public static void main(String[] args) throws Exception
	{
		testCases obj = new testCases();
		Object[][] data =  obj.readExcel("/Users/abhaskumar/Desktop/methods.xls");

		for(int i = 1; i<data.length; i++)
		{	
			String str = (String) data[i][1];
			if(str.equalsIgnoreCase("y"))
			{
				try{
					obj.firefox();	
					Method tc = testCases.class.getMethod((String)data[i][0]);
					tc.invoke(obj);
					reusable.bw.close();

				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		for(int i = 1; i<data.length; i++)
		{	
			String str = (String) data[i][1];
			if(str.equalsIgnoreCase("y"))
			{	
				try{
					obj.chrome();	
					Method tc = testCases.class.getMethod((String)data[i][0]);
					tc.invoke(obj);
					reusable.bw.close();

				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}}
		for(int i = 1; i<data.length; i++)
		{	
			String str = (String) data[i][1];
			if(str.equalsIgnoreCase("y"))
			{
				try{
					obj.safari();	
					Method tc = testCases.class.getMethod((String)data[1][0]);
					tc.invoke(obj);
					reusable.bw.close();

				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}}

	}
}
