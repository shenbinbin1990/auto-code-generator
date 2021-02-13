package ${controllerUrl};

/**
 * 
 * <p>说明： ${entityComment}API接口层</P>
 * @version: ${version}
 * @author: ${author}
 * @date: ${createTime}
 *
 */
@Slf4j
@Api(description = "${entityComment}",value="${entityComment}" )
@RestController
@RequestMapping("/${objectName}")
public class ${entityName}Controller {
    @Autowired
    private ${entityName}Service ${'${entityName}'?uncap_first}Service;

    @ApiOperation(value = "1.2.3-${methodDesc}" ,notes = "shenbinbin-${methodDesc}")
    @PostMapping("/${'${responseBody}'?uncap_first}Query")
    public JsonResult<List<${responseBody}>> get${responseBody}() {
        JsonResult<List<${responseBody}>> jsonResult;
        try {
            jsonResult = JsonResult.newSucc(${'${entityName}'?uncap_first}Service.get${responseBody}());
        } catch (Exception e) {
            jsonResult = JsonResult.newFail("${methodDesc}失败！");
            log.error("${methodDesc}失败！", e);
        }
        return jsonResult;
    }

    @ApiOperation(value = "1.2.3-${methodDesc}" ,notes = "shenbinbin-${methodDesc}")
    @PostMapping("/${'${responseBody}'?uncap_first}Query")
    public JsonResult<${responseBody}> get${responseBody}() {
        JsonResult<${responseBody}> jsonResult;
        try {
            jsonResult = JsonResult.newSucc(${'${entityName}'?uncap_first}Service.get${responseBody}());
        } catch (Exception e) {
            jsonResult = JsonResult.newFail("${methodDesc}失败！");
            log.error("${methodDesc}失败！", e);
        }
        return jsonResult;
    }

    @ApiOperation(value = "1.2.3-${methodDesc}" ,notes = "shenbinbin-${methodDesc}")
    @PostMapping("/${'${methodName}'?uncap_first}")
    public JsonResult ${'${methodName}'?uncap_first}(@RequestBody ${methodName}Req req) {
        BaseRes baseRes = ${'${entityName}'?uncap_first}Service.${'${methodName}'?uncap_first}(req);
        if (baseRes != null) {
            return JsonResult.failReturn(baseRes.getErrorCode(), baseRes.getErrorMsg());
        } else {
            return JsonResult.successReturn();
        }
    }

    @ApiOperation(value = "1.2.3-${methodDesc}" ,notes = "shenbinbin-${methodDesc}")
    @PostMapping("/${'${methodName}'?uncap_first}Query")
    public JsonResult<PageInfo<${responseBody}>> get${responseBody}(@Valid @RequestBody ${responseBody}Req req) {
        JsonResult<PageInfo<${responseBody}>> jsonResult;
        try {
            jsonResult = JsonResult.newSucc(${'${entityName}'?uncap_first}Service.get${responseBody}(req));
        } catch (Exception e) {
            jsonResult = JsonResult.newFail("${methodDesc}失败！");
            log.error("${methodDesc}失败！", e);
        }
        return jsonResult;
    }

    @ApiOperation(value = "1.2.3-${methodDesc}" ,notes = "shenbinbin-${methodDesc}")
    @PostMapping("/${'${entityName}'?uncap_first}Insert")
    public JsonResult add${entityName}(@Valid @RequestBody ${entityName}InsertReq req) {
        BaseRes baseRes = ${'${entityName}'?uncap_first}Service.add${entityName}(req);
        if (baseRes != null) {
            return JsonResult.failReturn(baseRes.getErrorCode(), baseRes.getErrorMsg());
        } else {
            return JsonResult.successReturn();
        }
    }

    @ApiOperation(value = "1.2.3-${methodDesc}" ,notes = "shenbinbin-${methodDesc}")
    @PostMapping("/${'${entityName}'?uncap_first}Disable")
    public JsonResult disable${entityName}(@Valid @RequestBody ${entityName}DisableReq req) {
        BaseRes baseRes = ${'${entityName}'?uncap_first}Service.disable${entityName}(req);
        if (baseRes != null) {
            return JsonResult.failReturn(baseRes.getErrorCode(), baseRes.getErrorMsg());
        } else {
            return JsonResult.successReturn();
        }
    }


    @ApiOperation(value = "1.2.3-医美项目知识库修改" ,notes = "shenbinbin医美项目知识库修改")
    @PostMapping("/${'${entityName}'?uncap_first}Update")
    public JsonResult update${entityName}(@Valid @RequestBody ${entityName}UpdateReq req) {
        BaseRes baseRes = ${'${entityName}'?uncap_first}Service.update${entityName}(req);
        if (baseRes != null) {
            return JsonResult.failReturn(baseRes.getErrorCode(), baseRes.getErrorMsg());
        } else {
            return JsonResult.successReturn();
        }
    }
}