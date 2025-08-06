package javabasic_02.day11.Test.Test03;

    public class Emp {
        public String getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public double getBaseSalry() {
            return baseSalary;
        }

        public void setId(String id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setBaseSalry(double baseSalary) {
            this.baseSalary = baseSalary;
        }

        public double getSalary(double bounus){
            return baseSalary + baseSalary * bounus;
        }

        private String id;
        private String name;
        private double baseSalary;


        public String toString() {
            return name + "(" + id + ") 사원의 기본급은 " + (int)baseSalary + "원 입니다.";
        }
    }

