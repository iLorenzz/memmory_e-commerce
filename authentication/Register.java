import java.util.ArrayList;

public class Register{
	private static ArrayList<Client> registered_clients = new ArrayList<>();
	
	public static Client register_client(
		String first_name, 
		String last_name,
		String birth,
		String email,
		String password,
		String addres) throws UserAlreadyRegisteredException{
			
			if(is_already_registered(email)){
				throw new UserAlreadyRegisteredException("This email is already registered");
			}
			
			Client client = new Client(first_name, last_name, birth, email, password, addres);
			registered_clients.add(client);
			
			return client;
	}
	
	public static ArrayList<Client> get_registered_clients(){
		return registered_clients;
	}
	
	public static boolean is_already_registered(String email){
		ArrayList<Client> clients = Register.get_registered_clients();
		
		for(Client client : clients){
			/*if(client.get_email().equals(email) && client.get_password().equals(password)){
				return true;
			}*/
			
			if(client.get_email().equals(email)){
				return true;
			}
		}
		
		return false;
	}
}