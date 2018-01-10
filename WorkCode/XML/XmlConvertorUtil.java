public static String objectToXmlString(Object object){
  StringWriter sw = new StringWriter();
  try{
    JAXBContext jaxbContext = JAXBContext.newInstance(object.getClass());
    Marshaller marshaller = jaxbContext.createMarshaller();
    marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
    marshaller.marshal(object, sw);
  }catch(JAXBException e){
    e.printStackTrace();
  }
  return sw.toString();
}
