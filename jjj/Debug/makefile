################################################################################
# Automatically-generated file. Do not edit!
################################################################################

-include ../makefile.init

RM := rm -rf

# All of the sources participating in the build are defined here
-include sources.mk
-include Startup/subdir.mk
-include Lib/subdir.mk
-include Dave/Generated/src/RESET001/subdir.mk
-include Dave/Generated/src/NVIC002/subdir.mk
-include Dave/Generated/src/LIBS/subdir.mk
-include Dave/Generated/src/DAVESupport/subdir.mk
-include Dave/Generated/src/CLK001/subdir.mk
-include Dave/Generated/src/CANGLOBAL/subdir.mk
-include Dave/Generated/src/CAN001/subdir.mk
-include subdir.mk
-include objects.mk

ifneq ($(MAKECMDGOALS),clean)
ifneq ($(strip $(C_DEPS)),)
-include $(C_DEPS)
endif
ifneq ($(strip $(S_DEPS)),)
-include $(S_DEPS)
endif
endif

-include ../makefile.defs

# Add inputs and outputs from these tool invocations to the build variables 
SECONDARY_FLASH += \
jjj.hex \

SECONDARY_LIST += \
jjj.lst \

SECONDARY_SIZE += \
jjj.siz \


# All Target
all: jjj.elf secondary-outputs

# Tool invocations
jjj.elf: $(OBJS) ../jjj.ld $(USER_OBJS)
	@echo 'Building target: $@'
	@echo 'Invoking: ARM-GCC C Linker'
	"C:\DAVE-3.1.8\DAVE-3.1.8\ARM-GCC/bin/arm-none-eabi-gcc" -T"../jjj.ld" -nostartfiles -L"C:\DAVE-3.1.8\DAVE-3.1.8\eclipse\/../CMSIS/Infineon/Lib" -L"C:\DAVE-3.1.8\DAVE-3.1.8\eclipse\/../Examples/Lib" -L"C:\DAVE-3.1.8\DAVE-3.1.8\eclipse\/../emWin/Start/GUI" -Wl,-Map,"jjj.map" -mcpu=cortex-m4 -mthumb -g3 -gdwarf-2 -o "jjj.elf" "@makefile.rsp" $(USER_OBJS) $(LIBS)
	@echo 'Finished building target: $@'
	@echo ' '

jjj.hex: jjj.elf
	@echo 'Invoking: ARM-GCC Create Flash Image'
	"C:\DAVE-3.1.8\DAVE-3.1.8\ARM-GCC/bin/arm-none-eabi-objcopy" -O ihex "jjj.elf"  "jjj.hex"
	@echo 'Finished building: $@'
	@echo ' '

jjj.lst: jjj.elf
	@echo 'Invoking: ARM-GCC Create Listing'
	"C:\DAVE-3.1.8\DAVE-3.1.8\ARM-GCC/bin/arm-none-eabi-objdump" -h -S "jjj.elf" > "jjj.lst"
	@echo 'Finished building: $@'
	@echo ' '

jjj.siz: jjj.elf
	@echo 'Invoking: ARM-GCC Print Size'
	"C:\DAVE-3.1.8\DAVE-3.1.8\ARM-GCC/bin/arm-none-eabi-size"  --format=berkeley jjj.elf
	@echo 'Finished building: $@'
	@echo ' '

# Other Targets
clean:
	-$(RM) $(SECONDARY_SIZE)$(OBJS)$(C_DEPS)$(SECONDARY_FLASH)$(S_DEPS)$(ARM_GCC_FOR_XMC_LINKER_OUTPUT_TYPE_OUTPUTS)$(SECONDARY_LIST) jjj.elf
	-@echo ' '

secondary-outputs: $(SECONDARY_FLASH) $(SECONDARY_LIST) $(SECONDARY_SIZE)

.PHONY: all clean dependents
.SECONDARY:

-include ../makefile.targets
