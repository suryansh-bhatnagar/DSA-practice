class Solution {
    public String defangIPaddr(String address) {
        char[] temp = new char[address.length()+6];
        int flag = 0;
        for (int i = 0; i < address.length(); i++) {
            if(address.toCharArray()[i]=='.'){
                temp[flag]='[';
                temp[flag+1]='.';
                temp[flag+2]=']';
                flag=flag+3;

            }else {
                temp[flag] =address.toCharArray()[i];
                flag++;
            }
        }
        return String.valueOf(temp);
    }
}