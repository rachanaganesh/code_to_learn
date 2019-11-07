package Arrays;

class min_cost_employee {
    public int calculateHiringCost(int hiringCost, int salary, int severanceFee, int months, int[] employees)
    {
        if (months == 0 || employees.length == 0)
            return 0;
        int currentEmployees = 0;
        int currentHiringCost = 0;
        int minHiringCost = Integer.MAX_VALUE;
        for (int i = 0; i < months; i++)
        {
            if (currentEmployees < employees[i])
            {
                int newEmployees = employees[i] - currentEmployees;
                currentHiringCost = newEmployees * (hiringCost + salary);
                currentHiringCost += currentEmployees * salary;
                currentEmployees += newEmployees;
            }
            else if (currentEmployees > employees[i])
            {
                if (employees[i] == 0)
                {
                    currentEmployees = 0;
                    continue;
                }
                int firedEmployees = currentEmployees - employees[i];
                int fees = firedEmployees * severanceFee;
                currentEmployees = currentEmployees - employees[i];
                currentHiringCost = currentEmployees * salary + firedEmployees * fees;
            }
            else {
                currentHiringCost = currentEmployees * salary;
            }
            minHiringCost = Math.min(currentHiringCost, minHiringCost);
        }
        return minHiringCost;
    }

    public static void main(){
        min_cost_employee min = new min_cost_employee();
        int[] emp ={3,2};
        System.out.println(min.calculateHiringCost(100, 1000, 10,2,emp));

    }
}
