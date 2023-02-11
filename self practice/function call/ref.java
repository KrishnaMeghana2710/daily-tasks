class ref{
    public static void main(String[] args) {
        sample s= new sample();
        s.change(s);
        System.out.println(s.number);
        
    }
}
class sample{
int number= 10;
void change(sample s){
    s.number= ++s.number;
}

}