package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.SparkleFilled: ImageVector
    get() {
        if (_SparkleFilled != null) return _SparkleFilled!!
        
        _SparkleFilled = ImageVector.Builder(
            name = "sparkle-filled",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.46524f, 9.82962f)
                curveTo(5.62134f, 9.94037f, 5.80806f, 9.99974f, 5.99946f, 9.99948f)
                curveTo(6.19151f, 10.0003f, 6.37897f, 9.94082f, 6.53546f, 9.82948f)
                curveTo(6.69223f, 9.71378f, 6.81095f, 9.55398f, 6.87646f, 9.37048f)
                lineTo(7.22346f, 8.30348f)
                curveTo(7.3077f, 8.05191f, 7.44906f, 7.82327f, 7.63646f, 7.63548f)
                curveTo(7.82305f, 7.44851f, 8.05078f, 7.30776f, 8.30146f, 7.22448f)
                lineTo(9.38746f, 6.87148f)
                curveTo(9.56665f, 6.80759f, 9.72173f, 6.68989f, 9.83146f, 6.53448f)
                curveTo(9.94145f, 6.37908f, 10.0005f, 6.19337f, 10.0005f, 6.00298f)
                curveTo(10.0005f, 5.81259f, 9.94145f, 5.62689f, 9.83146f, 5.47148f)
                curveTo(9.71293f, 5.30613f, 9.54426f, 5.18339f, 9.35046f, 5.12148f)
                lineTo(8.28146f, 4.77548f)
                curveTo(8.02989f, 4.69238f, 7.80123f, 4.55163f, 7.61371f, 4.36447f)
                curveTo(7.4262f, 4.1773f, 7.28503f, 3.9489f, 7.20146f, 3.69748f)
                lineTo(6.84846f, 2.61348f)
                curveTo(6.78519f, 2.43423f, 6.66777f, 2.27908f, 6.51246f, 2.16948f)
                curveTo(6.35557f, 2.06133f, 6.16951f, 2.00342f, 5.97896f, 2.00342f)
                curveTo(5.78841f, 2.00342f, 5.60235f, 2.06133f, 5.44546f, 2.16948f)
                curveTo(5.28572f, 2.28196f, 5.16594f, 2.44237f, 5.10346f, 2.62748f)
                lineTo(4.74846f, 3.71748f)
                curveTo(4.66476f, 3.96155f, 4.52691f, 4.18351f, 4.34524f, 4.36673f)
                curveTo(4.16358f, 4.54996f, 3.9428f, 4.6897f, 3.69946f, 4.77548f)
                lineTo(2.61546f, 5.12648f)
                curveTo(2.43437f, 5.19048f, 2.27775f, 5.30937f, 2.16743f, 5.4666f)
                curveTo(2.05712f, 5.62383f, 1.99859f, 5.81155f, 2.00003f, 6.00361f)
                curveTo(2.00146f, 6.19568f, 2.06277f, 6.38251f, 2.17541f, 6.53808f)
                curveTo(2.28806f, 6.69364f, 2.44643f, 6.81019f, 2.62846f, 6.87148f)
                lineTo(3.69546f, 7.21848f)
                curveTo(3.94767f, 7.30297f, 4.17673f, 7.44506f, 4.36446f, 7.63348f)
                curveTo(4.41519f, 7.6837f, 4.46262f, 7.73715f, 4.50646f, 7.79348f)
                curveTo(4.62481f, 7.94615f, 4.71614f, 8.11797f, 4.77646f, 8.30148f)
                lineTo(5.12846f, 9.38148f)
                curveTo(5.19143f, 9.56222f, 5.30914f, 9.71886f, 5.46524f, 9.82962f)
                close()
                moveTo(10.5344f, 13.8515f)
                curveTo(10.6703f, 13.9477f, 10.8328f, 13.9994f, 10.9994f, 13.9995f)
                curveTo(11.1642f, 13.998f, 11.3245f, 13.9456f, 11.4584f, 13.8495f)
                curveTo(11.5979f, 13.751f, 11.7029f, 13.611f, 11.7584f, 13.4495f)
                lineTo(12.0064f, 12.6875f)
                curveTo(12.0595f, 12.529f, 12.1485f, 12.385f, 12.2664f, 12.2665f)
                curveTo(12.3837f, 12.148f, 12.5277f, 12.0592f, 12.6864f, 12.0075f)
                lineTo(13.4584f, 11.7555f)
                curveTo(13.6161f, 11.701f, 13.7528f, 11.5985f, 13.8494f, 11.4625f)
                curveTo(13.9227f, 11.3595f, 13.9706f, 11.2405f, 13.9891f, 11.1154f)
                curveTo(14.0076f, 10.9903f, 13.9962f, 10.8626f, 13.9558f, 10.7428f)
                curveTo(13.9154f, 10.623f, 13.8472f, 10.5144f, 13.7567f, 10.4261f)
                curveTo(13.6662f, 10.3377f, 13.5561f, 10.272f, 13.4354f, 10.2345f)
                lineTo(12.6714f, 9.98548f)
                curveTo(12.5132f, 9.93291f, 12.3695f, 9.8443f, 12.2514f, 9.72663f)
                curveTo(12.1334f, 9.60896f, 12.0444f, 9.46547f, 11.9914f, 9.30748f)
                lineTo(11.7394f, 8.53348f)
                curveTo(11.685f, 8.37623f, 11.5825f, 8.24011f, 11.4464f, 8.14448f)
                curveTo(11.3443f, 8.07153f, 11.2266f, 8.02359f, 11.1026f, 8.00453f)
                curveTo(10.9787f, 7.98547f, 10.8519f, 7.99582f, 10.7327f, 8.03475f)
                curveTo(10.6135f, 8.07369f, 10.5051f, 8.1401f, 10.4163f, 8.22865f)
                curveTo(10.3274f, 8.31719f, 10.2607f, 8.42538f, 10.2214f, 8.54448f)
                lineTo(9.97435f, 9.30648f)
                curveTo(9.92207f, 9.46413f, 9.83452f, 9.60777f, 9.71835f, 9.72648f)
                curveTo(9.60382f, 9.84272f, 9.46428f, 9.9313f, 9.31035f, 9.98548f)
                lineTo(8.53435f, 10.2385f)
                curveTo(8.41689f, 10.2793f, 8.31057f, 10.347f, 8.22382f, 10.4361f)
                curveTo(8.13708f, 10.5252f, 8.0723f, 10.6333f, 8.03464f, 10.7518f)
                curveTo(7.99698f, 10.8704f, 7.98746f, 10.996f, 8.00686f, 11.1189f)
                curveTo(8.02625f, 11.2417f, 8.07401f, 11.3583f, 8.14635f, 11.4595f)
                curveTo(8.24456f, 11.5993f, 8.38462f, 11.7044f, 8.54635f, 11.7595f)
                lineTo(9.30935f, 12.0065f)
                curveTo(9.46821f, 12.0599f, 9.61262f, 12.1492f, 9.73135f, 12.2675f)
                curveTo(9.84958f, 12.3857f, 9.93801f, 12.5304f, 9.98935f, 12.6895f)
                lineTo(10.2424f, 13.4635f)
                curveTo(10.2971f, 13.6199f, 10.3992f, 13.7555f, 10.5344f, 13.8515f)
                close()
            }
        }.build()
        
        return _SparkleFilled!!
    }

private var _SparkleFilled: ImageVector? = null

