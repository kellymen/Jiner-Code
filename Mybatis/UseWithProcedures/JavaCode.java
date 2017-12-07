
/*******************返回多个结果集*******（方法 一）*******************/
//Dao层的接口
 public List<List<?>>  getOrders(Map<String, Object> map);

//Service层调用
   Map<String,Object> map=new HashMap<String, Object>();
        map.put("id", "22333");
        
   //取得返回的结果集   
   List<List<?>> results = orderDao.getOrders(map);
   
   //第一条结果集 总数量
   System.out.println(((List<Integer>)results.get(0)).get(0));
   
   //第二条订单列表
   System.out.println((List<OrderForm>)results.get(1));   

/*******************返回多个结果集*******（方法 二）*******************/
//Dao层的接口
public String querySourceInfo(Map<String, Object> map);

//service: 返回的参数值在传递进入的map中
mapper.querySourceInfo(map);
Object obj = map.get("var_result_value");
Object obj2 = map.get("var_result_value2");

/*****************************************************************/
