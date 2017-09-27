package attendance;

public class Student implements Attendee{

	private String firstName;
	private String lastName;
	private boolean present;
	public Student(String first, String last) { 
		this.firstName= first;
		this.lastName = last;
		this.present=false;
	}
	public boolean isPresent() {
		
		return present;
	}

	public void setPresent(boolean present) {
		this.present=present;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public boolean mathces(String first, String last) {
		
		return first.toLowerCase().equals(firstName.toLowerCase())&&last.toUpperCase().equals(lastName.toUpperCase());
	}

	public boolean matches(String last) {
		return last.toUpperCase().equals(lastName.toUpperCase());
	}

	public String getReportString() {
		String report = lastName;
		if(report.length()>20)
		{
			report=report.substring(0,17)+"...";
		}
		while(report.length()<20)
		{
			report+=" ";
		}
		report+=firstName;
		if(report.length()>40)
		{
			report=report.substring(0,37)+"...";
		}
		while(report.length()<40)
		{
			report+=" ";
		}
		if(present)
		{
			report+="PRESENT\n";
		}
		else
		{
			report+="ABSENT\n";
		}
		return report;
	}
}
