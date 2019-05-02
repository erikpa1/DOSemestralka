#pragma once
#include <vector>

class BatohItem;

class Batoh
{
public:
	
	Batoh();
	~Batoh();

	void AddItem(BatohItem * item);
	void RemoveTheHardestItem();

public:

	int GetMaxCapacity();
	int GetActualCapacity();
	int GetFreeCapacity();
	int GetHodnotaBatohu();

	void SetMaxCapacity(int capacity);

public:
		
	void PrintInventory();
	


private:

	std::vector<BatohItem *> _items;

private:

	int _maxCapacity = 0;
	int _actualCapacity = 0;
	int _hodnotaBatohu = 0;

};

