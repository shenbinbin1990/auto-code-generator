package ${entityUrl};
import java.util.Date;

/**   
 * @Description:TODO(${entityComment}实体类)
 * 
 * @version: ${version}
 * @author: ${author}
 * @date: ${createTime}
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@TableName("${table}")
public class ${entityName}Entity {
<#list cis as ci>
 <#if ci.property=="id">
	@TableId(value = "id", type = IdType.AUTO)
 </#if>
    //${ci.comment}
	private ${ci.javaType} ${ci.property};
    
</#list>
}
	