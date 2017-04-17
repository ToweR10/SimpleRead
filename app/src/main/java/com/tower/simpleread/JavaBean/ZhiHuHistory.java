package com.tower.simpleread.JavaBean;

import java.util.List;

/**
 * Created by Tower on 2017/4/17.
 */

public class ZhiHuHistory {
    /**
     * date : 20170416
     * stories : [{"images":["https://pic1.zhimg.com/v2-39386128b5510649331c661b653fe070.jpg"],"type":0,"id":9159010,"ga_prefix":"041622","title":"小事 · 你不要这样地看着我"}]
     */

    private String date;
    private List<StoriesBean> stories;

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

    public static class StoriesBean {
        /**
         * images : ["https://pic1.zhimg.com/v2-39386128b5510649331c661b653fe070.jpg"]
         * type : 0
         * id : 9159010
         * ga_prefix : 041622
         * title : 小事 · 你不要这样地看着我
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
}
