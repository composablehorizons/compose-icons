package com.composables.icons.radix

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Radix.EyeNone: ImageVector
    get() {
        if (_EyeNone != null) return _EyeNone!!
        
        _EyeNone = ImageVector.Builder(
            name = "eye-none",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 15f,
            viewportHeight = 15f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.6465f, 1.64651f)
                curveTo(12.8418f, 1.45125f, 13.1583f, 1.45125f, 13.3535f, 1.64651f)
                curveTo(13.5488f, 1.84177f, 13.5488f, 2.15828f, 13.3535f, 2.35354f)
                lineTo(11.6377f, 4.06838f)
                curveTo(12.9756f, 4.81468f, 14.0967f, 5.91192f, 14.9239f, 7.23537f)
                curveTo(15.0124f, 7.37719f, 15.0235f, 7.55204f, 14.9571f, 7.70217f)
                lineTo(14.9239f, 7.76467f)
                curveTo(13.3435f, 10.2933f, 10.6922f, 12f, 7.50002f, 12f)
                curveTo(6.36232f, 12f, 5.29371f, 11.7822f, 4.31741f, 11.3887f)
                lineTo(2.35354f, 13.3535f)
                curveTo(2.15828f, 13.5488f, 1.84177f, 13.5488f, 1.64651f, 13.3535f)
                curveTo(1.45125f, 13.1583f, 1.45125f, 12.8418f, 1.64651f, 12.6465f)
                lineTo(3.36135f, 10.9307f)
                curveTo(2.02399f, 10.1844f, 0.903113f, 9.08773f, 0.0761963f, 7.76467f)
                curveTo(-0.0249881f, 7.60262f, -0.0249956f, 7.39742f, 0.0761963f, 7.23537f)
                lineTo(0.227563f, 7.00002f)
                curveTo(1.82294f, 4.60124f, 4.4078f, 3.00002f, 7.50002f, 3.00002f)
                curveTo(8.63727f, 3.00002f, 9.70568f, 3.21714f, 10.6817f, 3.61037f)
                lineTo(12.6465f, 1.64651f)
                close()
                moveTo(5.09573f, 10.6104f)
                curveTo(5.84657f, 10.8632f, 6.65217f, 11f, 7.50002f, 11f)
                curveTo(10.1963f, 11f, 12.4661f, 9.62071f, 13.8994f, 7.50002f)
                curveTo(13.1227f, 6.35087f, 12.0992f, 5.42186f, 10.8965f, 4.80959f)
                lineTo(5.09573f, 10.6104f)
                close()
                moveTo(7.50002f, 4.00002f)
                curveTo(4.80354f, 4.00002f, 2.53299f, 5.37907f, 1.09963f, 7.50002f)
                curveTo(1.87617f, 8.64906f, 2.89999f, 9.57724f, 4.10256f, 10.1895f)
                lineTo(9.90335f, 4.3887f)
                curveTo(9.15289f, 4.13599f, 8.34748f, 4.00002f, 7.50002f, 4.00002f)
                close()
            }
        }.build()
        
        return _EyeNone!!
    }

private var _EyeNone: ImageVector? = null

