class RemoveSpec {
    String removeSpaces(String s) {
        // code here
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c!=' '){
                ans.append(c);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        RemoveSpec ob=new RemoveSpec();
        String s="g e e k s   f o r g e e k s";
        System.out.println(ob.removeSpaces(s));
    }
}