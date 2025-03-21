public class Sort{
	public static void main(String []args){
		int i,j;
		String[] arr={"best","test","stack","array"};
		System.out.println("Given array is :");
		for(i=0;i<arr.length;i++)
		{
		System.out.print(" "+arr[i]);
		}
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
			if(arr[i].compareTo(arr[j]) > 0)
			{
				String temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
			}
		}	
		System.out.println("\nSorted array :");
		for(i=0;i<arr.length;i++)
		{
		System.out.print(" "+arr[i]);
		}
}
}





























	
