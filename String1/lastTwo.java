public String lastTwo(String str) {
  if (str.length()>=2){
    String start = str.substring(0, str.length() - 2);
    char secondLast = str.charAt(str.length() - 2);
    char lastChar = str.charAt(str.length() - 1);
    return start+lastChar + secondLast;
  }
  return str;
}
