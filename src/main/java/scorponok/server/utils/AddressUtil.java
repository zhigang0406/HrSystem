package scorponok.server.utils;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AddressUtil {

    /**
     * @param args
     */
    /*public static void main(String[] args) {
        AddressUtil addressUtils = new AddressUtil();
        String ip = "47.97.218.140";
        String address = "";
        try {
            address = addressUtils.getAddress("ip="+ip, "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(address);
    }*/

    /**
     * 获取地址
     * @param params
     * @param encoding
     * @return
     * @throws Exception
     */
    public Result getAddress(String params, String encoding) throws Exception{
        String path = "http://ip.taobao.com/service/getIpInfo.php";
        String returnStr = this.getRs(path, params, encoding);
        Result result = new Result();
        JSONObject json=null;
        if(returnStr != null){
            json = new JSONObject(returnStr);
            if("0".equals(json.get("code").toString())){
                //result.setCountry(decodeUnicode(json.optJSONObject("data").getString("country")));//国家
                //result.setArea(decodeUnicode(json.optJSONObject("data").getString("area")));//地区
                result.setProvice(decodeUnicode(json.optJSONObject("data").getString("region")));//省份
                result.setCity(decodeUnicode(json.optJSONObject("data").getString("city")));//市区
                result.setZone(decodeUnicode(json.optJSONObject("data").getString("county")));//地区
                result.setIsp(decodeUnicode(json.optJSONObject("data").getString("isp")));//ISP公司
            }
        }
        return result;
    }
    /**
     * 从url获取结果
     * @param path
     * @param params
     * @param encoding
     * @return
     */
    public String getRs(String path, String params, String encoding){
        URL url = null;
        HttpURLConnection connection = null;
        try {
            url = new URL(path);
            connection = (HttpURLConnection)url.openConnection();// 新建连接实例
            connection.setConnectTimeout(2000);// 设置连接超时时间，单位毫�?
            connection.setReadTimeout(2000);// 设置读取数据超时时间，单位毫�?
            connection.setDoInput(true);// 是否打开输出�? true|false
            connection.setDoOutput(true);// 是否打开输入流true|false
            connection.setRequestMethod("POST");// 提交方法POST|GET
            connection.setUseCaches(false);// 是否缓存true|false
            connection.connect();// 打开连接端口
            DataOutputStream out = new DataOutputStream(connection.getOutputStream());
            out.writeBytes(params);
            out.flush();
            out.close();
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream(),encoding));
            StringBuffer buffer = new StringBuffer();
            String line = "";
            while ((line = reader.readLine())!= null) {
                buffer.append(line);
            }
            reader.close();
            return buffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            connection.disconnect();// 关闭连接
        }
        return null;
    }
    /**
     * 字符转码
     * @param theString
     * @return
     */
    public static String decodeUnicode(String theString){
        char aChar;
        int len = theString.length();
        StringBuffer buffer = new StringBuffer(len);
        for (int i = 0; i < len;) {
            aChar = theString.charAt(i++);
            if(aChar == '\\'){
                aChar = theString.charAt(i++);
                if(aChar == 'u'){
                    int val = 0;
                    for(int j = 0; j < 4; j++){
                        aChar = theString.charAt(i++);
                        switch (aChar) {
                            case '0':
                            case '1':
                            case '2':
                            case '3':
                            case '4':
                            case '5':
                            case '6':
                            case '7':
                            case '8':
                            case '9':
                                val = (val << 4) + aChar - '0';
                                break;
                            case 'a':
                            case 'b':
                            case 'c':
                            case 'd':
                            case 'e':
                            case 'f':
                                val = (val << 4) + 10 + aChar - 'a';
                                break;
                            case 'A':
                            case 'B':
                            case 'C':
                            case 'D':
                            case 'E':
                            case 'F':
                                val = (val << 4) + 10 + aChar - 'A';
                                break;
                            default:
                                throw new IllegalArgumentException(
                                        "Malformed      encoding.");
                        }
                    }
                    buffer.append((char) val);
                }else{
                    if(aChar == 't'){
                        aChar = '\t';
                    }

                    if(aChar == 'r'){
                        aChar = '\r';
                    }

                    if(aChar == 'n'){
                        aChar = '\n';
                    }

                    if(aChar == 'f'){
                        aChar = '\f';

                    }
                    buffer.append(aChar);
                }
            }else{
                buffer.append(aChar);
            }
        }
        return buffer.toString();
    }
   public class Result{
        private String provice; //  省
        private String city;//市
        private String zone;//区
        private String isp;//isp通信
        private String area;//地区
        private String country;//国家

        public String getProvice() {
            return provice;
        }

        public void setProvice(String provice) {
            this.provice = provice;
        }

        public String getArea() {
            return area;
        }

        public void setArea(String area) {
            this.area = area;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZone() {
            return zone;
        }

        public void setZone(String zone) {
            this.zone = zone;
        }

        public String getIsp() {
            return isp;
        }

        public void setIsp(String isp) {
            this.isp = isp;
        }
    }
}
