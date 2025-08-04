public boolean shareDigit(int a, int b) {
    String strA = String.valueOf(a);
    String strB = String.valueOf(b);
    
    for (int i=0; i<strA.length();i++) {
        for (int j=0; j<strB.length();j++) {
            if (strA.charAt(i) == strB.charAt(j)) {
                return true;
            }
        }
    }
    return false;
}
