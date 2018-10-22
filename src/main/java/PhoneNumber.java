public class PhoneNumber {
    private int mobilePhone;
    private int workingPhone;
    private int homePhone;

    PhoneNumber(int mobilePhone, int workingPhone, int homePhone) {
        this.mobilePhone = mobilePhone;
        this.workingPhone = workingPhone;
        this.homePhone = homePhone;
    }

    public String toString() {
        return "mobile phone: " + mobilePhone + ", working number: " + workingPhone + ", home number: " + homePhone;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public int getWorkingPhone() {
        return workingPhone;
    }

    public int getHomePhone() {
        return homePhone;
    }

}