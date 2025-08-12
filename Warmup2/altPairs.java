public String altPairs(String str) {
  StringBuilder r = new StringBuilder();

  for (int i = 0; i < str.length(); i += 4) {
    r.append(str.charAt(i)); 
    if (i + 1 < str.length()) {
      r.append(str.charAt(i + 1));
    }
  }
  return r.toString();
}
