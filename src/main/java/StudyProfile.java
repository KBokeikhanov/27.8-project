public enum StudyProfile {
    DOCTOR("Медицина"),
    DEVELOPER("Разработка"),
    ART("Искусство"),
    LAW("Юриспруденция");

    String profileName;

    StudyProfile(String profileName) {
        this.profileName = profileName;
    }
}
