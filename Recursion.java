package learning;

public class Recursion {
	
	public static int factorial(int n) {
		if(n==0) {
			return 1;
		}
		int smallOutput = factorial(n-1);
		int output = n * smallOutput;
		return output;
	}
	
	public static int fib(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		
		return fib(n-1) + fib(n-2);
	}
	
	public static boolean isSorted(int[] a) {
		if(a.length == 1) {
			return true;
		} else if(a[0]>a[1]) {
			return false;
		} else {
			int b[] = new int[a.length-1];
			for(int i = 0; i<b.length; i++) {
				b[i]=a[i+1];
			}
			return isSorted(b);
		}
	}
	
	public static int findStartIndex(int[] a, int x, int si) {
		if(si==a.length) {
			return -1;
		}
		if(a[si]==x) {
			return si;
		}		
	
		return findStartIndex(a, x, si+1);
		
		
	}
	
	public static int findLastIndex(int[] a, int x, int ei) {	
		
		
		if(ei < 0) {
			return -1;
		}
		
		if(a[ei]==x) {
			return ei;
		} else {
			
			return findLastIndex(a, x, ei-1);
		}	
				
	}

	
	public static boolean isSortedBetter(int[] a, int si) {
	
		if(si==a.length-1) {
			return true;
		} else if(a[si]>a[si+1]) {
			return false;
		}		
		
		return isSortedBetter(a, si+1);
		
	}
	
	
	public static boolean isPalindrome(String str, int l, int r) {
		if(l >= r) {
			return true;
		}
		
		
		if(!(str.charAt(l)==str.charAt(r))) {
			return false;
		}
		
		return isPalindrome(str, l+1, r-1);
	}
	
	public static boolean isTheStringPalindrome(String str) {
		if(str.length()==0 || str.length()==1) {
			return true;
		}
		
		if(str.charAt(0)!=str.charAt(str.length()-1)) {
			return false;
		}
		
		return isTheStringPalindrome(str.substring(1,str.length()-1));
	}
	
	public static String replaceChar(String str, char key, char value) {
	    
	    if (str.length() == 0) {
	        return str;
	    }


	    char firstChar = (str.charAt(0) == key) ? value : str.charAt(0);

	    return firstChar + replaceChar(str.substring(1), key, value);
	}
	
	
	public static String replacePi(String str) {
	    
	    if (str.length() <= 1) {
	        return str;
	        } 	    
	    
	    if(str.charAt(0) == 'p' && str.charAt(1) == 'i') {
	    	
	    	String firstTwo = "3.14";
	    	
	    	return firstTwo + replacePi(str.substring(2));
	    	
	    } else {
	    	return str.substring(0,1) + replacePi(str.substring(1));
	    }

	    
	}
	
	
	public static int recursiveBinarySearch(int[] a, int x, int si, int ei) {
		if(si>ei) {
			return -1;
		}
		
		
			int mid = (si+ei)/2;
			if(a[mid]==x) {
				return mid;
			} if(a[mid]>x) {
				return recursiveBinarySearch(a, x, si, mid-1);
			} else {
				return recursiveBinarySearch(a, x, mid+1,ei);
			}
		
	}
	
	public static int[] mergeArrays(int[] a, int[] b) {
		int i = 0, j = 0, k = 0;
		int m = a.length, n = b.length, p = m+n;
		int[] c = new int[p];
		while(i<m && j<n) {
			if(a[i]<b[j]) {
				c[k++]=a[i++];				
			} else {
				c[k++]=b[j++];
			}
		}
		
		while(i<m) {
			c[k++]=a[i++];
		}
		
		while(j<n) {
			c[k++]=b[j++];
		}
		
		return c;
		
	}
	
	public static int[] mergeSort(int[] arr) {
		int len = arr.length;
		if (len < 2) {
	        return arr; 
	    }
		
		int mid = len/2;		
		int[] a = new int[mid];
		int[] b = new int[len-mid];
		
		for(int i = 0; i <mid; i++) {
			a[i]=arr[i];
		}
		for(int i = mid; i <len; i++) {
			b[i-mid]=arr[i];
		}
		
		a = mergeSort(a);
		b = mergeSort(b);
		return mergeArrays(a,b);		
	}
	
	public static int partition(int[] a, int si, int ei) {
	    int pivotElement = a[si];
	    int count = 0;

	  
	    for (int i = si + 1; i <= ei; i++) {
	        if (a[i] <= pivotElement) {
	            count++;
	        }
	    }

	 
	    int pivotIndex = si + count;
	    int temp = a[si];
	    a[si] = a[pivotIndex];
	    a[pivotIndex] = temp;

	    
	    int i = si, j = ei;

	    while (i < j) {
	        if ( a[i] < pivotElement) {
	            i++;
	        }

	        if (a[j] >= pivotElement) {
	            j--;
	        } else {
	            temp = a[i];
	            a[i] = a[j];
	            a[j] = temp;
	            i++;
	            j--;
	        }
	    }

	    return pivotIndex;
	}


	public static void quickSort(int[] a, int si, int ei) {
	    if(si >= ei) {
	        return;
	    }
	    
	    int pivotIndex = partition(a, si, ei);
	    quickSort(a, si, pivotIndex - 1);
	    quickSort(a, pivotIndex + 1, ei);
	}
	
	
	public static void toh(int n, String s, String d, String h) {
		if(n<=0) {
			return;
		} else {
			toh(n-1, s, h, d);
			System.out.println("Disk " + n + " moved from " + s + " to " + d);
			toh(n-1, h, d, s);
		}
	}

	
	public static void main(String[] args) {
	
		
		int arr[] = {0,1,2,3,4,5,6,7,3};
//		String str = "ppiabappibauytr56pipippp1i";
//		
//		System.out.println(isTheStringPalindrome(str));
//		
//		
//		System.out.println(str.substring(1));
		
//		System.out.println(recursiveBinarySearch(arr,1,0,7));
		
//		printArr(arr);
//		
//		quickSort(arr,0,arr.length-1);
//		
//		printArr(arr);
		
		
		toh(4, "Source", "Destination", "Helper");

	}

	private static void printArr(int[] arr) {
		// TODO Auto-generated method stub
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		
	}
	
	

}
