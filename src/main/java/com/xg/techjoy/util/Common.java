package com.xg.techjoy.util;

/**
 * Created by dell on 2018/1/17.
 */
public class Common {

    //dao类定义一个MyRepository的接口，可以写一个自定义的方法
    //自定义dao接口
    public static final String ENTITY_DAO_PARENT = "public interface MyRepository<T, ID extends Serializable> extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {\n\n" +
            "//里面写一些自定义的方法\n}";
    //自定义接口的实现类
    public static final String ENTITY_DAO_PARENT_IMPL = "/**\n" +
            "     * 继承SimpleJpaRepository，SimpleJpaRepository帮助实现了JpaRepository中的方法。否则就要重新实现一遍\n" +
            "     * 实现类，写在MyRepository接口中自定义的方法的具体实现\n" +
            "     */\n" +
            "    public class MyRepositoryImpl<T, ID extends Serializable> extends SimpleJpaRepository<T, ID>\n" +
            "            implements MyRepository<T, ID>{\n" +
            "\n" +
            "        private final EntityManager entityManager;\n" +
            "\n" +
            "        //父类没有不带参数的构造方法，这里手动构造父类\n" +
            "        public MyRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {\n" +
            "            super(domainClass, entityManager);\n" +
            "            this.entityManager = entityManager;\n" +
            "        }\n" +
            "\n" +
            "        //写自定义方法的具体实现。。。\n" +
            "    }";
    //自定义工厂
    public static final String ENTITY_DAO_PARENT_FACTORY = "/**创建一个自定义工厂，在这个工厂里注册自定义的MyRepositoryImpl的实现*/\n" +
            "public class MyRepositoryFactoryBean<R extends JpaRepository<T, I>, T, I extends Serializable> extends JpaRepositoryFactoryBean<R, T, I> {\n\n" +
            "    @Override\n" +
            "    protected RepositoryFactorySupport createRepositoryFactory(EntityManager em) {\n" +
            "        return new MyRepositoryFactory(em);\n" +
            "    }\n" +
            "\n" +
            "    //创建一个内部类，该类不用在外部访问\n" +
            "    private static class MyRepositoryFactory<T, I extends Serializable>\n" +
            "            extends JpaRepositoryFactory {\n" +
            "\n" +
            "        private final EntityManager em;\n" +
            "\n" +
            "        public MyRepositoryFactory(EntityManager em) {\n" +
            "            super(em);\n" +
            "            this.em = em;\n" +
            "        }\n" +
            "\n" +
            "        //设置具体的实现类是BaseRepositoryImpl\n" +
            "        @Override\n" +
            "        protected Object getTargetRepository(RepositoryInformation information) {\n" +
            "            return new MyRepositoryImpl<T, I>((Class<T>) information.getDomainType(), em);\n" +
            "        }\n" +
            "\n" +
            "        //设置具体的实现类的class\n" +
            "        @Override\n" +
            "        protected Class<?> getRepositoryBaseClass(RepositoryMetadata metadata) {\n" +
            "            return MyRepositoryImpl.class;\n" +
            "        }\n" +
            "    }\n" +
            "}";


    //dao类的数据主体
    public static final String ENTITY_DAO = "public interface "
            + "#%ENTITY_CLASS#Dao extends MyRepository<#%ENTITY_CLASS#, Integer> {\n\n}";

    //然后抽象出来一个basicService
    //basicService的数据主体
    public static final String ENTITY_BASIC_SERVICE = "public abstract class BasicService<T extends Serializable,ID extends Serializable> {\n\n\n" +
            "@Autowired\n" +
            "MyRepository<T,ID> basicDao;\n\n" +
            "public T findOne(ID id) {\n" +
            "    return basicDao.findOne(id);\n" +
            "}\n\n" +
            "public List<T> findAllT() {\n" +
            "    return basicDao.findAll();\n" +
            "}\n\n" +
            "public Page<T> findAllT(Pageable pageable) {\n" +
            "    return this.basicDao.findAll(pageable);\n" +
            "}\n\n" +
            "public void add(T t) {\n" +
            "    this.basicDao.save(t);\n" +
            "}\n\n" +
            "public void update(T t) {\n" +
            "    this.basicDao.saveAndFlush(t);\n" +
            "}\n\n" +
            "public void deleteById(ID id) {\n" +
            "    this.basicDao.delete(id);\n" +
            "}\n\n" +
            "public Specification<T> inAndQuery(){\n" +
            "    return new Specification<T>() {\n" +
            "          @Override\n" +
            "          public Predicate toPredicate(Root<T> root, CriteriaQuery<?> query, CriteriaBuilder cb) {\n" +
            "               Predicate predicate = null;\n" +
            "               query.where(predicate);\n" +
            "               return query.getRestriction();\n" +
            "          }\n" +
            "   };\n\n" +
            "}\n\n\n}";



    //service的数据主体
    public static final String ENTITY_SERVICE = "public class #%ENTITY_CLASS#Service extends BasicService<#%ENTITY_CLASS#, Integer> {\n\n}";

    //baseController的数据主体
    public static final String BASE_CONTROLLER = "public abstract class BaseController {\n\n\n";
}
