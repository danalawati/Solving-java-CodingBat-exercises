public int blueTicket(int a, int b, int c) {
  int anb=a+b;
  int bnc=b+c;
  int anc=a+c;

  if (anb==10 || bnc==10 || anc==10){
    return 10;
  } else if (anb == bnc +10 || anb==anc+10){
    return 5;
  } else {
    return 0;
  }
}
