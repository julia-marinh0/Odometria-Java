public class Odometria extends LinearOpMode{

    //motores DcMotor

    DcMotor motorFE;
    DcMotor motorFD;
    DcMotor motorTE;
    DcMotor motorTD;

    //imu (ele é o ângulo que o robô vai estar virado)

    BNO055IMU imu;
    Orientation angles;
    //double Kp = 1;
    //double target;

    //posições do robô

    double poseX;
    double poseY;
    double poseZ;

    //potencia do motor (o que a gente decidir, se a gente quer botar  ou não)

    double PotenciaFD;
    double PotenciaFE;
    double PotenciaTE;
    double PotenciaTD;

    public init(){
        //hardware map!!

        double poseX = 0;
        double poseY = 0;
        double poseZ = 0;

        this.chassi.FD.setMode(DcMotor.RunMode.RUN_WITH_ENCODER);
        this.chassi.FE.setMode(DcMotor.RunMode.RUN_WITH_ENCODER);
        this.chassi.TD.setMode(DcMotor.RunMode.RUN_WITH_ENCODER);
        this.chassi.TE.setMode(DcMotor.RunMode.RUN_WITH_ENCODER);



    }
    public void andarX(int ticks, double velocidade, boolean lado){

        if(lado = true) {
            // lado direito

            this.motorFD.setTargetPosition(-1 * ticks);
            this.motorFE.setTargetPosition(ticks);
            this.motorTD.setTargetPosition(ticks);
            this.motorTE.setTargetPosition(-1 * ticks);
            this.poseX = motorFE.getCurrentPosition();
        }

        if(lado = false){

            // lado esquerdo
            this.motorFD.setTargetPosition(ticks);
            this.motorFE.setTargetPosition(-1 * ticks);
            this.motorTD.setTargetPosition(-1 * ticks);
            this.motorTE.setTargetPosition(ticks);
            this.poseX = motorFE.getCurrentPosition();
        }


    }
    public void andarY(int ticks, double velocidade, boolean direcao){

        if(direcao = true){
            //frente
            this.motorFD.setTargetPosition(ticks);
            this.motorFE.setTargetPosition(ticks);
            this.motorTD.setTargetPosition(ticks);
            this.motorTE.setTargetPosition(ticks);
            this.poseX = motorFE.getCurrentPosition();
        }
        if(direcao = false){
            //trás
            this.motorFD.setTargetPosition(-1 * ticks);
            this.motorFE.setTargetPosition(-1 * ticks);
            this.motorTD.setTargetPosition(-1 * ticks);
            this.motorTE.setTargetPosition(-1 * ticks);
            this.poseX = motorFE.getCurrentPosition();
        }
    }





}