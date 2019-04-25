package by.epam.shapes.creator;

import by.epam.shapes.entity.impl.Pyramid;
import by.epam.shapes.repository.impl.PyramidRepository;
import by.epam.shapes.repository.Repository;
import by.epam.shapes.validator.PyramidValidator;

import java.util.List;

public class PyramidRepositoryCreator {
    private Repository pyramidRepository = PyramidRepository.getPyramidRepository();
    public void createRepository(List<Pyramid> pyramidsList) {
        for (Pyramid pyramid : pyramidsList) {
            if (PyramidValidator.isPyramid(pyramid)) {
                pyramidRepository.addPyramid(pyramid);
            }
        }
    }
}