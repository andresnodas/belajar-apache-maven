package programmer.zaman.now.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	Gson gson = new Gson();
    	
    	Person person = new Person("Andres Nodas");
    	
    	System.out.println(gson.toJson(person));
    	
    }
}
