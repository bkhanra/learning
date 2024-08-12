package learning;
import java.util.Scanner;

public class Arrays {
	
	public static void swap(int[] arr, int l, int r) {
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
	}

    public static int takeInput(String str) {
        System.out.print(str);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        return input;
    }

    public static int sumOfArray(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }

    public static int[] createArrayWithSize() {
        int size = takeInput("Enter the size of the array: ");
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            int element = takeInput("Please enter " + i + "th number of the array: ");
            arr[i] = element;
        }
        return arr;
    }

    public static int[] createArrayWithCapacity() {
        int capacity = takeInput("Enter the capacity of the array: ");
        int size = takeInput("Enter the length of the array: ");
        int arr[] = new int[capacity];
        for (int i = 0; i < size; i++) {
            int element = takeInput("Please enter " + i + "th number of the array: ");
            arr[i] = element;
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] rotateRightNew(int[] arr, int step) {
        int length = arr.length;
        int[] rotatedArr = new int[length];
    
        	for(int i = 0; i < arr.length; i++) {
        		rotatedArr[(i + step) % arr.length] = arr[i];
        	}

        return rotatedArr;
    }
    
    public static int[] rotateLeftNew(int[] arr, int step) {
        int length = arr.length;
        int[] rotatedArr = new int[length];
    
        	for(int i = 0; i < arr.length; i++) {
        		rotatedArr[(i - step + arr.length) % arr.length] = arr[i];
        	}

        return rotatedArr;
    }
    
    public static int[] reverseArrayNew(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                size = i;
                break;
            }
        }
        
        int[] reverseArr = new int[arr.length];
        
        for (int i = 0; i < size; i++) {
            reverseArr[size - 1 - i] = arr[i];
        }
        
        return reverseArr;
    }

    public static int[] reverseArraySame(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        int size = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                size = i;
                break;
            }
        }
        
        int l = 0;
        int r = size - 1;
        
        for (int i = 0; i < size / 2; i++) {
            if (l < r) {
                swap(arr, l, r);
            }
            l++;
            r--;
        }
        
        return arr;
    }
    
    public static int[] rotateRightSame(int[] arr, int size, int step) {
    	
    	step = step % size;
    	int l = 0;
        int r = size - 1;
        
        for (int i = 0; i < size / 2; i++) {
            if (l < r) {
                swap(arr,l,r);
            }
            l++;
            r--;
        }
        
       
        
        int l1 = 0;
        int r1 = step - 1;
        
        for (int i = 0; i < step / 2; i++) {
            if (l1 < r1) {
                swap(arr, l1, r1);
            }
            l1++;
            r1--;
        }
        
        int l2 = step;
        int r2 = size - 1;        
        for (int i = 0; i < size / 2; i++) {
            if (l2 < r2) {
                swap(arr, l2, r2);
            }
            
            l2++;
            r2--;
        }  
                 
    	return arr;
    }
    
public static int[] rotateLeftSame(int[] arr, int size, int step) {
    	
    	step = step % size;
    	int l = 0;
        int r = size - 1;
        
        for (int i = 0; i < size / 2; i++) {
            if (l < r) {
                swap(arr,l,r);
            }
            l++;
            r--;
        }
        
       
    
        
        int l1 = 0;
        int r1 = size - step - 1;
        
        for (int i = 0; i < (size - step) / 2; i++) {
            if (l1 < r1) {
                swap(arr, l1, r1);
            }
            
            l1++;
            r1--;
        }
     
        
        int l2 = size - step;
        int r2 = size - 1;        
        for (int i = 0; i < size / 2; i++) {
            if (l2 < r2) {
                swap(arr, l2, r2);
            }
            
            l2++;
            r2--;
        }  
                 
    	return arr;
    }

	public static int facto(int i) {
		if(i<0) {
			throw new IllegalArgumentException("Number must be non-negative");
			
		} else if(i==0 || i==1) {
			return 1;
		} else {
			return i * facto(i-1);
		}
	}
	
	public static int nLargest(int[] arr, int n) {
		if(n==0) {
			return 0;
		}
		int max = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int sLargest(int[] arr, int n) {
		if(n==0) {
			return 0;
		}
		int max = arr[0];
		int max2 = arr[0];
		for(int i = 1; i < n; i++) {
			if(arr[i]>max) {
				max2 = max;
				max = arr[i];
			} else if(arr[i]>max2) {
				max2 = arr[i];
			}
		}
		return max2;
	}
	
	public static void insertElem(int[] arr, int size, int capacity, int pos, int elem) {
		if(size >= capacity || pos >= capacity) {
			return;
		}
		printArr(arr);
		
		for(int i = size; i > pos; i--) {
			arr[i] = arr[i-1];
		}
		arr[pos] = elem;
		printArr(arr);
	}
	
	public static void updateArr(int[] arr, int size, int key, int newkey) {
		if(size <= 0) {
			return;
		}
		for(int i = 0; i < size; i++) {
			if(arr[i]==key) {
				arr[i] = newkey;
				return;
			}	
		}
		System.out.println("Key not found!");
	}
	
	public static void pushZeroes(int[] arr) {	
		int nzIndex = 0;
		int zIndex = 0;
		
		while(zIndex < arr.length) {
					
			if(arr[zIndex]!=0) {
				swap(arr,zIndex,nzIndex);
				nzIndex++;				
			}			
			zIndex++;			
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
//--------------------------------------------------------
	// Alternate function for left and right rotation with reverse logic
	
	public static void reverse(int[] arr, int l, int r) {
		r--;	
		while(l<r) {
			swap(arr,l,r);
			l++;
			r--;
		}
		
	}
	
	public static void right(int[] arr, int step) {
		step = step % arr.length;
		reverse(arr, 0, arr.length);
		reverse(arr, 0, step);
		reverse(arr, step, arr.length);
	}
	
	public static void left(int[] arr, int step) {
		step = step % arr.length;
		reverse(arr, 0, arr.length);
		reverse(arr, 0, arr.length - step);
		reverse(arr, arr.length - step, arr.length);
	}

//--------------------------------------------------------	
	
	
	
	public static int[] sumOfArrays(int[] a, int[] b) {
	    int[] sum = new int[Math.max(a.length, b.length) + 1];
	    int i = a.length - 1;
	    int j = b.length - 1;
	    int k = sum.length - 1;
	    int carry = 0;

	    while (i >= 0 && j >= 0) {
	        int total = a[i] + b[j] + carry;
	        if (total >= 10) {
	            sum[k] = total % 10;
	            carry = total / 10;
	        } else {
	            sum[k] = total;
	            carry = 0;
	        }
	        i--;
	        j--;
	        k--;
	    }

	    while (i >= 0) {
	        int total = a[i] + carry;
	        if (total >= 10) {
	            sum[k] = total % 10;
	            carry = total / 10;
	        } else {
	            sum[k] = total;
	            carry = 0;
	        }
	        i--;
	        k--;
	    }

	    while (j >= 0) {
	        int total = b[j] + carry;
	        if (total >= 10) {
	            sum[k] = total % 10;
	            carry = total / 10;
	        } else {
	            sum[k] = total;
	            carry = 0;
	        }
	        j--;
	        k--;
	    }

	    // If there's a carry left, put it in the first position
	    sum[k] = carry;

	    return sum;
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


    public static void main(String args[]) {
       
       int A[] = {1,7,9,10};
       int B[] = {0,2,3,4,5,6,8,11};
       int sum[] = mergeArrays(A,B);
       printArr(sum);
       int[] arr = {2,8,3,1,0,10,9,15,81,11,12};
       mergeSort(arr);
       printArr(arr);
       
       
       
    }
}
