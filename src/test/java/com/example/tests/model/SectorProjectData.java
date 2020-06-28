package com.example.tests.model;

    public class SectorProjectData {

        private final String name;
        private final String code;
        private final String specialField_name;
        private final String specialField_type;

        public SectorProjectData(String name, String code, String specialField_name, String specialField_type) {

            this.name = name;
            this.code = code;
            this.specialField_name = specialField_name;
            this.specialField_type = specialField_type;

        }

        public String getName() { return name; }

        public String getCode() { return code; }

        public String getSpecialField_name() { return specialField_name; }

        public String getSpecialField_type() { return specialField_type; }

    }


