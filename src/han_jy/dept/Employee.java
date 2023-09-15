package han_jy.dept;

public class Employee {
	private String employeeName;//사원이름
    private String jobTitle;//직급

    public Employee(String employeeName, String jobTitle) {//사원생성자
        this.employeeName = employeeName;
        this.jobTitle = jobTitle;
    }
//사원
    public String getEmployeeName() {//사원이름반환
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {//사원이름설정
        this.employeeName = employeeName;
    }
//직급
    public String getJobTitle() {//직급반환
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {//직급설정
        this.jobTitle = jobTitle;
    }
}
