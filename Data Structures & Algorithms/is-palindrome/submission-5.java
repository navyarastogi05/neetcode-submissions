class Solution {
    public boolean isPalindrome(String s) 
    {
       String s1= s.toLowerCase();
        String str="";
        String s2="";
        for(int i =0; i<s1.length();i++)
        {
            if ((s1.charAt(i)>='a' && s1.charAt(i)<'z' )|| (s1.charAt(i)>='0' && s1.charAt(i)<='9'))
            {
                str=str+s1.charAt(i);
                s2=s1.charAt(i)+s2;
            }
        }
        if (str.equals(s2))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
