import axios from "axios";

export async function buscarPetsDisponiveis() {
    try {
        const response = await axios.get('http://localhost:8080/animals');
        console.log(response.data);

        return response.data;
    } catch (error) {
        console.error('Ocorreu um erro:', error);
    }
}


