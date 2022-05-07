package Recursion;
import java.util.*;
public class Permutation {
	public static TreeSet<String> hs=new TreeSet<>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		permutation(str,"");
		for(String el:hs) {
			System.out.print(el+" ");
		}
	}
	public static void permutation(String str,String substr) {
		if(str.length()==0) {
				hs.add(substr);
		}
		for(int j=0;j<str.length();j++) {
			char ch=str.charAt(j);
			String st=str.substring(0,j)+str.substring(j+1);
			permutation(st,substr+ch);
		}
			
	}
}













