
class BadIterate {
  public static void main(String[] args) {
    List<String> list = new ArrayList<String>();
    list.add("one");
    list.add("two");

    Iterator iter = list.iterator();
    while (iter.hasNext()) {
      String s = (String)iter.next();
      if (s.equals("one")) {
        list.remove(s);
      }
    }
  }
}
