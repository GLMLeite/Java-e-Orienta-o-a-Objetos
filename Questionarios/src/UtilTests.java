

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UtilTests {

	public static boolean ehAtributoProtected(Class klass, String fieldName) {
		Field field = getField(klass, fieldName);
		return Modifier.isProtected(field.getModifiers());
	}

	public static boolean ehAtributoPublico(Class klass, String fieldName) {
		Field field = getField(klass, fieldName);
		return Modifier.isPublic(field.getModifiers());
	}

	public static boolean ehAtributoPacote(Class klass, String fieldName) {
		return !ehAtributoProtected(klass, fieldName) && !ehAtributoPublico(klass, fieldName)
				&& !ehAtributoPrivado(klass, fieldName);
	}

	public static boolean ehAtributoPrivado(Class klass, String fieldName) {
		Field field = getField(klass, fieldName);
		return Modifier.isPrivate(field.getModifiers());
	}

	private static Field getField(Class klass, String fieldName) {
		List<Field> fields = Arrays.asList(klass.getDeclaredFields());
		for (Field field : fields) {
			if (field.getName().equals(fieldName)) {
				return field;
			}
		}
		return null;
	}

	public static boolean ehMetodoSobreescrito(Class klass, String methodName) {
		for (Method method : klass.getDeclaredMethods()) {
			if (method.getName().equals(methodName) && klass.getSuperclass() != Object.class) {
				for (Method methodSuper : klass.getSuperclass().getDeclaredMethods()) {
					if (methodSuper.getName().equals(methodName)) {
						return true;
					}
				}
			}
		}
		return false;
	}
}