package scorponok.server.utils;

import okhttp3.FormBody;
import org.springframework.stereotype.Component;
import scorponok.base.cache.SimpleCacheClient;
import scorponok.common.utils.HttpClient;

import javax.annotation.Resource;
import java.io.IOException;

@Component
public class SudunUtil {
    @Resource
    private HttpClient httpClient;
    @Resource
    private SimpleCacheClient simpleCacheClient;
    public static String API_URL ="http://118.178.138.170/msg/HttpBatchSendSM";
    public static String ACCOUNT ="p6htyx";
    public static String PSWD ="hP1N191J";

    public Boolean  sendSms(String telnum, String attach) throws IOException {
        FormBody.Builder builder = new FormBody.Builder();
        builder.add("account",ACCOUNT);
        builder.add("pswd",PSWD);
        builder.add("mobile",telnum);
        builder.add("needstatus","true");
        /*String code = SmsClient.getVerificationCode(6);*/
        /*builder.add("msg","【火光黑卡】您的验证码为:"+code+"，请勿向他人泄露。");*/
        String s = httpClient.doPost(API_URL, builder);
//        System.out.println(s);
        String[] split = s.split("\n")[0].split(",");
//        for (int i=0;i<split.length;i++){
//            System.out.println(split[i]+"aaaa");
//        }
        if (split.length == 2){
           /* simpleCacheClient.set(attach+ "_" + telnum,code);*/
            return "0".equals(split[1]);
        }
        return false;
    }

    public static void main(String[] args) {
        try {
            Boolean aBoolean = new SudunUtil().sendSms("15088706346", "2345");
            System.out.println(aBoolean);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
