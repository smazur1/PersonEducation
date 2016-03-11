import java.util.ArrayList;

//Person.java
public class Person {
	//composition has-a relationship
	private Job job;
	private ArrayList<Education> schools;

	public Person(){
		this.job=new Job();
		schools = new ArrayList<Education>();
	}


	public void addSchool(String school, int years) {

		Education e = new Education();
		e.setSchool(school);
		e.setYears(years);

		schools.add(e);

	}
	public ArrayList<Education> getSchools() {
		return schools;
	}


	public void createJob(int id, String role, long salary) {

		job.setId(id);
		job.setRole(role);
		job.setSalary(salary);

	}

	public void setJob(Job j) {
		job = j;
	}

	public long getSalary() {
		return job.getSalary();
	}

	public String toString() {
		String str = "";
		str = "Job :" + job.toString() + "\n";
		for (Education e : schools) {
			str = str + e.toString() + "\n";	
		}

		return str;
	}


}
