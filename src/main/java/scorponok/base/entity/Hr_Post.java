package scorponok.base.entity;

public class Hr_Post {
    private Long postId;

    private String postName;

    private Long postDepementid;

    public Long getPostId() {
        return postId;
    }

    public void setPostId(Long postId) {
        this.postId = postId;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName == null ? null : postName.trim();
    }

    public Long getPostDepementid() {
        return postDepementid;
    }

    public void setPostDepementid(Long postDepementid) {
        this.postDepementid = postDepementid;
    }
}