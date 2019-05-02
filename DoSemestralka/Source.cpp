#pragma once
#include <iostream>
#include <fstream>
#include <string>

#include "Batoh.h"
#include "BatohItem.h"

using namespace std;

int main()
{
	Batoh batoh;

	batoh.SetMaxCapacity(1500);

	ifstream aValues;
	aValues.open("H3_a.txt");

	ifstream cValues;
	cValues.open("H3_c.txt");

	if (aValues.is_open() && cValues.is_open())
	{
		int tmp = 0;

		while (!aValues.eof())
		{
			int valA;
			int valC;

			string valwrapper;
			aValues >> valwrapper;

			if (!valwrapper.empty())
			{

				valA = std::stoi(valwrapper);
				cValues >> valwrapper;
				valC = std::stoi(valwrapper);

				auto tmpItem = new BatohItem();
				tmpItem->SetVaha(valA);
				tmpItem->SetCena(valC);

				batoh.AddItem(tmpItem);

				cout << "Loaded " << tmpItem->ToString() << endl;

				tmp++;
			}

			if (tmp == 300)
			{
				return;
			}
		}

		cout << "Size: " << tmp;

		while (batoh.GetActualCapacity() < 0)
		{
			batoh.RemoveTheHardestItem();
		}
	}
	else {
		cout << "Failed to open file" << endl;
		while (true)
		{

		}
	}


	return 0;
}