public String middleThree(String str) {
  int mid = str.length()/2;
  return ""+ str.charAt(mid-1)+ str.charAt(mid)+str.charAt(mid+1);
}
