import java.util.ArrayList;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class task2 {
	static String word;
	public task2(String st) {
		this.word="MyString";
	}
	public static char myCharAt(int n)throws IOException {
		FileWriter fw = new FileWriter("char.txt");
		fw.write(word);
		fw.close();
		FileReader fr = new FileReader("char.txt");
		int d = myLength();
		char ch[] = new char[d];
		int i,c=0,k=0;
		while((c=fr.read())!=-1) {
			ch[k]=(char)c;
			k++;
		}
		System.out.println("The char is : "+ch[n]);
		return ch[n];
	}
	public static char[] mytoCharArray()throws IOException {
		FileWriter fw = new FileWriter("char.txt");
		fw.write(word);
		fw.close();
		FileReader fr = new FileReader("char.txt");
		int d=myLength();
		char ch[] = new char[d];
		int i,c=0,k=0;
		while((c=fr.read())!=-1) {
			ch[k]=(char)c;
			k++;
		}
		for(i=0;i<d;i++) {
			System.out.print(ch[i]);
		}
		return ch;
	}
	public static int myLength()throws IOException {
		int i=0;	 
		char[] ch1 = word.toCharArray();
		 for(char c : ch1)
		 {
			 i++; 
		 }
		        	System.out.println("\nLength of the string = "+i);
		return i;
	}
	public static int myCodePointAt()throws IOException {
		int i;
		char letter = myCharAt(4);
		i=letter;
		System.out.println("The Value of letter is "+i);
		return 0;
	}
	public static int myCodePointBefore(int num)throws IOException {
		num=num-1;
		int i;
		char letter = myCharAt(num);
		i=letter;
		System.out.println("The Value of letter is "+i);
		return 0;
	}
	public static int myCodePointCount(int fi, int li) {
		int count = li-fi;
		System.out.print("code point count is : "+count);
		return count;
	}
	public static int myCompareTo(String word2) {
		int value;
		if(word==word2) {
			value = 0;
			System.out.print(value);
		}
		else {
			value = 5;
			System.out.print(value);
		}
		return value;
	}
	public static char[] myUpperCase()throws IOException {
		int i,d=myLength();
		char[] up = new char[d];
		up = mytoCharArray();
		System.out.println("");
		for(i=0;i<d;i++) {
			if(97<=(int)up[i]&&(int)up[i]<=122) {
				int a =(int)up[i]-32;
				up[i]= (char)a;
			}
			System.out.print(up[i]);
		}
		return up;
	}
	public static char[] myLowerCase()throws IOException {
		int i,d=myLength();
		char[] lw = new char[d];
		lw = mytoCharArray();
		System.out.println("");
		for(i=0;i<d;i++) {
			if(65<=(int)lw[i]&&(int)lw[i]<=90) {
				int a =(int)lw[i]+32;
				lw[i]= (char)a;
			}
			System.out.print(lw[i]);
		}
		return lw;
	}
	public static int myCompareToIgnoreCase(String word2)throws IOException {
		int i,j,d=myLength();
		char[] ch1 = new char[d];
		ch1=myLowerCase();
		char[] ch2 = new char[d];
		System.out.println("");
		word=word2;
		ch2 =myLowerCase();
		int value,count=0;
		System.out.println("");
		for(i=0;i<d;i++) {
			for(j=i;j<d;j++) {
				if(ch1[i]==ch2[j]) {
					count=count+1;
				}
			}
		}
		if(count==d) {
			value=0;
			System.out.print(value);
		}
		else {
			value=5;
			System.out.print(value);
		}
		return value;
	}
	public static String myConCat(String str) {
		System.out.print(word+str);
		return word+str;
	}
	public static boolean myContains(String str)throws IOException {
		boolean value;
		int i,j,d1,d2,n=0,count=0;
		d1=myLength();
		char[] ch1 = mytoCharArray();
		word=str;
		char[] ch2 = mytoCharArray();
		d2=myLength();
		for(i=0;i<d1;i++) {
			for(j=0;j<d2;j++) {
				if(ch1[i]==ch2[j]) {
					count++;
					if(i<d1) {
					i++;
					}
				}
				else {
					break;
				}
			}
		}
		if(count==d2) {
			value = true;
			System.out.println(value);
		}
		else {
			value = false;
			System.out.println(value);
		}
		return value;
	}
	public static boolean myContentEquals(String st)throws IOException {
		boolean value;
		if(word==st) {
			value=true;
			System.out.print(value);
		}
		else {
			value=false;
			System.out.print(value);
		}
		return value;
	}
	public static String myCopyValueOf()throws IOException {
		int i,d1=myLength();
		char[] ch1 = new char[d1];
		ch1 = mytoCharArray();
		String str1= new String(ch1);
		return str1;
	}
	public static boolean myEndWith(String str)throws IOException {
			boolean value;
			int i,j=0,a,count=0;
			int d1=myLength();
		    char[] ch1 = new char[d1];
		    ch1=mytoCharArray();
		    word=str;
		    int d2=myLength();
		    a=d1-d2;
		    int k=0;
		    char[] ch2 = new char[d2];
		    ch2 = mytoCharArray();
		    char[] ch3 = new char[d2];
		    for(i=a;i<d1;i++) {
		    	ch3[k]=ch1[i];
		    	k++;
		    }
		    for(i=0;i<d2;i++) {
		    	for(j=i;j<=i;j++) {
		    		if(ch2[i]==ch3[j]) {
		    			count++;
		    		}
		    		else {
				    	value = false;
				    	System.out.print(value);
				    	return value;
				    }
		    	}
		    }
		    System.out.println("");
		    if(d2==count) {
		    	value = true;
		    	System.out.print(value);
		    }
		    else {
		    	value = false;
		    	System.out.print(value);
		    }
		    return value;		    
	}
	public static boolean myStartWith(String str)throws IOException {
		boolean value;
		int i,j=0,count=0;
		int d1=myLength();
	    char[] ch1 = new char[d1];
	    ch1=mytoCharArray();
	    word=str;
	    int d2=myLength();
	    int k=0;
	    char[] ch2 = new char[d2];
	    ch2 = mytoCharArray();
	    char[] ch3 = new char[d2];
	    for(i=0;i<d2;i++) {
	    	ch3[k]=ch1[i];
	    	k++;
	    }
	    for(i=0;i<d2;i++) {
	    	for(j=i;j<=i;j++) {
	    		if(ch2[i]==ch3[j]) {
	    			count++;
	    		}
	    		else {
			    	value = false;
			    	System.out.print(value);
			    	return value;
			    }
	    	}
	    }
	    System.out.println("");
	    if(d2==count) {
	    	value = true;
	    	System.out.print(value);
	    }
	    else {
	    	value = false;
	    	System.out.print(value);
	    }
	    return value;		    
}
	public static boolean myEquals(String str) {
		boolean value;
		if(word==str) {
			value=true;
			System.out.print(value);
		}
		else {
			value=false;
			System.out.print(value);
		}
		return value;
	}
	public static boolean myEquallIgnoreCase(String word2)throws IOException {
		boolean value;
		int i,j,d=myLength();
		char[] ch1 = new char[d];
		ch1=myLowerCase();
		char[] ch2 = new char[d];
		System.out.println("");
		word=word2;
		ch2 =myLowerCase();
		int count=0;
		System.out.println("");
		for(i=0;i<d;i++) {
			for(j=i;j<d;j++) {
				if(ch1[i]==ch2[j]) {
					count=count+1;
				}
			}
		}
		if(count==d) {
			value=true;
			System.out.print(value);
		}
		else {
			value=false;
			System.out.print(value);
		}
		return value;
	}
	public static int myIndexOf(String str)throws IOException {
		int i,j,d1,d2,n=0,d=0,pos=0;
		d1=myLength();
		char[] ch1 = mytoCharArray();
		word=str;
		char[] ch2 = mytoCharArray();
		d2=myLength();
		for(i=0;i<d1;i++) {
			for(j=0;j<d2;j++) {
				if(ch1[i]==ch2[j]) {
					if(d<1) {
					pos=i;
					d++;
					}
					if(i<d1) {
					i++;
					}
				}
				else {
					pos=-1;
					break;
				}
			}
		}
		System.out.print(pos);
		return pos;
	}
	public static boolean myIsEmpty(String str)throws IOException {
		boolean value;
		word=str;
		int d = myLength();
		if(d==0) {
			value = true;
			System.out.print(value);
		}
		else {
			value = false;
			System.out.print(value);
		}
		return value;
	}
	public static String myReplace(char oldch, char newch)throws IOException {
		int i,d1;
		d1=myLength();
		char[] ch1 = new char[d1];
		ch1=mytoCharArray();
		for(i=0;i<d1;i++) {
			if(ch1[i]==oldch) {
				ch1[i]=newch;
			}
		}
		String st = new String(ch1);
		System.out.println("");
		System.out.print(st);
		return st;
	}
	public static String mySubstring(int st, int lt)throws IOException {
		int i,j=0,d1;
		d1=myLength();
		char[] ch1 = new char[d1];
		ch1 = mytoCharArray();
		char[] ch2 = new char[lt-st+1];
		for(i=0;i<d1;i++) {
			if(st <= i && i <= lt) {
				ch2[j] = ch1[i];
				j++;
			}
		}
		String str = new String(ch2);
		System.out.println("");
		System.out.print(str);
		return str;
	}
	public static String myTrim(String str)throws IOException {
		 int i,num=0;
		 word=str;
		 int d1 = myLength();
		 char[] ch1 = new char[d1];
		 ch1=mytoCharArray();
		 for(i=0;ch1[i]==' ';i++) {
			 if(ch1[i]==(char)32) {
				 num++;			 
			 }			 
		 }
		 System.out.println("\n"+num);
		 System.out.println("\n"+d1);
		 String st=mySubstring(num, d1);
		 System.out.println(st);
		 return st;
	}
	public static void main(String[] args)throws IOException {
		task2 t2 = new task2(word);
		//myCharAt(3);
		//mytoCharArray();
		//myLength();
		//myCodePointAt();
		//myCodePointBefore(3);
		//myCodePointCount(0,7);
		//myCompareTo("MyString");		
		//myUpperCase();
		//myLowerCase();
		//myCompareToIgnoreCase("mysTriNg");
		//myConCat("Created");
		//myContains("tr");
		//myContentEquals("MyString");
		//myCopyValueOf();
		//myEndWith("ing");
		//myStartWith("My");
		//myEquals("MyString");
		//myEquallIgnoreCase("MyStRinG");
		//myIndexOf("value");
		//myIsEmpty("");
		//myReplace('i','o');
		//mySubstring(4,7);
		myTrim("   MyName   ");
		

	}

}
