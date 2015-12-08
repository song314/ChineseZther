package zither.ss.sichuan.cn.chinesezither.bean;

import com.litesuits.orm.db.annotation.NotNull;

/**
 * time: 12/7/15
 * description:
 *
 * @author tangsong
 */
public class CzStory extends BaseBean {

    @NotNull
    private String title;
    @NotNull
    private String author;
    private String content;
    private String pictureResName;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPictureResName() {
        return pictureResName;
    }

    public void setPictureResName(String pictureResName) {
        this.pictureResName = pictureResName;
    }

    @Override
    public String toString() {
        return "CzStory{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", pictureResName='" + pictureResName + '\'' +
                "} " + super.toString();
    }
}
