package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.GlobeAlt: ImageVector
    get() {
        if (_GlobeAlt != null) return _GlobeAlt!!
        
        _GlobeAlt = ImageVector.Builder(
            name = "globe-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.757f, 4.5f)
                curveToRelative(0.18f, 0.217f, 0.376f, 0.42f, 0.586f, 0.608f)
                curveToRelative(0.153f, -0.61f, 0.354f, -1.175f, 0.596f, -1.678f)
                arcTo(5.53f, 5.53f, 0f, false, false, 3.757f, 4.5f)
                close()
                moveTo(8f, 1f)
                arcToRelative(6.994f, 6.994f, 0f, false, false, -7f, 7f)
                arcToRelative(7f, 7f, 0f, true, false, 7f, -7f)
                close()
                moveToRelative(0f, 1.5f)
                curveToRelative(-0.476f, 0f, -1.091f, 0.386f, -1.633f, 1.427f)
                curveToRelative(-0.293f, 0.564f, -0.531f, 1.267f, -0.683f, 2.063f)
                arcTo(5.48f, 5.48f, 0f, false, false, 8f, 6.5f)
                arcToRelative(5.48f, 5.48f, 0f, false, false, 2.316f, -0.51f)
                curveToRelative(-0.152f, -0.796f, -0.39f, -1.499f, -0.683f, -2.063f)
                curveTo(9.09f, 2.886f, 8.476f, 2.5f, 8f, 2.5f)
                close()
                moveToRelative(3.657f, 2.608f)
                arcToRelative(8.823f, 8.823f, 0f, false, false, -0.596f, -1.678f)
                curveToRelative(0.444f, 0.298f, 0.842f, 0.659f, 1.182f, 1.07f)
                curveToRelative(-0.18f, 0.217f, -0.376f, 0.42f, -0.586f, 0.608f)
                close()
                moveToRelative(-1.166f, 2.436f)
                arcTo(6.983f, 6.983f, 0f, false, true, 8f, 8f)
                arcToRelative(6.983f, 6.983f, 0f, false, true, -2.49f, -0.456f)
                arcToRelative(10.703f, 10.703f, 0f, false, false, 0.202f, 2.6f)
                curveToRelative(0.72f, 0.231f, 1.49f, 0.356f, 2.288f, 0.356f)
                curveToRelative(0.798f, 0f, 1.568f, -0.125f, 2.29f, -0.356f)
                arcToRelative(10.705f, 10.705f, 0f, false, false, 0.2f, -2.6f)
                close()
                moveToRelative(1.433f, 1.85f)
                arcToRelative(12.652f, 12.652f, 0f, false, false, 0.018f, -2.609f)
                curveToRelative(0.405f, -0.276f, 0.78f, -0.594f, 1.117f, -0.947f)
                arcToRelative(5.48f, 5.48f, 0f, false, true, 0.44f, 2.262f)
                arcToRelative(7.536f, 7.536f, 0f, false, true, -1.575f, 1.293f)
                close()
                moveToRelative(-2.172f, 2.435f)
                arcToRelative(9.046f, 9.046f, 0f, false, true, -3.504f, 0f)
                curveToRelative(0.039f, 0.084f, 0.078f, 0.166f, 0.12f, 0.244f)
                curveTo(6.907f, 13.114f, 7.523f, 13.5f, 8f, 13.5f)
                reflectiveCurveToRelative(1.091f, -0.386f, 1.633f, -1.427f)
                curveToRelative(0.04f, -0.078f, 0.08f, -0.16f, 0.12f, -0.244f)
                close()
                moveToRelative(1.31f, 0.74f)
                arcToRelative(8.5f, 8.5f, 0f, false, false, 0.492f, -1.298f)
                curveToRelative(0.457f, -0.197f, 0.893f, -0.43f, 1.307f, -0.696f)
                arcToRelative(5.526f, 5.526f, 0f, false, true, -1.8f, 1.995f)
                close()
                moveToRelative(-6.123f, 0f)
                arcToRelative(8.507f, 8.507f, 0f, false, true, -0.493f, -1.298f)
                arcToRelative(8.985f, 8.985f, 0f, false, true, -1.307f, -0.696f)
                arcToRelative(5.526f, 5.526f, 0f, false, false, 1.8f, 1.995f)
                close()
                moveTo(2.5f, 8.1f)
                curveToRelative(0.463f, 0.5f, 0.993f, 0.935f, 1.575f, 1.293f)
                arcToRelative(12.652f, 12.652f, 0f, false, true, -0.018f, -2.608f)
                arcToRelative(7.037f, 7.037f, 0f, false, true, -1.117f, -0.947f)
                arcToRelative(5.48f, 5.48f, 0f, false, false, -0.44f, 2.262f)
                close()
            }
        }.build()
        
        return _GlobeAlt!!
    }

private var _GlobeAlt: ImageVector? = null

