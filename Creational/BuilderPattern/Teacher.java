public class Teacher {
    private String name;
    private String subject;
    private boolean isPresent;

    private Teacher(Builder builder) {
        this.name = builder.name;
        this.subject = builder.subject;
        this.isPresent = builder.isPresent;
    }

    public static class Builder {
        private String name;
        private String subject;
        private boolean isPresent;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder setIsPresent(boolean isPresent) {
            this.isPresent = isPresent;
            return this;
        }

        public Teacher build() {
            return new Teacher(this);
        }
    }

    @Override
    public String toString() {
        return "Guru :\nNama = " + name + "\nMengajar = " + subject + "\nKehadiran = " + (isPresent ? "Hadir" : "Tidak Hadir");
    }
}
