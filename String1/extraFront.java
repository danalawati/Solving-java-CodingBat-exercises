public String extraFront(String str) {
  String string;
  if (str.length()>2){
    string = str.substring(0,2);
  } else{
    string = str;
  }
  return string+string+string;
}
