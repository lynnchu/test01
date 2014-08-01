package com.test;
import org.ho.yaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.lang.ArrayStoreException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;



import org.testng.Assert;

public class Test2 {
	  /**
     * @param args
     */
    
//    public void getTest() {
//        Assert.assertEquals(1,2);
//        System.out.println("1234");
//    }
    
    public void getYamlFile() throws FileNotFoundException{    
        File f = new File("src/com/test/loginfail.yaml");
        System.out.println(f.getAbsolutePath());
        HashMap ml = Yaml.loadType(new FileInputStream(f.getAbsolutePath()), HashMap.class);
        List<String> list = (List<String>) ml.get("login fail");
        //System.out.println(list);
        Object[] strarray = (Object[]) list.toArray(); 
        //List<String> child1 = (List<String>) strarray[0]; 
       for (Object item : strarray) {
        	HashMap arr = (HashMap) item;
        	String usename = (String) arr.get("user name");
        	int userage = (int) arr.get("password");
        	System.out.println(usename);
        	System.out.println(userage);
        	//System.out.println(arr.get("msg"));
		}
        
        


        //System.out.println(((List<String) ml.get("loadString")).get("locater"));
    }
    public static void main(String[] args) throws FileNotFoundException {
        Test2 t = new Test2();        
        t.getYamlFile();
    }

}
