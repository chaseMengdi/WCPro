package wcProTest;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.Test;
import wcPro.*;

public class LBQTest {
	// 测试用例设计：
	// sort_01-02
	// 单词种类<=5,词频<=10,统计后为升序
	// sort_03-05
	// 单词种类<=5,词频<=10,统计后为降序
	// sort_06-08
	// 单词种类>=6,词频不定,统计后为升序
	// sort_09-10
	// 单词种类>=6,词频不定,统计后为降序
	// sort_11-15
	// 单词种类<=5,词频<=10,统计后为乱序
	// sort_16-20
	// 单词种类>=6,词频不定,统计后为乱序
	// show_21
	// show函数测试

	// 单词种类<6，词频统计后为升序
	@Test
	public void sort_01() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("four", 4);
		map.put("five", 5);

		sort_exp.add("five"); 
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_02() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);

		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("three");
		sort_exp.add("3");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	// 单词种类<6，词频统计后为降序
	@Test
	public void sort_03() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("five", 5);
		map.put("four", 4);
		map.put("one", 1);

		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_04() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("five", 5);
		map.put("four", 4);
		map.put("three", 3);
		map.put("one", 1);

		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("three");
		sort_exp.add("3");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_05() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("ten", 10);
		map.put("nine", 9);
		map.put("eight", 8);
		map.put("five", 5);
		map.put("one", 1);

		sort_exp.add("ten");
		sort_exp.add("10");
		sort_exp.add("nine");
		sort_exp.add("9");
		sort_exp.add("eight");
		sort_exp.add("8");
		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	// 单词种类>5，词频统计后为升序
	@Test
	public void sort_06() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("three", 3);
		map.put("five", 5);
		map.put("seven", 7);
		map.put("eight", 8);
		map.put("ten", 10);
		map.put("twelve", 12);
		map.put("fourteen", 14);

		sort_exp.add("fourteen");
		sort_exp.add("14");
		sort_exp.add("twelve");
		sort_exp.add("12");
		sort_exp.add("ten");
		sort_exp.add("10");
		sort_exp.add("eight");
		sort_exp.add("8");
		sort_exp.add("seven");
		sort_exp.add("7");
		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("three");
		sort_exp.add("3");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_07() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("nine", 9);
		map.put("seventeen", 17);
		map.put("twenty-five", 25);
		map.put("thirty-three", 33);
		map.put("thirty-nine", 39);
		map.put("forty-five", 45);
		map.put("fifty", 50);
		map.put("fifty-four", 54);
		map.put("sixty", 60);
		map.put("seven-eight", 78);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty-four");
		sort_exp.add("54");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("forty-five");
		sort_exp.add("45");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("twenty-five");
		sort_exp.add("25");
		sort_exp.add("seventeen");
		sort_exp.add("17");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_08() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("nine", 9);
		map.put("thirty-three", 33);
		map.put("thirty-nine", 39);
		map.put("fifty", 50);
		map.put("sixty", 60);
		map.put("seven-eight", 78);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	// 单词种类>5，词频统计后为降序
	@Test
	public void sort_09() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("seven-eight", 78);
		map.put("sixty", 60);
		map.put("fifty-four", 54);
		map.put("fifty", 50);
		map.put("forty-five", 45);
		map.put("thirty-nine", 39);
		map.put("thirty-three", 33);
		map.put("twenty-five", 25);
		map.put("seventeen", 17);
		map.put("nine", 9);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty-four");
		sort_exp.add("54");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("forty-five");
		sort_exp.add("45");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("twenty-five");
		sort_exp.add("25");
		sort_exp.add("seventeen");
		sort_exp.add("17");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_10() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("seven-eight", 78);
		map.put("sixty", 60);
		map.put("fifty", 50);
		map.put("thirty-nine", 39);
		map.put("thirty-three", 33);
		map.put("nine", 9);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	// 单词种类<6，词频统计后为乱序
	@Test
	public void sort_11() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("five", 5);
		map.put("four", 4);

		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_12() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("five", 5);
		map.put("four", 4);
		map.put("three", 3);

		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("three");
		sort_exp.add("3");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	// 单词种类<6，词频统计后为降序
	@Test
	public void sort_13() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("five", 5);
		map.put("one", 1);
		map.put("four", 4);

		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_14() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("three", 3);
		map.put("five", 5);
		map.put("one", 1);
		map.put("four", 4);

		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("four");
		sort_exp.add("4");
		sort_exp.add("three");
		sort_exp.add("3");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_15() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("five", 5);
		map.put("nine", 9);
		map.put("eleven", 11);
		map.put("one", 1);
		map.put("eight", 8);

		sort_exp.add("eleven");
		sort_exp.add("11");
		sort_exp.add("nine");
		sort_exp.add("9");
		sort_exp.add("eight");
		sort_exp.add("8");
		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	// 单词种类>5，词频统计后为升序
	@Test
	public void sort_16() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("seven", 7);
		map.put("five", 5);
		map.put("three", 3);
		map.put("fourteen", 14);
		map.put("twelve", 12);
		map.put("eight", 8);
		map.put("ten", 10);

		sort_exp.add("fourteen");
		sort_exp.add("14");
		sort_exp.add("twelve");
		sort_exp.add("12");
		sort_exp.add("ten");
		sort_exp.add("10");
		sort_exp.add("eight");
		sort_exp.add("8");
		sort_exp.add("seven");
		sort_exp.add("7");
		sort_exp.add("five");
		sort_exp.add("5");
		sort_exp.add("three");
		sort_exp.add("3");
		sort_exp.add("one");
		sort_exp.add("1");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_17() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("nine", 9);
		map.put("thirty-three", 33);
		map.put("twenty-five", 25);
		map.put("seventeen", 17);
		map.put("forty-five", 45);
		map.put("thirty-nine", 39);
		map.put("seven-eight", 78);
		map.put("fifty-four", 54);
		map.put("sixty", 60);
		map.put("fifty", 50);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty-four");
		sort_exp.add("54");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("forty-five");
		sort_exp.add("45");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("twenty-five");
		sort_exp.add("25");
		sort_exp.add("seventeen");
		sort_exp.add("17");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_18() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("fifty", 50);
		map.put("nine", 9);
		map.put("sixty", 60);
		map.put("thirty-nine", 39);
		map.put("seven-eight", 78);
		map.put("thirty-three", 33);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	// 单词种类>5，词频统计后为降序
	@Test
	public void sort_19() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("fifty-four", 54);
		map.put("seven-eight", 78);
		map.put("fifty", 50);
		map.put("sixty", 60);
		map.put("forty-five", 45);
		map.put("seventeen", 17);
		map.put("twenty-five", 25);
		map.put("thirty-nine", 39);
		map.put("thirty-three", 33);
		map.put("nine", 9);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty-four");
		sort_exp.add("54");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("forty-five");
		sort_exp.add("45");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("twenty-five");
		sort_exp.add("25");
		sort_exp.add("seventeen");
		sort_exp.add("17");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	@Test
	public void sort_20() {
		wcPro op1 = new wcPro();
		ArrayList<String> sort_exp = new ArrayList<String>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("seven-eight", 78);
		map.put("thirty-nine", 39);
		map.put("thirty-three", 33);
		map.put("nine", 9);
		map.put("fifty", 50);
		map.put("sixty", 60);

		sort_exp.add("seven-eight");
		sort_exp.add("78");
		sort_exp.add("sixty");
		sort_exp.add("60");
		sort_exp.add("fifty");
		sort_exp.add("50");
		sort_exp.add("thirty-nine");
		sort_exp.add("39");
		sort_exp.add("thirty-three");
		sort_exp.add("33");
		sort_exp.add("nine");
		sort_exp.add("9");

		assertEquals(sort_exp, op1.sort(map));
	}

	// show函数测试
	@Test
	public void show_21() {
		wcPro ex1 = new wcPro();
		assertEquals("图形界面打开成功\n", ex1.show());
	}

}
