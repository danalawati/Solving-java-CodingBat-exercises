public String stringX(String str) {
  if (str.length() <= 2) {
    return str;
  }

  String start = str.substring(0, 1);
  String end = str.substring(str.length() - 1);
  String middle = str.substrin
