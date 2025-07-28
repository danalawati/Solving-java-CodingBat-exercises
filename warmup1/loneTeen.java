public boolean loneTeen(int a, int b) {
    int[] teens = {13, 14, 15, 16, 17, 18, 19};

    boolean aIsTeen = false;
    boolean bIsTeen = false;

    for (int t : teens) {
        if (a == t) {
            aIsTeen = true;
        }
        if (b == t) {
            bIsTeen = true;
        }
    }

    return (aIsTeen && !bIsTeen) || (!aIsTeen && bIsTeen);
}
