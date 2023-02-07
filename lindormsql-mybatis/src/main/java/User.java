import java.sql.Date;
import java.sql.Time;

public class User {
    private String userId;
    private String userName;

    private Time t;
    private Date d;

    public User(String userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public User(String userId, String userName, Time t, Date d) {
        this.userId = userId;
        this.userName = userName;
        this.t = t;
        this.d = d;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Time getT() {
        return t;
    }

    public void setT(Time t) {
        this.t = t;
    }

    public Date getD() {
        return d;
    }

    public void setD(Date d) {
        this.d = d;
    }

    @Override public String toString() {
        return "User{" + "userId='" + userId + '\'' + ", userName='" + userName + '\'' + ", t=" + t + ", d=" + d + '}';
    }
}
