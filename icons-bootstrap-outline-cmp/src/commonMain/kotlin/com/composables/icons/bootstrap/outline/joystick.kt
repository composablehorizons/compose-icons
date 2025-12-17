package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Joystick: ImageVector
    get() {
        if (_Joystick != null) return _Joystick!!
        
        _Joystick = ImageVector.Builder(
            name = "joystick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.5f, 1.937f)
                verticalLineToRelative(5.087f)
                curveToRelative(0.863f, 0.083f, 1.5f, 0.377f, 1.5f, 0.726f)
                curveToRelative(0f, 0.414f, -0.895f, 0.75f, -2f, 0.75f)
                reflectiveCurveToRelative(-2f, -0.336f, -2f, -0.75f)
                curveToRelative(0f, -0.35f, 0.637f, -0.643f, 1.5f, -0.726f)
                verticalLineTo(3.937f)
                arcTo(2f, 2f, 0f, true, true, 10f, 2f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 9.665f)
                verticalLineToRelative(1.717f)
                arcToRelative(1f, 1f, 0f, false, false, 0.553f, 0.894f)
                lineToRelative(6.553f, 3.277f)
                arcToRelative(2f, 2f, 0f, false, false, 1.788f, 0f)
                lineToRelative(6.553f, -3.277f)
                arcToRelative(1f, 1f, 0f, false, false, 0.553f, -0.894f)
                verticalLineTo(9.665f)
                curveToRelative(0f, -0.1f, -0.06f, -0.19f, -0.152f, -0.23f)
                lineTo(9.5f, 6.715f)
                verticalLineToRelative(0.993f)
                lineToRelative(5.227f, 2.178f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0.001f, 0.23f)
                lineToRelative(-5.94f, 2.546f)
                arcToRelative(2f, 2f, 0f, false, true, -1.576f, 0f)
                lineToRelative(-5.94f, -2.546f)
                arcToRelative(0.125f, 0.125f, 0f, false, true, 0.001f, -0.23f)
                lineTo(6.5f, 7.708f)
                lineToRelative(-0.013f, -0.988f)
                lineTo(0.152f, 9.435f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.152f, 0.23f)
            }
        }.build()
        
        return _Joystick!!
    }

private var _Joystick: ImageVector? = null

