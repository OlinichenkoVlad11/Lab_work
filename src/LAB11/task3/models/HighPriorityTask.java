package LAB11.task3.models;

    public class HighPriorityTask extends Task {
        private int priorityLevel;

        public HighPriorityTask(int id, String title, int priorityLevel) {
            super(id, title);
            this.priorityLevel = priorityLevel;
        }

        @Override
        public String markAsDone() {
            super.markAsDone();

            System.out.println("🚀 Пріоритетне завдання виконано! Сповіщення надіслано.");
            return "";
        }

            @Override
            public  String toString() {
                return super.toString() + ", Пріорітетний рівень: " + priorityLevel;
            }
        }


