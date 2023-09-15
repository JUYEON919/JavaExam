package han_jy.dept;

public class DepartmentManagement {
    private String departmentName; // 부서 이름
    private Employee[] employees; // 사원 배열
    private int MAX_EMPLOYEES = 100; //100명으로 제한
    int employeeCount; // 현재 사원 수

    // 부서 관리 클래스 생성자
    public DepartmentManagement(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new Employee[MAX_EMPLOYEES]; // 최대 사원 수만큼 배열 초기화
        this.employeeCount = 0; // 초기 사원 수는 0명
    }

    // 부서 이름을 반환하는 메서드
    public String getDepartmentName() {
        return departmentName;
    }

    // 부서 이름을 설정하는 메서드
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // 사원을 추가하는 메서드
    public void addEmployee(String employeeName, String jobTitle) {
        if (employeeCount < MAX_EMPLOYEES) {
            // 배열에 사원 추가
            Employee employee = new Employee(employeeName, jobTitle);
            employees[employeeCount] = employee;
            employeeCount++; // 사원 수 증가
        } else {
            System.out.println("더 이상 사원을 추가할 수 없습니다.");
        }
    }
 // 사원의 직급 변경 메서드
    public void changeEmployeeJobTitle(String employeeName, String newJobTitle) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].getEmployeeName().equals(employeeName)) {
                employees[i].setJobTitle(newJobTitle);
                System.out.println(employeeName + "의 직급이 변경되었습니다.");
                return; // 사원을 찾았으면 반복문 종료
            }
        }
        // 지정한 이름의 사원을 찾지 못한 경우
        System.out.println(employeeName + "라는 이름의 사원을 찾을 수 없습니다.");
    }
    // 사원 배열을 반환하는 메서드
    public Employee[] getEmployees() {
        return employees;
    }
    //출력하는메서드
    public void showEmpList() {
        System.out.println("부서명: " + departmentName + " 총 " + employeeCount + "명");
        //System.out.println("직급 목록:");

        for (int i = 0; i < employeeCount; i++) {
         System.out.println("이름 : " + employees[i].getEmployeeName() + "직급 :  " + employees[i].getJobTitle());
        }
        System.out.println("---------------------------------");
    }

    // 사원 클래스 (내부 클래스)
    public class Employee {
        private String employeeName; // 사원 이름
        private String jobTitle; // 직급

        // 사원 생성자
        public Employee(String employeeName, String jobTitle) {
            this.employeeName = employeeName;
            this.jobTitle = jobTitle;
        }

        // 사원 이름을 반환하는 메서드
        public String getEmployeeName() {
            return employeeName;
        }

        // 사원 이름을 설정하는 메서드
        public void setEmployeeName(String employeeName) {
            this.employeeName = employeeName;
        }

        // 직급을 반환하는 메서드
        public String getJobTitle() {
            return jobTitle;
        }

        // 직급을 설정하는 메서드
        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }
    }
}

