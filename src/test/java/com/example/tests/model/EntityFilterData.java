package com.example.tests.model;

public class EntityFilterData {

        private final String name;
        private final String level;
        private final String region;
        private final String municipality;
        private final String status;
        private final String type;
        private final String start_interval;
        private final String end_interval;


        public EntityFilterData(String name, String level, String region, String municipality, String status, String type, String start_interval, String end_interval) {

            this.name = name;
            this.level = level;
            this.region = region;
            this.municipality = municipality;
            this.status = status;
            this.type = type;
            this.start_interval = start_interval;
            this.end_interval = end_interval;

        }

        public String getName() {
            return name;
        }

        public String getLevel() {
            return level;
        }

        public String getRegion() {
            return region;
        }

        public String getMunicipality() {
            return municipality;
        }

        public String getStatus() { return status; }

        public String getType() {
            return type;
        }

        public String getStart_interval() {
            return start_interval;
        }

        public String getEnd_interval() {
        return end_interval;
    }

}
