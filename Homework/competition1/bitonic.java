public boolean checkBitonic(int[] inArray) {
    if (inArray.length < 3 || inArray[0] > inArray[1])
        return false;
 
    boolean decreasing = false;
 
    for (int i = 1; i < inArray.length - 1; i++) {
        if (inArray[i] == inArray[i + 1] || decreasing && inArray[i] < inArray[i + 1])
            return false;
        else if (!decreasing)
            decreasing = inArray[i] > inArray[i + 1];
    }

    return decreasing;
}

System.out.println("Should be true: " + checkBitonic(new int[]{1, 2, 1}));
System.out.println("Should be true: " + checkBitonic(new int[]{1, 5, 7, 9, 8, 2}));
System.out.println("Should be true: " + checkBitonic(new int[]{3, 4, 5, 1}));

System.out.println("Should be false: " + checkBitonic(new int[]{}));
System.out.println("Should be false: " + checkBitonic(new int[]{1, 2}));
System.out.println("Should be false: " + checkBitonic(new int[]{2, 1}));
System.out.println("Should be false: " + checkBitonic(new int[]{1, 3, 5, 7}));
System.out.println("Should be false: " + checkBitonic(new int[]{7, 5, 3, 1}));
System.out.println("Should be false: " + checkBitonic(new int[]{1, 5, 5, 2}));
System.out.println("Should be false: " + checkBitonic(new int[]{5, 2, 1, 3}));