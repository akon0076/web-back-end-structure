/**
 * Created by Song on 2017/2/15.
 * User表操作接口
 */
@Repository
public interface UserRepositoty extends JpaRepository<User,Long>{

    @Query("select t from User t where t.name = :name")
    User findByUserName(@Param("name") String name);
}