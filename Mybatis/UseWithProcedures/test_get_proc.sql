USE [ap_agp_jiner]
GO
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER OFF
GO

ALTER PROCEDURE [dbo].[test_get_proc]
AS
DECLARE
  @error_code  int
  ,@error_msg  varchar(500)
  
SET NOCOUNT ON

SELECT @error_code = 0, @error_msg = NULL

BEGIN TRY

  SELECT @error_code AS error_code, @error_msg AS error_msg
  
  SELECT * FROM dbo.xxx WHERE ...
  
END TRY

BEGIN CATCH

  SELECT @error_code = ERROR_NUMBER(), @error_msg = ERROR_MESSAGE()
  
  SELECT @error_code AS error_code, @error_msg AS error_msg
  
  RETURN @error_code
  
END CATCH

RETURN @error_code
