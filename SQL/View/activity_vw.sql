USE [ap_db_cb]
GO

SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER OFF
GO

CREATE VIEW [dbo].[activities_vw] AS
  SELECT *, 1 'is_previous_day'
  FROM dbo.xxx_activities
  UNION
  SELECT *, 0, 'is_previous_day'
  FROM dbo.xxxxx_activities WITH (SNAPSHOT)
  
GO
