package ppt5;

import java.util.Vector;
import java.util.Scanner;

public class CommonExamStudent {
	
    private Vector<Integer> infoProcExamStudents;
    private Vector<Integer> securityExamStudents;
    private Vector<Integer> commonStudents;
    
    public void Credential() {
    	setInfoProcExamStudents(new Vector<>());
    	setSecurityExamStudents(new Vector<>());
    	setCommonStudents(new Vector<>());
    }
    
//    public void addTakers(Scanner scann, int flag) {
//    	Vector<Integer> target;
//    	if(flag == 0) {
//    		target = infoProcExamStudents;
//    		System
//    	}
//    }


/**
 * 정보처리기사 응시생 번호 등록
 * @param number
 */
    
   // public void addInfoProcessStudent(Integer studentNum) {
    public void addTakers(Scanner scann, int flag) {
    	int number = 0;
    	Vector<Integer> target;
    	if(flag == 0) {
    		target = infoProcExamStudents;
    		System.out.println("");
    	} else {
    		target = securityExamStudents;
    		System.out.println("");
    	}
    	
    	while(true) {
    		if(scann.hasNextInt()) {
    			number = scann.nextInt();
    			if (number >= 1 && number <= 30 && infoProcExamStudents.contains(number)) {
    				infoProcExamStudents.add(number);
    			} else {
    				throw new IllegalArgumentException("학생 번호는 1부터 30까지만 입력 가능합니다.");
    			}
    		}else if(scann.hasNext()) {
    			String value = scann.next();
    			if("q".equals(value)) break;
    		}
    	}
    }

    /**
     * 보안기사 응시생 번호 등록
     * @param studentNum
     */
    
    public void addSecurityStudent(Integer studentNum) {
        if (studentNum >= 1 && studentNum <= 30) {
            securityExamStudents.add(studentNum);
        } else {
        	throw new IllegalArgumentException("학생 번호는 1부터 30까지만 입력 가능합니다.");
        }
    }

    private void setCommonStudents(Vector vector) {
		// TODO Auto-generated method stub
		
	}


    private void setSecurityExamStudents(Vector vector) {
		// TODO Auto-generated method stub
		
	}


    private void setInfoProcExamStudents(Vector vector) {
		// TODO Auto-generated method stub
		
	}
 
    
    
    public void findCommonStudents() {
    	commonStudents.addAll(infoProcExamStudents);
    	commonStudents.retainAll(securityExamStudents);
    	
    	System.out.println("두시험 모두 응시한 학생 리스트");
    	for (Integer elem:commonStudents) {
    		
    	}
//        for (Integer student : infoProcExamStudents) {
//            if (securityExamStudents.contains(student)) {
//                commonStudents.add(student);
//            }
//        }
    }

    public void printCommonStudents() {
        if (commonStudents.isEmpty()) {
            System.out.println("두 개의 시험 모두 응시한 학생이 없습니다.");
        } else {
            System.out.println("두 개의 시험 모두 응시한 학생 번호:");
            for (int student : commonStudents) {
                System.out.println(student + "번 학생 ");
            }
        }
    }
}
