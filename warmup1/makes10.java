public boolean makes10(int a, int b) {
    if (a == 10 || b==10){
        return true;
    }
    //int c = a+b;
    if ((a+b) == 10){
        return true;
    }
    return false;
}
