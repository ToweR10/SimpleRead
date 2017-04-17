package com.tower.simpleread.JavaBean;

import java.util.List;

/**
 * Created by Tower on 2017/4/17.
 */

public class GuoKrNews {

    /**
     * now : 2017-04-17T18:48:24.149231+08:00
     * ok : true
     * result : [{"link_v2_sync_img":"http://jingxuan.guokr.com/pick/v2/82368/sync/","source_name":"天了噜！","video_url":"","current_user_has_collected":false,"likings_count":8,"images":["http://2.im.guokr.com/0Oel-EDrwypvwMUkvPKj2ae88P-bcIVhsO67cC3eUoTZAQAAbQIAAEpQ.jpg","http://2.im.guokr.com/5xydO_IP7dTUieZjC5IEKQaT33OlM0rJrzLui_HC8NkcAgAAwQMAAEpQ.jpg?imageView2/1/w/480/h/854","http://3.im.guokr.com/ql1TjE6uFLjdQvC_-Nl16qZ6W_vYLaa9Rw5GfE1Eop_cAQAAQQMAAFBO.png","http://1.im.guokr.com/alOStoLzBe_NdHe-cSDD2PlYr3CdfuDRICZ3jD9ber3aAQAAWwMAAFBO.png","http://1.im.guokr.com/BxNYZ8gTAGUisaL-tElyVQelM8ddoAVDo7DSilsEQuYoAQAA_QEAAEpQ.jpg","http://3.im.guokr.com/frqROAaaUkRrbdVuberGUTe7jZZ7hAIqX5xutI0x0NjAAwAAGwIAAFBO.png?imageView2/1/w/480/h/269","http://1.im.guokr.com/5YRy21WOg69UY27KpIO0GhDSU3yVIeayHT1tNV_pO-yJAgAAxwAAAEpQ.jpg?imageView2/1/w/480/h/147"],"video_duration":null,"id":82368,"category":"funny","style":"article","title":"美一男子网上直播随机杀人！凶手目前在逃！","source_data":{"image":"http://2.im.guokr.com/r8PINb_RG_niPP_rsxxvHLK7HmQE9i1NZD6pWV_0VDKgAAAAoAAAAFBO.png?imageView2/1/w/160/h/160","summary":"吸走你的无聊时间！","id":52,"key":"天了噜！","title":"天了噜！"},"headline_img_tb":"http://1.im.guokr.com/alOStoLzBe_NdHe-cSDD2PlYr3CdfuDRICZ3jD9ber3aAQAAWwMAAFBO.png?imageView2/1/w/288/h/521","link_v2":"http://jingxuan.guokr.com/pick/v2/82368/","date_picked":1492423260,"is_top":false,"link":"http://jingxuan.guokr.com/pick/82368/","headline_img":"http://1.im.guokr.com/alOStoLzBe_NdHe-cSDD2PlYr3CdfuDRICZ3jD9ber3aAQAAWwMAAFBO.png","replies_count":16,"current_user_has_liked":false,"page_source":"http://jingxuan.guokr.com/pick/82368/?ad=1","author":"一碗萝莉面","summary":"昨天是西方国家的复活节，一个象征重生与希望的日子。 然而这天却有人在美国克利夫兰市街头开枪杀死陌生人，更要命的是他竟然把全过程放在","source":"group","reply_root_id":781109,"date_created":1492396685}]
     */

    private String now;
    private boolean ok;
    private List<ResultBean> result;

    public String getNow() {
        return now;
    }

    public void setNow(String now) {
        this.now = now;
    }

    public boolean isOk() {
        return ok;
    }

    public void setOk(boolean ok) {
        this.ok = ok;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * link_v2_sync_img : http://jingxuan.guokr.com/pick/v2/82368/sync/
         * source_name : 天了噜！
         * video_url :
         * current_user_has_collected : false
         * likings_count : 8
         * images : ["http://2.im.guokr.com/0Oel-EDrwypvwMUkvPKj2ae88P-bcIVhsO67cC3eUoTZAQAAbQIAAEpQ.jpg","http://2.im.guokr.com/5xydO_IP7dTUieZjC5IEKQaT33OlM0rJrzLui_HC8NkcAgAAwQMAAEpQ.jpg?imageView2/1/w/480/h/854","http://3.im.guokr.com/ql1TjE6uFLjdQvC_-Nl16qZ6W_vYLaa9Rw5GfE1Eop_cAQAAQQMAAFBO.png","http://1.im.guokr.com/alOStoLzBe_NdHe-cSDD2PlYr3CdfuDRICZ3jD9ber3aAQAAWwMAAFBO.png","http://1.im.guokr.com/BxNYZ8gTAGUisaL-tElyVQelM8ddoAVDo7DSilsEQuYoAQAA_QEAAEpQ.jpg","http://3.im.guokr.com/frqROAaaUkRrbdVuberGUTe7jZZ7hAIqX5xutI0x0NjAAwAAGwIAAFBO.png?imageView2/1/w/480/h/269","http://1.im.guokr.com/5YRy21WOg69UY27KpIO0GhDSU3yVIeayHT1tNV_pO-yJAgAAxwAAAEpQ.jpg?imageView2/1/w/480/h/147"]
         * video_duration : null
         * id : 82368
         * category : funny
         * style : article
         * title : 美一男子网上直播随机杀人！凶手目前在逃！
         * source_data : {"image":"http://2.im.guokr.com/r8PINb_RG_niPP_rsxxvHLK7HmQE9i1NZD6pWV_0VDKgAAAAoAAAAFBO.png?imageView2/1/w/160/h/160","summary":"吸走你的无聊时间！","id":52,"key":"天了噜！","title":"天了噜！"}
         * headline_img_tb : http://1.im.guokr.com/alOStoLzBe_NdHe-cSDD2PlYr3CdfuDRICZ3jD9ber3aAQAAWwMAAFBO.png?imageView2/1/w/288/h/521
         * link_v2 : http://jingxuan.guokr.com/pick/v2/82368/
         * date_picked : 1492423260
         * is_top : false
         * link : http://jingxuan.guokr.com/pick/82368/
         * headline_img : http://1.im.guokr.com/alOStoLzBe_NdHe-cSDD2PlYr3CdfuDRICZ3jD9ber3aAQAAWwMAAFBO.png
         * replies_count : 16
         * current_user_has_liked : false
         * page_source : http://jingxuan.guokr.com/pick/82368/?ad=1
         * author : 一碗萝莉面
         * summary : 昨天是西方国家的复活节，一个象征重生与希望的日子。 然而这天却有人在美国克利夫兰市街头开枪杀死陌生人，更要命的是他竟然把全过程放在
         * source : group
         * reply_root_id : 781109
         * date_created : 1492396685
         */

        private String link_v2_sync_img;
        private String source_name;
        private String video_url;
        private boolean current_user_has_collected;
        private int likings_count;
        private Object video_duration;
        private int id;
        private String category;
        private String style;
        private String title;
        private SourceDataBean source_data;
        private String headline_img_tb;
        private String link_v2;
        private int date_picked;
        private boolean is_top;
        private String link;
        private String headline_img;
        private int replies_count;
        private boolean current_user_has_liked;
        private String page_source;
        private String author;
        private String summary;
        private String source;
        private int reply_root_id;
        private int date_created;
        private List<String> images;

        public String getLink_v2_sync_img() {
            return link_v2_sync_img;
        }

        public void setLink_v2_sync_img(String link_v2_sync_img) {
            this.link_v2_sync_img = link_v2_sync_img;
        }

        public String getSource_name() {
            return source_name;
        }

        public void setSource_name(String source_name) {
            this.source_name = source_name;
        }

        public String getVideo_url() {
            return video_url;
        }

        public void setVideo_url(String video_url) {
            this.video_url = video_url;
        }

        public boolean isCurrent_user_has_collected() {
            return current_user_has_collected;
        }

        public void setCurrent_user_has_collected(boolean current_user_has_collected) {
            this.current_user_has_collected = current_user_has_collected;
        }

        public int getLikings_count() {
            return likings_count;
        }

        public void setLikings_count(int likings_count) {
            this.likings_count = likings_count;
        }

        public Object getVideo_duration() {
            return video_duration;
        }

        public void setVideo_duration(Object video_duration) {
            this.video_duration = video_duration;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getStyle() {
            return style;
        }

        public void setStyle(String style) {
            this.style = style;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public SourceDataBean getSource_data() {
            return source_data;
        }

        public void setSource_data(SourceDataBean source_data) {
            this.source_data = source_data;
        }

        public String getHeadline_img_tb() {
            return headline_img_tb;
        }

        public void setHeadline_img_tb(String headline_img_tb) {
            this.headline_img_tb = headline_img_tb;
        }

        public String getLink_v2() {
            return link_v2;
        }

        public void setLink_v2(String link_v2) {
            this.link_v2 = link_v2;
        }

        public int getDate_picked() {
            return date_picked;
        }

        public void setDate_picked(int date_picked) {
            this.date_picked = date_picked;
        }

        public boolean isIs_top() {
            return is_top;
        }

        public void setIs_top(boolean is_top) {
            this.is_top = is_top;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getHeadline_img() {
            return headline_img;
        }

        public void setHeadline_img(String headline_img) {
            this.headline_img = headline_img;
        }

        public int getReplies_count() {
            return replies_count;
        }

        public void setReplies_count(int replies_count) {
            this.replies_count = replies_count;
        }

        public boolean isCurrent_user_has_liked() {
            return current_user_has_liked;
        }

        public void setCurrent_user_has_liked(boolean current_user_has_liked) {
            this.current_user_has_liked = current_user_has_liked;
        }

        public String getPage_source() {
            return page_source;
        }

        public void setPage_source(String page_source) {
            this.page_source = page_source;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getSource() {
            return source;
        }

        public void setSource(String source) {
            this.source = source;
        }

        public int getReply_root_id() {
            return reply_root_id;
        }

        public void setReply_root_id(int reply_root_id) {
            this.reply_root_id = reply_root_id;
        }

        public int getDate_created() {
            return date_created;
        }

        public void setDate_created(int date_created) {
            this.date_created = date_created;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public static class SourceDataBean {
            /**
             * image : http://2.im.guokr.com/r8PINb_RG_niPP_rsxxvHLK7HmQE9i1NZD6pWV_0VDKgAAAAoAAAAFBO.png?imageView2/1/w/160/h/160
             * summary : 吸走你的无聊时间！
             * id : 52
             * key : 天了噜！
             * title : 天了噜！
             */

            private String image;
            private String summary;
            private int id;
            private String key;
            private String title;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getSummary() {
                return summary;
            }

            public void setSummary(String summary) {
                this.summary = summary;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getKey() {
                return key;
            }

            public void setKey(String key) {
                this.key = key;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }
    }
}
