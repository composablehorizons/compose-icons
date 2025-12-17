package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Hourglass: ImageVector
    get() {
        if (_Hourglass != null) return _Hourglass!!
        
        _Hourglass = ImageVector.Builder(
            name = "hourglass",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 48f)
                horizontalLineToRelative(4f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineTo(12f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineTo(12f)
                curveTo(5.373f, 0f, 0f, 5.373f, 0f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(4f)
                curveToRelative(0f, 80.564f, 32.188f, 165.807f, 97.18f, 208f)
                curveTo(47.899f, 298.381f, 16f, 383.9f, 16f, 464f)
                horizontalLineToRelative(-4f)
                curveToRelative(-6.627f, 0f, -12f, 5.373f, -12f, 12f)
                verticalLineToRelative(24f)
                curveToRelative(0f, 6.627f, 5.373f, 12f, 12f, 12f)
                horizontalLineToRelative(360f)
                curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -6.627f, -5.373f, -12f, -12f, -12f)
                horizontalLineToRelative(-4f)
                curveToRelative(0f, -80.564f, -32.188f, -165.807f, -97.18f, -208f)
                curveTo(336.102f, 213.619f, 368f, 128.1f, 368f, 48f)
                close()
                moveTo(64f, 48f)
                horizontalLineToRelative(256f)
                curveToRelative(0f, 101.62f, -57.307f, 184f, -128f, 184f)
                reflectiveCurveTo(64f, 149.621f, 64f, 48f)
                close()
                moveToRelative(256f, 416f)
                horizontalLineTo(64f)
                curveToRelative(0f, -101.62f, 57.308f, -184f, 128f, -184f)
                reflectiveCurveToRelative(128f, 82.38f, 128f, 184f)
                close()
            }
        }.build()
        
        return _Hourglass!!
    }

private var _Hourglass: ImageVector? = null

