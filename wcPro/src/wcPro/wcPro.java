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
	// �������
	public static void main(String[] args) {
		if (args.length == 1) {
			if (args[0].endsWith(".txt")) {
				HashMap<String, Integer> map = wcPro.count(args[0]);
				String pri=wcPro.print(wcPro.sortList(map));
				System.out.println(pri);
			} else if (args[0].equals("-x")) {
				imgShow();
			} else{
				System.out.print("�����ʽ����\n");
			}
		} else{
			System.out.print("������������\n");
		}
	}

	// ����ͳ�Ƶ�����
	public static HashMap<String, Integer> count(String thefile) {
		File file = new File(thefile);
		HashMap<String, Integer> map = new HashMap<>();
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
				BufferedReader br = new BufferedReader(isr);
				String line = "";
				StringBuffer sb = new StringBuffer();
				while ((line = br.readLine()) != null) {
					// תΪСд
					line = line.toLowerCase();
					int k = 0;
					// ȥ�����׵ķ���ĸ����
					char first = line.charAt(k);
					while (!((first >= 'a' && first <= 'z') || first == '-')) {
						k++;
						first = line.charAt(k);
					}
					line = line.substring(k);
					// ȥ������ո�\\s+
					String[] split = line
							.split("\\s++|0|1|2|3|4|5|6|7|8|9|\\_|\\'|\\.|\\,|\\;|\\(|\\)|\\~|\\!|"
									+ "\\@|\\#|\\$|\\%|\\&|\\*|\\?|\""
									+ "|\\[|\\]|\\<|\\>|\\=|\\+|\\*|\\/|\\{|\\}|\\:|\\||\\^|\\`");
					for (int i = 0; i < split.length; i++) {
						// ��ȡ��ÿһ������
						Integer integer = map.get(split[i]);
						// ����ĩβΪ-�ĵ��ʻ�ͷΪ---
						if ((split[i].endsWith("-") || split[i].startsWith("-"))
								&& !(split[i].equals("-"))) {
							// ȥ������ո�\\s+
							String[] sp = split[i].split("\\s++|\\-");
							// ȫ��Ϊ----
							if (sp.length == 0) {
								split[i] = "-";
								integer = map.get(split[i]);
							}
							// ����--dan
							else if (split[i].startsWith("-")) {
								int j = 0;
								char si = split[i].charAt(0);
								while (split[i].charAt(j) == si)
									j++;
								split[i] = split[i].substring(j);
								integer = map.get(split[i]);
							}
							// ȥ������ո�\\s+
							sp = split[i].split("\\s+|\\-");
							// ȫ��Ϊ----
							if (sp.length == 0) {
								split[i] = "-";
								integer = map.get(split[i]);
							}
							// ����dn-dan---
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
							// ������������map��û�У���ֵ1
							if (null == integer) {
								map.put(split[i], 1);
							} else {
								// ����У���ԭ���ĸ����ϼ���һ
								map.put(split[i], ++integer);
							}
						}
					}
				}
				//sb.append(line);
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
			System.out.print("�ļ�������\n");
		}
		return map;
	}

	// ��Ƶ����
    public static ArrayList<String> sortList(HashMap<String, Integer> hashMap) {
        // ��Key��������
        TreeMap treeMap = new TreeMap(hashMap);
        // ��value��������
        ArrayList<Map.Entry<String, Integer>> sortList = new ArrayList<Map.Entry<String, Integer>>(
                treeMap.entrySet());
        Collections.sort(sortList, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> mapEntry_1,
                    Map.Entry<String, Integer> mapEntry_2) {
                // ����
                return mapEntry_2.getValue() - mapEntry_1.getValue();
                // ���� mapEntry_1.getValue() - mapEntry_2.getValue()��
            }
        });
        ArrayList<String> strSort = new ArrayList<String>();
        int loopNum = 0;
        for (Map.Entry<String, Integer> mapString : sortList) {
            // �ų�-��ո�
            if (!(mapString.getKey().equals("")) && !(mapString.getKey().equals("-"))) {
                strSort.add(mapString.getKey());
                strSort.add(mapString.getValue().toString());
                // ���ǰ100������
                if (loopNum > 100)
                    break;
                loopNum++;
            }
        }
        return strSort;
    }

	// �������
	public static String print(ArrayList<String> str) {
		String message = "";
		StringBuffer buf=new StringBuffer();
		int i = 0;
		//FileWriter writer = null;
		OutputStreamWriter writer = null;
		try {
			// ��һ��д�ļ��������캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�
			//writer = new FileWriter("result.txt", true);
			writer=new OutputStreamWriter(new FileOutputStream("result.txt",true),"UTF-8");
			//FileOutputStream("result.txt",true)���캯���еĵڶ�������true��ʾ��׷����ʽд�ļ�
			for (i = 0; i < str.size() - 1; i++) {
				writer.write((str.get(i) + " " + str.get(i + 1) + "\r\n")
						.toCharArray());
				buf.append(str.get(i) + " " + str.get(i + 1) + "\r\n");
				//message += (str.get(i) + " " + str.get(i + 1) + "\r\n");
				// ���ǰ100������
				if (i > 100)
					break;
				i++;
			}
			writer.write(("-------------------\r\n").toCharArray());
			writer.close();
		} catch (IOException e) {
			System.out.print("�ļ���д����" + e + "\n");
		}
		finally{
			try {
				writer.close();
			} catch (IOException e) {
				System.out.print("�رմ���" + e + "\n");
			}
		}
		message=buf.toString();
		return message;
	}

	// ͼ�ν���
    public static String imgShow() {
        // Ĭ�ϵĴ�·��Ϊ���ҵ��ĵ���
        JFileChooser fileChooser = new JFileChooser(new File(
                System.getProperty("user.dir")));
        // ����Ĭ��Ŀ¼Ϊ�õ����̵�·��
        fileChooser.setDialogTitle("��ѡ���ļ�");
        FileNameExtensionFilter nameFilter = new FileNameExtensionFilter(
                "�ı��ļ�(*.txt)", "txt");
        fileChooser.setFileFilter(nameFilter);
        int returnVal = fileChooser.showOpenDialog(null);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            String[] filePath = new String[1];
            filePath[0] = fileChooser.getSelectedFile().getPath();
            main(filePath);
            return "ͼ�ν���򿪳ɹ�\n";
        } else {
            return "ͼ�ν����ʧ��\n";
        }
    }
}