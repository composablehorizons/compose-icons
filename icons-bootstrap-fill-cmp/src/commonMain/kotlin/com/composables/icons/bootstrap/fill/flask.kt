package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Flask: ImageVector
    get() {
        if (_Flask != null) return _Flask!!
        
        _Flask = ImageVector.Builder(
            name = "flask",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(11f)
                verticalLineToRelative(5.358f)
                lineToRelative(4.497f, 7.36f)
                curveToRelative(0.099f, 0.162f, 0.16f, 0.332f, 0.192f, 0.503f)
                lineToRelative(0.013f, 0.063f)
                lineToRelative(0.008f, 0.083f)
                quadToRelative(0.006f, 0.053f, 0.007f, 0.107f)
                lineToRelative(-0.003f, 0.09f)
                quadToRelative(-0.001f, 0.047f, -0.005f, 0.095f)
                quadToRelative(-0.006f, 0.053f, -0.017f, 0.106f)
                lineToRelative(-0.016f, 0.079f)
                quadToRelative(-0.012f, 0.049f, -0.028f, 0.096f)
                lineToRelative(-0.028f, 0.086f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.17f, 0.322f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.395f, 0.394f)
                quadToRelative(-0.04f, 0.028f, -0.082f, 0.054f)
                quadToRelative(-0.045f, 0.026f, -0.095f, 0.049f)
                lineToRelative(-0.073f, 0.035f)
                lineToRelative(-0.09f, 0.033f)
                quadToRelative(-0.05f, 0.02f, -0.103f, 0.034f)
                quadToRelative(-0.04f, 0.01f, -0.08f, 0.017f)
                quadToRelative(-0.053f, 0.012f, -0.108f, 0.021f)
                lineToRelative(-0.006f, 0.002f)
                lineToRelative(-0.202f, 0.013f)
                horizontalLineTo(1.783f)
                lineToRelative(-0.214f, -0.015f)
                arcToRelative(1.503f, 1.503f, 0f, false, true, -1.066f, -2.268f)
                lineTo(5f, 6.359f)
                verticalLineTo(1f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.499f, 0.499f, 0f, false, true, -0.354f, -0.854f)
                arcTo(0.5f, 0.5f, 0f, false, true, 4.5f, 0f)
                close()
                moveToRelative(0.5f, 12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.885f)
                lineToRelative(-0.61f, -1f)
                close()
                moveToRelative(-1f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.664f)
                lineToRelative(-0.612f, -1f)
                close()
                moveToRelative(-1f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.441f)
                lineToRelative(-0.61f, -1f)
                close()
                moveTo(9f, 6f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1.22f)
                lineToRelative(-0.147f, -0.24f)
                arcTo(0.5f, 0.5f, 0f, false, true, 10f, 6.5f)
                verticalLineTo(6f)
                close()
                moveToRelative(0f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineTo(4f)
                close()
                moveToRelative(0f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 1f)
                horizontalLineToRelative(1f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _Flask!!
    }

private var _Flask: ImageVector? = null

