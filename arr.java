class arr{
    public static void main(String[] args) {
        int[][] arr = {{10,20,30},
        {80,50,60}
        };

        for (int i  :  arr[0]){
            System.out.print(i +" ");

        }

        System.err.println(arr[0][0]);
        arr[1][1] += 10;
        System.err.println(arr[1][1]);
        arr[0][0] = 2;
        System.out.println(arr[0][0]);
        

    }
}