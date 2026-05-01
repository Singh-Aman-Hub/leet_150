class Solution {
    public int areaOfMaxDiagonal(int[][] arr) {
        int max = arr[0][0] * arr[0][1];
        int m = arr.length;

        double max1 = Math.sqrt((arr[0][0]*arr[0][0]) + (arr[0][1]*arr[0][1]));

        for(int i = 0; i < m; i++)
        {
            int temp = (arr[i][0]*arr[i][0]) + (arr[i][1]*arr[i][1]);
            double sqr = Math.sqrt(temp);

            if (max1 < sqr || (max1 == sqr && max < arr[i][0] * arr[i][1]))
            {
                max = arr[i][0] * arr[i][1];
                max1 = sqr;
            }
        }
        return max;
    }
}