package qa.test;

public class TestFunc {
	public static void main(String[] args){
		String temp = "";
		
//		*******
//		  *****
//		    ***
//		      *
		for(int i=0;i<9;i=i+2){
			temp = "";
			for(int j=0;j<9;j++){
				if(j<i){
					temp=temp+" ";
				}else{
					temp=temp+"*";
				}
			}
			System.out.println(temp);
		}
		
//	     *    
//	    ***   
//	   *****  
//	  ******* 
//	 *********	
		for(int i=4;i>=0;i--){
			temp = "";
			for(int j=1;j<=9;j++){
				if(j<=i || j>(i+(9-(2*i)))){
					temp = temp + " ";
				}else{
					temp = temp + "*";
				}
			}
			System.out.println(temp);
		}
		
		System.exit(0);
	}
}
