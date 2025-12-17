package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.CloudUpload: ImageVector
    get() {
        if (_CloudUpload != null) return _CloudUpload!!
        
        _CloudUpload = ImageVector.Builder(
            name = "cloud-upload",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 3f)
                curveTo(6.34315f, 3f, 5f, 4.34315f, 5f, 6f)
                curveTo(5f, 6.27614f, 4.77614f, 6.5f, 4.5f, 6.5f)
                horizontalLineTo(4.25f)
                curveTo(3.00736f, 6.5f, 2f, 7.50736f, 2f, 8.75f)
                curveTo(2f, 9.99264f, 3.00736f, 11f, 4.25f, 11f)
                horizontalLineTo(5.02242f)
                curveTo(5.05337f, 11.3434f, 5.11588f, 11.6777f, 5.20703f, 12f)
                horizontalLineTo(4.25f)
                curveTo(2.45507f, 12f, 1f, 10.5449f, 1f, 8.75f)
                curveTo(1f, 7.029f, 2.33769f, 5.62043f, 4.03004f, 5.50733f)
                curveTo(4.27283f, 3.53062f, 5.95767f, 2f, 8f, 2f)
                curveTo(9.92958f, 2f, 11.54f, 3.36628f, 11.9167f, 5.1842f)
                curveTo(11.5678f, 5.09145f, 11.2053f, 5.03214f, 10.8328f, 5.0099f)
                curveTo(10.4237f, 3.83954f, 9.30992f, 3f, 8f, 3f)
                close()
                moveTo(15f, 10.5f)
                curveTo(15f, 12.9853f, 12.9853f, 15f, 10.5f, 15f)
                curveTo(8.01472f, 15f, 6f, 12.9853f, 6f, 10.5f)
                curveTo(6f, 8.01472f, 8.01472f, 6f, 10.5f, 6f)
                curveTo(12.9853f, 6f, 15f, 8.01472f, 15f, 10.5f)
                close()
                moveTo(10.146f, 8.14684f)
                lineTo(8.14645f, 10.1464f)
                curveTo(7.95118f, 10.3417f, 7.95118f, 10.6583f, 8.14645f, 10.8536f)
                curveTo(8.34171f, 11.0488f, 8.65829f, 11.0488f, 8.85355f, 10.8536f)
                lineTo(10f, 9.70711f)
                verticalLineTo(13f)
                curveTo(10f, 13.2761f, 10.2239f, 13.5f, 10.5f, 13.5f)
                curveTo(10.7761f, 13.5f, 11f, 13.2761f, 11f, 13f)
                verticalLineTo(9.70711f)
                lineTo(12.1464f, 10.8536f)
                curveTo(12.3417f, 11.0488f, 12.6583f, 11.0488f, 12.8536f, 10.8536f)
                curveTo(13.0488f, 10.6583f, 13.0488f, 10.3417f, 12.8536f, 10.1464f)
                lineTo(10.8536f, 8.14645f)
                curveTo(10.8056f, 8.09851f, 10.7504f, 8.06234f, 10.6914f, 8.03794f)
                curveTo(10.6333f, 8.01385f, 10.5697f, 8.0004f, 10.503f, 8.00001f)
                lineTo(10.5f, 8f)
                lineTo(10.497f, 8.00001f)
                curveTo(10.4303f, 8.0004f, 10.3667f, 8.01385f, 10.3086f, 8.03794f)
                curveTo(10.2505f, 8.06198f, 10.196f, 8.09744f, 10.1486f, 8.14433f)
                lineTo(10.146f, 8.14684f)
                close()
            }
        }.build()
        
        return _CloudUpload!!
    }

private var _CloudUpload: ImageVector? = null

