/*编程，保存两本书名，用+拼接，看效果。
保存两个性别，用+拼接，看效果。
保存两本书的价格，用+拼接，看效果。*/
//写一个公共类public
public class test03{
	//写一个main方法
	public static void main(String[] args){
		//错误：char c1 = '红楼梦';
		//     char c2 = '三国演义';
		//写书名需要用字符串String，因为不是单个的字符
		String book1 = "红楼梦";
		String book2 = "三国演义";
		char c3 = '男';
		char c4 = '女';
		float price1 = 20.1f;
		float price2 = 21.5f;
		System.out.println(book1 + book2);
		System.out.println(c3 + c4);
		System.out.println(price1 + price2);

	}
}