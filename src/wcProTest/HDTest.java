package wcProTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import wcPro.*;

public class HDTest {
	//测试用例设计：
	//print_01-05
	//单词种类<=5,词频<=10
	//print_06-10
	//单词种类<=5,词频不定
	//print_11-15
	//单词种类>=6,词频<=10
	//print_16-20
	//单词种类>=6,词频不定
	
	//单词种类<=5,词频<=10
	@Test
	public void print_01() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "five 5\r\n" + "four 4\r\n" + "one 1\r\n";

		arr.add("five");
		arr.add("5");
		arr.add("four");
		arr.add("4");
		arr.add("one");
		arr.add("1");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_02() { 
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "five 5\r\n" + "four 4\r\n" + "three 3\r\n"
				+ "one 1\r\n";

		arr.add("five");
		arr.add("5");
		arr.add("four");
		arr.add("4");
		arr.add("three");
		arr.add("3");
		arr.add("one");
		arr.add("1");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_03() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "five 5\r\n" + "four 4\r\n" + "two 2\r\n";

		arr.add("five");
		arr.add("5");
		arr.add("four");
		arr.add("4");
		arr.add("two");
		arr.add("2");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_04() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "five 5\r\n" + "four 4\r\n" + "two 2\r\n"
				+ "one 1\r\n";

		arr.add("five");
		arr.add("5");
		arr.add("four");
		arr.add("4");
		arr.add("two");
		arr.add("2");
		arr.add("one");
		arr.add("1");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_05() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "ten 10\r\n" + "nine 9\r\n" + "eight 8\r\n"
				+ "five 5\r\n" + "one 1\r\n";

		arr.add("ten");
		arr.add("10");
		arr.add("nine");
		arr.add("9");
		arr.add("eight");
		arr.add("8");
		arr.add("five");
		arr.add("5");
		arr.add("one");
		arr.add("1");

		assertEquals(str_exp, ex1.print(arr));
	}

	//单词种类<=5,词频不定
	@Test
	public void print_06() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "thirty-two 32\r\n" + "thirty-one 31\r\n" 
					+ "seventeen 17\r\n"+"five 5\r\n";

		arr.add("thirty-two");
		arr.add("32");
		arr.add("thirty-one");
		arr.add("31");
		arr.add("seventeen");
		arr.add("17");
		arr.add("five");
		arr.add("5");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_07() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "forty-eight 48\r\n" + "forty-one 41\r\n" 
					+ "thirty-eight 38\r\n"+"eleven 11\r\n";

		arr.add("forty-eight");
		arr.add("48");
		arr.add("forty-one");
		arr.add("41");
		arr.add("thirty-eight");
		arr.add("38");
		arr.add("eleven");
		arr.add("11");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_08() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "thirty-four 34\r\n" + "twenty-three 23\r\n" 
					+ "fourteen 14\r\n"+"nine 9\r\n";

		arr.add("thirty-four");
		arr.add("34");
		arr.add("twenty-three");
		arr.add("23");
		arr.add("fourteen");
		arr.add("14");
		arr.add("nine");
		arr.add("9");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_09() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "forty-nine 49\r\n" + "forty-two 42\r\n" 
					+ "sixteen 16\r\n"+"eleven 11\r\n";

		arr.add("forty-nine");
		arr.add("49");
		arr.add("forty-two");
		arr.add("42");
		arr.add("sixteen");
		arr.add("16");
		arr.add("eleven");
		arr.add("11");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_10() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "thirty 30\r\n" + "twenty-eight 28\r\n" 
					+ "sixteen 16\r\n"+"seven 7\r\n";

		arr.add("thirty");
		arr.add("30");
		arr.add("twenty-eight");
		arr.add("28");
		arr.add("sixteen");
		arr.add("16");
		arr.add("seven");
		arr.add("7");
		
		assertEquals(str_exp, ex1.print(arr));
	}
	//单词种类>=6,词频<=10
	@Test
	public void print_11() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "nine 9\r\n" + "six 6\r\n" + "five 5\r\n"
					+"three 3\r\n" + "two 2\r\n" + "one 1\r\n";

		arr.add("nine");
		arr.add("9");
		arr.add("six");
		arr.add("6");
		arr.add("five");
		arr.add("5");
		arr.add("three");
		arr.add("3");
		arr.add("two");
		arr.add("2");
		arr.add("one");
		arr.add("1");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_12() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "ten 10\r\n" + "eight 8\r\n" + "seven 7\r\n"
				+"six 6\r\n" + "three 3\r\n" + "two 2\r\n";
		
		arr.add("ten");
		arr.add("10");
		arr.add("eight");
		arr.add("8");
		arr.add("seven");
		arr.add("7");
		arr.add("six");
		arr.add("6");
		arr.add("three");
		arr.add("3");
		arr.add("two");
		arr.add("2");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_13() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "ten 10\r\n" + "eight 8\r\n" + "seven 7\r\n"
				+"six 6\r\n" + "five 5\r\n" + "two 2\r\n";
		
		arr.add("ten");
		arr.add("10");
		arr.add("eight");
		arr.add("8");
		arr.add("seven");
		arr.add("7");
		arr.add("six");
		arr.add("6");
		arr.add("five");
		arr.add("5");
		arr.add("two");
		arr.add("2");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_14() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "eight 8\r\n" + "seven 7\r\n"+"six 6\r\n" 
					+ "five 5\r\n" + "four 4\r\n" + "three 3\r\n";

		arr.add("eight");
		arr.add("8");
		arr.add("seven");
		arr.add("7");
		arr.add("six");
		arr.add("6");
		arr.add("five");
		arr.add("5");
		arr.add("four");
		arr.add("4");
		arr.add("three");
		arr.add("3");
		
		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_15() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "nine 9\r\n" + "eight 8\r\n" + "six 6\r\n"
				+"five 5\r\n" + "four 4\r\n" + "one 1\r\n";
		
		arr.add("nine");
		arr.add("9");
		arr.add("eight");
		arr.add("8");
		arr.add("six");
		arr.add("6");
		arr.add("five");
		arr.add("5");
		arr.add("four");
		arr.add("4");
		arr.add("one");
		arr.add("1");
		
		assertEquals(str_exp, ex1.print(arr));
	}
	//单词种类>=6,词频不定
	@Test
	public void print_16() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "fourteen 14\r\n" + "twelve 12\r\n" + "ten 10\r\n"
				+ "eight 8\r\n" + "seven 7\r\n" + "five 5\r\n" + "three 3\r\n"
				+ "one 1\r\n";

		arr.add("fourteen");
		arr.add("14");
		arr.add("twelve");
		arr.add("12");
		arr.add("ten");
		arr.add("10");
		arr.add("eight");
		arr.add("8");
		arr.add("seven");
		arr.add("7");
		arr.add("five");
		arr.add("5");
		arr.add("three");
		arr.add("3");
		arr.add("one");
		arr.add("1");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_17() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "seven-eight 78\r\n" + "sixty 60\r\n"
				+ "fifty-four 54\r\n" + "fifty 50\r\n" + "forty-five 45\r\n"
				+ "thirty-nine 39\r\n" + "thirty-three 33\r\n"
				+ "twenty-five 25\r\n" + "seventeen 17\r\n" + "nine 9\r\n";

		arr.add("seven-eight");
		arr.add("78");
		arr.add("sixty");
		arr.add("60");
		arr.add("fifty-four");
		arr.add("54");
		arr.add("fifty");
		arr.add("50");
		arr.add("forty-five");
		arr.add("45");
		arr.add("thirty-nine");
		arr.add("39");
		arr.add("thirty-three");
		arr.add("33");
		arr.add("twenty-five");
		arr.add("25");
		arr.add("seventeen");
		arr.add("17");
		arr.add("nine");
		arr.add("9");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_18() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "seven-eight 78\r\n" + "sixty 60\r\n" + "fifty 50\r\n"
				+ "thirty-nine 39\r\n" + "thirty-three 33\r\n" + "nine 9\r\n";

		arr.add("seven-eight");
		arr.add("78");
		arr.add("sixty");
		arr.add("60");
		arr.add("fifty");
		arr.add("50");
		arr.add("thirty-nine");
		arr.add("39");
		arr.add("thirty-three");
		arr.add("33");
		arr.add("nine");
		arr.add("9");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_19() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "seven-eight 78\r\n" + "sixty 60\r\n"
				+ "fifty-four 54\r\n" + "fifty 50\r\n" + "forty-five 45\r\n"
				+ "thirty-nine 39\r\n" + "thirty-three 33\r\n"
				+ "twenty-five 25\r\n" + "seventeen 17\r\n" + "nine 9\r\n";

		arr.add("seven-eight");
		arr.add("78");
		arr.add("sixty");
		arr.add("60");
		arr.add("fifty-four");
		arr.add("54");
		arr.add("fifty");
		arr.add("50");
		arr.add("forty-five");
		arr.add("45");
		arr.add("thirty-nine");
		arr.add("39");
		arr.add("thirty-three");
		arr.add("33");
		arr.add("twenty-five");
		arr.add("25");
		arr.add("seventeen");
		arr.add("17");
		arr.add("nine");
		arr.add("9");

		assertEquals(str_exp, ex1.print(arr));
	}

	@Test
	public void print_20() {
		wcPro ex1 = new wcPro();
		ArrayList<String> arr = new ArrayList<String>();
		String str_exp = "seven-eight 78\r\n" + "sixty 60\r\n" + "fifty 50\r\n"
				+ "thirty-nine 39\r\n" + "thirty-three 33\r\n" + "nine 9\r\n";

		arr.add("seven-eight");
		arr.add("78");
		arr.add("sixty");
		arr.add("60");
		arr.add("fifty");
		arr.add("50");
		arr.add("thirty-nine");
		arr.add("39");
		arr.add("thirty-three");
		arr.add("33");
		arr.add("nine");
		arr.add("9");

		assertEquals(str_exp, ex1.print(arr));
	}

}
