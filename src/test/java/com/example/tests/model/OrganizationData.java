package com.example.tests.model;

    public class OrganizationData {

        private final String shortName;
        private final String fullName;
        private final String ogrn;
        private final String inn;
        private final String kpp;
        private final String ogv;
        private final String oktmo;
        private final String address;
        private final String level;

        public OrganizationData(String shortName, String fullName, String ogrn, String inn, String kpp, String ogv, String oktmo, String address, String level) {

            this.shortName = shortName;
            this.fullName = fullName;
            this.ogrn = ogrn;
            this.inn = inn;
            this.kpp = kpp;
            this.ogv = ogv;
            this.oktmo = oktmo;
            this.address = address;
            this.level = level;
        }

        public String getShortName() { return shortName; }

        public String getFullName() { return fullName; }

        public String getOgrn() { return ogrn; }

        public String getInn() { return inn; }

        public String getKpp() { return kpp; }

        public String getOgv() { return ogv; }

        public String getOktmo() { return oktmo; }

        public String getAddress() { return address; }

        public String getLevel() { return level; }

    }


