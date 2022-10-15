package com.measoby.designpattern.builder;

public class Text {
    private String text;

    @Override
    public String toString() {
        return text;
    }

    public static class Builder{
        private String title;
        private String content;
        private String[] items;

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setContent(String content) {
            this.content = content;
            return this;
        }

        public Builder setItems(String... items) {
            this.items = items;
            return this;
        }

        public Text build() {
            Text text = new Text();
            StringBuilder sbuilder = new StringBuilder();
            sbuilder.append("타이틀 : ").append(title).append("\n");
            sbuilder.append("내용 : ").append(content).append("\n");
            sbuilder.append("항목 : ").append("\n");
            for (String item : items) {
                sbuilder.append(" - ").append(item).append("\n");
            }

            text.text = sbuilder.toString();
            return text;
        }
    }
}
