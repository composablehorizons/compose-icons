package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EnvelopeAt: ImageVector
    get() {
        if (_EnvelopeAt != null) return _EnvelopeAt!!
        
        _EnvelopeAt = ImageVector.Builder(
            name = "envelope-at",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 2f)
                arcTo(2f, 2f, 0f, false, false, 0.05f, 3.555f)
                lineTo(8f, 8.414f)
                lineToRelative(7.95f, -4.859f)
                arcTo(2f, 2f, 0f, false, false, 14f, 2f)
                close()
                moveToRelative(-2f, 9.8f)
                verticalLineTo(4.698f)
                lineToRelative(5.803f, 3.546f)
                close()
                moveToRelative(6.761f, -2.97f)
                lineToRelative(-6.57f, 4.026f)
                arcTo(2f, 2f, 0f, false, false, 2f, 14f)
                horizontalLineToRelative(6.256f)
                arcTo(4.5f, 4.5f, 0f, false, true, 8f, 12.5f)
                arcToRelative(4.49f, 4.49f, 0f, false, true, 1.606f, -3.446f)
                lineToRelative(-0.367f, -0.225f)
                lineTo(8f, 9.586f)
                close()
                moveTo(16f, 9.671f)
                verticalLineTo(4.697f)
                lineToRelative(-5.803f, 3.546f)
                lineToRelative(0.338f, 0.208f)
                arcTo(4.5f, 4.5f, 0f, false, true, 12.5f, 8f)
                curveToRelative(1.414f, 0f, 2.675f, 0.652f, 3.5f, 1.671f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.834f, 12.244f)
                curveToRelative(0f, 1.168f, -0.577f, 2.025f, -1.587f, 2.025f)
                curveToRelative(-0.503f, 0f, -1.002f, -0.228f, -1.12f, -0.648f)
                horizontalLineToRelative(-0.043f)
                curveToRelative(-0.118f, 0.416f, -0.543f, 0.643f, -1.015f, 0.643f)
                curveToRelative(-0.77f, 0f, -1.259f, -0.542f, -1.259f, -1.434f)
                verticalLineToRelative(-0.529f)
                curveToRelative(0f, -0.844f, 0.481f, -1.4f, 1.26f, -1.4f)
                curveToRelative(0.585f, 0f, 0.87f, 0.333f, 0.953f, 0.63f)
                horizontalLineToRelative(0.03f)
                verticalLineToRelative(-0.568f)
                horizontalLineToRelative(0.905f)
                verticalLineToRelative(2.19f)
                curveToRelative(0f, 0.272f, 0.18f, 0.42f, 0.411f, 0.42f)
                curveToRelative(0.315f, 0f, 0.639f, -0.415f, 0.639f, -1.39f)
                verticalLineToRelative(-0.118f)
                curveToRelative(0f, -1.277f, -0.95f, -2.326f, -2.484f, -2.326f)
                horizontalLineToRelative(-0.04f)
                curveToRelative(-1.582f, 0f, -2.64f, 1.067f, -2.64f, 2.724f)
                verticalLineToRelative(0.157f)
                curveToRelative(0f, 1.867f, 1.237f, 2.654f, 2.57f, 2.654f)
                horizontalLineToRelative(0.045f)
                curveToRelative(0.507f, 0f, 0.935f, -0.07f, 1.18f, -0.18f)
                verticalLineToRelative(0.731f)
                curveToRelative(-0.219f, 0.1f, -0.643f, 0.175f, -1.237f, 0.175f)
                horizontalLineToRelative(-0.044f)
                curveTo(10.438f, 16f, 9f, 14.82f, 9f, 12.646f)
                verticalLineToRelative(-0.214f)
                curveTo(9f, 10.36f, 10.421f, 9f, 12.485f, 9f)
                horizontalLineToRelative(0.035f)
                curveToRelative(2.12f, 0f, 3.314f, 1.43f, 3.314f, 3.034f)
                close()
                moveToRelative(-4.04f, 0.21f)
                verticalLineToRelative(0.227f)
                curveToRelative(0f, 0.586f, 0.227f, 0.8f, 0.581f, 0.8f)
                curveToRelative(0.31f, 0f, 0.564f, -0.17f, 0.564f, -0.743f)
                verticalLineToRelative(-0.367f)
                curveToRelative(0f, -0.516f, -0.275f, -0.708f, -0.572f, -0.708f)
                curveToRelative(-0.346f, 0f, -0.573f, 0.245f, -0.573f, 0.791f)
            }
        }.build()
        
        return _EnvelopeAt!!
    }

private var _EnvelopeAt: ImageVector? = null

