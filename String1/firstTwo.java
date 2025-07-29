public String firstTwo(String str) {
  String sub;
  if (str.length() >2){
    sub = str.substring(0,2);
  } else {
    sub = str;
  }
  return sub;
  
}


