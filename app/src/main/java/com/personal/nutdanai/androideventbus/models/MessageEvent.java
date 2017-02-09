package com.personal.nutdanai.androideventbus.models;

public class MessageEvent {

    public static class  SearchActivityEvent {
        private String message;
        public SearchActivityEvent(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

    public static class SearchFragmentEvent {
        private String message;
        public SearchFragmentEvent(String message) {
            this.message = message;
        }

        public String getMessage() {
            return message;
        }
    }

}