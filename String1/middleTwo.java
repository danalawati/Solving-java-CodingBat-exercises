public String middleTwo(String str) {
  int mid = str.length()/2;
  return ""+str.charAt(mid-1) + str.charAt(mid);
  //"" makes the chars into a string
}
