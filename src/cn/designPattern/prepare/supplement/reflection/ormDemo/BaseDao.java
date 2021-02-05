package cn.designPattern.prepare.supplement.reflection.ormDemo;

/**
 * create by Freedom on 2021/2/2
 */
public interface BaseDao<T> {


    String save(T t);

    String findAll();

    String findById(T t);

    String deleteById(T t);

    String updateById(T t);

//    boolean save(T t);
//    List<T> findAll();
//    T findById(T t);
//    boolean deleteById(T t);
//    boolean updateById(T t);

}
