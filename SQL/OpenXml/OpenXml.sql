BEGIN RTY
  DECLARE @idoc int
  DECLARE @xml xml
  
  SET @xml = '<?xml version="1.0"?>
  <root>
  <ArrayOfInt>
    <int>1</int>
    <int>2</int>
    <int>3</int>
    <int>4</int>
    <int>5</int>
  </ArrayOfInt>
  <ArrayOfLong>
    <int>6</int>
    <int>7</int>
    <int>8</int>
    <int>9</int>
    <int>10</int>
  </ArrayOfLong>
  </root>'
  
  EXEC sp_xml_preparedocument @idoc OUTPUT, @xml
  
  select * from OPENXML(@idoc, '/root/ArrayOfInt/int') with ([int] int '.') --good
  
  select * from OPENXML(@idoc, '/root/ArrayOfInt', 2) as T where T.text is not null
  
  select * from OPENXML(@idoc, '/root/ArrayOfInt', 3) where nodetype = 3
  
  EXEC sp_xml_removedocument @idoc
  
END TRY
