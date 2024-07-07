import java.util.Scanner;

public class Patterns {	
	
	public static void pattern1 (int n) {
		
		/*
		 * for input 4
		 * output will be
		 * 1111
		 * 2222
		 * 3333
		 * 4444
		 */		
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
	
	
public static void pattern2 (int n) {
		
		/*
		 * for input 4
		 * output will be
		 * 1234
		 * 1234
		 * 1234
		 * 1234
		 */		
		
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		
	}


public static void pattern3 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * 4321
	 * 4321
	 * 4321
	 * 4321
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int j = n; j >= 1; j--) {
			System.out.print(j);
		}
		System.out.println();
	}
	
}


public static void rightAngleTriangleStar1 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * *
	 * **
	 * ***
	 * ****
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= i; j++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

public static void rightAngleTriangleNumber1 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * 1
	 * 12
	 * 123
	 * 1234
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int j = 1; j <= i; j++) {
			System.out.print(j);
		}
		System.out.println();
	}
	
}

public static void rightAngleTriangleNumber3 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * 1
	 * 23
	 * 456
	 * 78910
	 */		
	int number = 1;
	for(int i = 1; i <= n; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print(number);
			number++;
		}
		System.out.println();
	}
	
}

public static void rightAngleTriangleNumber4 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * 1
	 * 23
	 * 345
	 * 4567
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int j = 0; j < i; j++) {
			System.out.print(i+j);
			
		}
		System.out.println();
	}
	
}


public static void rightAngleTriangleNumber5 (int n) {
	
/*
Sample Input 1:
7
Sample Output 1:
7
7 6
7 6 5 
7 6 5 4 
7 6 5 4 3 
7 6 5 4 3 2 
7 6 5 4 3 2 1
Sample Input 2:
6
Sample Output 2:
6
6 5 
6 5 4 
6 5 4 3 
6 5 4 3 2 
6 5 4 3 2 1
*/		
	
	for(int i = n; i >= 1; i--) {
		for(int j = n; j >= i; j--) {
			System.out.print(j);
			System.out.print(" ");
			
		}
		System.out.println();
	}
	
}


public static void rightAngleTriangleStar2 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 *    *
	 *   **
	 *  ***
	 * ****
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int space = n-i; space >= 1; space--) {
			System.out.print(" ");
		}
		for(int star = 1; star <= i; star++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

public static void rightAngleTriangleNumber2 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 *    1
	 *   12
	 *  123
	 * 1234
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int space = n-i; space >= 1; space--) {
			System.out.print(" ");
		}
		for(int number = 1; number <= i; number++) {
			System.out.print(number);
		}
		System.out.println();
	}
	
}

public static void numberPyramid1 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 *    1
	 *   123
	 *  12345
	 * 1234567
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int space = n-i; space >= 1; space--) {
			System.out.print(" ");
		}
		for(int number = 1; number <= i*2-1; number++) {
			System.out.print(number);
		}
		System.out.println();
	}
	
}

public static void numberPyramid2 (int n) {
	
/*
	 Sample Input 1:
5
Sample Output 1:
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
*/		
	
	for(int i = 1; i <= n; i++) {
		for(int space = n-i; space >= 1; space--) {
			System.out.print(" ");
		}
		for(int number = 1; number <= i; number++) {
			System.out.print(i);
			System.out.print(" ");
		}
		System.out.println();
	}
	
}

public static void numberPyramid3 (int n) {
	
/*

Sample Input 1:
5
Sample Output 1:
           1
          232
         34543
        4567654
       567898765
Sample Input 2:
4
Sample Output 2:
           1
          232
         34543
        4567654
        
*/		
	
	for(int i = 1; i <= n; i++) {
		for(int space = n-i; space >= 1; space--) {
			System.out.print(" ");
		}
		
		for(int number = 1; number <= i; number++) {
			System.out.print(number + i - 1);
			
		}
		
		for(int number = i; number > 1; number--) {
			System.out.print(number + i - 2);
			
		}
		
		System.out.println();
	}
	
}


public static void numberIsosceles1 (int n) {
	
/*
	 Sample Input 1:
5
Sample Output 1:
   1
  121
 12321
1234321
*/		
	
	for(int i = 1; i <= n; i++) {
		for(int space = n-i; space >= 1; space--) {
			System.out.print(" ");
		}
		
		for(int number = 1; number <= i; number++) {
			System.out.print(number);
			
		}
		
		for(int number = i; number > 1; number--) {
			System.out.print(number - 1);
			
		}
		
		System.out.println();
	}
	
	
}


public static void starPyramid1 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 *    *
	 *   ***
	 *  *****
	 * *******
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int space = n-i; space >= 1; space--) {
			System.out.print(" ");
		}
		for(int star = 1; star <= i*2-1; star++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}


public static void alphabetPattern1 (int n) {
	
	/*
	 * for input 4
	 * output will be
		ABCD
		ABCD
		ABCD
		ABCD
	 */		
	
	for(int i = 1; i <= n; i++) {
		
		for(int alphabet = 0; alphabet < n; alphabet++) {
			char c = (char) (65 + alphabet);
			System.out.print(c);
		}
		System.out.println();
	}
	
}


public static void alphabetPattern2 (int n) {
	
	/*
	 * for input 4
	 * output will be
		AAAA
		BBBB
		CCCC
		DDDD
	 */		
	
	for(int i = 0; i < n; i++) {
		
		for(int alphabet = 0; alphabet < n; alphabet++) {
			char c = (char) (65 + i);
			System.out.print(c);
		}
		System.out.println();
	}
	
}

public static void alphabetPattern3 (int n) {
	
	/*
	 * for input 4
	 * output will be
		ABCD
		BCDE
		CDEF
		DEFG
	 */		
	
	for(int i = 0; i < n; i++) {
		
		for(int alphabet = 0; alphabet < n; alphabet++) {
			char c = (char) (65 + alphabet + i);
			System.out.print(c);
		}
		System.out.println();
	}
	
}


public static void alphabetPattern4 (int n) {
	
	/*
Sample Input 1:
8
Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH
Sample Input 2:
7
Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
	 */		
	
	for(int i = 1; i <= n; i++) {
		
		for(int alphabet = 0; alphabet < i; alphabet++) {
			char c = (char) (65 + n - i + alphabet);
			System.out.print(c);
		}
		System.out.println();
	}
	
}


public static void invertedTriangleStar1 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * ****
	 *  ***
	 *   **
	 *    *
	 */		
	
	for(int i = 1; i <= n; i++) {
		for(int space = 1; space < i; space++) {
			System.out.print(" ");
		}
		for(int star = n; star >= i; star--) {
			System.out.print("*");
		}
		System.out.println();
	}
	
}

public static void invertedTriangleStar2 (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * ****
	 * ***
	 * **
	 * *
	 */		
	
	for(int i = 1; i <= n; i++) {
		
		for(int star = n; star >= i; star--) {
			System.out.print("*");
		}
		for(int space = 1; space < i; space++) {
			System.out.print(" ");
		}
		System.out.println();
	}
	
}


public static void hourGlassNumber (int n) {
	
	/*
	 * for input 4
	 * output will be
	 * 
	 * 1 2 3 4
	 *  2 3 4
	 *   3 4
	 *    4
	 *   3 4
	 *  2 3 4
	 * 1 2 3 4
	 *
	 */		
	
for(int upperRow = 1; upperRow <=n; upperRow++) {
	
	for(int upperSpace = 1; upperSpace <=upperRow - 1; upperSpace++) {
		System.out.print(" ");
	}
	
	for(int upperNumber = upperRow; upperNumber <=n; upperNumber++) {
		System.out.print(upperNumber + " ");
	}	
	
	System.out.println();
	
	
	}


for(int lowerRow = 2; lowerRow <= n; lowerRow++) {
	
	for(int lowerSpace = 1; lowerSpace <= n - lowerRow; lowerSpace++) {
		System.out.print(" ");
	}
	
	for(int lowerNumber = n - lowerRow + 1; lowerNumber <=n; lowerNumber++) {
		System.out.print(lowerNumber + " ");
	}	
	
	System.out.println();
		
	}
	
}
	
	
	public static void main(String args[]) {
		int n;
		System.out.print("Please enter a value: ");
		Scanner userInput = new Scanner(System.in);
		n = userInput.nextInt();
		
		hourGlassNumber(n);		
		
		userInput.close();
	}
}

