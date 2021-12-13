package kaaai.library.test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatChange {
	
	/**
	 *  yyyy-MM-dd
	 */
	private DateTimeFormatter iso8601;
	
	/**
	 *  yyyy/MM/dd
	 */
	private DateTimeFormatter iso8601Slash;
	
	/**
	 * コンストラクタ
	 */
	public DateFormatChange() {
		this.iso8601Slash = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		this.iso8601 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	}
	
	/**
	 * yyyy-MM-ddへ変換を行う
	 * @param preChangeDate
	 * @return
	 */
	public String changeIso8601(LocalDate preChangeDate) {
		String postChangeDate = preChangeDate.format(iso8601);
		System.out.println("変換前2: " + postChangeDate);
		
		return postChangeDate;
	}
	
	/**
	 * yyyy/MM/ddへ変換を行う
	 * @param preChangeDate
	 * @return
	 */
	public String changeIso8601Slash(LocalDate preChangeDate) {
		String postChangeDate = preChangeDate.format(iso8601Slash);
		System.out.println("変換前2: " + postChangeDate);
		
		return postChangeDate;
	}
}
