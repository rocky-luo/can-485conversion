################################################################################
# Automatically-generated file. Do not edit!
################################################################################

# Add inputs and outputs from these tool invocations to the build variables 
C_SRCS += \
../Dave/Generated/src/DAVESupport/DAVE3.c \
../Dave/Generated/src/DAVESupport/MULTIPLEXER.c 

OBJS += \
./Dave/Generated/src/DAVESupport/DAVE3.o \
./Dave/Generated/src/DAVESupport/MULTIPLEXER.o 

C_DEPS += \
./Dave/Generated/src/DAVESupport/DAVE3.d \
./Dave/Generated/src/DAVESupport/MULTIPLEXER.d 


# Each subdirectory must supply rules for building sources it contributes
Dave/Generated/src/DAVESupport/%.o: ../Dave/Generated/src/DAVESupport/%.c
	@echo 'Building file: $<'
	@echo 'Invoking: ARM-GCC C Compiler'
	"C:\DAVE-3.1.8\DAVE-3.1.8\ARM-GCC/bin/arm-none-eabi-gcc" -DUC_ID=4502 -DDAVE_CE -I"C:\DAVE-3.1.8\DAVE-3.1.8\eclipse\/../CMSIS/Include" -I"C:\DAVE-3.1.8\DAVE-3.1.8\eclipse\/../CMSIS/Infineon/Include" -I"C:\DAVE-3.1.8\DAVE-3.1.8\ARM-GCC/arm-none-eabi/include" -I"C:\DAVE-3.1.8\DAVE-3.1.8\eclipse\/../emWin/Start/GUI/inc" -I"C:\DAVE-3.1.8\DAVE-3.1.8\eclipse\/../CMSIS/Infineon/XMC4500_series/Include" -I"D:\DAVE3_workspace\ws\jjj\Dave\Generated\inc\MOTORLIBS" -I"D:\DAVE3_workspace\ws\jjj\Dave\Generated\inc\DAVESupport" -I"D:\DAVE3_workspace\ws\jjj\Dave\Generated\inc\LIBS" -O0 -ffunction-sections -Wall -std=gnu99 -mfloat-abi=softfp -Wa,-adhlns="$@.lst" -c -fmessage-length=0 -MMD -MP -MF"$(@:%.o=%.d)" -MT"$(@:%.o=%.d) $@" -mcpu=cortex-m4 -mfpu=fpv4-sp-d16 -mthumb -g3 -gdwarf-2 -o "$@" "$<"
	@echo 'Finished building: $<'
	@echo ' '


