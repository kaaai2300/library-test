package kaaai.library.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatChange {
	
	private DateTimeFormatter formatIso8601Slash;
	
	/**
	 * コンストラクタ
	 */
	public DateFormatChange() {
		this.formatIso8601Slash = DateTimeFormatter.ofPattern("yyyy/MM/dd");
	}
	
	/**
	 * iso8601へ変換を行う
	 * @param preChangeDate
	 * @return
	 */
	public String changeIso8601(LocalDate preChangeDate) {

		String postChangeDate = preChangeDate.format(formatIso8601Slash);
		System.out.println("変換前2: " + postChangeDate);
		
		return postChangeDate;
	}
}
