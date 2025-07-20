import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Client{
	private final int id;
	private String first_name;
	private String last_name;
	private final LocalDate birth;
	private String email;
	private String password;
	private String addres;
	
	private static ArrayList<Integer> used_ids;
	
	public Client(
		String first_name, 
		String last_name,
		String birth,
		String email,
		String password,
		String addres)
	{
		this.id = generate_id();
		this.first_name = first_name;
		this.last_name = last_name;
		this.birth = format_birth(birth);
		this.email = email;
		this.password = password;
		this.addres = addres;
	}
	
	public int get_id(){
		return this.id;
	}
	
	public void set_first_name(String new_name){
		this.first_name = new_name;
	}
	
	public String get_first_name(){
		return this.first_name;
	}
	
	public void set_last_name(String new_last_name){
		this.last_name = new_last_name;
	}
	
	public String get_last_name(){
		return this.last_name;
	}
	
	public LocalDate get_birth(){
		return this.birth;
	}
	
	public void set_email(String new_email){
		this.email = new_email;
	}
	
	public String get_email(){
		return this.email;
	}
	
	public void set_password(String new_password){
		this.password = new_password;
	}
	
	public String get_password(){
		return this.password;
	}
	
	public void set_addres(String new_addres){
		this.addres = new_addres;
	}
	
	public String get_addres(){
		return this.addres;
	}
	
	private static int generate_id(){
		Random random = new Random();
		int random_id;
		
		do{
			random_id = random.nextInt();
		}while(used_ids != null && used_ids.contains(random_id));
		
		used_ids.add(random_id);
		return random_id;
	}
	
	private static LocalDate format_birth(String birth){
		LocalDate dob = LocalDate.parse(birth);
		return dob;
	}
}