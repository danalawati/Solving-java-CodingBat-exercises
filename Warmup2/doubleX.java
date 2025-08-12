boolean doubleX(String str) {
  int indexx = str.indexOf("x");
  if (indexx != -1 && indexx + 1 < str.length() && str.charAt(indexx + 1) == 'x') {
    return true;
  }
  return false;
}
