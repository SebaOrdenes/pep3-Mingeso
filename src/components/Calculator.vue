<template>
<form name="calc"> 
<input string="number" name="operando1" v-model="operando1" > 
<br> 
<input string="number" name="operando2" v-model="operando2"> 
<br> 
 <button v-on:click="suma"> + </button>
<input type="Button" name="" value=" + " onclick="suma"> 
<input type="Button" name="" value=" - " onclick="calcula('-')"> 
<input type="Button" name="" value=" X " onclick="calcula('*')"> 
<input type="Button" name="" value=" / " onclick="calcula('/')"> 
<br> 


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
          },
   	
} 

</script>