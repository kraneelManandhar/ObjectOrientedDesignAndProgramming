package w5;

interface Database {
    void save(String data);
}

class MySQLDatabase implements Database {
    public void save(String data) {
        System.out.println("Saving to MySQL");
    }
}

class UserService {
    private Database db;

    UserService(Database db) {
        this.db = db;
    }

    void registerUser(String user) {
        db.save(user);
    }
}