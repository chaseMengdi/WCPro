package wcPro; 

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

public class wcPro {
// 输入控制
	public static void main(String[] args) {
		if (args.length == 1) {
			if (args[0].endsWith(".txt")) {
				HashMap<String, Integer> map = wcPro.count(args[0]);
				wcPro.print(wcPro.sort(map));
			} else if (args[0].equals("-x")) {
				show();
			} else{
				System.out.print("输入格式错误\n");
			}
		} else{
			System.out.print("参数数量错误\n");
		}
	}
// 划分统计单词数
	public static HashMap<String, Integer> count(String thefile) {
		File file = new File(thefile);
		HashMap<String, Integer> map = new HashMap<>();
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String line = new String("");
				StringBuffer sb = new StringBuffer();
				while ((line = br.readLine()) != null) {
					// 转为小写
					line = line.toLowerCase();
					int k = 0;
					// 去除行首的非字母单词
					char first = line.charAt(k);
					while (!((first >= 'a' && first <= 'z') || first == '-')) {
						k++;
						first = line.charAt(k);
					}
					line = line.substring(k);
					// 去除多个空格\\s+
					String[] split = line
							.split("\\s++|0|1|2|3|4|5|6|7|8|9|\\_|\\'|\\.|\\,|\\;|\\(|\\)|\\~|\\!|"
									+ "\\@|\\#|\\$|\\%|\\&|\\*|\\?|\""
									+ "|\\[|\\]|\\<|\\>|\\=|\\+|\\*|\\/|\\{|\\}|\\:|\\||\\^|\\`");
					for (int i = 0; i < split.length; i++) {
						// 获取到每一个单词
						Integer integer = map.get(split[i]);
						// 考虑末尾为-的单词或开头为---
						if ((split[i].endsWith("-") || split[i].startsWith("-"))
								&& !(split[i].equals("-"))) {
							// 去除多个空格\\s+
							String[] sp = split[i].split("\\s++|\\-");
							// 全部为----
							if (sp.length == 0) {
								split[i] = "-";
								integer = map.get(split[i]);
							}
							// 处理--dan
							else if (split[i].startsWith("-")) {
								int j = 0;
								char si = split[i].charAt(0);
								while (split[i].charAt(j) == si)
									j++;
								split[i] = split[i].substring(j);
								integer = map.get(split[i]);
							}
							// 去除多个空格\\s+
							sp = split[i].split("\\s+|\\-");
							// 全部为----
							if (sp.length == 0) {
								split[i] = "-";
								integer = map.get(split[i]);
							}
							// 处理dn-dan---
							else {
								String tmp = sp[0];
								for (int j = 1; j < sp.length; j++) {
									tmp = tmp + "-" + sp[j];
								}
								split[i] = tmp;
								integer = map.get(split[i]);
							}
						}
						if (!split[i].equals("") && !split[i].equals("-")) {
							// 如果这个单词在map中没有，赋值1
							if (null == integer) {
								map.put(split[i], 1);
							} else {
								// 如果有，在原来的个数上加上一
								map.put(split[i], ++integer);
							}
						}
					}
				}
				sb.append(line);
				br.close();
				isr.close();
				fis.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			System.out.print("文件不存在\n");
		}
		return map;
	}
// 词频排序
	public static ArrayList<String> sort(HashMap<String, Integer> map) {
		// 以Key进行排序
		TreeMap treemap = new TreeMap(map);
		// 以value进行排序
		ArrayList<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
				treemap.entrySet());
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
			public int compare(Map.Entry<String, Integer> o1,
					Map.Entry<String, Integer> o2) {
				// 降序
				return o2.getValue() - o1.getValue();
				// 升序 o1.getValue() - o2.getValue()）
			}
		});
		ArrayList<String> str = new ArrayList<String>();
		int i = 0;
		for (Map.Entry<String, Integer> string : list) {
			// 排除-与空格
			if (!(string.getKey().equals("")) && !(string.getKey().equals("-"))) {
				str.add(string.getKey());
				str.add(string.getValue().toString());
				// 输出前100个单词
				if (i > 100)
					break;
				i++;
			}
		}
		return str;
	}
// 控制输出
	public static String print(ArrayList<String> str) {
		String message = "";
		int i = 0;
		try {
			// 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件
			FileWriter writer = new FileWriter("result.txt", true);
			for (i = 0; i < str.size() - 1; i++) {
				writer.write((str.get(i) + " " + str.get(i + 1) + "\r\n")
						.toCharArray());
				message += (str.get(i) + " " + str.get(i + 1) + "\r\n");
				// 输出前100个单词
				if (i > 100)
					break;
				i++;
			}
			writer.write(("-------------------\r\n").toCharArray());
			writer.close();
		} catch (IOException e) {
			System.out.print("文件读写错误" + e + "\n");
		}
		return message;
	}
// 图形界面
	public static String show() {
		// 默认的打开路径为“我的文档”
		JFileChooser fcDlg = new JFileChooser(new File(
				System.getProperty("user.dir")));
		// 设置默认目录为得到工程的路径
		fcDlg.setDialogTitle("请选择文件");
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"文本文件(*.txt)", "txt");
		fcDlg.setFileFilter(filter);
		int returnVal = fcDlg.showOpenDialog(null);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			String[] filepath = new String[1];
			filepath[0] = fcDlg.getSelectedFile().getPath();
			main(filepath);
			return "图形界面打开成功\n";
		} else {
			return "图形界面打开失败\n";
		}
	}
}
