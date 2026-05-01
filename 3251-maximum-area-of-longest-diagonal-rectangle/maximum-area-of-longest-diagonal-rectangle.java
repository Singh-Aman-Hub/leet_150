class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int max=arr[0][0]*arr[0][1];
        double max1=Math.sqrt((arr[0][0]*arr[0][0])+(arr[0][1]*arr[0][1]));
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int temp=(arr[i][0]*arr[i][0])+(arr[i][1]*arr[i][1]);
            double sqrt=Math.sqrt(temp);
            if(max1<sqrt || (max1==sqrt && max<arr[i][0]*arr[i][1]))
            {
                max=arr[i][0]*arr[i][1];
                max1=sqrt;
            }
        }
        return max;
    }
}