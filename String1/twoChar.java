public String twoChar(String str, int index) {
  if (index > str.length()-2){
    return str.substring(0, 2);
  } else if (index < 0){
    return str.substring(0, 2);
  } else {
    return str.substring(index,index+2);
  }
  
}
