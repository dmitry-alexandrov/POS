package com.example.tests.model;

    public class MunicipalityData {

        private final String name;
        private final String code;
        private final String region;

        public MunicipalityData(String name, String code, String region) {

            this.name = name;
            this.code = code;
            this.region = region;

        }

        public String getName() { return name; }

        public String getCode() { return code; }

        public String getRegion() { return region; }

    }


