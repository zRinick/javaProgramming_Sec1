import java.time.*;
public class FictionBook {
	private String author_name;
	private String email;
	private String title;
	private int publicYear;
	
	FictionBook(String title,int publicYear){
		this.title=title;
		this.publicYear=publicYear;
	}
	public void setAuthorName(String name) {
		this.author_name=name;
	}
	public void setEmail(String email) {
		this.email=email;
	}

	public boolean checkFormatName() {
		if(author_name.trim().indexOf(" ")!=-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public String getLastName() {
		
		return (author_name.substring(author_name.indexOf(" ")+1)).toUpperCase();
	}
	public String getFirstName() {
		
		
		return (author_name.substring(author_name.indexOf(" "))).toUpperCase();
	}
	public boolean cheekEmail() {
		if (email.endsWith("@hotmail.com") || email.endsWith("@windowslive.com")) {
		    return true;
		} 
		else {
		    return false;
		}

	}
	public int totalPublicYear() {
		
		return Year.now().getValue()-publicYear;
	}
	public String toString() {
		return title.toUpperCase()+" write by "+getLastName().substring(0,1)+"."+getFirstName()+"("+email+")"
	+ "\nPublished for "+totalPublicYear()+" years";
	}
}
