package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignDeadEnd: ImageVector
    get() {
        if (_SignDeadEnd != null) return _SignDeadEnd!!
        
        _SignDeadEnd = ImageVector.Builder(
            name = "sign-dead-end",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.783f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.593f, 0f, 0.886f, -0.359f, 0.886f, -1.002f)
                reflectiveCurveTo(6.07f, 6f, 5.473f, 6f)
                close()
                moveToRelative(0.333f, 0.28f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.395f, 0f, 0.582f, 0.24f, 0.582f, 0.722f)
                curveToRelative(0f, 0.48f, -0.186f, 0.718f, -0.581f, 0.718f)
                horizontalLineToRelative(-0.321f)
                close()
                moveTo(7.82f, 7.72f)
                horizontalLineToRelative(-0.918f)
                verticalLineToRelative(-0.602f)
                horizontalLineToRelative(0.863f)
                verticalLineTo(6.85f)
                horizontalLineToRelative(-0.863f)
                verticalLineToRelative(-0.57f)
                horizontalLineToRelative(0.917f)
                verticalLineTo(6f)
                horizontalLineTo(6.571f)
                verticalLineToRelative(2f)
                horizontalLineTo(7.82f)
                close()
                moveToRelative(0.573f, -0.274f)
                lineTo(8.216f, 8f)
                horizontalLineToRelative(-0.34f)
                lineToRelative(0.688f, -2f)
                horizontalLineToRelative(0.371f)
                lineToRelative(0.689f, 2f)
                horizontalLineToRelative(-0.352f)
                lineToRelative(-0.177f, -0.554f)
                close()
                moveToRelative(0.627f, -0.255f)
                lineToRelative(-0.268f, -0.845f)
                horizontalLineToRelative(-0.015f)
                lineToRelative(-0.27f, 0.845f)
                close()
                moveTo(9.746f, 6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.593f, 0f, 0.886f, -0.359f, 0.886f, -1.002f)
                reflectiveCurveTo(11.032f, 6f, 10.436f, 6f)
                close()
                moveToRelative(0.333f, 0.28f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.394f, 0f, 0.582f, 0.24f, 0.582f, 0.722f)
                curveToRelative(0f, 0.48f, -0.186f, 0.718f, -0.582f, 0.718f)
                horizontalLineToRelative(-0.32f)
                close()
                moveToRelative(-4.173f, 4.44f)
                horizontalLineToRelative(0.917f)
                verticalLineTo(11f)
                horizontalLineTo(5.575f)
                verticalLineTo(9f)
                horizontalLineToRelative(1.248f)
                verticalLineToRelative(0.28f)
                horizontalLineToRelative(-0.917f)
                verticalLineToRelative(0.57f)
                horizontalLineToRelative(0.863f)
                verticalLineToRelative(0.268f)
                horizontalLineToRelative(-0.863f)
                close()
                moveToRelative(1.489f, 0.28f)
                verticalLineTo(9.56f)
                horizontalLineToRelative(0.013f)
                lineTo(8.344f, 11f)
                horizontalLineToRelative(0.292f)
                verticalLineTo(9f)
                horizontalLineToRelative(-0.32f)
                verticalLineToRelative(1.436f)
                horizontalLineToRelative(-0.014f)
                lineTo(7.369f, 9f)
                horizontalLineToRelative(-0.293f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(1.56f, 0f)
                verticalLineTo(9f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.596f, 0f, 0.886f, 0.355f, 0.886f, 0.998f)
                reflectiveCurveTo(10.238f, 11f, 9.645f, 11f)
                close()
                moveToRelative(0.653f, -1.72f)
                horizontalLineToRelative(-0.32f)
                verticalLineToRelative(1.44f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.395f, 0f, 0.581f, -0.239f, 0.581f, -0.718f)
                curveToRelative(0f, -0.481f, -0.187f, -0.722f, -0.581f, -0.722f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.05f, 0.435f)
                curveToRelative(-0.58f, -0.58f, -1.52f, -0.58f, -2.1f, 0f)
                lineTo(0.436f, 6.95f)
                curveToRelative(-0.58f, 0.58f, -0.58f, 1.519f, 0f, 2.098f)
                lineToRelative(6.516f, 6.516f)
                curveToRelative(0.58f, 0.58f, 1.519f, 0.58f, 2.098f, 0f)
                lineToRelative(6.516f, -6.516f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.519f, 0f, -2.098f)
                close()
                moveToRelative(-1.4f, 0.7f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0.7f, 0f)
                lineToRelative(6.516f, 6.515f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0f, 0.7f)
                lineTo(8.35f, 14.866f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, -0.7f, 0f)
                lineTo(1.134f, 8.35f)
                arcToRelative(0.495f, 0.495f, 0f, false, true, 0f, -0.7f)
                lineTo(7.65f, 1.134f)
                close()
            }
        }.build()
        
        return _SignDeadEnd!!
    }

private var _SignDeadEnd: ImageVector? = null

