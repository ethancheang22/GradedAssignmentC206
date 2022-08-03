//alvin

public class AddTuition {

	private int Tuitioncode;
	private String Tuitiontitle;
	private String Groupname;
	private String TuitionDescription;
	private String duration;
	private String teacher;
	private String requisite;
	private String dateTime;

	public AddTuition(int tuitioncode, String tuitiontitle, String groupname, String tutitionDescription,
			String duration, String teacher, String requisite, String dateTime) {
		this.Tuitioncode = tuitioncode;
		this.Tuitiontitle = tuitiontitle;
		this.Groupname = groupname;
		this.TuitionDescription = tutitionDescription;
		this.requisite = requisite;
		this.duration = duration;
		this.teacher = teacher;
		this.dateTime = dateTime;
	}

	public int getTuitioncode() {
		return Tuitioncode;
	}

	public void setTuitioncode(int tuitioncode) {
		Tuitioncode = tuitioncode;
	}

	public String getTuitiontitle() {
		return Tuitiontitle;
	}

	public void setTuitiontitle(String tuitiontitle) {
		Tuitiontitle = tuitiontitle;
	}

	public String getGroupname() {
		return Groupname;
	}

	public void setGroupname(String groupname) {
		Groupname = groupname;
	}

	public String getTutitionDescription() {
		return TuitionDescription;
	}

	public void setTutitionDescription(String tutitionDescription) {
		TuitionDescription = tutitionDescription;
	}

	public String getrequisite() {
		return requisite;
	}

	public void setrequisite(String requisite) {
		requisite = requisite;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getDateTime() {
		return dateTime;
	}

	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}

}
