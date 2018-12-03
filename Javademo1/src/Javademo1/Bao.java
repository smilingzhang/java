package Javademo1;

public class Bao {

	public Bao() {
		// TODO 自动生成的构造函数存根
	}
	public static void main(String[] args) {
		/*包的概念（1）包对java源文件没有作用，只对class字码节文件起作用
		（2）包相当于一个字码节的相对路径，引入包可以防止文件名之间的
		冲突，用public修饰的顶级类和接口对包外代码可见*/
		 /**1.
		  * 1）包的概念
		  * 包（package）是Java提供的一种区别类的名字空间的机制，是类的组织方式，是一组相关类和接口的集合，它提供了访问权限和命名的管理机制。
		  Java中提供的包主要有以下3种用途:
		  1) 将功能相近的类放在同一个包中，可以方便查找与使用。
		  2) 由于在不同包中可以存在同名类，所以使用包在一定程度上可以避免命名冲突。
		  3) 在Java中，某次访问权限是以包为单位的。
		  */
		 /**
		  * 2）包的定义
		  * a：定义了包之后，这个包内的所有类的全名就是 包名.类名
		  * b:包对应这文件系统的目录层次
		  * c:在同一包中的类可以相互访问，无需import语句
		  */
		 /**
		  * 3）类的其他修饰符
		  * a:final表明这个类是一个最终的类，不能由这个类派生出其他的子类
		  * b:abstract抽象类不能实例化对象
		  */
	}

}
