package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Interpreter_mode: ImageVector
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
                moveTo(20f, 20f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, 0f, 0f, -1.54f, 0f, -1.54f)
                curveToRelative(1.69f, -0.24f, 3f, -1.7f, 3f, -3.46f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveTo(18f, 16.38f, 18f, 15f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 1.76f, 1.31f, 3.22f, 3f, 3.46f)
                curveTo(20f, 18.46f, 20f, 20f, 20f, 20f)
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

