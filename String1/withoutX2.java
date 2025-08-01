public String withoutX2(String str) {
  String output="";
  if (str.length()== 0){
    return str;
  }
  if (str.charAt(0)!='x'){
    output += str.charAt(0);
  }
  if (str.length()>=2 && str.charAt(1)!='x'){
    output +=str.charAt(1);
  }
  if (str.length() > 2) {
    output += str.substring(2);
  }
  return output;
}
