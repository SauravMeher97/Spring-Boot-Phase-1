package com.backenddevelopment.webapplication.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.backenddevelopment.webapplication.entities.user;

@Component
public class UserDAO {
   
   private static List<user> userlist = new ArrayList<user>();
   
   static {
   	userlist.add(new user("Saurav"));
   	userlist.add(new user("Aruna"));	
   }
   
   public user getUser(String userName) {
	   user tempuser=null;
	   
	   for(user iter:userlist) {
		   if(iter.getUserName().equalsIgnoreCase(userName)) {
			   tempuser=iter;
			   break;
		   }
		   }
	  
	   return tempuser;
      
}

}