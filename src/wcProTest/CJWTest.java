package wcProTest;

import static org.junit.Assert.*;
import java.util.HashMap;
import org.junit.Test;
import wcPro.*;

public class CJWTest {
	// 测试计划：
	// count_01-count-10
	// 大小写+连字符（任意位置）+单引号
	//随机组合测试
	// count_11-count_20
	// 大小写+连字符（任意位置）+单引号+数字（任意位置）+词频相同+双引号+常见字符
	//随机组合测试

	// 一个单词，小写
	@Test
	public void count_01() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("test", 1);
		assertEquals(map_exp, ex1.count("01.txt"));
	}

	// 多个单词，小写
	@Test
	public void count_02() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("test", 5);
		map_exp.put("word", 3);
		map_exp.put("wow", 1);
		// map_exp.put("test",2);
		assertEquals(map_exp, ex1.count("02.txt"));
	}

	// 一个单词，大小写混合
	@Test
	public void count_03() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("test", 1);
		assertEquals(map_exp, ex1.count("03.txt"));
	}

	// 多个单词，大小写混合
	@Test
	public void count_04() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word", 3);
		map_exp.put("test", 5);
		map_exp.put("woe", 4);
		assertEquals(map_exp, ex1.count("04.txt"));
	}

	// 一个单词，大小写+连字符混合
	@Test
	public void count_05() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-defined", 1);
		assertEquals(map_exp, ex1.count("05.txt"));
	}

	// 多个单词，大小写+连字符混合
	@Test
	public void count_06() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-defined", 2);
		map_exp.put("test", 4);
		map_exp.put("un-expected", 3);
		assertEquals(map_exp, ex1.count("06.txt"));
	}

	// 一个单词，大小写+连字符（任意位置）混合
	@Test
	public void count_07() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 1);
		assertEquals(map_exp, ex1.count("07.txt"));
	}

	// 多个单词，大小写+连字符（任意位置）混合
	@Test
	public void count_08() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-defined", 2);
		map_exp.put("test", 4);
		map_exp.put("un-expected", 3);
		assertEquals(map_exp, ex1.count("06.txt"));
	}

	// 一个单词，大小写+单引号混合
	@Test
	public void count_09() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("let", 1);
		map_exp.put("s", 1);
		assertEquals(map_exp, ex1.count("09.txt"));
	}

	// 多个单词，大小写+连字符（任意位置）+单引号混合
	@Test
	public void count_10() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 2);
		map_exp.put("word", 4);
		map_exp.put("let", 3);
		map_exp.put("s", 3);
		assertEquals(map_exp, ex1.count("10.txt"));
	}

	// 一个单词，大小写+连字符+双引号混合
	@Test
	public void count_11() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 1);
		assertEquals(map_exp, ex1.count("11.txt"));
	}

	// 多个单词，大小写+连字符（任意位置）+单引号+双引号混合
	@Test
	public void count_12() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 2);
		map_exp.put("test", 3);
		map_exp.put("let", 4);
		map_exp.put("s", 4);
		assertEquals(map_exp, ex1.count("12.txt"));
	}

	// 一个单词，大小写+连字符（任意位置）+双引号+数字混合
	@Test
	public void count_13() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("wo", 1);
		map_exp.put("rd-undefined", 1);
		assertEquals(map_exp, ex1.count("13.txt"));
	}

	// 多个单词，大小写+连字符（任意位置）+单引号+双引号+数字混合
	@Test
	public void count_14() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 2);
		map_exp.put("test", 3);
		map_exp.put("i", 4);
		assertEquals(map_exp, ex1.count("14.txt"));
	}

	// 一个单词，大小写+连字符（任意位置）+双引号+数字（任意位置）混合
	@Test
	public void count_15() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("wo", 1);
		map_exp.put("rd-undefined", 1);
		assertEquals(map_exp, ex1.count("15.txt"));
	}

	// 多个单词，大小写+连字符（任意位置）+单引号+双引号+数字（任意位置）混合
	@Test
	public void count_16() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 2);
		map_exp.put("test", 3);
		map_exp.put("let", 2);
		map_exp.put("s", 4);
		assertEquals(map_exp, ex1.count("16.txt"));
	}

	// 一个单词，大小写+连字符（任意位置）+双引号+数字（任意位置）+常见符号混合
	@Test
	public void count_17() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("wo", 1);
		map_exp.put("rd-undefined", 1);
		assertEquals(map_exp, ex1.count("17.txt"));
	}

	// 多个单词，大小写+连字符（任意位置）+单引号+双引号+数字（任意位置）+常见符号混合
	@Test
	public void count_18() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 2);
		map_exp.put("test", 3);
		map_exp.put("let", 2);
		map_exp.put("s", 21);
		assertEquals(map_exp, ex1.count("18.txt"));
	}

	// 一个单词，大小写+连字符（任意位置）+双引号+数字（任意位置）+常见符号混合
	@Test
	public void count_19() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("wo", 1);
		map_exp.put("rd-undefined", 1);
		assertEquals(map_exp, ex1.count("19.txt"));
	}

	// 多个单词，大小写+连字符（任意位置）+单引号+双引号+数字（任意位置）+常见符号+词频相同混合
	@Test
	public void count_20() {
		HashMap<String, Integer> map_exp = new HashMap<>();
		wcPro ex1 = new wcPro();
		map_exp.put("word-undefined", 22);
		map_exp.put("s", 22);
		map_exp.put("let", 1);
		assertEquals(map_exp, ex1.count("20.txt"));
	}

}
