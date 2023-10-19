package com.youcode.app.dao.init;

import com.youcode.app.dao.enums.Entity.*;
import com.youcode.app.dao.enums.Service.*;
import com.youcode.app.dao.enums.Service.impl.*;
import com.youcode.libs.print.Printer;
import com.youcode.utils.db.enums.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumInitializer {
    public void initTaskPriority() {
        Printer.info("Starting TaskPriority initialization");

        TaskPriorityService taskPriorityService = new TaskPriorityServiceImpl();
        List<TaskPriority> taskPriorityList = new ArrayList<>(taskPriorityService.getAllTaskPriority());

        Arrays.stream(TaskPriorityEnum.values()).forEach(priority -> {
            if (taskPriorityList.stream().noneMatch(taskPriority -> taskPriority.getName().equals(priority))) {
                taskPriorityService.addTaskPriority(priority);
                Printer.success("Priority " + priority + " added successfully");
            } else {
                Printer.warning("Priority " + priority + " already exists");
            }
        });


        Printer.success("TaskPriority initialized");
    }

    public void initTaskType() {
        Printer.info("Starting TaskType initialization");

        TaskTypeService taskTypeService = new TaskTypeServiceImpl();
        List<TaskType> taskTypeList = new ArrayList<>(taskTypeService.getAllTaskType());

        Arrays.stream(TaskTypeEnum.values()).forEach(type -> {
            if (taskTypeList.stream().noneMatch(taskType -> taskType.getName().equals(type))) {
                taskTypeService.addTaskType(type);
                Printer.success("Type " + type + " added successfully");
            } else {
                Printer.warning("Type " + type + " already exists");
            }
        });


        Printer.success("TaskType initialized");
    }

    public void initTaskDifficulty() {
        Printer.info("Starting TaskDifficulty initialization");

        TaskDifficultyService taskDifficultyService = new TaskDifficultyServiceImpl();
        List<TaskDifficulty> taskDifficultyList = new ArrayList<>(taskDifficultyService.getAllTaskDifficulty());

        Arrays.stream(TaskDifficultyEnum.values()).forEach(difficulty -> {
            if (taskDifficultyList.stream().noneMatch(taskDifficulty -> taskDifficulty.getName().equals(difficulty))) {
                taskDifficultyService.addTaskDifficulty(difficulty);
                Printer.success("Difficulty " + difficulty + " added successfully");
            } else {
                Printer.warning("Difficulty " + difficulty + " already exists");
            }
        });


        Printer.success("TaskDifficulty initialized");
    }

    public void initTskStatus() {
        Printer.info("Starting TskStatus initialization");

        TskStatusService tskStatusService = new TskStatusServiceImpl();
        List<TaskStatus> taskStatusList = new ArrayList<>(tskStatusService.getAllTskStatus());

        Arrays.stream(TskStatusEnum.values()).forEach(status -> {
            if (taskStatusList.stream().noneMatch(taskStatus -> taskStatus.getName().equals(status))) {
                tskStatusService.addTskStatus(status);
                Printer.success("Status " + status + " added successfully");
            } else {
                Printer.warning("Status " + status + " already exists");
            }
        });


        Printer.success("TskStatus initialized");
    }

    public void initEquipmentPWokPlace() {
        Printer.info("Starting EquipmentPWokPlace initialization");

        EquipmentPWokPlaceService equipmentPWokPlaceService = new EquipmentPWokPlaceServiceImpl();
        List<EquipmentWokPlace> equipmentWokPlaceList = new ArrayList<>(equipmentPWokPlaceService.getAllEquipmentPWokPlace());

        Arrays.stream(EquipmentWokPlaceEnum.values()).forEach(place -> {
            if (equipmentWokPlaceList.stream().noneMatch(equipmentWokPlace -> equipmentWokPlace.getName().equals(place))) {
                equipmentPWokPlaceService.addEquipmentPWokPlace(place);
                Printer.success("Place " + place + " added successfully");
            } else {
                Printer.warning("Place " + place + " already exists");
            }
        });


        Printer.success("EquipmentPWokPlace initialized");
    }

    public void initEquipmentStatus() {
        Printer.info("Starting EquipmentStatus initialization");

        EquipmentStatusService equipmentStatusService = new EquipmentStatusServiceImpl();
        List<EquipmentStatus> equipmentStatusList = new ArrayList<>(equipmentStatusService.getAllEquipmentStatus());

        Arrays.stream(EquipmentStatusEnum.values()).forEach(status -> {
            if (equipmentStatusList.stream().noneMatch(equipmentStatus -> equipmentStatus.getName().equals(status))) {
                equipmentStatusService.addEquipmentStatus(status);
                Printer.success("Status " + status + " added successfully");
            } else {
                Printer.warning("Status " + status + " already exists");
            }
        });

        Printer.success("EquipmentStatus initialized");


    }

    public void initEquipmentHealth() {
        Printer.info("Starting EquipmentHealth initialization");

        EquipmentHealthService equipmentHealthService = new EquipmentHealthServiceImpl();
        List<EquipmentHealth> equipmentHealthList = new ArrayList<>(equipmentHealthService.getAllEquipmentHealth());

        Arrays.stream(EquipmentHealthEnum.values()).forEach(health -> {
            if (equipmentHealthList.stream().noneMatch(equipmentHealth -> equipmentHealth.getName().equals(health))) {
                equipmentHealthService.addEquipmentHealth(health);
                Printer.success("Health " + health + " added successfully");
            } else {
                Printer.warning("Health " + health + " already exists");
            }
        });

        Printer.success("EquipmentHealth initialized");
    }

    public void initAccountStatus() {
        Printer.info("Starting AccountStatus initialization");

        AccountStatusService accountStatusService = new AccountStatusServiceImpl();
        List<AccountStatus> accountStatusList = new ArrayList<>(accountStatusService.getAllAccountStatus());

        Arrays.stream(AccountStatusEnum.values()).forEach(status -> {
            if (accountStatusList.stream().noneMatch(accountStatus -> accountStatus.getName().equals(status))) {
                accountStatusService.addAccountStatus(status);
                Printer.success("Status " + status + " added successfully");
            } else {
                Printer.warning("Status " + status + " already exists");
            }
        });

        Printer.success("AccountStatus initialized");

    }


    public void initRoles() {
        Printer.info("Starting Roles initialization");

        EmployeeRoleService employeeRoleService = new EmployeeRoleServiceImp();
        List<EmployeeRole> employeeRoleList = new ArrayList<>(employeeRoleService.getAllEmployeeRoles());

        Arrays.stream(EmployeeRolesEnum.values()).forEach(roles -> {
            if (employeeRoleList.stream().noneMatch(employeeRole -> employeeRole.getName().equals(roles))) {
                employeeRoleService.addEmployeeRole(roles);
                Printer.success("Role " + roles + " added successfully");
            } else {
                Printer.warning("Role " + roles + " already exists");
            }
        });

        Printer.success("Roles initialized");
    }


    public void initEmployeeStatus() {
        Printer.info("Starting EmployeeStatus initialization");

        EmployeeStatusService employeeStatusService = new EmployeeStatusServiceImpl();
        List<EmployeeStatus> employeeStatusList = new ArrayList<>(employeeStatusService.getAllEmployeeStatus());

        Arrays.stream(EmployeeStatusEnum.values()).forEach(status -> {
            if (employeeStatusList.stream().noneMatch(employeeStatus -> employeeStatus.getName().equals(status))) {
                employeeStatusService.addEmployeeStatus(status);
                Printer.success("Status " + status + " added successfully");
            } else {
                Printer.warning("Status " + status + " already exists");
            }
        });
        Printer.success("EmployeeStatus initialized");

    }
}
