package baitap.BaiTapBuoi11.Bai1;

import java.util.Date;

public class Post {
private String Title;
private String Id;
private String Description;
private String Content;
private Date LastUpdatedAt = new Date();
private Date PostedAt = new Date();

//    public Post(String title, String id, String description, String content, String lastUpdatedAt, String postedAt) {
//        Title = title;
//        Id = id;
//        Description = description;
//        Content = content;
//        LastUpdatedAt = lastUpdatedAt;
//        PostedAt = postedAt;
//    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Date getLastUpdatedAt() {
        return LastUpdatedAt;
    }

    public void setLastUpdatedAt(Date lastUpdatedAt) {
        LastUpdatedAt = lastUpdatedAt;
    }

    public Date getPostedAt() {
        return PostedAt;
    }

    public void setPostedAt(Date postedAt) {
        PostedAt = postedAt;
    }
}
