package wcProTest;

import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Test;
import wcPro.*;

public class WDTest {
	// ����������ƣ�
	// main_01//����Ϊ��
	// main_02-04//��������
	// main_05-09//��������
	// main_10-13//�ļ����ʹ���
	// main_14-16//�ļ�δ�ҵ�
	// main_17-19//�ļ�������
	// main_20//��������(-x)

	// ���һ����������
	// ��Ҫѡ����ȷ��txt�ļ�����ͨ������

	// ����Ϊ��
	@Test
	public void main_01() {
		// ��ȡ����̨ʵ���������
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = " ";
		// ���ö��ԣ�ʵ�������Ԥ��������Ա�
		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	// ��������
	@Test
	public void main_02() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[2];
		str[0] = "01.txt";
		str[1] = "-x";

		ex1.main(str);
		assertEquals("������������\n", outContent.toString());
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
		assertEquals("������������\n", outContent.toString());
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
		assertEquals("������������\n", outContent.toString());
	}

	// �������ϸ�
	@Test
	public void main_05() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-c";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	@Test
	public void main_06() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-l";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	@Test
	public void main_07() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-w";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	@Test
	public void main_08() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-o";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	@Test
	public void main_09() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "-v";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	// �ļ������ϸ�
	@Test
	public void main_10() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.java";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	@Test
	public void main_11() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.c";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	@Test
	public void main_12() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.doc";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	@Test
	public void main_13() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "01.cpp";

		ex1.main(str);
		assertEquals("�����ʽ����\n", outContent.toString());
	}

	// �ļ�δ�ҵ�
	@Test
	public void main_14() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "21.txt";

		ex1.main(str);
		assertEquals("�ļ�������\n", outContent.toString());
	}

	@Test
	public void main_15() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "22.txt";

		ex1.main(str);
		assertEquals("�ļ�������\n", outContent.toString());
	}

	@Test
	public void main_16() {
		final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outContent));
		wcPro ex1 = new wcPro();

		String[] str = new String[1];
		str[0] = "23.txt";

		ex1.main(str);
		assertEquals("�ļ�������\n", outContent.toString());
	}

	// �����������ļ���������
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

	// ����������ͼ�ν��棩
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
