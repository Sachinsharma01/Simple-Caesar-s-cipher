/*   Created by IntelliJ IDEA.
 *   Author: Nishant Mishra
 *   Date: 21-07-2020
 *   Time: 00:26
 *   File: PasswordProblem.java
 */
// que-> create Caesar Cipher Password as
// 1) change all uppercase to lowercase
// 2) char = char + 2
package myPractice;
import java.util.Scanner;
class PasswordProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Please Enter Your Password : ");
        String inputPassword = scn.nextLine().toLowerCase();
        char []inputPasswordArray = inputPassword.toCharArray();
        String pass = "";
        for (char i : inputPasswordArray){
            int value = (int) (i) + 2;
            pass += (char) (value);
        }
        System.out.print("It's Caesar Cipher Code is : "+pass);
    }
}
