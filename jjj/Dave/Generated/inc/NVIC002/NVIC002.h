/*******************************************************************************
**  DAVE App Name : NVIC002       App Version: 1.0.18               
**  This file is generated by DAVE, User modification to this file will be    **
**  overwritten at the next code generation.                                  **
*******************************************************************************/


/*CODE_BLOCK_BEGIN[NVIC002.h]*/
/**************************************************************************//**
 *
 * Copyright (C) 2011 Infineon Technologies AG. All rights reserved.
 *
 * Infineon Technologies AG (Infineon) is supplying this software for use with 
 * Infineon's microcontrollers.  
 * This file can be freely distributed within development tools that are 
 * supporting such microcontrollers. 
 *
 * THIS SOFTWARE IS PROVIDED "AS IS".  NO WARRANTIES, WHETHER EXPRESS, IMPLIED
 * OR STATUTORY, INCLUDING, BUT NOT LIMITED TO, IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE APPLY TO THIS SOFTWARE.
 * INFINEON SHALL NOT, IN ANY CIRCUMSTANCES, BE LIABLE FOR SPECIAL, INCIDENTAL, 
 * OR CONSEQUENTIAL DAMAGES, FOR ANY REASON WHATSOEVER.
 *
********************************************************************************
**                                                                            **
**                                                                            **
** PLATFORM : Infineon XMC4000/XMC1000 Series                                 **
**                                                                            **
** COMPILER : Compiler Independent                                            **
**                                                                            **
** AUTHOR   : App Developer                                                   **
**                                                                            **
** MAY BE CHANGED BY USER [yes/no]: Yes                                       **
**                                                                            **
** MODIFICATION DATE : February 18, 2013                                      **
*******************************************************************************/

/*******************************************************************************
**                       Author(s) Identity                                   **
********************************************************************************
**                                                                            **
** Initials     Name                                                          ** 
** ---------------------------------------------------------------------------**
** SSS          App Developer                                                 **
*******************************************************************************/
/**
 * @file NVIC002.h
 *
 * @App    Version NVIC002 <1.0.18>
 * 
 * @brief  Header file for NVIC SRGeneral (NVIC002) App.
 *
 */
 /* Revision History
  * 18  Feb 2013   v1.0.12  Comments are added.
  */

#ifndef NVIC002_H_
#define NVIC002_H_

/******************************************************************************
**                      Include Files                                        **
******************************************************************************/
#include <DAVE3.h>

/******************************************************************************
**                      Global Macro Definitions                             **
******************************************************************************/

/******************************************************************************
**                      Global Type Definitions                              **
******************************************************************************/
/**
 * @ingroup NVIC002_publicparam
 * @{
 */

/**
 * Mapping of User defined functions to Interrupt Handlers.
 */
   

#define can_receive         IRQ_Hdlr_77 /* User defined function mapped to IRQ_Hdlr_77 */



/**
 * Structure which holds the UI configuration mapped for the App
 *        instance.
 *  Note: Sub-Priority is not available for TIMM Devices
 */

typedef struct NVIC002_HandleType
{
  /** Mapped NVIC Node */
  uint8_t NodeID;     
  /**  Node Interrupt Priority */
  uint8_t Priority;    
  /**  Node Interrupt SubPriority */
  uint8_t SubPriority;  
}NVIC002_HandleType;

/**
 * Structure which holds NVIC002 Status Codes
 */
typedef enum NVIC002_StatusType {
  /*  
  MODULENAME = NVIC002
  */

  /*
  ERRCODESTRING = NVIC002_FUNC_ENTRY
  STRCODESTRING = Entered Function %s
  */
  NVIC002_FUNC_ENTRY = 1,
  /**
   * Exit specific function
   */

    /*
  ERRCODESTRING = NVIC002_FUNC_EXIT
  STRCODESTRING = Exited Function %s
  */
  NVIC002_FUNC_EXIT
  /*
  ERRORCODEEND
  */

}NVIC002_StatusType;

/**
 * @}
 */
/*******************************************************************************
**                      Global Constant Declarations                          **
*******************************************************************************/


/*******************************************************************************
**                      Extern Variables                                      **
*******************************************************************************/


/*******************************************************************************
** FUNCTION PROTOTYPES                                                        **
*******************************************************************************/

/**
 * @ingroup NVIC002_apidoc
 * @{
 */

/**
 * Function to configure and initialize  the NVIC002 App instances
 *
 *
 * @param[in] None
 *
 * @return     void
 *
 * <BR><P ALIGN="LEFT"><B>Example:</B>
 * @code
 *  #include <DAVE3.h>
 *
 *  int main(void)
 *  {
 *    DAVE_Init(); // NVIC002_Init() is called within DAVE_Init()
 *    return 0;
 *  }
 * @endcode<BR> </p>
 *
 */
void  NVIC002_Init(void);

/**
 * Function to enable the IRQ
 *
 * @param[in]  Handle Instance Handle
 *
 * @return     void
 *
 * <BR><P ALIGN="LEFT"><B>Example:</B>
 * @code
 *  #include <DAVE3.h>
 *
 *  int main(void)
 *  {
 *    DAVE_Init(); // NVIC002_Init() is called within DAVE_Init()
 *    NVIC002_EnableIRQ(&NVIC002_Handle0);
 *    return 0;
 *  }
 * @endcode<BR> </p>
 */
void NVIC002_EnableIRQ(const NVIC002_HandleType* Handle);

/**
 * Function to disable the IRQ
 *
 * @param[in]  Handle Instance Handle
 *
 * @return     void
 * <BR><P ALIGN="LEFT"><B>Example:</B>
 * @code
 * #include <DAVE3.h>
 *
 *  int main(void)
 *  {
 *    DAVE_Init(); // NVIC002_Init() is called within DAVE_Init()
 *    NVIC002_DisableIRQ(&NVIC002_Handle0);
 *    return 0;
 *  }
 * @endcode<BR> </p>
 */
void NVIC002_DisableIRQ(const NVIC002_HandleType* Handle);

/**
 *@}
 */

/* Inclusion of App config file */
#include "NVIC002_Conf.h"

#endif /* NVIC002_H_ */
/*CODE_BLOCK_END*/


