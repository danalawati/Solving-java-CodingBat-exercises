public int diff21(int n) {
    boolean doubleDiff = false;
    if (n>21){
        doubleDiff = true;
    }
    int a = n-21;
    if (a<0){
        a = a*-1;
    }
    if (doubleDiff){
        return a*2;
    } else {
        return a;
    }
}
