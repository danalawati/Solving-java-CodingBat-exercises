public String right2(String str) {
  String two = str.substring(str.length()-2);
  return two + str.substring(0,str.length()-2);
}
