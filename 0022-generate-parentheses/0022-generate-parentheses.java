class Solution {
    public boolean isvalid(String s)
    {
        int bal = 0;
        for(char ch:s.toCharArray()){
            if(ch == '(')
            {
                bal++;
            }else{
                bal--;
            }
            if(bal<0)
        { 
            return false;
        }
        }
       
        return bal == 0;
    }
    public void generate(List<String> res,String current,int n)
    {
        if(current.length() == 2*n)
        {
            if(isvalid(current))
            {
                res.add(current);
                
            }
            return;
        }
        generate(res,current+'(',n);
        generate(res,current+')',n);
    }
    public List<String> generateParenthesis(int n) {

        List<String> res = new ArrayList<>();
        generate(res,"",n);
        return res;
        
    }
}