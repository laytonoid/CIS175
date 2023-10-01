package controller;
import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**  
* Taylor Layton - tglayton
* CIS171 22149
* Sep 29, 2023
* Windows 10 
*/
@Converter(autoApply = true)
public class LocalDateAttributeConverter implements
AttributeConverter<LocalDate, Date> {
	
	@Override
	public Date convertToDatabaseColumn(LocalDate attribute) {
		// TODO Auto-generated method stub
		return (attribute == null ? null:
Date.valueOf(attribute));
	}
	
	@Override
	public LocalDate convertToEntityAttribute(Date dbData) {
		// TODO Auto-generated method stub
		return (dbData == null ? null: dbData.toLocalDate());
	}
}
