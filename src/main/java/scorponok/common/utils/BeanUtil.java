package scorponok.common.utils;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BeanUtil {
	public static String[] getNullPropertyNames(Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<String>();
		for (java.beans.PropertyDescriptor pd : pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if (srcValue == null)
				emptyNames.add(pd.getName());
		}
		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}

	public static String[] getValueIs0PropertyNames(Object source) {
		final BeanWrapper src = new BeanWrapperImpl(source);
		java.beans.PropertyDescriptor[] pds = src.getPropertyDescriptors();

		Set<String> emptyNames = new HashSet<String>();
		for (java.beans.PropertyDescriptor pd : pds) {
			Object srcValue = src.getPropertyValue(pd.getName());
			if (srcValue.equals(0))
				emptyNames.add(pd.getName());
		}
		String[] result = new String[emptyNames.size()];
		return emptyNames.toArray(result);
	}

	public static <T> T copy(Object source, Class<T> clazz) {
		try {
			T newInstance = clazz.newInstance();
			BeanUtils.copyProperties(source, newInstance);
			return newInstance;
		} catch (InstantiationException | IllegalAccessException e) {
			return null;
		}

	}

	public static <T> List<T> copy(List<?> source, Class<T> clazz) {

		List<T> target = new ArrayList<T>();
		if (source == null || source.size() == 0) {
			return target;
		}
		for (Object t : source) {
			target.add(copy(t, clazz));
		}
		return target;

	}
}
