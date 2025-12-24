// User function Template for Java
class Solution {
    String isVowel(char c) {
        String r = "";
        if((c == 'a'|| c == 'e' || c== 'i' || c == 'o' || c == 'u')||(c == 'A' || c == 'E'||c == 'I'|| c == 'O' || c == 'U')){
            r = "YES";
        }
        else{
            r = "NO";
        }
        return r;
    }
}
