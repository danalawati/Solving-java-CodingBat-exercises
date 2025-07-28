public boolean hasTeen(int a, int b, int c) {
  int count = 0;
  int teen[] = {13,14,15,16,17,18,19};
  for (int t : teen){
    if (a == t){
      count ++;
    } else if (b == t){
      count++;
    } else if (c == t){
      count++;
    }
  }
  if (count >=1){
    return true;
  } else {
    return false;
  }
}
