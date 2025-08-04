public int sumLimit(int a, int b) {
    String strA = String.valueOf(a);
    String strSum = String.valueOf(a+b);
    
    if (strSum.length()==strA.length()) {
        return a+b;
    } else {
        return a;
    }
}
