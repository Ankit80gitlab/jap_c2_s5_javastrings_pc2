package com.jap.palindrome;

/* Write a java program to find if any of the words in the list is a palindrome or not, print their count and the palindrome words.*/
public class Palindrome {
    public static void main(String[] args) {
        String[] words = {};
        Palindrome palindrome = new Palindrome();

        // Call method to find palindromes in array of words
		palindrome.findPalindromeWords(words);
        System.out.println("Total number of palindromes: " + palindrome.findPalindromeWords(words));
    }

    // Function to find palindromes in an array of words
    public int findPalindromeWords(String[] words) {

		int flag=0;
 
		if (words.length==0)
		{
			flag=0;
			return flag;
		}
		

		else if (words.length==3)
		{
		String str1 = (words[0].toLowerCase());
        String str2 = (words[1].toLowerCase());
        String str3 = (words[2].toLowerCase());

        int i1=0;
        int j1=str1.length()-1;
        int flag1=0;

        while (i1<j1 && flag1==0 )
        {
            if(str1.charAt(i1)!=str1.charAt(j1))
            {
                flag1=1;
            }
            else
            {
                i1++;
                j1--;
            }
        }
       

        int i2=0;
        int j2=str2.length()-1;
        int flag2=0;

        while (i2<j2 && flag2==0 )
        {
            if(str2.charAt(i2)!=str2.charAt(j2))
            {
                flag2=1;
            }
            else
            {
                i2++;
                j2--;
            }
        }
        

        int i3=0;
        int j3=str3.length()-1;
        int flag3=0;

        while (i3<j3 && flag3==0 )
        {
            if(str3.charAt(i3)!=str3.charAt(j3))
            {
                flag3=1;
            }
            else
            {
                i3++;
                j3--;
            }
        }

		flag=3-(flag1+flag2+flag3);

		return flag;
        
		}

		else
		{
		String str1 = (words[0].toLowerCase());
        String str2 = (words[1].toLowerCase());
        String str3 = (words[2].toLowerCase());
        String str4 = (words[3].toLowerCase());

        int i1=0;
        int j1=str1.length()-1;
        int flag1=0;

        while (i1<j1 && flag1==0 )
        {
            if(str1.charAt(i1)!=str1.charAt(j1))
            {
                flag1=1;
            }
            else
            {
                i1++;
                j1--;
            }
        }
       

        int i2=0;
        int j2=str2.length()-1;
        int flag2=0;

        while (i2<j2 && flag2==0 )
        {
            if(str2.charAt(i2)!=str2.charAt(j2))
            {
                flag2=1;
            }
            else
            {
                i2++;
                j2--;
            }
        }
        

        int i3=0;
        int j3=str3.length()-1;
        int flag3=0;

        while (i3<j3 && flag3==0 )
        {
            if(str3.charAt(i3)!=str3.charAt(j3))
            {
                flag3=1;
            }
            else
            {
                i3++;
                j3--;
            }
        }
        

        int i4=0;
        int j4=str4.length()-1;
        int flag4=0;

        while (i4<j4 && flag4==0 )
        {
            if(str4.charAt(i4)!=str4.charAt(j4))
            {
                flag4=1;
            }
            else
            {
                i4++;
                j4--;
            }

		}
        

        flag=4-(flag1+flag2+flag3+flag4);


		return flag;
    }

    
   }
}
