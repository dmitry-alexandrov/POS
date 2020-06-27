package com.example.tests.model;

    public class ClientsApiRoleData {

        private final String clientApiRoleName;
        private final String clientApiRoleDescription;

        public ClientsApiRoleData(String clientApiRoleName, String clientApiRoleDescription) {

            this.clientApiRoleName = clientApiRoleName;
            this.clientApiRoleDescription = clientApiRoleDescription;

        }

        public String getClientApiRoleName() { return clientApiRoleName; }

        public  String getClientApiRoleDescription() { return clientApiRoleDescription; }

    }



