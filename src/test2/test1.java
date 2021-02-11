package test2;

/**
 * @author b2la
 *
 */
public class test1 {
	String nom;
	String post;
	String phone;
		
	
	private test1(String nom, String post, String phone) {
		super();
		this.nom = nom;
		this.post = post;
		this.phone = phone;
	}
	private String getNom() {
		return nom;
	}
	private void setNom(String nom) {
		this.nom = nom;
	}
	private String getPost() {
		return post;
	}
	private void setPost(String post) {
		this.post = post;
	}
	private String getPhone() {
		return phone;
	}
	private void setPhone(String phone) {
		this.phone = phone;
	}
	

	

}
