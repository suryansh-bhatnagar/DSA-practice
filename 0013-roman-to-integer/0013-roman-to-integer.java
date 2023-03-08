class Solution {
    public int romanToInt(String s) {
        
        int res = 0;
        char []temp = s.toCharArray();
        for (int i = 0; i < s.toCharArray().length; i++) {

            if(temp[i]=='I'){
                if(i+1< s.toCharArray().length){
                    if(temp[i+1]=='V'){
                        res = res+4;
                        i++;
                    }
                  else  if(temp[i+1]=='X'){
                        res = res+9;
                        i++;
                    }
                  else{
                      res  =res+1;
                    }
                } else{
                    res  =res+1;
                }

            }
         else if(temp[i]=='X'){
                if(i+1< s.toCharArray().length){
                    if(temp[i+1]=='L'){
                        res = res+40;
                        i++;
                    }
                   else if(temp[i+1]=='C'){
                        res = res+90;
                        i++;
                    }
                   else{
                       res= res+10;
                    }
                } else{
                    res= res+10;
                }

            }
           else if(temp[i]=='C'){
                if(i+1< s.toCharArray().length){
                    if(temp[i+1]=='D'){
                        res = res+400;
                        i++;
                    }
                   else if(temp[i+1]=='M'){
                        res = res+900;
                        i++;
                    }else{
                       res = res+100;
                    }
                }else{
                    res = res+100;
                }

            }
           else if(temp[i]=='V'){
                res=res+5;
            }
           else if(temp[i]=='L'){
                res=res+50;
            }
           else if(temp[i]=='D'){
                res=res+500;
            }
            else if(temp[i]=='M'){
                res=res+1000;
            };
            
        }
        return res;

    }
}