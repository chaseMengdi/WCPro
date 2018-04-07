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
}
