package com.te.clone;

public class CloningMethodMain  {

	public static void main(String[] args)  {
		
		CloningMethod re=new CloningMethod();
		 try {
			 re.divide(5,0);
		 }catch (Exception e) {
			System.out.println(e.getMessage());
		}
		 
		 try {
			CloningMethod ref=(CloningMethod)re.clone();
			System.out.println(ref);
			System.out.println(re);
			CloningMethod rev=new CloningMethod();
			System.out.println(rev);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 
	}

}
