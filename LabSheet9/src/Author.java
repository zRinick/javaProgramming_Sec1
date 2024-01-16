
public class Author {
	private String name;
	private String email;
	private char gender;
	
	public Author(String name,String email,char gender) {
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	public Author(String name,String email) {
		this.name=name;
		this.email=email;
	}
	public Author() {
		
	}
	public String getName() {
		return this.name;
	}
	public String getEmail() {
		return this.email;
	}
	public String getGenderName() {
		if(gender=='m') {
			return "male";
		}
		else if (gender=='f') {
			return "female";
		}
		else {
			return null;
		}
		
		
	}
	public String toString() {
		return "Author name: "+name+"("+email+";"+getGenderName()+")";
	}
	
	
	
}
