package demo.singleton;

/**
 * @author chenpengchao   2018/4/11 9:46
 */
public class AppClient {

    public static void main(String[] args){
        SingleTonEnum.uniqueSingleTon.whateverMethod();
        ReadConfig instance = ReadConfig.getInstance();
        try {
            instance.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instance.getParamA());
        System.out.println(instance.getParamB());
    }


}
