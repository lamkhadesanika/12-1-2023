package com_awt;

import java.util.Arrays;

public class numeric {


	public static void main(String[] args){   
	    
	    int[]  num = {1,2,3,4,5,6};
	            
	   String[] str = {"sanika","yash","divya"};
	   
	    System.out.println("Original numeric array : "+Arrays.toString(num));
	    Arrays.sort(num);
	    System.out.println("Sorted numeric array : "+Arrays.toString(num));
	    
	    System.out.println("Original string array : "+Arrays.toString(str));
	    Arrays.sort(str);
	    System.out.println("Sorted string array : "+Arrays.toString(str));
	    }
	}    

