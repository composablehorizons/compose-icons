package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Speedometer2: ImageVector
    get() {
        if (_Speedometer2 != null) return _Speedometer2!!
        
        _Speedometer2 = ImageVector.Builder(
            name = "speedometer2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineTo(6f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(4.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 4f)
                moveTo(3.732f, 5.732f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.707f, 0f)
                lineToRelative(0.915f, 0.914f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.708f, 0.708f)
                lineToRelative(-0.914f, -0.915f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.707f)
                moveTo(2f, 10f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.586f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(2.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 2f, 10f)
                moveToRelative(9.5f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                horizontalLineTo(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.5f, -0.5f)
                moveToRelative(0.754f, -4.246f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.527f, -0.02f)
                lineTo(7.547f, 9.31f)
                arcToRelative(0.91f, 0.91f, 0f, true, false, 1.302f, 1.258f)
                lineToRelative(3.434f, -4.297f)
                arcToRelative(0.39f, 0.39f, 0f, false, false, -0.029f, -0.518f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, 15.547f, 2.661f)
                curveToRelative(-0.442f, 1.253f, -1.845f, 1.602f, -2.932f, 1.25f)
                curveTo(11.309f, 13.488f, 9.475f, 13f, 8f, 13f)
                curveToRelative(-1.474f, 0f, -3.31f, 0.488f, -4.615f, 0.911f)
                curveToRelative(-1.087f, 0.352f, -2.49f, 0.003f, -2.932f, -1.25f)
                arcTo(8f, 8f, 0f, false, true, 0f, 10f)
                moveToRelative(8f, -7f)
                arcToRelative(7f, 7f, 0f, false, false, -6.603f, 9.329f)
                curveToRelative(0.203f, 0.575f, 0.923f, 0.876f, 1.68f, 0.63f)
                curveTo(4.397f, 12.533f, 6.358f, 12f, 8f, 12f)
                reflectiveCurveToRelative(3.604f, 0.532f, 4.923f, 0.96f)
                curveToRelative(0.757f, 0.245f, 1.477f, -0.056f, 1.68f, -0.631f)
                arcTo(7f, 7f, 0f, false, false, 8f, 3f)
            }
        }.build()
        
        return _Speedometer2!!
    }

private var _Speedometer2: ImageVector? = null

