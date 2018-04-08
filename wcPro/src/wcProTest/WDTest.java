package wcProTest;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import wcPro.*;

public class WDTest {
	// 测试用例设计：
	// main_01//参数为空
	// main_02-04//参数过多
	// main_05-09//参数错误
	// main_10-13//文件类型错误
	// main_14-16//文件未找到
	// main_17-19//文件名正常
	// main_20//参数正常(-x)

	// 最后一个测试用例
	// 需要选择正确的txt文件才能通过测试

	// 参数为空
	@Test
	public void main_01() {
		// 获取控制台实际输出内容
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = " ";
		// 调用断言，实际输出和预期输出做对比
		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	// 参数过多
	@Test
	public void main_02() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[2];
		str[0] = "01.txt";
		str[1] = "-x";

		ex1.main(str);
		assertEquals("参数数量错误\n", outContent.toString());
	}

	@Test
	public void main_03() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[2];
		str[0] = "01.java";
		str[1] = "-x";

		ex1.main(str);
		assertEquals("参数数量错误\n", outContent.toString());
	}

	@Test
	public void main_04() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[2];
		str[0] = "01.java";
		str[1] = "-c";

		ex1.main(str);
		assertEquals("参数数量错误\n", outContent.toString());
	}

	// 参数不合格
	@Test
	public void main_05() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-c";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	@Test
	public void main_06() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-l";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	@Test
	public void main_07() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-w";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	@Test
	public void main_08() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-o";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	@Test
	public void main_09() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-v";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	// 文件名不合格
	@Test
	public void main_10() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.java";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	@Test
	public void main_11() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.c";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	@Test
	public void main_12() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.doc";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	@Test
	public void main_13() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.cpp";

		ex1.main(str);
		assertEquals("输入格式错误\n", outContent.toString());
	}

	// 文件未找到
	@Test
	public void main_14() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "21.txt";

		ex1.main(str);
		assertEquals("文件不存在\n", outContent.toString());
	}

	@Test
	public void main_15() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "22.txt";

		ex1.main(str);
		assertEquals("文件不存在\n", outContent.toString());
	}

	@Test
	public void main_16() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "23.txt";

		ex1.main(str);
		assertEquals("文件不存在\n", outContent.toString());
	}

	// 参数正常（文件名正常）
	@Test
	public void main_17() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.txt";

		ex1.main(str);
		// assertEquals("test   2\n", outContent.toString());
	}

	@Test
	public void main_18() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "02.txt";

		ex1.main(str);
		// assertEquals("", outContent.toString());
	}

	@Test
	public void main_19() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "03.txt";

		ex1.main(str);
		// assertEquals("", outContent.toString());
	}

	// 参数正常（图形界面）
	@Test
	public void main_20() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-x";

		ex1.main(str);
		assertEquals("", outContent.toString());
	}
}
