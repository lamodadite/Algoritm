#include <iostream>
#include <algorithm>
#include <queue>

using namespace std;

bool	compare(int x, int y)
{
	return (x > y);
}

int	main()
{
	int crane_n;
	int box_n;
	int	cnt = 0;

	cin >> crane_n;
	int	*crane = new int[crane_n];
	for (int i = 0; i < crane_n; i++)
	{
		cin >> crane[i];
	}
	sort(crane, crane + crane_n, compare);

	cin >> box_n;
	vector<int> box;
	for (int i = 0; i < box_n; i++)
	{
		int	tmp;
		cin >> tmp;
		box.push_back(tmp);
	}
	sort(box.begin(), box.end(), greater<int>());

	if(crane[0] < box[0])
	{
		cout << -1 << "\n";
		return 0;
	}
	int c_idx;
	int	b_idx;
	while (!box.empty())
	{
		c_idx = 0;
		b_idx = 0;
		while (c_idx < crane_n && b_idx < box.size() && !box.empty())
		{
			if (box[b_idx] <= crane[c_idx])
			{
				box.erase(box.begin() + b_idx);
				c_idx++;
			}
			else
				b_idx++;
		}
		cnt++;
	}

	cout << cnt << endl;
	return 0;
}
