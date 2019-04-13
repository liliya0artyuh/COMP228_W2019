

public class  Birthday {

    private String firstName;
    private int age;

    
    
	public Birthday() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Birthday(String firstName, int age) {
		super();
		this.firstName = firstName;
		this.age = age;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public String toString() {
		return "Birthday [firstName=" + firstName + ", age=" + age + "]";
	}

	
}
