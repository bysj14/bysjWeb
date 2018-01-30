package com.xg.techjoy.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by dell on 2018/1/16.
 */
public class CodeProducer {


    //项目的路径    .getProperty("user.dir") ---- 获取系统属性
    private static String srcPath = System.getProperty("user.dir") + "/src/main/java/";

    //不需要生成dao和service的domain类
    private static List<String> noNeedEntities = new ArrayList<>();

    //项目
    private static String packagePath = "";


    /**
     * 判断指定的文件是否存在，不存在则创建，存在则删除
     *
     * @param fileName
     * @throws IOException
     */
    public static void createFileOrNot(String fileName) throws IOException {
        File f = new File(fileName);
        if (!f.exists()) { //如果文件不存在
            if (!f.getParentFile().exists()) { //如果文件的父路径也不存在
                //创建父路径
                f.getParentFile().mkdirs();
            }
            f.createNewFile();
        } else {
            //删除，重新创建
            f.delete();
            f.createNewFile();
        }
    }


    /**
     * 创建MyRepository文件
     *
     * @param packageName
     * @throws IOException
     */
    public static void createEntityDaoParent(String packageName) throws IOException {
        //文件详细地址   把 . 替换成 /
        String fileName = srcPath + packageName.replace(".", "/") + "/MyRepository.java";
        //判断文件是否存在
        createFileOrNot(fileName);
        //字符输入流  参数append值为true，说明将字节追加到文件末尾处
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        //写入数据
        out.write("package " + packagePath + "jpaRepository;\n\n");
        out.write("import java.io.Serializable;\n");
        out.write("import org.springframework.data.repository.NoRepositoryBean;\n");
        out.write("import org.springframework.data.jpa.repository.JpaRepository;\n");
        out.write("import org.springframework.data.jpa.repository.JpaSpecificationExecutor;\n\n\n");
        out.write("//加上@NoRepositoryBean注解，SpringDataJpa在启动时就不会去实例化这个接口\n");
        out.write("@NoRepositoryBean\n");
        out.write(Common.ENTITY_DAO_PARENT);
        //刷新----将缓冲内容真正写入
        out.flush();
        //释放资源
        out.close();
    }

    /**
     * 创建MyRepositoryImpl实现类
     *
     * @param packageName
     * @throws IOException
     */
    public static void createEntityDaoParentImpl(String packageName) throws IOException {
        //文件详细地址   把 . 替换成 /
        String fileName = srcPath + packageName.replace(".", "/") + "/MyRepositoryImpl.java";
        //判断文件是否存在
        createFileOrNot(fileName);
        //字符输入流  参数append值为true，说明将字节追加到文件末尾处
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        //写入数据
        out.write("package " + packagePath + "jpaRepository;\n\n");
        out.write("import org.springframework.data.jpa.repository.support.SimpleJpaRepository;\n");
        out.write("import javax.persistence.EntityManager;\n");
        out.write("import java.io.Serializable;\n\n");
        out.write(Common.ENTITY_DAO_PARENT_IMPL);
        //刷新----将缓冲内容真正写入
        out.flush();
        //释放资源
        out.close();
    }

    /**
     * 创建MyRepositoryFactoryBean文件
     *
     * @param packageName
     * @throws IOException
     */
    public static void createEntityDaoParentFactory(String packageName) throws IOException {
        //文件详细地址   把 . 替换成 /
        String fileName = srcPath + packageName.replace(".", "/") + "/MyRepositoryFactoryBean.java";
        //判断文件是否存在
        createFileOrNot(fileName);
        //字符输入流  参数append值为true，说明将字节追加到文件末尾处
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        //写入数据
        out.write("package " + packagePath + "jpaRepository;\n\n");
        out.write("import org.springframework.data.jpa.repository.JpaRepository;\n");
        out.write("import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;\n");
        out.write("import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;\n");
        out.write("import org.springframework.data.repository.core.RepositoryInformation;\n");
        out.write("import org.springframework.data.repository.core.RepositoryMetadata;\n");
        out.write("import org.springframework.data.repository.core.support.RepositoryFactorySupport;\n");
        out.write("import javax.persistence.EntityManager;\n");
        out.write("import java.io.Serializable;\n");
        out.write(Common.ENTITY_DAO_PARENT_FACTORY);
        //刷新----将缓冲内容真正写入
        out.flush();
        //释放资源
        out.close();
    }

    /**
     * 创建实体类对应的的dao
     *
     * @param entityName  实体类名称
     * @param packageName 所在的包名
     * @throws IOException
     */
    public static void createEntityDao(String entityName, String packageName) throws IOException {
        //文件的详细地址
        String fileName = srcPath + packageName.replace(".", "/") + "/" + entityName + "Dao.java";
        //判断文件是否存在
        createFileOrNot(fileName);
        //字符输入流  参数append值为true，说明将字节追加到文件末尾处
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        //写入数据
        out.write("package " + packagePath + "dao;\n\n");
        out.write("import " + packagePath + "domain." + entityName + ";\n");
        out.write("import " + packagePath + "jpaRepository.MyRepository;\n\n\n");
        out.write(Common.ENTITY_DAO.replaceAll("#%ENTITY_CLASS#", entityName));
        //刷新----将缓冲内容真正写入
        out.flush();
        //释放资源
        out.close();
    }

    /**
     * 创建BasicService文件
     *
     * @param packageName
     * @throws IOException
     */
    public static void createBasicService(String packageName) throws IOException {
        //文件的详细地址
        String fileName = srcPath + packageName.replace(".", "/") + "/BasicService.java";
        //判断文件是否存在
        createFileOrNot(fileName);
        //字符输入流
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        //写入数据
        out.write("package " + packagePath + "service;\n\n");
        out.write("import " + packagePath + "jpaRepository.MyRepository;\n");
        out.write("import org.springframework.beans.factory.annotation.Autowired;\n");
        out.write("import org.springframework.stereotype.Service;\n");
        out.write("import org.springframework.data.domain.Page;\n");
        out.write("import org.springframework.data.domain.Pageable;\n");
        out.write("import org.springframework.data.jpa.domain.Specification;\n");
        out.write("import javax.persistence.criteria.CriteriaBuilder;\n");
        out.write("import javax.persistence.criteria.CriteriaQuery;\n");
        out.write("import javax.persistence.criteria.Predicate;\n");
        out.write("import javax.persistence.criteria.Root;\n");
        out.write("import java.io.Serializable;\n");
        out.write("import java.util.List;\n\n\n");
        out.write("@Service\n");
        out.write(Common.ENTITY_BASIC_SERVICE);
        //刷新，将缓冲内容真正写入
        out.flush();
        //释放资源
        out.close();
    }

    /**
     * 创建实体类对应的的service
     *
     * @param entityName  实体类名称
     * @param packageName 所在的包名
     */
    public static void createEntityService(String entityName, String packageName) throws IOException {
        //文件的详细地址
        String fileName = srcPath + packageName.replace(".", "/") + "/" + entityName + "Service.java";
        //判断文件是否存在
        createFileOrNot(fileName);
        //字符输入流,
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        //写入数据
        out.write("package " + packagePath + "service;\n\n");
        out.write("import org.springframework.stereotype.Service;\n");
        out.write("import " + packagePath + "domain." + entityName + ";\n");
        out.write("import " + packagePath + "service.BasicService;\n\n\n");
        out.write("@Service\n");
        out.write(Common.ENTITY_SERVICE.replaceAll("#%ENTITY_CLASS#", entityName));
        //刷新
        out.flush();
        //释放资源
        out.close();
    }


    /**
     * @description 获得文件夹内所有文件的名称
     */
    public static List<String> getAllFileName(String file_Name_path) throws IOException {
        //获取该路径下的所有的文件
        File[] files = new File(file_Name_path).listFiles();
        //判断这些文件是否需要自动生成dao和service
        needEntitiesOrNot(files);
        List<String> fileNames = new ArrayList<>();
        //遍历所有的文件名称，只保留.java前面的部分，保存到fileNames中
        for (File file : files) {
            if (file.isFile()) {
                String name = file.getName();
                fileNames.add(name.substring(0, name.indexOf(".")));
            }
        }
        return fileNames;
    }


    /**
     * 在文件指定位置插入
     *
     * @param file
     * @param point
     * @param content
     * @throws IOException
     */
    public static void domainImplSerializable(File file, int point, String content) throws IOException {

        File tmp = File.createTempFile("tmp", null);//在临时文件夹下创建临时空文件
        tmp.deleteOnExit();//程序运行正常结束后，就自动删除

        RandomAccessFile raf = new RandomAccessFile(file, "rw");//他是一个随即读写的类，可以进行指针的定位，在指定位置进行读写。

        FileOutputStream tmpOut = new FileOutputStream(tmp);//创建临时文件保存插入点后数据
        FileInputStream tmpIn = new FileInputStream(tmp);
        raf.seek(point);

        byte[] buff = new byte[1024];//将要插入的内容读入临时文件中
        int hasRead = 0;//保存实际读取的字节数
        while ((hasRead = raf.read(buff)) > 0) {//循环读取
            tmpOut.write(buff, 0, hasRead);
        }

        raf.seek(point);//返回原插入处
        raf.write(content.getBytes());//追加需要添加的内容
        while ((hasRead = tmpIn.read(buff)) > 0) {//追加临时文件中的内容
            raf.write(buff, 0, hasRead);
        }

    }


    /**
     * domain实体类 获取指针位置
     */
    public static int[] getSeekPoint(File file, String entityName) throws IOException {

        BufferedReader entityBr = new BufferedReader(new FileReader(file));

        entityBr.mark( ( int )file.length() + 1 );//在首行做个标记
        String line = null;
        int[] pointer = new int[2];

        while ((line = entityBr.readLine()) != null) {//按照顺序查找的
            pointer[1] += (line.length() + 1);
            if (line.contains("public class " + entityName)) {
                if (line.contains("{")) {
                    pointer[1] = pointer[1] - 2;// 插到 { 之前
                } else {
                    pointer[1] = pointer[1] - 1;// 插到 该行最后
                }
                break;//跳出while循环
            }
        }
        entityBr.reset();//BufferedReader重新定位到文件首位置,每一次读完之后重新定位到文件首位置继续读入
        while ((line = entityBr.readLine()) != null) {//按照顺序查找的
            pointer[0] += (line.length() + 1);
            if (line.contains("package com.xg.techjoy.")) {
                pointer[0] = pointer[0];//下一行
                break;
            }
        }
        return pointer;//返回插入位置
    }

    /**
     * 实现真正的序列化
     */
    public static void impldomainImpl(File file, String entityName) throws IOException {

        BufferedReader entityBr = new BufferedReader(new FileReader(file));

        String line = null;
        boolean whetherToImpl = true;

        while ((line = entityBr.readLine()) != null) {
            if (line.contains("import java.io.Serializable;") || line.contains("implements Serializable")) {
                whetherToImpl = false;
                break;
            }
        }

        if (whetherToImpl == true) {
            int[] points = getSeekPoint(file, entityName);//获取插入位置
            domainImplSerializable(file, points[1], " implements Serializable");//实现序列化
            points = getSeekPoint(file, entityName);//获取插入位置
            domainImplSerializable(file, points[0], "import java.io.Serializable;\n");//引入序列化


        }
    }

    /**
     * @description 判断该实体类是否需要自动生成dao或service
     */
    public static void needEntitiesOrNot(File[] files) throws IOException {

        for (File file : files) {
            boolean whetherToCreate = false;
            if (file.isFile()) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
                String line = null;
                String name = file.getName();
                String entityName = name.substring(0, name.indexOf("."));
                while ((line = reader.readLine()) != null) {
                    if (line.contains("@javax.persistence.Entity") || line.contains("@Entity")) {
                        //给相应的实体类实现序列化
                        System.out.println(entityName);
                        impldomainImpl(file, entityName);
                        whetherToCreate = true;
                        break;//跳出while循环
                    }
                }
                if (!whetherToCreate) {
                    noNeedEntities.add(entityName);
                }
            }
        }
    }

    /**
     * 首字母变为小写
     *
     * @param str
     * @return
     */
    public static String setFirstLower(String str) {
        return str.substring(0, 1).toLowerCase() + str.substring(1);
    }

    /**
     * 创建底层抽象的 BaseController
     *
     * @param packageName
     * @throws IOException
     */
    public static void createBaseController(String packageName) throws IOException {
        //文件的详细地址
        String fileName = srcPath + packageName.replace(".", "/") + "/BaseController.java";
        //判断是否存在
        createFileOrNot(fileName);
        //字符输入流
        BufferedWriter out = new BufferedWriter(new FileWriter(fileName, true));
        //获取所有的service文件
        List<String> serviceFileNames = getAllFileName(srcPath + "com/xg/techjoy/service");
        //写入
        out.write("package " + packagePath + "controller;\n\n");
        out.write("import " + packagePath + "service.*;\n");
        out.write("import org.springframework.beans.factory.annotation.Autowired;\n\n\n");
        out.write(Common.BASE_CONTROLLER);
        //创建每个实体类对应的dao和service
        for (String serviceName : serviceFileNames) {
            out.write("@Autowired\n");
            out.write("protected " + serviceName + " " + setFirstLower(serviceName) + ";\n");//protected只有这个类的子类可以访问
        }
        out.write("\n\n\n}");
        //刷新
        out.flush();
        //释放资源
        out.close();
    }

    /**
     * 程序运行入口
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("该程序可根据实体类自动生成对应Dao、Service和一个底层抽象Controller文件");
        System.out.println("\n注意：存放实体类的文件夹名称必须为domain");
        System.out.println("\n请输入您要进行的项目的package路径【例：com.xg.techjoy.】: ");

        packagePath = input.nextLine();

        //获得所有的实体类名称
        List<String> domainFileNames = getAllFileName(srcPath + "/com/xg/techjoy/domain");

        if (domainFileNames.size() == 0) {
            System.out.println("警告 ---- 未添加名为domain的实体类文件夹");
            System.exit(0);//结束程序运行
        }

        //dao和service所在的包
        String daoPackageName = "com.xg.techjoy.dao";
        String daoParentPackageName = "com.xg.techjoy.jpaRepository";
        String servicePackageName = "com.xg.techjoy.service";
        String controllerPackageName = "com.xg.techjoy.controller";

        //创建MyRepository和BasicService
        createEntityDaoParent(daoParentPackageName);
        createEntityDaoParentImpl(daoParentPackageName);
        createEntityDaoParentFactory(daoParentPackageName);
        createBasicService(servicePackageName);

        //创建每个实体类对应的dao和service
        for (String entityName : domainFileNames) {
            //判断此实体类是否需要创建对应的dao和service
            boolean isCreateOrNot = true;
            for (String entity : noNeedEntities) {
                if (entity.toLowerCase().equals(entityName.toLowerCase())) {
                    isCreateOrNot = false;
                    break;
                }
            }
            if (isCreateOrNot) {
                createEntityDao(entityName, daoPackageName);
                createEntityService(entityName, servicePackageName);
            }
        }
        //必须在已经生成好所有service文件后调用该方法
        createBaseController(controllerPackageName);
        System.out.println("\n\n\n再次使用前，注意先删除上次添加的实体类文件domain 和上次新生成的 dao,service,jpaRepository,controller文件");
    }

}
