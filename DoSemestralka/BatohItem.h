#pragma once
#include <string>

class BatohItem
{

public:

	BatohItem();
	~BatohItem();

public:

	void SetVaha(int vaha);
	void SetCena(int cena);

	int GetVaha();
	int GetCena();

	std::string ToString();

private:

	int _vaha = 0;
	int _cena = 0;

};

