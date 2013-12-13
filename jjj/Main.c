/*
 * Main.c
 *
 *  Created on: 2013-12-13
 *      Author: Administrator
 */





#include <DAVE3.h>			//Declarations from DAVE3 Code Generation (includes SFR declaration)
CAN001_MessageHandleType CanRecMsgObj;
//uint8_t *Data1;

void can_receive(void)
{
	if(CAN001_GetMOFlagStatus(&CAN001_Handle0,1,RECEIVE_PENDING)== CAN_SET)
	{
		CAN001_ClearMOFlagStatus(&CAN001_Handle0,1,RECEIVE_PENDING);
		CAN001_ReadMsgObj(&CAN001_Handle0,&CanRecMsgObj,1);
		CAN001_UpdateMODataRegisters(&CAN001_Handle0,2,8,CanRecMsgObj.data);
		CAN001_SendDataFrame(&CAN001_Handle0,2);
	}

}

int main(void)
{
//	status_t status;		// Declaration of return variable for DAVE3 APIs (toggle comment if required)


	DAVE_Init();			// Initialization of DAVE Apps


	while(1)
	{

		for(int i=0;i<1000;i++)
			for(int j=0;j<10000;j++);
	}
	return 0;
}
