package ppt4;

import java.time.LocalDate;

public class MainClass {

	public static void main(String[] args) {

		LocalDate currentDate = LocalDate.now();
		System.out.println(currentDate);
		
		LocalDate specificDate = LocalDate.of(2023,  3, 1);
		System.out.println(specificDate);
		
		System.out.println(specificDate.getDayOfWeek());
		System.out.println(specificDate.getDayOfYear());
		
		System.out.println(specificDate.getMonth());
		System.out.println(specificDate.getMonthValue());
		
		System.out.println(specificDate.isLeapYear());
		
		System.out.println(specificDate.plusDays(100));
		
	}

}

