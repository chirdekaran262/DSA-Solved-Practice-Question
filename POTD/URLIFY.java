class URLify {
    String URLify(String s) {
        // code here
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c==' '){
                sb.append("%20");
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        URLify urlify=new URLify();
        String s="Mr John Smith";
        System.out.println(urlify.URLify(s));
    }
}