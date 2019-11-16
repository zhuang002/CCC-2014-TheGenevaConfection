/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegenevaconfection;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author zhuan
 */
public class TheGenevaConfection {

    static Scanner sc=new Scanner(System.in);
	static int count=0;
	static int boats=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=sc.nextInt();
		for (int i=0;i<n;i++)
			doTestCase();
	}
	private static void doTestCase() {
		// TODO Auto-generated method stub
		Stack<Integer> stack1=new Stack<Integer>();
		Stack<Integer> stack2=new Stack<Integer>();
		count=0;
		boats=sc.nextInt();
		for (int i=1;i<=boats;i++) {
			stack1.push(sc.nextInt());
		}
		for (int i=1;i<=boats;i++) {
			if (!getExpect(i,stack1,stack2))
			{
				System.out.println("N");
				return;
			}
		}
		System.out.println("Y");
	}
	private static boolean getExpect(int expect,Stack<Integer> stack1,Stack<Integer> stack2) {
		// TODO Auto-generated method stub
		if (stack2.isEmpty() || stack2.peek()!=expect) {
			if (count>=boats) return false;
			count++;
			int b = stack1.pop();
			if (b==expect) return true;
			stack2.push(b);
			return getExpect(expect,stack1,stack2);
		}
		
		stack2.pop();
		return true;
	}
    
}
