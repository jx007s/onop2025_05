package basic;

public class ForStarMain {

	public static void main(String[] args) {

		System.out.println("1. ------");
		for (int star = 0; star < 5; star++) {
			for (int tt = 0; tt <=star; tt++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2. ------");
		for (int star = 0; star < 5; star++) {
			for (int tt = star; tt <5; tt++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("3. ------");
		for (int star = 0; star < 5; star++) {
			
			for (int tt = star; tt <5-1; tt++) {
				System.out.print(" ");
			}
			
			for (int tt = 0; tt <=star; tt++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
/*
 

2번

 *****
 ****
 ***
 **
 *





 3번

     *
    **
   ***
  ****
 *****
 
 
 &&&&*
 &&&**
 &&***
 &****
 *****
 
 
  4번

 *****
  ****
   ***
    **
     *


 5번

     *
    ***
   *****
  *******
 *********



 6번

 *********
  *******
   *****
    ***
     * 


 */
