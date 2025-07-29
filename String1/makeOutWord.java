public String makeOutWord(String out, String word) {
  int len = out.length()/2; 
  String first = out.substring(0,len);
  String last = out.substring(len);
  return first + word + last;
}
