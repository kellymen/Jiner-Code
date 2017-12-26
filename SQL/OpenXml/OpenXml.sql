BEGIN RTY
  DECLARE @idoc int
  DECLARE @xml xml
  
  SET @xml = '<?xml version="1.0"?>
  <ArrayOfInt>
    <int>1</int>
    <int>2</int>
    <int>3</int>
    <int>4</int>
    <int>5</int>
  </ArrayOfInt>'
  
  EXEC sp_xml_preparedocument @idoc OUTPUT, @xml
  
  select * from OPENXML(@idoc, '/ArrayOfInt', 2) as T where T.text is not null
  
  EXEC sp_xml_removedocument @idoc
  
END TRY
