package scorponok.server.response;


public class UploadResponse extends BaseResponse{
    String ossAddress;

    public String getOssAddress() {
        return ossAddress;
    }

    public void setOssAddress(String ossAddress) {
        this.ossAddress = ossAddress;
    }
}
