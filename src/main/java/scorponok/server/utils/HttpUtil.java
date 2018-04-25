package scorponok.server.utils;

import scorponok.common.utils.StringUtil;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class HttpUtil {
	public static final String ACCOUNT_INFO = "account_info";
	public static final String PC_ACCOUNT_INFO = "pcaccount_info";
	public static final String LOGIN_COOKIE = "lnc";

	public static void put(String key, Object value) {
		requestParam.get().put(key, value);
	}

	public static Object get(String key) {
		return requestParam.get().get(key);
	}

	private static final ThreadLocal<Map<String, Object>> requestParam = new ThreadLocal<Map<String, Object>>() {
		protected Map<String, Object> initialValue() {
			return new HashMap<String, Object>();
		}

		;
	};

	public static String getLoginToken() {
		return (String) requestParam.get().get(LOGIN_COOKIE);
	}

	public static void clear() {
		requestParam.get().clear();
	}

	private static void setLoginToken(String token) {
		requestParam.get().put(LOGIN_COOKIE, token);
	}

	public static boolean checkCookie(Cookie[] cookies) {
		if (cookies == null || cookies.length == 0) {
			return false;
		} else {
			for (Cookie cookie : cookies) {
				if (LOGIN_COOKIE.equals(cookie.getName()) && StringUtil.isNotEmpty(cookie.getValue()) && cookie.getValue().length() == 64) {
					setLoginToken(cookie.getValue());
					return true;
				}
			}
			return false;
		}
	}

	public static int getAccountId(Cookie[] cookies) {
		int id = 0;
		if (cookies == null || cookies.length == 0) {
			return id;
		} else {
			for (Cookie cookie : cookies) {
				if (LOGIN_COOKIE.equals(cookie.getName())) {
					id = Integer.parseInt(cookie.getValue());
				}
			}
		}
		return id;
	}

	public static boolean checkCookies(Cookie[] cookies) {
		if (cookies == null || cookies.length == 0) {
			return false;
		} else {
			for (Cookie cookie : cookies) {
				if (LOGIN_COOKIE.equals(cookie.getName())) {
					return true;
				}
			}
		}
		return false;
	}

	public static Cookie buildLoginCookie(String host) {
		String token = StringUtil.getToken(64);
		setLoginToken(token);
		Cookie cookie = new Cookie(LOGIN_COOKIE, token);
		cookie.setMaxAge(7200);
		cookie.setDomain(host);
		cookie.setPath("/");
		return cookie;
	}

	public static String getRequestUrl(HttpServletRequest request) {
		String requestUrl = request.getScheme() + "://" + request.getServerName() // 服务器地址
				+ request.getContextPath() // 项目名称
				+ request.getServletPath(); // 请求页面或其他地址
		String query = request.getQueryString();
		if (query != null) {
			requestUrl += "?" + query;
		}
		return requestUrl;
	}

	public static String getRedirectUrl(String host, HttpServletRequest request, Long id) {
		String requestUrl = request.getScheme() + "://" + host // 服务器地址
				+ request.getContextPath() // 项目名称
				+ request.getServletPath(); // 请求页面或其他地址
		String query = request.getQueryString();
		if (query != null) {
			requestUrl += "?" + query + "&loginId=" + id;
		}
		return requestUrl;
	}

	public static String getRedirectUrl(String host, HttpServletRequest request) {
		String requestUrl = request.getScheme() + "://" + host // 服务器地址
				+ request.getContextPath() // 项目名称
				+ request.getServletPath(); // 请求页面或其他地址
		String query = request.getQueryString();
		if (query != null) {
			requestUrl += "?" + query;
		}
		return requestUrl;
	}

	public static String getRequestUrlNoQueryString(HttpServletRequest request) {
		String requestUrl = request.getScheme() + "://" + request.getServerName() // 服务器地址
				+ request.getContextPath() // 项目名称
				+ request.getServletPath(); // 请求页面或其他地址
		return requestUrl;
	}
	// public static Account getAccount(HttpServletRequest request) {
	// Account account = (Account)
	// request.getSession().getAttribute(HttpUtil.ACCOUNT_INFO);
	// return account;
	// }

/*	public static PcAccount getPcAccount(HttpServletRequest request) {
		return (PcAccount) request.getSession().getAttribute(PC_ACCOUNT_INFO);
	}*/

	public static String getDomain(HttpServletRequest request) {
		return request.getScheme() + "://" + request.getServerName();
	}
}
