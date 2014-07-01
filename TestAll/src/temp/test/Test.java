package temp.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		String sql = "with datasource as /*某班级某人的lesson下的所有练习结果*/" +
				"(SELECT * from (SELECT subjectID,ordernum FROM dbo.TEACH_TD_MaterialKnwSubject " +
				"where knwid=?) a inner join(" +
				"SELECT practiceID,classID,studentID,totalScore,correctCount,errorCount,subjectCount " +
				"FROM TEACH_VD_WorkOrExceptionItems where classID = ? " +
				"AND studentID = ?) b on a.subjectid = b.practiceid),groupbyData as " +
				"/*按照练习分组，最好的成绩*/(select * , ROW_NUMBER() over(partition by subjectid " +
				"order by totalscore desc) as rowID from datasource),joindata as /*关联练习表的名称与考点*/" +
				"(select a.name,a.inspectability,b.* from dbo.TEACH_TD_Practice as a INNER JOIN " +
				"groupbyData as b on a.id = b.subjectid) select * from joindata where rowid = 1 ORDER by ordernum";
		System.out.println(sql);
	}
	
}
