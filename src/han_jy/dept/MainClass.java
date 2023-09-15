package han_jy.dept;

import han_jy.dept.DepartmentManagement.Employee;

public class MainClass {

    // 메인 메서드 
    public static void main(String[] args) {
        // 부서 생성
        DepartmentManagement department = new DepartmentManagement("Sales");
        DepartmentManagement department2 = new DepartmentManagement("Design");

        // 사원 추가
        department.addEmployee("John", "Manager");
        department.showEmpList();
        
        department.addEmployee("Alice", "Director");
        department.showEmpList();
        
        department.addEmployee("Smith", "Chief");
        department.showEmpList();
        
        department.addEmployee("A", "Staff");
        department.showEmpList();
        
        department.addEmployee("B", "Staff");
        department.showEmpList();
        department.changeEmployeeJobTitle("B", "Chief");
        department.showEmpList();
        
        
        department2.addEmployee("Bob", "Chief");
        department2.addEmployee("Jack", "Advisor");
        department2.addEmployee("Linda", "Manger");
  
        /*
        //최대사원수
        int maxEmployees = department.MAX_EMPLOYEES;
        System.out.println("최대 사원 수: " + maxEmployees);
        */
        
        // 사원 리스트 출력
       
//        Employee[] employees = department.getEmployees();
//        System.out.println("Department Name : " + department.getDepartmentName());
//        for (int i = 0; i < department.employeeCount; i++) {
//            System.out.println("Employee Name : " + employees[i].getEmployeeName());
//            System.out.println("Job Title : " + employees[i].getJobTitle());
//            System.out.println();
//        }
//        System.out.println("Department Name : " + department2.getDepartmentName());
//        for (int i = 0; i < department2.employeeCount; i++) {
//            System.out.println("Employee Name : " + employees[i].getEmployeeName());
//            System.out.println("Job Title : " + employees[i].getJobTitle());
//            System.out.println();
//        }
    }
}
