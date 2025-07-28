public int max1020(int a, int b) {
    int max = Math.max(a, b);
    int min = Math.min(a, b);
    //now we now which is bigger

    if (max >= 10 && max <= 20) {
        return max;
    //return the bigger automatically if its withing range
    } else if (min >= 10 && min <= 20) {
        return min;
    } else {
        return 0;
    }
}
