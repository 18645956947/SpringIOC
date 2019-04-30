public abstract class Bean1 {
//    private Bean2 bean2;

    //方法注入
    protected abstract Bean2 ccreateBean2();

    public void printBean2(){
        System.out.println("bean2 = " + ccreateBean2());
    }


}
