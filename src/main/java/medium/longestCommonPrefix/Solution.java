package medium.longestCommonPrefix;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public String longestCommonPrefix(String[] strs) { // [flower]
        if(strs.length == 0)return "";
        String str=strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(str)!=0)
            {
                str=str.substring(0,str.length()-1);
            }
        }
        return str;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }
}
