@ECHO OFF
FOR /D /R %%i IN (out build target log generated generated_tests) DO (
    IF EXIST %%i (
        RD /S /Q %%i
        @ECHO deleted %%i
    )
)
@echo finished
