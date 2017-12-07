
--ROW_NUMBER ( ) OVER ( [ PARTITION BY value_expression , ... [ n ] ] order_by_clause )

dbcc freeproccache
dbcc dropcleanbuffers
set statistics time on
set statistics io on
set statistics profile on;
 
with #pager as 
(
select ID,Title,ROW_NUMBER() OVER(Order By ID) as rowid from Article_Detail 
)
select ID,Title from #pager where rowid between (15 * (50-1)+1) and 15 * 50
 
 
set statistics profile off;
