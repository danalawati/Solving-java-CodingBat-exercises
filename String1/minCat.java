public String minCat(String a, String b) {
  String neww;
  if (a.length()>b.length()){
    a = a.substring(a.length()-b.length());
  } else if (a.length()<b.length()){
    b = b.substring(b.length()-a.length());
  } 
  return a+b;
}

