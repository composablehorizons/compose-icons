package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Server: ImageVector
    get() {
        if (_Server != null) return _Server!!
        
        _Server = ImageVector.Builder(
            name = "server",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.333f, 2.667f)
                curveTo(1.333f, 1.194f, 4.318f, 0f, 8f, 0f)
                reflectiveCurveToRelative(6.667f, 1.194f, 6.667f, 2.667f)
                verticalLineTo(4f)
                curveToRelative(0f, 1.473f, -2.985f, 2.667f, -6.667f, 2.667f)
                reflectiveCurveTo(1.333f, 5.473f, 1.333f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.333f, 6.334f)
                verticalLineToRelative(3f)
                curveTo(1.333f, 10.805f, 4.318f, 12f, 8f, 12f)
                reflectiveCurveToRelative(6.667f, -1.194f, 6.667f, -2.667f)
                verticalLineTo(6.334f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -1.458f, 0.79f)
                curveTo(11.81f, 7.684f, 9.967f, 8f, 8f, 8f)
                reflectiveCurveToRelative(-3.809f, -0.317f, -5.208f, -0.876f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -1.458f, -0.79f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.667f, 11.668f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -1.458f, 0.789f)
                curveToRelative(-1.4f, 0.56f, -3.242f, 0.876f, -5.21f, 0.876f)
                curveToRelative(-1.966f, 0f, -3.809f, -0.316f, -5.208f, -0.876f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, -1.458f, -0.79f)
                verticalLineToRelative(1.666f)
                curveTo(1.333f, 14.806f, 4.318f, 16f, 8f, 16f)
                reflectiveCurveToRelative(6.667f, -1.194f, 6.667f, -2.667f)
                close()
            }
        }.build()
        
        return _Server!!
    }

private var _Server: ImageVector? = null

