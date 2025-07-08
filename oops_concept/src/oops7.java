
public class oops7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String str1="kark";
          String str2="kakr";
          str1=str1.toLowerCase();
          str2=str2.toLowerCase();
          if(str1.endsWith(" "+str2.substring(0,1))) {
        	  str1=str2.substring(1);
          }
          String re=str1+str2;
          System.out.println(re);
	}

}
