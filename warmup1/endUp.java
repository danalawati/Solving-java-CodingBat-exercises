public String endUp(String str) {
  String substr;
  if (str.length()<4){
    return str.toUpperCase();
  } else {
    substr = str.substring(str.length() - 3);
    substr = substr.toUpperCase();
    return str.substring(0,str.length()-3) + substr;
  }
}
