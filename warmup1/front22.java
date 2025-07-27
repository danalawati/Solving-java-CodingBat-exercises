public String front22(String str) {
  String char2;
  if (str.length()<2){
    char2 =str;
  } else {
    char2 = str.substring(0,2);
  }
  return char2+str+char2;
}
