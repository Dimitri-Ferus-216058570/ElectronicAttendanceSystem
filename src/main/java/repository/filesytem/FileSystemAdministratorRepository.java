package repository.filesytem;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.Administrator;
import repository.AdministratorRepository;

import java.io.*;
import java.util.*;
//Repository save an Administrator to a Json file
public class FileSystemAdministratorRepository implements AdministratorRepository {
    //Path to the JSON file
    private final String filePath;

    //Gson object to handle JSON serialization/deserialization
    private final Gson gson = new Gson();

    public FileSystemAdministratorRepository(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void save(Administrator admin) {
        Map<Integer, Administrator> admins = loadAll();
        admins.put(admin.getAdminId(), admin);
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(admins, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Administrator findById(Integer id) {
        Map<Integer, Administrator> admins = loadAll();
        return admins.get(id);
    }

    @Override
    public List<Administrator> findAll() {
        return new ArrayList<>(loadAll().values());
    }

    @Override
    public void delete(Integer id) {
        Map<Integer, Administrator> admins = loadAll();
        admins.remove(id);
        try (Writer writer = new FileWriter(filePath)) {
            gson.toJson(admins, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Map<Integer, Administrator> loadAll() {
        try (Reader reader = new FileReader(filePath)) {
            return gson.fromJson(reader, new TypeToken<Map<Integer, Administrator>>(){}.getType());
        } catch (FileNotFoundException e) {
            // File not found — return empty map
            return new HashMap<>();
        } catch (IOException e) {
            e.printStackTrace();
            return new HashMap<>();
        }
    }
}
