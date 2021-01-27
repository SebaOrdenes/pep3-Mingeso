<template>
<form name="calc"> 
Numero 1: <input string="number" name="operando1" v-model="operando1" > 
<br> 
Numero 2: <input string="number" name="operando2" v-model="operando2"> 
<br> 
 <button v-on:click="suma"> + </button>
<input type="Button" name="" value=" - " onclick="calcula('-')"> 
<input type="Button" name="" value=" X " onclick="calcula('*')"> 
<input type="Button" name="" value=" / " onclick="calcula('/')"> 
<br> 
Resultado: {{result}}

</form>
</template>

<script>
export default {
   data() {
    return {
      operando1: 0,
      operando2: 0,
      result:null,
    }
  },
     suma(){
            axios.post('http://localhost:8081/add', {
              numberOne:this.operando1,
              numberTwo: this.operando2
            })
            .then(Response => {
              console.log(Response.data);
            })
            .catch(err =>{
              console.log(err);
            })
          
          axios.get('http://localhost:8081/add')
                  .then(response =>{
                      this.result = response.data
                    })
                  .catch(e=>{
                    this.erros.push(e)
                  })
   	
} }

</script>