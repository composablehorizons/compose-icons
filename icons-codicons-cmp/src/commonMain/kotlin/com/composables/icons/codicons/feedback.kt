package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Feedback: ImageVector
    get() {
        if (_Feedback != null) return _Feedback!!
        
        _Feedback = ImageVector.Builder(
            name = "feedback",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 1f)
                curveTo(8.67157f, 1f, 8f, 1.67157f, 8f, 2.5f)
                verticalLineTo(4.5f)
                curveTo(8f, 5.15293f, 8.41717f, 5.70842f, 8.99951f, 5.91447f)
                verticalLineTo(7f)
                curveTo(8.99951f, 7.19401f, 9.11174f, 7.3705f, 9.28743f, 7.45279f)
                curveTo(9.46313f, 7.53508f, 9.67056f, 7.50831f, 9.8196f, 7.38411f)
                lineTo(11.4805f, 6f)
                horizontalLineTo(13.5f)
                curveTo(14.3284f, 6f, 15f, 5.32843f, 15f, 4.5f)
                verticalLineTo(2.5f)
                curveTo(15f, 1.67157f, 14.3284f, 1f, 13.5f, 1f)
                horizontalLineTo(9.5f)
                close()
                moveTo(9f, 2.5f)
                curveTo(9f, 2.22386f, 9.22386f, 2f, 9.5f, 2f)
                horizontalLineTo(13.5f)
                curveTo(13.7761f, 2f, 14f, 2.22386f, 14f, 2.5f)
                verticalLineTo(4.5f)
                curveTo(14f, 4.77614f, 13.7761f, 5f, 13.5f, 5f)
                horizontalLineTo(11.2995f)
                curveTo(11.1825f, 5f, 11.0693f, 5.04101f, 10.9794f, 5.11589f)
                lineTo(9.99951f, 5.93248f)
                verticalLineTo(5.5f)
                curveTo(9.99951f, 5.22395f, 9.7758f, 5.00013f, 9.49975f, 5f)
                curveTo(9.22373f, 4.99987f, 9f, 4.77606f, 9f, 4.5f)
                verticalLineTo(2.5f)
                close()
                moveTo(3f, 6f)
                curveTo(3f, 4.89543f, 3.89543f, 4f, 5f, 4f)
                curveTo(6.10457f, 4f, 7f, 4.89543f, 7f, 6f)
                curveTo(7f, 7.10457f, 6.10457f, 8f, 5f, 8f)
                curveTo(3.89543f, 8f, 3f, 7.10457f, 3f, 6f)
                close()
                moveTo(5f, 5f)
                curveTo(4.44772f, 5f, 4f, 5.44772f, 4f, 6f)
                curveTo(4f, 6.55228f, 4.44772f, 7f, 5f, 7f)
                curveTo(5.55228f, 7f, 6f, 6.55228f, 6f, 6f)
                curveTo(6f, 5.44772f, 5.55228f, 5f, 5f, 5f)
                close()
                moveTo(2.49998f, 9f)
                lineTo(7.5f, 9f)
                curveTo(8.32843f, 9f, 9f, 9.67157f, 9f, 10.5f)
                curveTo(9f, 11.6161f, 8.54103f, 12.5103f, 7.78785f, 13.1148f)
                curveTo(7.04658f, 13.7098f, 6.05308f, 14f, 5f, 14f)
                curveTo(3.94692f, 14f, 2.95342f, 13.7098f, 2.21215f, 13.1148f)
                curveTo(1.45897f, 12.5103f, 1f, 11.6161f, 1f, 10.5f)
                curveTo(1f, 9.67161f, 1.67156f, 9f, 2.49998f, 9f)
                close()
                moveTo(7.5f, 10f)
                lineTo(2.49998f, 10f)
                curveTo(2.22387f, 10f, 2f, 10.2239f, 2f, 10.5f)
                curveTo(2f, 11.3169f, 2.32453f, 11.9227f, 2.8381f, 12.3349f)
                curveTo(3.36358f, 12.7567f, 4.12008f, 13f, 5f, 13f)
                curveTo(5.87992f, 13f, 6.63642f, 12.7567f, 7.1619f, 12.3349f)
                curveTo(7.67547f, 11.9227f, 8f, 11.3169f, 8f, 10.5f)
                curveTo(8f, 10.2239f, 7.77614f, 10f, 7.5f, 10f)
                close()
            }
        }.build()
        
        return _Feedback!!
    }

private var _Feedback: ImageVector? = null

