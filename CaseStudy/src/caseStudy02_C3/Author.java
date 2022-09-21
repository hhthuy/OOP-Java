package caseStudy02_C3;

/**
 * Bieu dien lop Author
 * 
 * @author HongThuy
 *
 */
public class Author {
	// Cac thuoc tinh
	private String name;
	private String email;
	private char gender;

	// Cac thuoc tinh
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the gender
	 */
	public char getGender() {
		return gender;
	}

	/**
	 * @param gender the gender to set
	 */
	public void setGender(char gender) {
		this.gender = gender;
	}

	/**
	 * Constructor mac dinh
	 */
	public Author() {

	}

	/**
	 * 
	 * @param name   la ten tac gia
	 * @param email  la email cua ta gia
	 * @param gender la gioi tnh cua tac gia
	 */
	public Author(String name, String email, char gender) {
		setName(name);
		setEmail(email);
		setGender(gender);
	}

	@Override
	public String toString() {
		return String.format("Author[name=%s , email=%s , gender=%c]", name, email, gender);
	}
}
