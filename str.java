class str{
    public static void main(String[] args) {
        String s = "HyeMithil";
       
        System.out.println(s.charAt(0));
        System.err.println(s.charAt(2));
        s = "a" + s.substring(1);
        System.err.println(s);
        
    }
}