package scorponok.base.entity;

import java.util.Date;

public class Hr_Shop {
    private Long shopId;

    private String shopNumber;

    private Long shopBrandid;

    private String shopName;

    private Long shopAreaId;

    private Date shopCreationTime;

    private String shopJobNumber;

    private String shopHr;

    public Long getShopId() {
        return shopId;
    }

    public void setShopId(Long shopId) {
        this.shopId = shopId;
    }

    public String getShopNumber() {
        return shopNumber;
    }

    public void setShopNumber(String shopNumber) {
        this.shopNumber = shopNumber == null ? null : shopNumber.trim();
    }

    public Long getShopBrandid() {
        return shopBrandid;
    }

    public void setShopBrandid(Long shopBrandid) {
        this.shopBrandid = shopBrandid;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Long getShopAreaId() {
        return shopAreaId;
    }

    public void setShopAreaId(Long shopAreaId) {
        this.shopAreaId = shopAreaId;
    }

    public Date getShopCreationTime() {
        return shopCreationTime;
    }

    public void setShopCreationTime(Date shopCreationTime) {
        this.shopCreationTime = shopCreationTime;
    }

    public String getShopJobNumber() {
        return shopJobNumber;
    }

    public void setShopJobNumber(String shopJobNumber) {
        this.shopJobNumber = shopJobNumber == null ? null : shopJobNumber.trim();
    }

    public String getShopHr() {
        return shopHr;
    }

    public void setShopHr(String shopHr) {
        this.shopHr = shopHr == null ? null : shopHr.trim();
    }
}