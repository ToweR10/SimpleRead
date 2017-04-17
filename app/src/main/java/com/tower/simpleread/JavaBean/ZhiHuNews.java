package com.tower.simpleread.JavaBean;

import java.util.List;

/**
 * Created by Tower on 2017/4/17.
 */

public class ZhiHuNews {
    /**
     * date : 20170417
     * stories : [{"images":["https://pic4.zhimg.com/v2-b7f49c46ff33eb76f9d8bf9926c1d3af.jpg"],"type":0,"id":9364217,"ga_prefix":"041717","title":"杨洁导演的 86 版电视剧《西游记》究竟好在哪？"}]
     * top_stories : [{"image":"https://pic2.zhimg.com/v2-af9166670e8147861b10b924db7ac845.jpg","type":0,"id":9364217,"ga_prefix":"041717","title":"杨洁导演的 86 版电视剧《西游记》究竟好在哪？"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean {
        /**
         * images : ["https://pic4.zhimg.com/v2-b7f49c46ff33eb76f9d8bf9926c1d3af.jpg"]
         * type : 0
         * id : 9364217
         * ga_prefix : 041717
         * title : 杨洁导演的 86 版电视剧《西游记》究竟好在哪？
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private List<String> images;

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }
    }

    public static class TopStoriesBean {
        /**
         * image : https://pic2.zhimg.com/v2-af9166670e8147861b10b924db7ac845.jpg
         * type : 0
         * id : 9364217
         * ga_prefix : 041717
         * title : 杨洁导演的 86 版电视剧《西游记》究竟好在哪？
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getGa_prefix() {
            return ga_prefix;
        }

        public void setGa_prefix(String ga_prefix) {
            this.ga_prefix = ga_prefix;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }
}
