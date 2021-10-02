package Database;

public interface Database {
    public void connect();
    public void commit();
    public void disconnect();
    public void createItem();
    public void readItem();
    public void updateItem();
    public void deleteItem();
}
