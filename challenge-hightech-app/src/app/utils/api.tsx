interface Post {
    name: string;
	email: string;
	cpf: string;
	cargo: string;
	phone: number;
	password: string;
}

export const API_URL = 'http://localhost:8080/Salesforce/rest/user';

export const fetchData = async (endpont: string): Promise<Post[] | null> => {
    try {
        const response = await fetch(`${API_URL}/${endpont}`);
        if (!response.ok){
            throw new Error('failed to fetch data');
        }
    } catch (error) {
        console.error('Error fetching data: ',error)
        return null
    }
}