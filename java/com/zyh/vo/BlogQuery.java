package com.zyh.vo;

/**
 * @author 恒哥
 * @version V1.0
 * @Package com.zyh.vo
 * @date 2022/4/25 17:22
 */
public class BlogQuery {
    private String title;
    private Long typeId;
    private boolean recommend;

    public BlogQuery() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public boolean isRecommend() {
        return recommend;
    }

    public void setRecommend(boolean recommend) {
        this.recommend = recommend;
    }
}
