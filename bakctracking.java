public class bakctracking {
    public static void permu(String str , String permun , int idx){
        
        if (str.length()== 0){
            System.out.println(permun);
            return;
        }

        for (int i = 0; i < str.length(); i++){
             char currChar = str.charAt(i);

             String newstr = str.substring(0, i) + str.substring(i + 1); // a ko hataya bc ko add kra
             permu(newstr, permun + currChar, idx+1); // new str , per+ churr char means bca joda 
        }
    }

    public static void main(String[] args) {

        String str = "ABC";
        permu(str, "", 0);
        
    }
    
}
