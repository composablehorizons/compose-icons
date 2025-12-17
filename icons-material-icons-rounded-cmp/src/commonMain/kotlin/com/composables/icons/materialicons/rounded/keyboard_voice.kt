package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Keyboard_voice: ImageVector
    get() {
        if (_Keyboard_voice != null) return _Keyboard_voice!!
        
        _Keyboard_voice = ImageVector.Builder(
            name = "keyboard_voice",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 15f)
                curveToRelative(1.66f, 0f, 2.99f, -1.34f, 2.99f, -3f)
                lineTo(15f, 6f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                reflectiveCurveTo(9f, 4.34f, 9f, 6f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveToRelative(6.08f, -3f)
                curveToRelative(-0.42f, 0f, -0.77f, 0.3f, -0.83f, 0.71f)
                curveToRelative(-0.37f, 2.61f, -2.72f, 4.39f, -5.25f, 4.39f)
                reflectiveCurveToRelative(-4.88f, -1.77f, -5.25f, -4.39f)
                curveToRelative(-0.06f, -0.41f, -0.42f, -0.71f, -0.83f, -0.71f)
                curveToRelative(-0.52f, 0f, -0.92f, 0.46f, -0.85f, 0.97f)
                curveToRelative(0.46f, 2.97f, 2.96f, 5.3f, 5.93f, 5.75f)
                verticalLineTo(21f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.28f)
                curveToRelative(2.96f, -0.43f, 5.47f, -2.78f, 5.93f, -5.75f)
                curveToRelative(0.07f, -0.51f, -0.33f, -0.97f, -0.85f, -0.97f)
                close()
            }
        }.build()
        
        return _Keyboard_voice!!
    }

private var _Keyboard_voice: ImageVector? = null

