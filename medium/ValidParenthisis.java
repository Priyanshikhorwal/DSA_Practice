class ValidParenthisis {
    public boolean isValid(String s) {
        boolean ans =false;
        Stack<Character> tow=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for(char c : s.toCharArray()){
            if(map.containsValue(c)){
                tow.push(c);
            }
            else if(map.containsKey(c)){
                if(!tow.isEmpty() && tow.peek()==map.get(c)){
                    tow.pop();
                    ans=true;
                }
                else if(tow.isEmpty()){
                    ans=false;
                    break;
                }
                else if(!tow.isEmpty() && tow.peek()!=map.get(c)){
                    ans=false;
                    break;
                }
            }
        }
        if(!tow.isEmpty()){
            ans=false;
        }
        
        return ans;
    }

    public static void main(String[] args) {
        ValidParenthisis sol = new ValidParenthisis();
        System.out.println(sol.isValid("()[]{}")); // true
        System.out.println(sol.isValid("(]"));     // false
    }


}
