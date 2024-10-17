import 'package:shared_preferences/shared_preferences.dart';

class JadwalService {
  Future<void> simpanJadwal(String key, String value) async {
    final prefs = await SharedPreferences.getInstance();
    await prefs.setString(key, value);
  }

  Future<String?> dapatkanJadwal(String key) async {
    final prefs = await SharedPreferences.getInstance();
    return prefs.getString(key);
  }
}
