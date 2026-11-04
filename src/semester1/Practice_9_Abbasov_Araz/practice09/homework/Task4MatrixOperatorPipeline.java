package semester1.Practice_9_Abbasov_Araz.practice09.homework;

public class Task4MatrixOperatorPipeline {
    public static void main(String[] args) {
        double[][] rawData = {
                {1.0, 2.0},
                {3.0, 4.0}
        };

        EncapsulatedMatrix matrix = new EncapsulatedMatrix(rawData);

        rawData[0][0] = 999.0;

        MatrixPipeline pipeline = new MatrixPipeline("Конвеєр матричних операторів", 4);

        pipeline.addStage(new ScaleMatrixOperator(2.0));
        pipeline.addStage(new TransposeMatrixOperator());
        pipeline.addStage(new DiagonalShiftOperator(3.0));

        double[][] rightData = {
                {1.0, 0.0},
                {0.0, 1.0}
        };
        EncapsulatedMatrix identity = new EncapsulatedMatrix(rightData);
        pipeline.addStage(new MultiplyByMatrixOperator(identity));

        pipeline.runPipeline(matrix);
    }

    public static class EncapsulatedMatrix {
        private final int rows;
        private final int cols;
        private final double[][] grid;

        public EncapsulatedMatrix(double[][] source) {
            if (source == null || source.length == 0 || source[0] == null) {
                this.rows = 0;
                this.cols = 0;
                this.grid = new double[0][0];
            } else {
                this.rows = source.length;
                this.cols = source[0].length;
                this.grid = new double[rows][cols];
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        this.grid[i][j] = source[i][j];
                    }
                }
            }
        }

        public int getRows() {
            return rows;
        }

        public int getCols() {
            return cols;
        }

        public double[][] getGridCopy() {
            double[][] copy = new double[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    copy[i][j] = grid[i][j];
                }
            }
            return copy;
        }

        public double getElement(int r, int c) {
            if (r < 0 || r >= rows || c < 0 || c >= cols) {
                return 0.0;
            }
            return grid[r][c];
        }

        public boolean isSquare() {
            return rows == cols;
        }

        public double getTrace() {
            if (!isSquare()) {
                return 0.0;
            }
            double trace = 0.0;
            for (int i = 0; i < rows; i++) {
                trace += grid[i][i];
            }
            return trace;
        }

        public double getFrobeniusNorm() {
            double sumSq = 0.0;
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sumSq += grid[i][j] * grid[i][j];
                }
            }
            return Math.sqrt(sumSq);
        }

        public double getDeterminant() {
            if (!isSquare()) {
                return 0.0;
            }
            if (rows == 2) {
                return grid[0][0] * grid[1][1] - grid[0][1] * grid[1][0];
            }
            if (rows == 3) {
                return grid[0][0] * grid[1][1] * grid[2][2]
                        + grid[0][1] * grid[1][2] * grid[2][0]
                        + grid[0][2] * grid[1][0] * grid[2][1]
                        - grid[0][2] * grid[1][1] * grid[2][0]
                        - grid[0][0] * grid[1][2] * grid[2][1]
                        - grid[0][1] * grid[1][0] * grid[2][2];
            }
            return 0.0;
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Матриця (").append(rows).append("x").append(cols);
            sb.append(" | Норма Фробеніуса: ").append(String.format("%.2f", getFrobeniusNorm()));
            if (isSquare()) {
                sb.append(" | Слід: ").append(String.format("%.2f", getTrace()));
                sb.append(" | det: ").append(String.format("%.2f", getDeterminant()));
            }
            sb.append("):\n");
            for (int i = 0; i < rows; i++) {
                sb.append("  [");
                for (int j = 0; j < cols; j++) {
                    sb.append(String.format("%7.2f", grid[i][j]));
                }
                sb.append(" ]\n");
            }
            return sb.toString();
        }
    }

    public static abstract class AbstractMatrixOperator {
        private final String operatorName;

        public AbstractMatrixOperator(String operatorName) {
            this.operatorName = operatorName;
        }

        public String getOperatorName() {
            return operatorName;
        }

        public abstract boolean isApplicable(EncapsulatedMatrix input);

        public abstract EncapsulatedMatrix apply(EncapsulatedMatrix input);

        public final EncapsulatedMatrix executeSafely(EncapsulatedMatrix input) {
            if (input != null && isApplicable(input)) {
                return apply(input);
            }
            System.out.println("Оператор '" + operatorName + "' не може бути застосований до вхідної матриці!");
            return input;
        }
    }

    public static class ScaleMatrixOperator extends AbstractMatrixOperator {
        private final double scaleFactor;

        public ScaleMatrixOperator(double scaleFactor) {
            super("Scale(x" + scaleFactor + ")");
            this.scaleFactor = scaleFactor;
        }

        @Override
        public boolean isApplicable(EncapsulatedMatrix input) {
            return input != null;
        }

        @Override
        public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
            int r = input.getRows();
            int c = input.getCols();
            double[][] result = new double[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    result[i][j] = input.getElement(i, j) * scaleFactor;
                }
            }
            return new EncapsulatedMatrix(result);
        }
    }

    public static class TransposeMatrixOperator extends AbstractMatrixOperator {
        public TransposeMatrixOperator() {
            super("Transpose(A^T)");
        }

        @Override
        public boolean isApplicable(EncapsulatedMatrix input) {
            return input != null;
        }

        @Override
        public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
            int r = input.getRows();
            int c = input.getCols();
            double[][] result = new double[c][r];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    result[j][i] = input.getElement(i, j);
                }
            }
            return new EncapsulatedMatrix(result);
        }
    }

    public static class DiagonalShiftOperator extends AbstractMatrixOperator {
        private final double lambda;

        public DiagonalShiftOperator(double lambda) {
            super("DiagonalShift(+" + lambda + "*I)");
            this.lambda = lambda;
        }

        @Override
        public boolean isApplicable(EncapsulatedMatrix input) {
            return input != null && input.isSquare();
        }

        @Override
        public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
            int n = input.getRows();
            double[][] result = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    double val = input.getElement(i, j);
                    if (i == j) {
                        val += lambda;
                    }
                    result[i][j] = val;
                }
            }
            return new EncapsulatedMatrix(result);
        }
    }

    public static class MultiplyByMatrixOperator extends AbstractMatrixOperator {
        private final EncapsulatedMatrix rightMatrix;

        public MultiplyByMatrixOperator(EncapsulatedMatrix rightMatrix) {
            super("MultiplyByMatrix");
            this.rightMatrix = rightMatrix;
        }

        @Override
        public boolean isApplicable(EncapsulatedMatrix input) {
            return input != null && rightMatrix != null && input.getCols() == rightMatrix.getRows();
        }

        @Override
        public EncapsulatedMatrix apply(EncapsulatedMatrix input) {
            int r1 = input.getRows();
            int c1 = input.getCols();
            int c2 = rightMatrix.getCols();
            double[][] result = new double[r1][c2];

            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    double sum = 0.0;
                    for (int k = 0; k < c1; k++) {
                        sum += input.getElement(i, k) * rightMatrix.getElement(k, j);
                    }
                    result[i][j] = sum;
                }
            }
            return new EncapsulatedMatrix(result);
        }
    }

    public static class MatrixPipeline {
        private final String pipelineName;
        private final AbstractMatrixOperator[] stages;
        private int stageCount;

        public MatrixPipeline(String pipelineName, int maxCapacity) {
            this.pipelineName = pipelineName;
            this.stages = new AbstractMatrixOperator[maxCapacity];
            this.stageCount = 0;
        }

        public void addStage(AbstractMatrixOperator op) {
            if (stageCount < stages.length) {
                stages[stageCount] = op;
                stageCount++;
            }
        }

        public EncapsulatedMatrix runPipeline(EncapsulatedMatrix initial) {
            System.out.println("================ " + pipelineName.toUpperCase() + " ================");
            System.out.print("[ВХІДНА МАТРИЦЯ X0 (" + initial.getRows() + "x" + initial.getCols());
            System.out.print(" | Норма Фробеніуса: " + String.format("%.2f", initial.getFrobeniusNorm()));
            if (initial.isSquare()) {
                System.out.print(" | Слід: " + String.format("%.2f", initial.getTrace()));
                System.out.print(" | det: " + String.format("%.2f", initial.getDeterminant()));
            }
            System.out.println(")]:");
            double[][] initGrid = initial.getGridCopy();
            for (int i = 0; i < initial.getRows(); i++) {
                System.out.print("  [");
                for (int j = 0; j < initial.getCols(); j++) {
                    System.out.print(String.format("%7.2f", initGrid[i][j]));
                }
                System.out.println(" ]");
            }
            System.out.println();

            EncapsulatedMatrix current = initial;

            for (int i = 0; i < stageCount; i++) {
                AbstractMatrixOperator op = stages[i];
                current = op.executeSafely(current);
                System.out.println("---> Етап " + (i + 1) + ": Оператор '" + op.getOperatorName() + "' виконано успішно:");
                System.out.print(current.toString());
            }

            System.out.println("==============================================================");
            return current;
        }
    }
}