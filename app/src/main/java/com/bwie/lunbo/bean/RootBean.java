package com.bwie.lunbo.bean;

import java.util.List;

/**
 * Created by lenovo on 2017/2/26.
 */

public class RootBean {
    /**
     * items : [{"avatarPath":"http://img.dxycdn.com/avatars/120/36.jpg","body":"丁香园 2017 运营和市场岗位招聘啦","mobilePushId":285,"path":"http://res.dxycdn.com/upload/2017/02/21/03/35127012.jpg","sortTime":"2017-02-21 00:00:00","title":"丁香园 2017 运营和市场岗位招聘啦","url":"http://www.dxy.cn/bbs/topic/36123008"},{"avatarPath":"http://img.dxycdn.com/avatars/120/36.jpg","body":"服用二甲双胍 这 8 大要点要知道","mobilePushId":287,"path":"http://res.dxycdn.com/upload/2017/02/23/05/62071912.jpg","sortTime":"2017-02-23 00:00:00","title":"服用二甲双胍 这 8 大要点要知道","url":"http://www.dxy.cn/bbs/topic/36144247"},{"avatarPath":"http://img.dxycdn.com/avatars/120/36.jpg","body":"血肉模糊的手外伤保肢，值得吗？","mobilePushId":288,"path":"http://res.dxycdn.com/upload/2017/02/23/07/72230524.jpg","sortTime":"2017-02-23 00:00:00","title":"血肉模糊的手外伤保肢，值得吗？","url":"http://www.dxy.cn/bbs/topic/36140806"}]
     * pageBean : {"count":0,"current":1,"pages":[],"size":20,"total":0}
     * status : success
     */

    private PageBeanBean pageBean;
    private String status;
    private List<ItemsBean> items;

    public PageBeanBean getPageBean() {
        return pageBean;
    }

    public void setPageBean(PageBeanBean pageBean) {
        this.pageBean = pageBean;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ItemsBean> getItems() {
        return items;
    }

    public void setItems(List<ItemsBean> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "RootBean{" +
                "pageBean=" + pageBean +
                ", status='" + status + '\'' +
                ", items=" + items +
                '}';
    }

    public static class PageBeanBean {
        /**
         * count : 0
         * current : 1
         * pages : []
         * size : 20
         * total : 0
         */

        private int count;
        private int current;
        private int size;
        private int total;
        private List<?> pages;

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public int getCurrent() {
            return current;
        }

        public void setCurrent(int current) {
            this.current = current;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<?> getPages() {
            return pages;
        }

        public void setPages(List<?> pages) {
            this.pages = pages;
        }
    }

    public static class ItemsBean {
        /**
         * avatarPath : http://img.dxycdn.com/avatars/120/36.jpg
         * body : 丁香园 2017 运营和市场岗位招聘啦
         * mobilePushId : 285
         * path : http://res.dxycdn.com/upload/2017/02/21/03/35127012.jpg
         * sortTime : 2017-02-21 00:00:00
         * title : 丁香园 2017 运营和市场岗位招聘啦
         * url : http://www.dxy.cn/bbs/topic/36123008
         */

        private String avatarPath;
        private String body;
        private int mobilePushId;
        private String path;
        private String sortTime;
        private String title;
        private String url;

        public String getAvatarPath() {
            return avatarPath;
        }

        public void setAvatarPath(String avatarPath) {
            this.avatarPath = avatarPath;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public int getMobilePushId() {
            return mobilePushId;
        }

        public void setMobilePushId(int mobilePushId) {
            this.mobilePushId = mobilePushId;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getSortTime() {
            return sortTime;
        }

        public void setSortTime(String sortTime) {
            this.sortTime = sortTime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        @Override
        public String toString() {
            return "ItemsBean{" +
                    "avatarPath='" + avatarPath + '\'' +
                    ", body='" + body + '\'' +
                    ", mobilePushId=" + mobilePushId +
                    ", path='" + path + '\'' +
                    ", sortTime='" + sortTime + '\'' +
                    ", title='" + title + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }
}
