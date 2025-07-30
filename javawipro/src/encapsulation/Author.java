package encapsulation;

public class Author {

		    private String name;
		    private String email;
		    private char gender;

		    // Parameterized Constructor
		    public Author(String name, String email, char gender) {
		        this.name = name;
		        this.email = email;
		        this.gender = gender;
		    }

		    // Getters and Setters
		    public String getName() { return name; }
		    public void setName(String name) { this.name = name; }

		    public String getEmail() { return email; }
		    public void setEmail(String email) { this.email = email; }

		    public char getGender() { return gender; }
		    public void setGender(char gender) { this.gender = gender; }
		// TODO Auto-generated method stub

	}


