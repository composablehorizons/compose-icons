package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.HandThumbsUp: ImageVector
    get() {
        if (_HandThumbsUp != null) return _HandThumbsUp!!
        
        _HandThumbsUp = ImageVector.Builder(
            name = "hand-thumbs-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.956f, 1.745f)
                curveTo(7.021f, 0.81f, 7.908f, 0.087f, 8.864f, 0.325f)
                lineToRelative(0.261f, 0.066f)
                curveToRelative(0.463f, 0.116f, 0.874f, 0.456f, 1.012f, 0.965f)
                curveToRelative(0.22f, 0.816f, 0.533f, 2.511f, 0.062f, 4.51f)
                arcToRelative(10f, 10f, 0f, false, true, 0.443f, -0.051f)
                curveToRelative(0.713f, -0.065f, 1.669f, -0.072f, 2.516f, 0.21f)
                curveToRelative(0.518f, 0.173f, 0.994f, 0.681f, 1.2f, 1.273f)
                curveToRelative(0.184f, 0.532f, 0.16f, 1.162f, -0.234f, 1.733f)
                quadToRelative(0.086f, 0.18f, 0.138f, 0.363f)
                curveToRelative(0.077f, 0.27f, 0.113f, 0.567f, 0.113f, 0.856f)
                reflectiveCurveToRelative(-0.036f, 0.586f, -0.113f, 0.856f)
                curveToRelative(-0.039f, 0.135f, -0.09f, 0.273f, -0.16f, 0.404f)
                curveToRelative(0.169f, 0.387f, 0.107f, 0.819f, -0.003f, 1.148f)
                arcToRelative(3.2f, 3.2f, 0f, false, true, -0.488f, 0.901f)
                curveToRelative(0.054f, 0.152f, 0.076f, 0.312f, 0.076f, 0.465f)
                curveToRelative(0f, 0.305f, -0.089f, 0.625f, -0.253f, 0.912f)
                curveTo(13.1f, 15.522f, 12.437f, 16f, 11.5f, 16f)
                horizontalLineTo(8f)
                curveToRelative(-0.605f, 0f, -1.07f, -0.081f, -1.466f, -0.218f)
                arcToRelative(4.8f, 4.8f, 0f, false, true, -0.97f, -0.484f)
                lineToRelative(-0.048f, -0.03f)
                curveToRelative(-0.504f, -0.307f, -0.999f, -0.609f, -2.068f, -0.722f)
                curveTo(2.682f, 14.464f, 2f, 13.846f, 2f, 13f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.85f, 0.685f, -1.432f, 1.357f, -1.615f)
                curveToRelative(0.849f, -0.232f, 1.574f, -0.787f, 2.132f, -1.41f)
                curveToRelative(0.56f, -0.627f, 0.914f, -1.28f, 1.039f, -1.639f)
                curveToRelative(0.199f, -0.575f, 0.356f, -1.539f, 0.428f, -2.59f)
                close()
            }
        }.build()
        
        return _HandThumbsUp!!
    }

private var _HandThumbsUp: ImageVector? = null

