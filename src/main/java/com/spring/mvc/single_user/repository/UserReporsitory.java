
package com.spring.mvc.single_user.repository;

import com.spring.mvc.single_user.entities.User;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReporsitory extends JpaRepository<User, Long>{
    //根據NAME 來取得USER
    User getByName(String name);
    
    //WHERE name LIKE ?% AND id < ?
    List<User> getByNameStartingWithAndIdLessThan(String name, Long id);
    
    //WHERE id in(?, ?, ?)OR birth < ?
    List<User> getByIdInOrBirthLessThanEqual(List<Long> ids, Date birth);
    
    @Query("SELECT u FROM User u WHERE (YEAR(current_date) - YEAR(u.birth)) < :age")
    List<User> getByAgeLessThan(Integer age);
    
    //查詢筆數
    @Query(value = "SELECT count(id) FROM T_User", nativeQuery = true)
    Long getTotalCount();
}
