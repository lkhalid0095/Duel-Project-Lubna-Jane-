package attendance;

public class Student implements Attendee{

	private String firstName;
	private String lastName;
	private boolean ispresent;
	public Student(String first, String last) { 
		firstName= first;
		lastName = last;
	}
	public boolean isPresent() {
		
		return false;
	}

	public void setPresent(boolean present) {
		if(isPresent()) {
			present=true;
		}
		else
		{
			present=false;
		}
	}

	public String getFirstName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLastName() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean mathces(String first, String last) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean matches(String last) {
		// TODO Auto-generated method stub
		return false;
	}

	public String getReportString() {
		// TODO Auto-generated method stub
		return null;
	}

}
