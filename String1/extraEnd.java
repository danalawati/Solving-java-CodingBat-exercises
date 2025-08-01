public String extraEnd(String str) {
  String sub;
  if (str.length() >2){
    sub = str.substring(str.length()-2);
  } else {
    sub = str;
  }
  return sub+sub+sub;
}
