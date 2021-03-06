/*
 * Copyright (c) 1997, 2017, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.tools.internal.ws.resources;

import java.util.Locale;
import java.util.ResourceBundle;
import com.sun.istack.internal.localization.Localizable;
import com.sun.istack.internal.localization.LocalizableMessageFactory;
import com.sun.istack.internal.localization.LocalizableMessageFactory.ResourceBundleSupplier;
import com.sun.istack.internal.localization.Localizer;


/**
 * Defines string formatting method for each constant in the resource file
 *
 */
public final class WscompileMessages {

    private final static String BUNDLE_NAME = "com.sun.tools.internal.ws.resources.wscompile";
    private final static LocalizableMessageFactory MESSAGE_FACTORY = new LocalizableMessageFactory(BUNDLE_NAME, new WscompileMessages.BundleSupplier());
    private final static Localizer LOCALIZER = new Localizer();

    public static Localizable localizableWSIMPORT_NOT_A_FILE_NOR_URL(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.NotAFileNorURL", arg0);
    }

    /**
     * "{0}" is neither a file name nor an URL
     *
     */
    public static String WSIMPORT_NOT_A_FILE_NOR_URL(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_NOT_A_FILE_NOR_URL(arg0));
    }

    public static Localizable localizableWSGEN_USAGE_EXTENSIONS() {
        return MESSAGE_FACTORY.getMessage("wsgen.usage.extensions");
    }

    /**
     *
     * Extensions:
     *   -Xnocompile                do not compile generated Java files
     *
     */
    public static String WSGEN_USAGE_EXTENSIONS() {
        return LOCALIZER.localize(localizableWSGEN_USAGE_EXTENSIONS());
    }

    public static Localizable localizableWSIMPORT_HELP(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.help", arg0);
    }

    /**
     *
     * Usage: {0} [options] <WSDL_URI>
     *
     * where [options] include:
     *   -b <path>                 specify jaxws/jaxb binding files or additional schemas
     *                             (Each <path> must have its own -b)
     *   -B<jaxbOption>            Pass this option to JAXB schema compiler
     *   -catalog <file>           specify catalog file to resolve external entity references
     *                             supports TR9401, XCatalog, and OASIS XML Catalog format.
     *   -classpath <path>         specify where to find user class files and wsimport extensions
     *   -cp <path>                specify where to find user class files and wsimport extensions
     *   -d <directory>            specify where to place generated output files
     *   -encoding <encoding>      specify character encoding used by source files
     *   -extension                allow vendor extensions - functionality not specified
     *                             by the specification.  Use of extensions may
     *                             result in applications that are not portable or
     *                             may not interoperate with other implementations
     *   -help                     display help
     *   -httpproxy:<proxy>        set a HTTP proxy. Format is [user[:password]@]proxyHost:proxyPort
     *                             (port defaults to 8080)
     *   -J<javacOption>           pass this option to javac
     *   -keep                     keep generated files
     *   -p <pkg>                  specifies the target package
     *   -m <name>                 generate module-info.java with given Java module name
     *   -quiet                    suppress wsimport output
     *   -s <directory>            specify where to place generated source files
     *   -target <version>         generate code as per the given JAXWS spec version
     *                             Defaults to 2.2, Accepted values are 2.0, 2.1 and 2.2
     *                             e.g. 2.0 will generate compliant code for JAXWS 2.0 spec
     *   -verbose                  output messages about what the compiler is doing
     *   -version                  print version information
     *   -fullversion              print full version information
     *   -wsdllocation <location>  @WebServiceClient.wsdlLocation value
     *   -clientjar <jarfile>      creates the jar file of the generated artifacts along with the
     *                             WSDL metadata required for invoking the web service.
     *   -generateJWS              generate stubbed JWS implementation file
     *   -implDestDir <directory>  specify where to generate JWS implementation file
     *   -implServiceName <name>   local portion of service name for generated JWS implementation
     *   -implPortName <name>      local portion of port name for generated JWS implementation
     *
     */
    public static String WSIMPORT_HELP(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_HELP(arg0));
    }

    public static Localizable localizableWSIMPORT_ILLEGAL_TARGET_VERSION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.ILLEGAL_TARGET_VERSION", arg0);
    }

    /**
     * "{0}" is not a valid target version. "2.0" and "2.1" are supported.
     *
     */
    public static String WSIMPORT_ILLEGAL_TARGET_VERSION(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_ILLEGAL_TARGET_VERSION(arg0));
    }

    public static Localizable localizableWSIMPORT_USAGE_EXAMPLES() {
        return MESSAGE_FACTORY.getMessage("wsimport.usage.examples");
    }

    /**
     *
     * Examples:
     *   wsimport stock.wsdl -b stock.xml -b stock.xjb
     *   wsimport -d generated http://example.org/stock?wsdl
     *
     *
     */
    public static String WSIMPORT_USAGE_EXAMPLES() {
        return LOCALIZER.localize(localizableWSIMPORT_USAGE_EXAMPLES());
    }

    public static Localizable localizableWSIMPORT_DEBUG_MESSAGE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.DebugMessage", arg0);
    }

    /**
     * [DEBUG] {0}
     *
     */
    public static String WSIMPORT_DEBUG_MESSAGE(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_DEBUG_MESSAGE(arg0));
    }

    public static Localizable localizableWSIMPORT_FULLVERSION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.fullversion", arg0);
    }

    /**
     * wsimport full version "{0}"
     *
     */
    public static String WSIMPORT_FULLVERSION(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_FULLVERSION(arg0));
    }

    public static Localizable localizableWSIMPORT_NO_SUCH_JAXB_OPTION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.noSuchJaxbOption", arg0);
    }

    /**
     * no such JAXB option: {0}
     *
     */
    public static String WSIMPORT_NO_SUCH_JAXB_OPTION(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_NO_SUCH_JAXB_OPTION(arg0));
    }

    public static Localizable localizableWSIMPORT_ILLEGAL_PROXY(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.ILLEGAL_PROXY", arg0);
    }

    /**
     * "{0}" is not a valid proxy format. The format is [user[:password]@]proxyHost:proxyPort
     *
     */
    public static String WSIMPORT_ILLEGAL_PROXY(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_ILLEGAL_PROXY(arg0));
    }

    public static Localizable localizableINVOKER_NEED_ENDORSED(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("invoker.needEndorsed", arg0, arg1);
    }

    /**
     * You are running on JDK6 or newer which comes with JAX-WS {0} API, but this tool requires JAX-WS {1} or newer API. Use the standard override mechanism.
     *
     */
    public static String INVOKER_NEED_ENDORSED(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableINVOKER_NEED_ENDORSED(arg0, arg1));
    }

    public static Localizable localizableWSIMPORT_AUTH_INFO_NEEDED(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("wsimport.authInfoNeeded", arg0, arg1, arg2);
    }

    /**
     * {0},  "{1}" needs authorization, please provide authorization file with read access at {2} or use -Xauthfile to give the authorization file and on each line provide authorization information using this format : http[s]://user:password@host:port//<url-path>
     *
     */
    public static String WSIMPORT_AUTH_INFO_NEEDED(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableWSIMPORT_AUTH_INFO_NEEDED(arg0, arg1, arg2));
    }

    public static Localizable localizableWSIMPORT_AUTH_INFO_LINENO(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsimport.AUTH_INFO_LINENO", arg0, arg1);
    }

    /**
     * line {0} of {1}
     *
     */
    public static String WSIMPORT_AUTH_INFO_LINENO(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSIMPORT_AUTH_INFO_LINENO(arg0, arg1));
    }

    public static Localizable localizableWSCOMPILE_MISSING_OPTION_ARGUMENT(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.missingOptionArgument", arg0);
    }

    /**
     * option "{0}" requires an argument
     *
     */
    public static String WSCOMPILE_MISSING_OPTION_ARGUMENT(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_MISSING_OPTION_ARGUMENT(arg0));
    }

    public static Localizable localizableWSIMPORT_ARCHIVE_ARTIFACT(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsimport.archiveArtifact", arg0, arg1);
    }

    /**
     * Adding {0} to the archive {1}
     *
     */
    public static String WSIMPORT_ARCHIVE_ARTIFACT(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSIMPORT_ARCHIVE_ARTIFACT(arg0, arg1));
    }

    public static Localizable localizableWSGEN_USAGE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.usage", arg0);
    }

    /**
     * Usage: {0} [options] <SEI>
     *
     * Use "wsgen -help" for a detailed description of options.
     *
     */
    public static String WSGEN_USAGE(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_USAGE(arg0));
    }

    public static Localizable localizableWSIMPORT_USAGE_EXTENSIONS() {
        return MESSAGE_FACTORY.getMessage("wsimport.usage.extensions");
    }

    /**
     *
     * Extensions:
     *   -XadditionalHeaders              map headers not bound to request or response message to
     *                                    Java method parameters
     *   -Xauthfile                       file to carry authorization information in the format
     *                                    http://username:password@example.org/stock?wsdl
     *   -Xdebug                          print debug information
     *   -Xno-addressing-databinding      enable binding of W3C EndpointReferenceType to Java
     *   -Xnocompile                      do not compile generated Java files
     *   -XdisableAuthenticator           disable Authenticator used by JAX-WS RI,
     *                                    -Xauthfile option will be ignored if set
     *   -XdisableSSLHostnameVerification disable the SSL Hostname verification while fetching
     *                                    wsdls
     *
     */
    public static String WSIMPORT_USAGE_EXTENSIONS() {
        return LOCALIZER.localize(localizableWSIMPORT_USAGE_EXTENSIONS());
    }

    public static Localizable localizableWSIMPORT_WARNING_MESSAGE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.WarningMessage", arg0);
    }

    /**
     * [WARNING] {0}
     *
     */
    public static String WSIMPORT_WARNING_MESSAGE(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_WARNING_MESSAGE(arg0));
    }

    public static Localizable localizableWSGEN_INVALID_TRANSPORT(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsgen.invalid.transport", arg0, arg1);
    }

    /**
     * "{0}" is not a supported transport.  Supported transport includes: {1}.
     *
     */
    public static String WSGEN_INVALID_TRANSPORT(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSGEN_INVALID_TRANSPORT(arg0, arg1));
    }

    public static Localizable localizableWSIMPORT_DOCUMENT_DOWNLOAD(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsimport.document.download", arg0, arg1);
    }

    /**
     *
     * Downloading metadata document from {0} to {1}
     *
     */
    public static String WSIMPORT_DOCUMENT_DOWNLOAD(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSIMPORT_DOCUMENT_DOWNLOAD(arg0, arg1));
    }

    public static Localizable localizableWSGEN_CLASS_NOT_FOUND(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.class.not.found", arg0);
    }

    /**
     * Class not found: "{0}"
     *
     */
    public static String WSGEN_CLASS_NOT_FOUND(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_CLASS_NOT_FOUND(arg0));
    }

    public static Localizable localizableWSCOMPILE_DUPLICATE_OPTION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.duplicateOption", arg0);
    }

    /**
     * duplicate option: {0}
     *
     */
    public static String WSCOMPILE_DUPLICATE_OPTION(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_DUPLICATE_OPTION(arg0));
    }

    public static Localizable localizableWSCOMPILE_UNSUPPORTED_ENCODING(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.unsupportedEncoding", arg0);
    }

    /**
     * unsupported encoding: {0}
     *
     */
    public static String WSCOMPILE_UNSUPPORTED_ENCODING(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_UNSUPPORTED_ENCODING(arg0));
    }

    public static Localizable localizableWSIMPORT_COMPILING_CODE() {
        return MESSAGE_FACTORY.getMessage("wsimport.CompilingCode");
    }

    /**
     *
     * Compiling code...
     *
     *
     */
    public static String WSIMPORT_COMPILING_CODE() {
        return LOCALIZER.localize(localizableWSIMPORT_COMPILING_CODE());
    }

    public static Localizable localizableWSGEN_SERVICENAME_MISSING_NAMESPACE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.servicename.missing.namespace", arg0);
    }

    /**
     * The service name "{0}" is missing a namespace.
     *
     */
    public static String WSGEN_SERVICENAME_MISSING_NAMESPACE(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_SERVICENAME_MISSING_NAMESPACE(arg0));
    }

    public static Localizable localizableWSIMPORT_MAX_REDIRECT_ATTEMPT() {
        return MESSAGE_FACTORY.getMessage("wsimport.maxRedirectAttempt");
    }

    /**
     * Can not get a WSDL maximum number of redirects(5) reached
     *
     */
    public static String WSIMPORT_MAX_REDIRECT_ATTEMPT() {
        return LOCALIZER.localize(localizableWSIMPORT_MAX_REDIRECT_ATTEMPT());
    }

    public static Localizable localizableWSIMPORT_READING_AUTH_FILE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.readingAuthFile", arg0);
    }

    /**
     * Trying to read authorization file : "{0}"...
     *
     */
    public static String WSIMPORT_READING_AUTH_FILE(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_READING_AUTH_FILE(arg0));
    }

    public static Localizable localizableWSGEN_CANNOT_GEN_WSDL_FOR_SOAP_12_BINDING(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsgen.cannot.gen.wsdl.for.soap12.binding", arg0, arg1);
    }

    /**
     * wsgen can not generate WSDL for SOAP 1.2 binding: {0} on class: {1}.Please specify "-extension" and "-wsdl:protocol XSoap1.2" switches. For example:wsgen -wsdl:protocol XSoap1.2 -extenson {1}
     *
     */
    public static String WSGEN_CANNOT_GEN_WSDL_FOR_SOAP_12_BINDING(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSGEN_CANNOT_GEN_WSDL_FOR_SOAP_12_BINDING(arg0, arg1));
    }

    public static Localizable localizableWSIMPORT_INFO_MESSAGE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.InfoMessage", arg0);
    }

    /**
     * [INFO] {0}
     *
     */
    public static String WSIMPORT_INFO_MESSAGE(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_INFO_MESSAGE(arg0));
    }

    public static Localizable localizableWSCOMPILE_EXISTING_OPTION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.existingOption", arg0);
    }

    /**
     * Ignoring already defined option {0}
     *
     *
     */
    public static String WSCOMPILE_EXISTING_OPTION(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_EXISTING_OPTION(arg0));
    }

    public static Localizable localizableWSGEN_PORTNAME_MISSING_NAMESPACE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.portname.missing.namespace", arg0);
    }

    /**
     * The port name "{0}" is missing a namespace.
     *
     */
    public static String WSGEN_PORTNAME_MISSING_NAMESPACE(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_PORTNAME_MISSING_NAMESPACE(arg0));
    }

    public static Localizable localizableWSIMPORT_GENERATING_CODE() {
        return MESSAGE_FACTORY.getMessage("wsimport.GeneratingCode");
    }

    /**
     *
     * Generating code...
     *
     *
     */
    public static String WSIMPORT_GENERATING_CODE() {
        return LOCALIZER.localize(localizableWSIMPORT_GENERATING_CODE());
    }

    public static Localizable localizableWSIMPORT_AUTH_FILE_NOT_FOUND(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsimport.authFileNotFound", arg0, arg1);
    }

    /**
     * Authorization file "{0}" not found. If the WSDL access needs Basic Authentication, please provide authorization file with read access at {1} or use -Xauthfile to give the authorization file and on each line provide authorization information using this format : http[s]://user:password@host:port//<url-path>
     *
     */
    public static String WSIMPORT_AUTH_FILE_NOT_FOUND(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSIMPORT_AUTH_FILE_NOT_FOUND(arg0, arg1));
    }

    public static Localizable localizableWSIMPORT_WSDLLOCATION_CLIENTJAR() {
        return MESSAGE_FACTORY.getMessage("wsimport.wsdllocation.clientjar");
    }

    /**
     * wsdlLocation cannot be specified when using clientJar option
     *
     */
    public static String WSIMPORT_WSDLLOCATION_CLIENTJAR() {
        return LOCALIZER.localize(localizableWSIMPORT_WSDLLOCATION_CLIENTJAR());
    }

    public static Localizable localizableWSIMPORT_FAILED_TO_PARSE(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsimport.FailedToParse", arg0, arg1);
    }

    /**
     * Failed to parse "{0}": {1}
     *
     */
    public static String WSIMPORT_FAILED_TO_PARSE(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSIMPORT_FAILED_TO_PARSE(arg0, arg1));
    }

    public static Localizable localizableWSIMPORT_NO_WSDL(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.no.wsdl", arg0);
    }

    /**
     * Failed to read the WSDL document: {0}, because 1) could not find the document; 2) the document could not be read; 3) the root element of the document is not <wsdl:definitions>.
     *
     */
    public static String WSIMPORT_NO_WSDL(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_NO_WSDL(arg0));
    }

    public static Localizable localizableWSGEN_INVALID_PROTOCOL(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsgen.invalid.protocol", arg0, arg1);
    }

    /**
     * "{0}" is not a supported protocol.  Supported protocols include: {1}.
     *
     */
    public static String WSGEN_INVALID_PROTOCOL(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSGEN_INVALID_PROTOCOL(arg0, arg1));
    }

    public static Localizable localizableWSGEN_HELP(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("wsgen.help", arg0, arg1, arg2);
    }

    /**
     *
     * Usage: {0} [options] <SEI>
     *
     * where [options] include:
     *   -classpath <path>          specify where to find input class files and wsgen extensions
     *   -cp <path>                 specify where to find input class files and wsgen extensions
     *   -d <directory>             specify where to place generated output files
     *   -encoding <encoding>       specify character encoding used by source files
     *   -extension                 allow vendor extensions - functionality not specified
     *                              by the specification.  Use of extensions may
     *                              result in applications that are not portable or
     *                              may not interoperate with other implementations
     *   -help                      display help
     *   -J<javacOption>            pass this option to javac
     *   -keep                      keep generated files
     *   -r <directory>             resource destination directory, specify where to
     *                              place resouce files such as WSDLs
     *   -s <directory>             specify where to place generated source files
     *   -verbose                   output messages about what the compiler is doing
     *   -version                   print version information
     *   -fullversion               print full version information
     *   -wsdl[:protocol]           generate a WSDL file. The protocol is optional.
     *                              Valid protocols are {1},
     *                              the default is soap1.1.
     *                              The non standard protocols {2}
     *                              can only be used in conjunction with the
     *                              -extension option.
     *   -inlineSchemas             inline schemas in the generated wsdl. Must be
     *                              used in conjunction with the -wsdl option.
     *   -servicename <name>        specify the Service name to use in the generated WSDL
     *                              Used in conjunction with the -wsdl option.
     *   -portname <name>           specify the Port name to use in the generated WSDL
     *                              Used in conjunction with the -wsdl option.
     *   -x <file>                  specify External Web Service Metadata xml descriptor
     *
     */
    public static String WSGEN_HELP(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableWSGEN_HELP(arg0, arg1, arg2));
    }

    public static Localizable localizableWSIMPORT_USAGE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.usage", arg0);
    }

    /**
     * Usage: {0} [options] <WSDL_URI>
     *
     * Use "wsimport -help" for a detailed description of options.
     *
     */
    public static String WSIMPORT_USAGE(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_USAGE(arg0));
    }

    public static Localizable localizableWSCOMPILE_ERROR(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.error", arg0);
    }

    /**
     * error: {0}
     *
     */
    public static String WSCOMPILE_ERROR(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_ERROR(arg0));
    }

    public static Localizable localizableWSCOMPILE_WARNING(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.warning", arg0);
    }

    /**
     * warning: {0}
     *
     */
    public static String WSCOMPILE_WARNING(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_WARNING(arg0));
    }

    public static Localizable localizableWRAPPER_TASK_NEED_ENDORSED(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wrapperTask.needEndorsed", arg0, arg1);
    }

    /**
     * You are running on JDK6 or newer which comes with JAX-WS {0} API, but this tool requires JAX-WS {1} or newer API. Use the standard override mechanism.
     *
     */
    public static String WRAPPER_TASK_NEED_ENDORSED(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWRAPPER_TASK_NEED_ENDORSED(arg0, arg1));
    }

    public static Localizable localizableWSIMPORT_VERSION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.version", arg0);
    }

    /**
     * wsimport version "{0}"
     *
     */
    public static String WSIMPORT_VERSION(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_VERSION(arg0));
    }

    public static Localizable localizableWSCOMPILE_NO_SUCH_DIRECTORY(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.noSuchDirectory", arg0);
    }

    /**
     * directory not found: {0}
     *
     */
    public static String WSCOMPILE_NO_SUCH_DIRECTORY(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_NO_SUCH_DIRECTORY(arg0));
    }

    public static Localizable localizableWSIMPORT_MISSING_FILE() {
        return MESSAGE_FACTORY.getMessage("wsimport.missingFile");
    }

    /**
     * Missing WSDL_URI
     *
     */
    public static String WSIMPORT_MISSING_FILE() {
        return LOCALIZER.localize(localizableWSIMPORT_MISSING_FILE());
    }

    public static Localizable localizableWSCOMPILE_COMPILATION_FAILED() {
        return MESSAGE_FACTORY.getMessage("wscompile.compilationFailed");
    }

    /**
     * compilation failed, errors should have been reported
     *
     */
    public static String WSCOMPILE_COMPILATION_FAILED() {
        return LOCALIZER.localize(localizableWSCOMPILE_COMPILATION_FAILED());
    }

    public static Localizable localizableWSIMPORT_PARSING_WSDL() {
        return MESSAGE_FACTORY.getMessage("wsimport.ParsingWSDL");
    }

    /**
     * parsing WSDL...
     *
     *
     *
     */
    public static String WSIMPORT_PARSING_WSDL() {
        return LOCALIZER.localize(localizableWSIMPORT_PARSING_WSDL());
    }

    public static Localizable localizableWSGEN_USAGE_EXAMPLES() {
        return MESSAGE_FACTORY.getMessage("wsgen.usage.examples");
    }

    /**
     *
     * Examples:
     *   wsgen -cp . example.Stock
     *   wsgen -cp . example.Stock -wsdl -servicename '{http://mynamespace}MyService'
     *
     *
     */
    public static String WSGEN_USAGE_EXAMPLES() {
        return LOCALIZER.localize(localizableWSGEN_USAGE_EXAMPLES());
    }

    public static Localizable localizableWSIMPORT_ARCHIVING_ARTIFACTS(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.archivingArtifacts", arg0);
    }

    /**
     *
     * Archiving the generated artifacts into {0}.
     *
     *
     */
    public static String WSIMPORT_ARCHIVING_ARTIFACTS(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_ARCHIVING_ARTIFACTS(arg0));
    }

    public static Localizable localizableWSGEN_PROTOCOL_WITHOUT_EXTENSION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.protocol.without.extension", arg0);
    }

    /**
     * The optional protocol "{0}" must be used in conjunction with the "-extension" option.
     *
     */
    public static String WSGEN_PROTOCOL_WITHOUT_EXTENSION(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_PROTOCOL_WITHOUT_EXTENSION(arg0));
    }

    public static Localizable localizableWSGEN_MISSING_FILE() {
        return MESSAGE_FACTORY.getMessage("wsgen.missingFile");
    }

    /**
     * Missing SEI
     *
     */
    public static String WSGEN_MISSING_FILE() {
        return LOCALIZER.localize(localizableWSGEN_MISSING_FILE());
    }

    public static Localizable localizableWSGEN_VERSION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.version", arg0);
    }

    /**
     * wsgen version "{0}"
     *
     */
    public static String WSGEN_VERSION(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_VERSION(arg0));
    }

    public static Localizable localizableWSGEN_NO_WEBSERVICES_CLASS(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.no.webservices.class", arg0);
    }

    /**
     * wsgen did not find any class with @WebService annotation. Please specify @WebService annotation on {0}.
     *
     */
    public static String WSGEN_NO_WEBSERVICES_CLASS(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_NO_WEBSERVICES_CLASS(arg0));
    }

    public static Localizable localizableWSGEN_SOAP_12_WITHOUT_EXTENSION() {
        return MESSAGE_FACTORY.getMessage("wsgen.soap12.without.extension");
    }

    /**
     * The optional protocol "Xsoap1.2" must be used in conjunction with the "-extension" option.
     *
     */
    public static String WSGEN_SOAP_12_WITHOUT_EXTENSION() {
        return LOCALIZER.localize(localizableWSGEN_SOAP_12_WITHOUT_EXTENSION());
    }

    public static Localizable localizableWSGEN_CLASS_MUST_BE_IMPLEMENTATION_CLASS(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.class.must.be.implementation.class", arg0);
    }

    /**
     * The class "{0}" is not an endpoint implementation class.
     *
     */
    public static String WSGEN_CLASS_MUST_BE_IMPLEMENTATION_CLASS(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_CLASS_MUST_BE_IMPLEMENTATION_CLASS(arg0));
    }

    public static Localizable localizableWSGEN_INLINE_SCHEMAS_ONLY_WITH_WSDL() {
        return MESSAGE_FACTORY.getMessage("wsgen.inlineSchemas.only.with.wsdl");
    }

    /**
     * "-inlineSchemas" must be used in conjunction with the "-wsdl" option
     *
     */
    public static String WSGEN_INLINE_SCHEMAS_ONLY_WITH_WSDL() {
        return LOCALIZER.localize(localizableWSGEN_INLINE_SCHEMAS_ONLY_WITH_WSDL());
    }

    public static Localizable localizableWRAPPER_TASK_LOADING_INCORRECT_API(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("wrapperTask.loadingIncorrectApi", arg0, arg1, arg2);
    }

    /**
     * You are loading JAX-WS {0} API from {1} but this tool requires JAX-WS {2} API.
     *
     */
    public static String WRAPPER_TASK_LOADING_INCORRECT_API(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableWRAPPER_TASK_LOADING_INCORRECT_API(arg0, arg1, arg2));
    }

    public static Localizable localizableWSCOMPILE_CANT_GET_COMPILER(Object arg0, Object arg1, Object arg2) {
        return MESSAGE_FACTORY.getMessage("wscompile.cant.get.compiler", arg0, arg1, arg2);
    }

    /**
     * No Java compiler found. Perhaps environment/JDK problem?
     *  Used JVM: {0}, {1}/{2}
     *
     */
    public static String WSCOMPILE_CANT_GET_COMPILER(Object arg0, Object arg1, Object arg2) {
        return LOCALIZER.localize(localizableWSCOMPILE_CANT_GET_COMPILER(arg0, arg1, arg2));
    }

    public static Localizable localizableWSGEN_SERVICENAME_MISSING_LOCALNAME(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.servicename.missing.localname", arg0);
    }

    /**
     * The service name "{0}" is missing a localname.
     *
     */
    public static String WSGEN_SERVICENAME_MISSING_LOCALNAME(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_SERVICENAME_MISSING_LOCALNAME(arg0));
    }

    public static Localizable localizableWSCOMPILE_INVALID_OPTION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.invalidOption", arg0);
    }

    /**
     * unrecognized parameter {0}
     *
     */
    public static String WSCOMPILE_INVALID_OPTION(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_INVALID_OPTION(arg0));
    }

    public static Localizable localizableWSIMPORT_HTTP_REDIRECT(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsimport.httpRedirect", arg0, arg1);
    }

    /**
     * Server returned HTTP Status code: "{0}", retrying with "{1}"
     *
     */
    public static String WSIMPORT_HTTP_REDIRECT(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSIMPORT_HTTP_REDIRECT(arg0, arg1));
    }

    public static Localizable localizableWSGEN_PORTNAME_MISSING_LOCALNAME(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.portname.missing.localname", arg0);
    }

    /**
     * The port name "{0}" is missing a localname.
     *
     */
    public static String WSGEN_PORTNAME_MISSING_LOCALNAME(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_PORTNAME_MISSING_LOCALNAME(arg0));
    }

    public static Localizable localizableWSIMPORT_ERROR_MESSAGE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.ErrorMessage", arg0);
    }

    /**
     * [ERROR] {0}
     *
     */
    public static String WSIMPORT_ERROR_MESSAGE(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_ERROR_MESSAGE(arg0));
    }

    public static Localizable localizableWSGEN_FULLVERSION(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.fullversion", arg0);
    }

    /**
     * wsgen full version "{0}"
     *
     */
    public static String WSGEN_FULLVERSION(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_FULLVERSION(arg0));
    }

    public static Localizable localizableWSGEN_WSDL_ARG_NO_GENWSDL(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.wsdl.arg.no.genwsdl", arg0);
    }

    /**
     * The "{0}" option can only be in conjunction with the "-wsdl" option.
     *
     */
    public static String WSGEN_WSDL_ARG_NO_GENWSDL(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_WSDL_ARG_NO_GENWSDL(arg0));
    }

    public static Localizable localizableWSCOMPILE_INFO(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wscompile.info", arg0);
    }

    /**
     * info: {0}
     *
     */
    public static String WSCOMPILE_INFO(Object arg0) {
        return LOCALIZER.localize(localizableWSCOMPILE_INFO(arg0));
    }

    public static Localizable localizableWSGEN_COULD_NOT_CREATE_FILE(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsgen.could.not.create.file", arg0);
    }

    /**
     * Could not create file: "{0}"
     *
     */
    public static String WSGEN_COULD_NOT_CREATE_FILE(Object arg0) {
        return LOCALIZER.localize(localizableWSGEN_COULD_NOT_CREATE_FILE(arg0));
    }

    public static Localizable localizableWSIMPORT_ILLEGAL_AUTH_INFO(Object arg0) {
        return MESSAGE_FACTORY.getMessage("wsimport.ILLEGAL_AUTH_INFO", arg0);
    }

    /**
     * "{0}" is not a valid authorization information format. The format is http[s]://user:password@host:port//<url-path>.
     *
     */
    public static String WSIMPORT_ILLEGAL_AUTH_INFO(Object arg0) {
        return LOCALIZER.localize(localizableWSIMPORT_ILLEGAL_AUTH_INFO(arg0));
    }

    public static Localizable localizableWSGEN_CANNOT_GEN_WSDL_FOR_NON_SOAP_BINDING(Object arg0, Object arg1) {
        return MESSAGE_FACTORY.getMessage("wsgen.cannot.gen.wsdl.for.non.soap.binding", arg0, arg1);
    }

    /**
     * wsgen can not generate WSDL for non-SOAP binding: {0} on Class {1}
     *
     */
    public static String WSGEN_CANNOT_GEN_WSDL_FOR_NON_SOAP_BINDING(Object arg0, Object arg1) {
        return LOCALIZER.localize(localizableWSGEN_CANNOT_GEN_WSDL_FOR_NON_SOAP_BINDING(arg0, arg1));
    }

    public static Localizable localizableWSIMPORT_FETCHING_METADATA() {
        return MESSAGE_FACTORY.getMessage("wsimport.fetchingMetadata");
    }

    /**
     *
     * Downloading the WSDL and associated metadata
     *
     *
     */
    public static String WSIMPORT_FETCHING_METADATA() {
        return LOCALIZER.localize(localizableWSIMPORT_FETCHING_METADATA());
    }

    private static class BundleSupplier
        implements ResourceBundleSupplier
    {


        public ResourceBundle getResourceBundle(Locale locale) {
            return ResourceBundle.getBundle(BUNDLE_NAME, locale);
        }

    }

}
