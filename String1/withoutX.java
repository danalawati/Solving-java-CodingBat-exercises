public String withoutX(String str) {
    int len = str.length();
    if (len == 0){
      return str;
    }
    if (str.startsWith("x")) {
        str = str.substring(1);
        len--;
    }
    if (len > 0 && str.endsWith("x")) {
        str = str.substring(0, str.length() - 1);
    }

    return str;
}
