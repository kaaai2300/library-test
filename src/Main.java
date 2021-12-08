import java.time.LocalDate;

import kaaai.library.test.DateFormatChange;

public class Main {

	/**
	 * ライブラリテスト
	 * @param args
	 */
	public static void main(String[] args) {
		// 現在の日付を取得
		LocalDate nowDate = LocalDate.now().plusDays(5);
		System.out.println("変換前: " + nowDate);
		// 日付のフォーマット変換
		DateFormatChange dateFormatChange = new DateFormatChange();
		String postChange = dateFormatChange.changeIso8601(nowDate);
		
		System.out.println("変換後: " + postChange);
	}

}
