#include <iostream>
#include <string>

#include "Batoh.h"
#include "BatohItem.h"



Batoh::Batoh()
{
}


Batoh::~Batoh()
{
}

void Batoh::AddItem(BatohItem * item)
{
	if (item != nullptr)
	{
		_actualCapacity = item->GetVaha();
		_hodnotaBatohu = item->GetCena();
		_items.push_back(item);
	}
	
}

void Batoh::RemoveTheHardestItem()
{
	if (_items.empty() == false)
	{
		BatohItem * theHardest = _items.front();
		int theHardestIndex = 0;
		
		int tmpIndex = 0;

		for (auto const tmp : _items)
		{
			if (tmp->GetCena() > theHardest->GetVaha())
			{
				theHardest = tmp;
				theHardestIndex = tmpIndex;
			}

			tmpIndex++;
		}
	}

}

int Batoh::GetMaxCapacity()
{
	return _maxCapacity;
}

int Batoh::GetActualCapacity()
{
	return _actualCapacity;
}

int Batoh::GetFreeCapacity() 
{
	return _maxCapacity - _actualCapacity;
}

int Batoh::GetHodnotaBatohu() 
{
	return _hodnotaBatohu;
}

void Batoh::SetMaxCapacity(int capacity)
{
	_maxCapacity = capacity;
}

void Batoh::PrintInventory()
{
	std::cout << "Total bag weight: ";
	std::cout << _actualCapacity;

	std::cout << "Free space: ";
	std::cout << this->GetFreeCapacity();

	for (auto const tmp : _items)
	{
		std::cout << "Batoh contain: " << tmp->GetCena() << " with weight: " << tmp->GetVaha() << std::endl;
	}
}
