package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Unmute: ImageVector
    get() {
        if (_Unmute != null) return _Unmute!!
        
        _Unmute = ImageVector.Builder(
            name = "unmute",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.69398f, 2.03934f)
                curveTo(8.8792f, 2.11749f, 8.99961f, 2.29898f, 8.99961f, 2.50001f)
                verticalLineTo(13.5f)
                curveTo(8.99961f, 13.7014f, 8.87875f, 13.8832f, 8.693f, 13.9611f)
                curveTo(8.50725f, 14.039f, 8.29289f, 13.9978f, 8.14921f, 13.8567f)
                lineTo(5.22278f, 10.9817f)
                horizontalLineTo(3.49963f)
                curveTo(2.67121f, 10.9817f, 1.99963f, 10.3101f, 1.99963f, 9.48172f)
                verticalLineTo(6.49273f)
                curveTo(1.99963f, 5.66431f, 2.67121f, 4.99273f, 3.49963f, 4.99273f)
                horizontalLineTo(5.22402f)
                lineTo(8.15073f, 2.14185f)
                curveTo(8.29474f, 2.00157f, 8.50875f, 1.96119f, 8.69398f, 2.03934f)
                close()
                moveTo(7.99961f, 3.68507f)
                lineTo(5.77617f, 5.85089f)
                curveTo(5.68281f, 5.94184f, 5.55763f, 5.99273f, 5.42729f, 5.99273f)
                horizontalLineTo(3.49963f)
                curveTo(3.22349f, 5.99273f, 2.99963f, 6.21659f, 2.99963f, 6.49273f)
                verticalLineTo(9.48172f)
                curveTo(2.99963f, 9.75786f, 3.22349f, 9.98172f, 3.49963f, 9.98172f)
                horizontalLineTo(5.42729f)
                curveTo(5.55836f, 9.98172f, 5.68419f, 10.0332f, 5.77769f, 10.125f)
                lineTo(7.99961f, 12.3079f)
                verticalLineTo(3.68507f)
                close()
                moveTo(10.1109f, 5.18874f)
                curveTo(10.2828f, 4.97264f, 10.5973f, 4.93682f, 10.8135f, 5.10873f)
                lineTo(10.8143f, 5.1094f)
                lineTo(10.8152f, 5.11015f)
                lineTo(10.8174f, 5.11188f)
                lineTo(10.8228f, 5.11628f)
                lineTo(10.8377f, 5.12882f)
                curveTo(10.8495f, 5.13885f, 10.8648f, 5.15224f, 10.8831f, 5.16904f)
                curveTo(10.9197f, 5.20261f, 10.9685f, 5.2499f, 11.0254f, 5.31119f)
                curveTo(11.1389f, 5.43362f, 11.2853f, 5.61296f, 11.4303f, 5.85143f)
                curveTo(11.7218f, 6.33096f, 12.0039f, 7.04439f, 12.0039f, 7.99855f)
                curveTo(12.0039f, 8.95268f, 11.7218f, 9.66687f, 11.4305f, 10.1471f)
                curveTo(11.2857f, 10.3859f, 11.1393f, 10.5657f, 11.0259f, 10.6884f)
                curveTo(10.9692f, 10.7498f, 10.9204f, 10.7973f, 10.8839f, 10.8309f)
                curveTo(10.8642f, 10.849f, 10.8441f, 10.8666f, 10.8236f, 10.8838f)
                lineTo(10.8152f, 10.8907f)
                lineTo(10.8143f, 10.8914f)
                curveTo(10.8143f, 10.8914f, 10.368f, 11.1337f, 10.1116f, 10.8129f)
                curveTo(9.94006f, 10.5983f, 9.97396f, 10.2858f, 10.1868f, 10.1128f)
                lineTo(10.1883f, 10.1115f)
                lineTo(10.1876f, 10.1122f)
                lineTo(10.1892f, 10.1108f)
                lineTo(10.1883f, 10.1115f)
                curveTo(10.1912f, 10.109f, 10.1975f, 10.1036f, 10.2066f, 10.0952f)
                curveTo(10.2248f, 10.0784f, 10.2543f, 10.05f, 10.2914f, 10.0098f)
                curveTo(10.3659f, 9.92923f, 10.47f, 9.80248f, 10.5755f, 9.62847f)
                curveTo(10.7851f, 9.28301f, 11.0039f, 8.74609f, 11.0039f, 7.99855f)
                curveTo(11.0039f, 7.25106f, 10.7851f, 6.71522f, 10.5758f, 6.3709f)
                curveTo(10.4703f, 6.19744f, 10.3663f, 6.07121f, 10.292f, 5.99105f)
                curveTo(10.2549f, 5.95104f, 10.2255f, 5.92278f, 10.2073f, 5.90613f)
                curveTo(10.1982f, 5.89781f, 10.192f, 5.89242f, 10.1891f, 5.88995f)
                lineTo(10.1901f, 5.89071f)
                curveTo(9.97439f, 5.71873f, 9.93908f, 5.40472f, 10.1109f, 5.18874f)
                close()
                moveTo(11.8127f, 3.10886f)
                curveTo(11.5966f, 2.93686f, 11.2821f, 2.97255f, 11.1101f, 3.18858f)
                curveTo(10.9382f, 3.40451f, 10.9743f, 3.71932f, 11.19f, 3.89138f)
                lineTo(11.2011f, 3.9006f)
                curveTo(11.2119f, 3.90975f, 11.2295f, 3.92484f, 11.2528f, 3.94582f)
                curveTo(11.2994f, 3.98781f, 11.369f, 4.05318f, 11.4538f, 4.14133f)
                curveTo(11.6239f, 4.31792f, 11.8537f, 4.58411f, 12.0841f, 4.93509f)
                curveTo(12.5446f, 5.63643f, 13.0029f, 6.66847f, 13.0029f, 8.00405f)
                curveTo(13.0029f, 9.33953f, 12.5446f, 10.3694f, 12.0845f, 11.0685f)
                curveTo(11.8541f, 11.4184f, 11.6244f, 11.6835f, 11.4545f, 11.8593f)
                curveTo(11.3697f, 11.947f, 11.3002f, 12.0121f, 11.2536f, 12.0538f)
                curveTo(11.2303f, 12.0747f, 11.2128f, 12.0897f, 11.202f, 12.0988f)
                lineTo(11.1904f, 12.1083f)
                lineTo(11.1895f, 12.1091f)
                curveTo(10.9742f, 12.2808f, 10.9382f, 12.5945f, 11.1093f, 12.8105f)
                curveTo(11.2808f, 13.0269f, 11.596f, 13.0628f, 11.8125f, 12.8913f)
                lineTo(11.8455f, 12.8642f)
                curveTo(11.864f, 12.8487f, 11.8895f, 12.8268f, 11.9209f, 12.7986f)
                curveTo(11.9838f, 12.7423f, 12.0707f, 12.6607f, 12.1735f, 12.5543f)
                curveTo(12.3789f, 12.3418f, 12.6496f, 12.0286f, 12.9197f, 11.6183f)
                curveTo(13.4604f, 10.797f, 14.0029f, 9.57884f, 14.0029f, 8.00405f)
                curveTo(14.0029f, 6.42934f, 13.4605f, 5.20938f, 12.9201f, 4.38627f)
                curveTo(12.6501f, 3.97503f, 12.3795f, 3.66089f, 12.1742f, 3.4477f)
                curveTo(12.0714f, 3.34097f, 11.9846f, 3.25908f, 11.9217f, 3.20255f)
                curveTo(11.8903f, 3.17426f, 11.8649f, 3.15228f, 11.8464f, 3.13665f)
                lineTo(11.8239f, 3.11798f)
                lineTo(11.8169f, 3.11222f)
                lineTo(11.8144f, 3.11024f)
                lineTo(11.8127f, 3.10886f)
                close()
                moveTo(10.1891f, 5.88995f)
                lineTo(10.1877f, 5.88874f)
                lineTo(10.1891f, 5.88995f)
                close()
            }
        }.build()
        
        return _Unmute!!
    }

private var _Unmute: ImageVector? = null

