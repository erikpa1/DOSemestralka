#include "BatohItem.h"


BatohItem::BatohItem()
{
}


BatohItem::~BatohItem()
{
}


void BatohItem::SetVaha(int vaha)
{
	_vaha = vaha;
}

void BatohItem::SetCena(int cena)
{
	_cena = cena; 
}

int BatohItem::GetVaha()
{
	return _vaha;
}

int BatohItem::GetCena()
{
	return _cena;
}

std::string BatohItem::ToString()
{
	return std::string(std::to_string(_cena) + " " + std::to_string(_vaha));
}
