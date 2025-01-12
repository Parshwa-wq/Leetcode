import java.util.*;
class test 
{
    public int romanToInt(String s) 
  {
        int sum=0;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(i!=s.length()-1)
            {
                if(s.charAt(i)=='I' && s.charAt(i+1)=='V')
                {
                    sum+=4;
                    i++;

                    if(i==s.length()-1)
                    break;
                }
                else if(s.charAt(i)=='I' && s.charAt(i+1)=='X')
                {
                    sum+=9;
                    i++;    
 
                    if(i==s.length()-1)
                    break;              
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='L')
                {
                    sum+=40;
                    i++;    
   
                    if(i==s.length()-1)
                    break;            
                }
                else if(s.charAt(i)=='X' && s.charAt(i+1)=='C')
                {
                    sum+=90;
                    i++;     
   
                    if(i==s.length()-1)
                    break;           
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='D')
                {
                    sum+=400;
                    i++;  
 
                    if(i==s.length()-1)
                    break; 
                }
                else if(s.charAt(i)=='C' && s.charAt(i+1)=='M')
                {
                    sum+=900;
                    i++;

                    if(i==s.length()-1)
                    break;
                }
                else
                {
                switch(c)
                {
                case 'I':
                sum+=1;
                break;

                case 'V':
                sum+=5;
                break;

                case 'X':
                sum+=10;
                break;

                case 'L':
                sum+=50;
                break;

                case 'C':
                sum+=100;
                break;

                case 'D':
                sum+=500;
                break;

                case 'M':
                sum+=1000;
                break;

                default :
                return 0;
                }
                }
            }
            if(i==s.length()-1)
            {
                switch(c)
                {
                case 'I':
                sum+=1;
                break;

                case 'V':
                sum+=5;
                break;

                case 'X':
                sum+=10;
                break;

                case 'L':
                sum+=50;
                break;

                case 'C':
                sum+=100;
                break;

                case 'D':
                sum+=500;
                break;

                case 'M':
                sum+=1000;
                break;

                default :
                return 0;
                }
            }
        }
        return sum;
    }

    String check(String string)
    {
        int count=0;
        for(int i=0;i<string.length();i++)
          {
            char c=string.charAt(i);
            if(c=='I' || c=='V' || c=='X' || c=='L' || c=='C' || c=='D' || c=='M')
            {
              count++;
              continue;
            }
          }
          return count==string.length()? "1" :"0" ;
    }

  public static void main(String s[])
  { 
    Scanner input=new Scanner(System.in);
    test obj=new test();

    String string;

    while(true)
    {
        System.out.print("Enter something(in roman): ");
        string=input.next().toUpperCase();
        String comp=obj.check(string); 
        if(comp.equals("1"))
        {
            System.out.print(string+": "+obj.romanToInt(string));
            break;
        }
        else
        {
            System.out.print("\npls... enter valid roman integers.\nEnter again: ");
        }
    }
  }
}
