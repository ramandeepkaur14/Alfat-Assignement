package programs;



import java.util.Arrays;



public class program4 {

    public static void main(String[] args) {
        int mapping[] =	{8,9,4,0,2,1,3,5,7,6};
        int nums[] ={991,338,38};

        int [] arr =sortJumbled(mapping,nums);
        int length = arr.length;
        for(int i = 0;i<length;i++)
        {
            System.out.println(arr[i]);
        }


    }

    public static int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[][] converted = new int[n][2];
        for (int i = 0; i < n; ++i) {
            String str = String.valueOf(nums[i]);
            char[] arr = str.toCharArray();
            for (int j = 0; j < arr.length; ++j) {
                arr[j] = (char)(mapping[arr[j] - '0'] + '0');
            }
            converted[i][0] = Integer.parseInt(new String(arr));
            converted[i][1] = i;
        }
        Arrays.sort(converted, (a, b) -> {
            return a[0] - b[0];
        });

        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = nums[converted[i][1]];
        }
        return res;
    }
}




