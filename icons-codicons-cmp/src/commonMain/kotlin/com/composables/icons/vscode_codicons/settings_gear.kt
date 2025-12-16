package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SettingsGear: ImageVector
    get() {
        if (_SettingsGear != null) return _SettingsGear!!
        
        _SettingsGear = ImageVector.Builder(
            name = "settings-gear",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 9f)
                curveTo(10.3425f, 9f, 9.00002f, 10.3425f, 9.00002f, 12f)
                curveTo(9.00002f, 13.6575f, 10.3425f, 15f, 12f, 15f)
                curveTo(13.6575f, 15f, 15f, 13.6575f, 15f, 12f)
                curveTo(15f, 10.3425f, 13.6575f, 9f, 12f, 9f)
                close()
                moveTo(12f, 13.5f)
                curveTo(11.172f, 13.5f, 10.5f, 12.828f, 10.5f, 12f)
                curveTo(10.5f, 11.172f, 11.172f, 10.5f, 12f, 10.5f)
                curveTo(12.828f, 10.5f, 13.5f, 11.172f, 13.5f, 12f)
                curveTo(13.5f, 12.828f, 12.828f, 13.5f, 12f, 13.5f)
                close()
                moveTo(21.8475f, 14.5725f)
                lineTo(19.9185f, 12.942f)
                curveTo(19.8675f, 12.8985f, 19.8195f, 12.8505f, 19.776f, 12.7995f)
                curveTo(19.332f, 12.279f, 19.3965f, 11.5005f, 19.9185f, 11.058f)
                lineTo(21.8475f, 9.4275f)
                curveTo(22.0395f, 9.2655f, 22.113f, 9.0045f, 22.0365f, 8.766f)
                curveTo(21.579f, 7.3545f, 20.823f, 6.06f, 19.8285f, 4.962f)
                curveTo(19.7085f, 4.83f, 19.5405f, 4.758f, 19.368f, 4.758f)
                curveTo(19.2975f, 4.758f, 19.227f, 4.77f, 19.1595f, 4.794f)
                lineTo(16.779f, 5.6415f)
                curveTo(16.716f, 5.664f, 16.65f, 5.682f, 16.584f, 5.694f)
                curveTo(16.509f, 5.7075f, 16.434f, 5.715f, 16.3605f, 5.715f)
                curveTo(15.7725f, 5.715f, 15.2505f, 5.298f, 15.141f, 4.701f)
                lineTo(14.6865f, 2.223f)
                curveTo(14.6415f, 1.977f, 14.451f, 1.782f, 14.205f, 1.7295f)
                curveTo(13.485f, 1.5765f, 12.7485f, 1.5f, 12.0015f, 1.5f)
                curveTo(11.2545f, 1.5f, 10.5165f, 1.578f, 9.79652f, 1.7295f)
                curveTo(9.55052f, 1.782f, 9.36002f, 1.977f, 9.31502f, 2.223f)
                lineTo(8.86202f, 4.701f)
                curveTo(8.85002f, 4.767f, 8.83202f, 4.8315f, 8.80952f, 4.8945f)
                curveTo(8.62802f, 5.4f, 8.15102f, 5.715f, 7.64102f, 5.715f)
                curveTo(7.50302f, 5.715f, 7.36202f, 5.691f, 7.22402f, 5.643f)
                lineTo(4.84352f, 4.7955f)
                curveTo(4.77602f, 4.7715f, 4.70402f, 4.7595f, 4.63502f, 4.7595f)
                curveTo(4.46252f, 4.7595f, 4.29452f, 4.8315f, 4.17452f, 4.9635f)
                curveTo(3.17852f, 6.0615f, 2.42402f, 7.356f, 1.96502f, 8.7675f)
                curveTo(1.88702f, 9.006f, 1.96202f, 9.267f, 2.15402f, 9.429f)
                lineTo(4.08302f, 11.0595f)
                curveTo(4.13402f, 11.103f, 4.18202f, 11.151f, 4.22552f, 11.202f)
                curveTo(4.66952f, 11.7225f, 4.60502f, 12.501f, 4.08302f, 12.9435f)
                lineTo(2.15402f, 14.574f)
                curveTo(1.96202f, 14.736f, 1.88852f, 14.997f, 1.96502f, 15.2355f)
                curveTo(2.42252f, 16.647f, 3.17852f, 17.9415f, 4.17452f, 19.0395f)
                curveTo(4.29452f, 19.1715f, 4.46252f, 19.2435f, 4.63502f, 19.2435f)
                curveTo(4.70552f, 19.2435f, 4.77602f, 19.2315f, 4.84352f, 19.2075f)
                lineTo(7.22402f, 18.36f)
                curveTo(7.28702f, 18.3375f, 7.35302f, 18.3195f, 7.41902f, 18.3075f)
                curveTo(7.49402f, 18.294f, 7.56902f, 18.288f, 7.64252f, 18.288f)
                curveTo(8.23052f, 18.288f, 8.75252f, 18.705f, 8.86202f, 19.302f)
                lineTo(9.31502f, 21.78f)
                curveTo(9.36002f, 22.026f, 9.55052f, 22.221f, 9.79652f, 22.2735f)
                curveTo(10.5165f, 22.4265f, 11.2545f, 22.503f, 12.0015f, 22.503f)
                curveTo(12.7485f, 22.503f, 13.4865f, 22.425f, 14.205f, 22.2735f)
                curveTo(14.451f, 22.221f, 14.6415f, 22.026f, 14.6865f, 21.78f)
                lineTo(15.141f, 19.302f)
                curveTo(15.153f, 19.236f, 15.171f, 19.1715f, 15.1935f, 19.1085f)
                curveTo(15.375f, 18.603f, 15.852f, 18.288f, 16.362f, 18.288f)
                curveTo(16.5f, 18.288f, 16.641f, 18.312f, 16.779f, 18.36f)
                lineTo(19.158f, 19.2075f)
                curveTo(19.227f, 19.2315f, 19.2975f, 19.2435f, 19.3665f, 19.2435f)
                curveTo(19.539f, 19.2435f, 19.707f, 19.1715f, 19.827f, 19.0395f)
                curveTo(20.823f, 17.9415f, 21.5775f, 16.647f, 22.035f, 15.2355f)
                curveTo(22.113f, 14.997f, 22.038f, 14.736f, 21.846f, 14.574f)
                lineTo(21.8475f, 14.5725f)
                close()
                moveTo(19.092f, 17.589f)
                lineTo(17.2815f, 16.944f)
                curveTo(16.9845f, 16.839f, 16.6755f, 16.785f, 16.362f, 16.785f)
                curveTo(15.2085f, 16.785f, 14.1705f, 17.514f, 13.782f, 18.5985f)
                curveTo(13.731f, 18.738f, 13.6935f, 18.882f, 13.6665f, 19.029f)
                lineTo(13.3215f, 20.9055f)
                curveTo(12.8865f, 20.9685f, 12.444f, 21f, 12.0015f, 21f)
                curveTo(11.559f, 21f, 11.1165f, 20.9685f, 10.68f, 20.904f)
                lineTo(10.3365f, 19.0275f)
                curveTo(10.098f, 17.727f, 8.96552f, 16.7835f, 7.64252f, 16.7835f)
                curveTo(7.48052f, 16.7835f, 7.31552f, 16.7985f, 7.14902f, 16.8285f)
                curveTo(7.00352f, 16.8555f, 6.86102f, 16.893f, 6.72002f, 16.9425f)
                lineTo(4.90952f, 17.5875f)
                curveTo(4.35752f, 16.896f, 3.91652f, 16.1385f, 3.59102f, 15.321f)
                lineTo(5.05202f, 14.0865f)
                curveTo(5.61152f, 13.614f, 5.95202f, 12.951f, 6.01202f, 12.222f)
                curveTo(6.07202f, 11.493f, 5.84252f, 10.785f, 5.36702f, 10.227f)
                curveTo(5.27102f, 10.1145f, 5.16452f, 10.008f, 5.05202f, 9.912f)
                lineTo(3.59102f, 8.6775f)
                curveTo(3.91652f, 7.86f, 4.35752f, 7.101f, 4.90952f, 6.411f)
                lineTo(6.72002f, 7.056f)
                curveTo(7.01702f, 7.161f, 7.32602f, 7.215f, 7.64102f, 7.215f)
                curveTo(8.79452f, 7.215f, 9.83252f, 6.486f, 10.221f, 5.4015f)
                curveTo(10.272f, 5.2605f, 10.3095f, 5.1165f, 10.3365f, 4.971f)
                lineTo(10.68f, 3.0945f)
                curveTo(11.1165f, 3.0315f, 11.559f, 2.9985f, 12.0015f, 2.9985f)
                curveTo(12.444f, 2.9985f, 12.8865f, 3.03f, 13.3215f, 3.093f)
                lineTo(13.665f, 4.9695f)
                curveTo(13.9035f, 6.27f, 15.036f, 7.2135f, 16.359f, 7.2135f)
                curveTo(16.521f, 7.2135f, 16.686f, 7.1985f, 16.851f, 7.1685f)
                curveTo(16.9965f, 7.1415f, 17.1405f, 7.104f, 17.2815f, 7.0545f)
                lineTo(19.092f, 6.4095f)
                curveTo(19.644f, 7.0995f, 20.085f, 7.8585f, 20.4105f, 8.676f)
                lineTo(18.951f, 9.9105f)
                curveTo(18.3915f, 10.383f, 18.0495f, 11.046f, 17.991f, 11.775f)
                curveTo(17.931f, 12.504f, 18.1605f, 13.2135f, 18.636f, 13.77f)
                curveTo(18.7335f, 13.884f, 18.8385f, 13.989f, 18.9525f, 14.085f)
                lineTo(20.4135f, 15.3195f)
                curveTo(20.088f, 16.137f, 19.647f, 16.896f, 19.095f, 17.586f)
                lineTo(19.092f, 17.589f)
                close()
            }
        }.build()
        
        return _SettingsGear!!
    }

private var _SettingsGear: ImageVector? = null

