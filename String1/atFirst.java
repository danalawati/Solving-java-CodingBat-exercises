public String atFirst(String str) {
  if (str.equals("")){
    return "@@";
  } else if (str.length()==1){
    return str.substring(0,1) + "@";
  } else {
    return str.substring(0,2);
  }
}
