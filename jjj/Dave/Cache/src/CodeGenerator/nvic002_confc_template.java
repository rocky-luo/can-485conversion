package CodeGenerator;

import java.util.*;
import com.ifx.davex.appjetinteract.App2JetInterface;

public class nvic002_confc_template
{
  protected static String nl;
  public static synchronized nvic002_confc_template create(String lineSeparator)
  {
    nl = lineSeparator;
    nvic002_confc_template result = new nvic002_confc_template();
    nl = null;
    return result;
  }

  public final String NL = nl == null ? (System.getProperties().getProperty("line.separator")) : nl;
  protected final String TEXT_1 = NL + "/*CODE_BLOCK_BEGIN[NVIC002_Conf.c]*/" + NL + "/*******************************************************************************" + NL + " Copyright (c) 2011, Infineon Technologies AG                                 **" + NL + " All rights reserved.                                                         **" + NL + "                                                                              **" + NL + " Redistribution and use in source and binary forms, with or without           **" + NL + " modification,are permitted provided that the following conditions are met:   **" + NL + "                                                                              **" + NL + " *Redistributions of source code must retain the above copyright notice,      **" + NL + " this list of conditions and the following disclaimer.                        **" + NL + " *Redistributions in binary form must reproduce the above copyright notice,   **" + NL + " this list of conditions and the following disclaimer in the documentation    **" + NL + " and/or other materials provided with the distribution.                       **" + NL + " *Neither the name of the copyright holders nor the names of its contributors **" + NL + " may be used to endorse or promote products derived from this software without** " + NL + " specific prior written permission.                                           **" + NL + "                                                                              **" + NL + " THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS \"AS IS\"  **" + NL + " AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE    **" + NL + " IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE   **" + NL + " ARE  DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE   **" + NL + " LIABLE  FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR         **" + NL + " CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF         **" + NL + " SUBSTITUTE GOODS OR  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS    **" + NL + " INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN      **" + NL + " CONTRACT, STRICT LIABILITY,OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)       **" + NL + " ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE   **" + NL + " POSSIBILITY OF SUCH DAMAGE.                                                  **" + NL + "                                                                              **" + NL + " To improve the quality of the software, users are encouraged to share        **" + NL + " modifications, enhancements or bug fixes with Infineon Technologies AG       **" + NL + " dave@infineon.com).                                                          **" + NL + "                                                                              **" + NL + "********************************************************************************" + NL + "**                                                                            **" + NL + "**                                                                            **" + NL + "** PLATFORM : Infineon XMC4000/XMC1000 Series   \t\t            \t      **" + NL + "**                                                                            **" + NL + "** COMPILER : Compiler Independent                                            **" + NL + "**                                                                            **" + NL + "** AUTHOR   : App Developer                                                   **" + NL + "**                                                                            **" + NL + "** MAY BE CHANGED BY USER [yes/no]: Yes                                       **" + NL + "**                                                                            **" + NL + "** MODIFICATION DATE : February 18, 2013                                      **" + NL + "*******************************************************************************/" + NL + "/*******************************************************************************" + NL + "**                       Author(s) Identity                                   **" + NL + "********************************************************************************" + NL + "**                                                                            **" + NL + "** Initials     Name                                                          **" + NL + "** ---------------------------------------------------------------------------**" + NL + "** AKW           App Developer                                                 **" + NL + "*******************************************************************************/" + NL + "/**" + NL + " * @file   NVIC002_Conf.c" + NL + " *" + NL + " * @App    Version NVIC002 <";
  protected final String TEXT_2 = ">" + NL + " * " + NL + " * @brief  Configuration file generated based on UI settings " + NL + " *         of NVIC002 App" + NL + " *" + NL + " */" + NL + "/* Revision History\t" + NL + " * 18 Feb 2013 \t v1.0.12   Conditional Codes are added to support both " + NL + " * \t                       XMC4000/XMC1000 devices." + NL + " */" + NL + "" + NL + "/*******************************************************************************" + NL + " ** INCLUDE FILES                                                             **" + NL + " ******************************************************************************/" + NL + "#include <DAVE3.h>";
  protected final String TEXT_3 = NL + NL + "/**" + NL + " * @ingroup NVIC002_publicparam" + NL + " * @{" + NL + " */";
  protected final String TEXT_4 = NL;
  protected final String TEXT_5 = NL + "const NVIC002_HandleType NVIC002_Handle";
  protected final String TEXT_6 = " = {" + NL + "  /* Mapped NVIC Node */" + NL + "  .NodeID      = ";
  protected final String TEXT_7 = " , ";
  protected final String TEXT_8 = NL + "  /* Node Interrupt Priority */" + NL + "  .Priority    = ";
  protected final String TEXT_9 = ",  ";
  protected final String TEXT_10 = NL + "  /* Node Interrupt Priority */" + NL + "  .Priority    = ";
  protected final String TEXT_11 = ",  " + NL + "  /* Node Interrupt SubPriority */" + NL + "  .SubPriority = ";
  protected final String TEXT_12 = "  \t\t";
  protected final String TEXT_13 = NL + "};";
  protected final String TEXT_14 = NL + "/* NVIC NODE NOT MAPPED FOR APP INSTANCE ";
  protected final String TEXT_15 = " */";
  protected final String TEXT_16 = " " + NL + "" + NL + "/**" + NL + " * @}" + NL + " */" + NL + "/*CODE_BLOCK_END*/";
  protected final String TEXT_17 = NL;

  public String generate(Object argument)
  {
    final StringBuffer stringBuffer = new StringBuffer();
     App2JetInterface app = (App2JetInterface) argument; 
     String AppBaseuri = "app/nvic002/";
    stringBuffer.append(TEXT_1);
    stringBuffer.append( app.getAppVersion(AppBaseuri));
    stringBuffer.append(TEXT_2);
     int IsTIMM1Device = -1; 
     IsTIMM1Device = ((app.getSoftwareId().substring(0,1).compareTo("1")==0)?1:0); 
    stringBuffer.append(TEXT_3);
     String MappedUri = null; 
     String appInst  = null; 
    stringBuffer.append(TEXT_4);
     ArrayList<String> appsList = (ArrayList<String>)(app.getApps("app/nvic002/"));
 for (String appIns : appsList ) {
 appInst = appIns.substring(appIns.lastIndexOf("/")+1);
     MappedUri = app.getMappedUri(AppBaseuri + appInst + "/nvicnode"); 
     if((MappedUri != null) && (MappedUri != "")) { 
    stringBuffer.append(TEXT_5);
    stringBuffer.append(appInst);
    stringBuffer.append(TEXT_6);
    stringBuffer.append( MappedUri.substring(MappedUri.lastIndexOf('/')+ 1 ));
    stringBuffer.append(TEXT_7);
     if(IsTIMM1Device == 1) 
    { 
    stringBuffer.append(TEXT_8);
    stringBuffer.append(app.getIntegerValue(AppBaseuri + appInst +"/NVIC002_TIMMirwInterruptPriority"));
    stringBuffer.append(TEXT_9);
    } 
     else 
    { 
    stringBuffer.append(TEXT_10);
    stringBuffer.append(app.getIntegerValue(AppBaseuri + appInst +"/NVIC002_irwInterruptPriority"));
    stringBuffer.append(TEXT_11);
    stringBuffer.append(app.getIntegerValue(AppBaseuri + appInst +"/NVIC002_irwInterruptSubPriority"));
    stringBuffer.append(TEXT_12);
    } 
    stringBuffer.append(TEXT_13);
     } 
     else { 
    stringBuffer.append(TEXT_14);
    stringBuffer.append(appInst);
    stringBuffer.append(TEXT_15);
     } 
    } 
    stringBuffer.append(TEXT_16);
    stringBuffer.append(TEXT_17);
    return stringBuffer.toString();
  }
}
