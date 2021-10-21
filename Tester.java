public class Tester {
    public static String withoutString(String base, String remove) {
        String newBase = base.toLowerCase();
        String newRemove = remove.toLowerCase();
        while (newBase.indexOf(newRemove) >= 0){
            base = base.substring(0, newBase.indexOf(newRemove)) + base.substring(newBase.indexOf(newRemove) + newRemove.length());
            newBase = base.toLowerCase();
        }
        return base;
    }
    public static void main(String[] args) {
        System.out.println(withoutString("Hello there", "llo"));
        System.out.println(withoutString("Hello there", "e"));
        System.out.println(withoutString("Hello there", "x"));
        System.out.println(withoutString("This is a FISH", "IS"));
        System.out.println(withoutString("THIS is a FISH", "is"));
        System.out.println(withoutString("THIS is a FISH", "iS"));
        System.out.println(withoutString("abxxxxab", "xx"));
        System.out.println(withoutString("abxxxab", "xx"));
        System.out.println(withoutString("abxxxab", "x"));
        System.out.println(withoutString("xxx", "x"));
        System.out.println(withoutString("xxx", "xx"));
        System.out.println(withoutString("xyzzy", "Y"));
        System.out.println(withoutString("", "x"));
        System.out.println(withoutString("abcabc", "b"));
        System.out.println(withoutString("AA22bb", "2"));
        System.out.println(withoutString("1111", "1"));
        System.out.println(withoutString("1111", "11"));
        System.out.println(withoutString("MkjtMkx", "Mk"));
        System.out.println(withoutString("Hi HoHo", "Ho"));
    }
}
