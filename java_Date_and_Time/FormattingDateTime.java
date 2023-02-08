package java_Date_and_Time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting : " + myDateObj);
		
		
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E,dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myDateObj.format(myFormatObj);
		System.out.println("After Formatting : " + formattedDate);
		
	}

}
