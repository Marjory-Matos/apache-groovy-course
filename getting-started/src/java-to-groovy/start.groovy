class start {
    public class User{
        private Long id;
        private String firstName;
        private String lastName;
        private String email;
        private Date dob;


        public User(){

        }

        User(Long id, String firstName, String lastName, String email, Date dob) {
            this.id = id
            this.firstName = firstName
            this.lastName = lastName
            this.email = email
            this.dob = dob
        }

        Long getId() {
            return id
        }

        void setId(Long id) {
            this.id = id
        }

        String getFirstName() {
            return firstName
        }

        void setFirstName(String firstName) {
            this.firstName = firstName
        }

        String getLastName() {
            return lastName
        }

        void setLastName(String lastName) {
            this.lastName = lastName
        }

        String getEmail() {
            return email
        }

        void setEmail(String email) {
            this.email = email
        }

        Date getDob() {
            return dob
        }

        void setDob(Date dob) {
            this.dob = dob
        }

        public void printFullName(){
            System.out.println("FullName: " + firstName + " " + lastName);
        }

        @Override
        public String toString(){
            return "Person-first=" + firstName + ",last=" + lastName + "]";
        }

    }
}
