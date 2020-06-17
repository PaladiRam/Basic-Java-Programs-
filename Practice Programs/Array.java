class arraySort {    
   public static void main(String[] args) {
        int x[] = {20, 20, 30, 40, 50, 50, 50};  
		System.out.println("Original array length: "+x.length);
		System.out.print("Array elements are: ");
       for (int i = 0; i < x.length; i++)
        {
            System.out.print(x[i]+" ");
        }
		System.out.println("The new length of the array is: "+array_sort(x));
			
    }
    
    public static int array_sort(int[] x) {
         int index = 1;
        for (int i = 1; i < x.length; i++) {
            if (x[i] != nums[index-1])
                x[index++] = x[i];
        }
	  return index;
    }
}