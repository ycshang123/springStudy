package com.soft1851.spring.ioc.entity;/*@ClassName Post
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/17
 *@Version 1.0
 **/

import com.alibaba.druid.sql.visitor.functions.Char;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Post {
    private Integer postId;
    private  Integer forumId;
    private  String title;
    private  String context;
    private Char[] thumbnail;
    private Timestamp postTime;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Integer getForumId() {
        return forumId;
    }

    public void setForumId(Integer forumId) {
        this.forumId = forumId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public Char[] getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Char[] thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Timestamp getPostTime() {
        return postTime;
    }

    public void setPostTime(Timestamp postTime) {
        this.postTime = postTime;
    }
}
