public class Admin{
	private final String admin_user;
 	private final String admin_password;
  
  	private Admin(){
   		this.admin_user = "admin123";
     	this.admin_password = "password123";
   	}
    
    public String getUser(){
    	return this.admin_user;
    }
    
    public String getPassword(){
    	return this.admin_password;
    }
    
    public Admin newAdmin(){
    	return new Admin();
    }
}
