package test.stu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.stream.Stream;

public class Start {

    private static Connection connection = null;

    private static PreparedStatement preparedStatement = null;

    private static ResultSet resultSet = null;

    public static boolean insert() throws SQLException {
        connection = JDBCUtils.getConnection();
        preparedStatement = connection.prepareStatement("INSERT INTO student values(null,?,?,?)");
        preparedStatement.setString(1, MyRandom.randomName());
        preparedStatement.setString(2, MyRandom.randomGender());
        preparedStatement.setString(3, MyRandom.randomPhone());
        int i = preparedStatement.executeUpdate();

        JDBCUtils.close(connection, preparedStatement);

        return (i > 0) ? true : false;
    }

    public static ArrayList<String> selectName() throws SQLException {
        ArrayList<String> arrayList = new ArrayList<>();
        connection = JDBCUtils.getConnection();
        preparedStatement = connection.prepareStatement("select name from student");
        resultSet = preparedStatement.executeQuery();


        while (resultSet.next()) {
            arrayList.add(resultSet.getString(1));
        }
        JDBCUtils.close(connection, preparedStatement, resultSet);
        return arrayList;
    }

    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = selectName();

        System.out.println(arrayList.size());
        Stream<String> names = arrayList.stream().distinct();
        long count = names.count();
        System.out.println(count);


    }


}
