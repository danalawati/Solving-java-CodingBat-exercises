public String deFront(String str) {    
  if (str.length() >= 2) {
    if (str.charAt(0) == 'a' && str.charAt(1) == 'b') {
      return "ab" + str.substring(2);
    } else if (str.charAt(0) == 'a') {
      return "a" + str.substring(2);
    } else if (str.charAt(1) == 'b') {
      return "b" + str.substring(2);
    } else {
      return str.substring(2);
    }
  } else if (str.length() == 1 && str.charAt(0) == 'a') {
    return "a";
  }
  return "";
}
