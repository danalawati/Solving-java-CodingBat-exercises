public String everyNth(String str, int n) {
  String output="";
  for (int i=0; i<str.length(); i=i+n){
    output += str.charAt(i);
  }
  return output;
}
