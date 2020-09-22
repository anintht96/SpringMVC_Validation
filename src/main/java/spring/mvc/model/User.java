package spring.mvc.model;

import java.time.LocalDate;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

import spring.mvc.validator.Phone;

public class User {

	@NotNull
	@Min(value = 1)
	private Integer id;

	@Pattern(regexp = "(?U)(([a-zA-Z]\\s*){5,30}+)") 
	private String name;

	@NotEmpty
	@Email
	private String email;

	@NotNull
	@Min(value = 12)
	@Max(value = 40)
	private Integer tuoi;

	@Phone
	private String phoneNumber;

	@NotNull
	@Past
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private LocalDate dateOfBirth;

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getTuoi() {
		return tuoi;
	}

	public void setTuoi(Integer tuoi) {
		this.tuoi = tuoi;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
