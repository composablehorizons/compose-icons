package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.PaintBucket: ImageVector
    get() {
        if (_PaintBucket != null) return _PaintBucket!!
        
        _PaintBucket = ImageVector.Builder(
            name = "paint-bucket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.192f, 2.78f)
                curveToRelative(-0.458f, -0.677f, -0.927f, -1.248f, -1.35f, -1.643f)
                arcToRelative(3f, 3f, 0f, false, false, -0.71f, -0.515f)
                curveToRelative(-0.217f, -0.104f, -0.56f, -0.205f, -0.882f, -0.02f)
                curveToRelative(-0.367f, 0.213f, -0.427f, 0.63f, -0.43f, 0.896f)
                curveToRelative(-0.003f, 0.304f, 0.064f, 0.664f, 0.173f, 1.044f)
                curveToRelative(0.196f, 0.687f, 0.556f, 1.528f, 1.035f, 2.402f)
                lineTo(0.752f, 8.22f)
                curveToRelative(-0.277f, 0.277f, -0.269f, 0.656f, -0.218f, 0.918f)
                curveToRelative(0.055f, 0.283f, 0.187f, 0.593f, 0.36f, 0.903f)
                curveToRelative(0.348f, 0.627f, 0.92f, 1.361f, 1.626f, 2.068f)
                curveToRelative(0.707f, 0.707f, 1.441f, 1.278f, 2.068f, 1.626f)
                curveToRelative(0.31f, 0.173f, 0.62f, 0.305f, 0.903f, 0.36f)
                curveToRelative(0.262f, 0.05f, 0.64f, 0.059f, 0.918f, -0.218f)
                lineToRelative(5.615f, -5.615f)
                curveToRelative(0.118f, 0.257f, 0.092f, 0.512f, 0.05f, 0.939f)
                curveToRelative(-0.03f, 0.292f, -0.068f, 0.665f, -0.073f, 1.176f)
                verticalLineToRelative(0.123f)
                horizontalLineToRelative(0.003f)
                arcToRelative(1f, 1f, 0f, false, false, 1.993f, 0f)
                horizontalLineTo(14f)
                verticalLineToRelative(-0.057f)
                arcToRelative(1f, 1f, 0f, false, false, -0.004f, -0.117f)
                curveToRelative(-0.055f, -1.25f, -0.7f, -2.738f, -1.86f, -3.494f)
                arcToRelative(4f, 4f, 0f, false, false, -0.211f, -0.434f)
                curveToRelative(-0.349f, -0.626f, -0.92f, -1.36f, -1.627f, -2.067f)
                reflectiveCurveTo(8.857f, 3.052f, 8.23f, 2.704f)
                curveToRelative(-0.31f, -0.172f, -0.62f, -0.304f, -0.903f, -0.36f)
                curveToRelative(-0.262f, -0.05f, -0.64f, -0.058f, -0.918f, 0.219f)
                close()
                moveTo(4.16f, 1.867f)
                curveToRelative(0.381f, 0.356f, 0.844f, 0.922f, 1.311f, 1.632f)
                lineToRelative(-0.704f, 0.705f)
                curveToRelative(-0.382f, -0.727f, -0.66f, -1.402f, -0.813f, -1.938f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, -0.131f, -0.673f)
                quadToRelative(0.137f, 0.09f, 0.337f, 0.274f)
                moveToRelative(0.394f, 3.965f)
                curveToRelative(0.54f, 0.852f, 1.107f, 1.567f, 1.607f, 2.033f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, 0.682f, -0.732f)
                curveToRelative(-0.453f, -0.422f, -1.017f, -1.136f, -1.564f, -2.027f)
                lineToRelative(1.088f, -1.088f)
                quadToRelative(0.081f, 0.181f, 0.183f, 0.365f)
                curveToRelative(0.349f, 0.627f, 0.92f, 1.361f, 1.627f, 2.068f)
                curveToRelative(0.706f, 0.707f, 1.44f, 1.278f, 2.068f, 1.626f)
                quadToRelative(0.183f, 0.103f, 0.365f, 0.183f)
                lineToRelative(-4.861f, 4.862f)
                lineToRelative(-0.068f, -0.01f)
                curveToRelative(-0.137f, -0.027f, -0.342f, -0.104f, -0.608f, -0.252f)
                curveToRelative(-0.524f, -0.292f, -1.186f, -0.8f, -1.846f, -1.46f)
                reflectiveCurveToRelative(-1.168f, -1.32f, -1.46f, -1.846f)
                curveToRelative(-0.147f, -0.265f, -0.225f, -0.47f, -0.251f, -0.607f)
                lineToRelative(-0.01f, -0.068f)
                close()
                moveToRelative(2.87f, -1.935f)
                arcToRelative(2.4f, 2.4f, 0f, false, true, -0.241f, -0.561f)
                curveToRelative(0.135f, 0.033f, 0.324f, 0.11f, 0.562f, 0.241f)
                curveToRelative(0.524f, 0.292f, 1.186f, 0.8f, 1.846f, 1.46f)
                curveToRelative(0.45f, 0.45f, 0.83f, 0.901f, 1.118f, 1.31f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -1.066f, 0.091f)
                arcToRelative(11f, 11f, 0f, false, true, -0.76f, -0.694f)
                curveToRelative(-0.66f, -0.66f, -1.167f, -1.322f, -1.458f, -1.847f)
                close()
            }
        }.build()
        
        return _PaintBucket!!
    }

private var _PaintBucket: ImageVector? = null

