package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Interpreter_mode: ImageVector
    get() {
        if (_Interpreter_mode != null) return _Interpreter_mode!!
        
        _Interpreter_mode = ImageVector.Builder(
            name = "interpreter_mode",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.5f, 16.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineTo(15f)
                curveTo(22f, 15.83f, 21.33f, 16.5f, 20.5f, 16.5f)
                close()
                moveTo(20.5f, 20f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -0.45f, 0f, -1.04f, 0f, -1.04f)
                curveToRelative(1.51f, -0.22f, 2.71f, -1.4f, 2.95f, -2.89f)
                curveTo(24f, 15.27f, 23.76f, 15f, 23.46f, 15f)
                curveToRelative(-0.24f, 0f, -0.45f, 0.17f, -0.49f, 0.41f)
                curveToRelative(-0.2f, 1.18f, -1.23f, 2.09f, -2.47f, 2.09f)
                reflectiveCurveToRelative(-2.27f, -0.9f, -2.47f, -2.09f)
                curveTo(17.99f, 15.17f, 17.78f, 15f, 17.54f, 15f)
                curveToRelative(-0.3f, 0f, -0.54f, 0.27f, -0.5f, 0.57f)
                curveToRelative(0.25f, 1.5f, 1.45f, 2.68f, 2.95f, 2.89f)
                curveToRelative(0f, 0f, 0f, 0.59f, 0f, 1.04f)
                curveTo(20f, 19.78f, 20.22f, 20f, 20.5f, 20f)
                close()
                moveTo(9f, 12f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                curveToRelative(0.47f, 0f, 0.92f, 0.08f, 1.34f, 0.23f)
                curveTo(9.5f, 5.26f, 9f, 6.57f, 9f, 8f)
                curveToRelative(0f, 1.43f, 0.5f, 2.74f, 1.34f, 3.77f)
                curveTo(9.92f, 11.92f, 9.47f, 12f, 9f, 12f)
                close()
                moveTo(7.11f, 13.13f)
                curveTo(5.79f, 14.05f, 5f, 15.57f, 5f, 17.22f)
                verticalLineTo(20f)
                horizontalLineTo(1f)
                verticalLineToRelative(-2.78f)
                curveToRelative(0f, -1.12f, 0.61f, -2.15f, 1.61f, -2.66f)
                curveTo(3.85f, 13.92f, 5.37f, 13.37f, 7.11f, 13.13f)
                close()
                moveTo(11f, 8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveTo(11f, 10.21f, 11f, 8f)
                close()
                moveTo(18.32f, 20f)
                curveToRelative(-1.67f, -0.81f, -2.82f, -2.52f, -2.82f, -4.5f)
                curveToRelative(0f, -0.89f, 0.23f, -1.73f, 0.64f, -2.45f)
                curveTo(15.77f, 13.02f, 15.39f, 13f, 15f, 13f)
                curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                curveTo(7.61f, 15.07f, 7f, 16.1f, 7f, 17.22f)
                verticalLineTo(20f)
                lineTo(18.32f, 20f)
                close()
            }
        }.build()
        
        return _Interpreter_mode!!
    }

private var _Interpreter_mode: ImageVector? = null

