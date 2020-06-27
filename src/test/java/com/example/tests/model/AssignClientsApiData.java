package com.example.tests.model;

    public class AssignClientsApiData {

        private final String user_id;
        private final String role_name;

        public AssignClientsApiData(String user_id, String role_name) {

            this.user_id = user_id;
            this.role_name = role_name;

        }

        public String getUser_id() { return user_id; }

        public String getRole_name() { return role_name; }

    }


