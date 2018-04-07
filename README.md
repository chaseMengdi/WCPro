# wcPro
### 第4周小组作业：WordCount优化

### 项目说明：
<br>对记事本（txt）文件进行单词的词频统计和排序，排序结果以指定格式输出到默认文件中，并要求能够快速地完成整个统计和结果输出功能。
<br>可执行程序命名为：wcPro.exe，该程序处理用户需求的模式为：
<br>wcPro.exe [input_file_name]
<br>存储统计结果的文件为result.txt，放在与wcPro.exe相同的目录下。
<br>开发工具：MyEclipse Eclipse
<br>测试工具：JUnit框架
<br>项目工程：/src/wcPro
<br>单元测试工程：/src/wcProTest
<br>可执行文件目录：/BIN

### 任务分工：
* 王  迪：main函数编写，判断并处理命令行参数
* 成建伟：统计文件内单词和词频，定义模块接口
* 刘博谦：单词与词频的排序，图形界面的实现
* 侯  岱：将排序后的单词与词频输出到文件

### 项目框架：
* 变量：
  * HashMap<String, Integer> map
  * 存放统计后的单词与词频
  * ArrayList<String> str
  * 存放排序后的单词和词频
  * String message
  * 存放输出到文件的内容
  * String[] split
  * 存放忽略不计的分隔符
* 函数：
  * public static void main(String[] args)
  * 主函数判断并处理命令行参数
  * public static HashMap<String, Integer> count(String thefile)
  * 统计文件内单词与词频
  * public static ArrayList<String> sort(HashMap<String, Integer> map)
  * 单词与词频的排序
  * public static String print(ArrayList<String> str)
  * 排序后结果输出到指定文件
  * public static String show()
  * 图形界面选择txt文件
  
### 代码贡献率：
* 成建伟(17091) 0.51
* 刘博谦(17070) 0.28
* 侯  岱(17083) 0.13
* 王  迪(17074) 0.08
