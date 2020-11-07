public class keyindex
{
	public void key(int[] arr)
	{
		int R = 256;
		int N = arr.length;
		int[] aux = new int[N];
		int[] count = new int[R+1];
		// Compute frequency counts.
 		for (int i = 0; i < N; i++)
 		{
 			count[arr[i]+ 1]++;
 		}
 		
 		// Transform counts to indices.
 		for (int r = 0; r < R; r++)
 		{
 			count[r+1] += count[r];
 		}
 		
 		// Distribute the records.
		for (int i = 0; i < N; i++)
		{
			aux[count[arr[i]]++] = arr[i];
		}
		
 		// Copy back.
 		for (int i = 0; i < N; i++)
 		{
 			arr[i] = aux[i];
 		}
 		for(int i : arr)
 		{
 			System.out.print(i +" ");
 		}
	}
	public static void main(String[] args)
	{
		keyindex obj = new keyindex();
		int x[] = {2,3,1,1,5,0,4,8,5,4,7};
		obj.key(x);
	}
}