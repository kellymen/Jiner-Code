
--OFFSET { integer_constant | offset_row_count_expression } { ROW | ROWS } 
--FETCH { FIRST | NEXT } { integer_constant | fetch_row_count_expression } { ROW | ROWS } ONLY

dbcc freeproccache
dbcc dropcleanbuffers
set statistics time on
set statistics io on
set statistics profile on;
 
select ID,Title from Article_Detail order by id OFFSET (15 * (50-1)) ROW FETCH NEXT 15 rows only
 
set statistics profile off; 
