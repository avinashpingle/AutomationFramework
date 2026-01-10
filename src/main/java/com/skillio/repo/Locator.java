package com.skillio.repo;

public interface Locator {

	String userName = "xpath##//input[@name=\"username\"]";
	String password = "xpath##//input[@name=\"password\"]";
	String submitBtn = "xpath##//button[@type=\"submit\"]";
	String viewPIMMenu = "xpath##//a[@href=\"/web/index.php/pim/viewPimModule\"]";
	String addBtn = "xpath##//button[text()=' Add ']";
	String firstName = "xpath##//input[@name=\"firstName\"]";
	String lastName = "xpath##//input[@name=\"lastName\"]";
	String saveBtn = "xpath##//button[text()=' Save ']";
	String adminMenu = "xpath##//a[@href=\"/web/index.php/admin/viewAdminModule\"]";
	String adminAddBtn = "xpath##//button[text()=' Add ']";
	String typeForHints = "xpath##//input[@placeholder=\"Type for hints...\"]";
	String adminTypeOption = "xpath##//div[@role=\"option\"]/descendant::span";
}