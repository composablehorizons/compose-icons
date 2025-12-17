package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignDeadEnd: ImageVector
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
                moveTo(5.116f, 6.28f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.395f, 0f, 0.582f, 0.24f, 0.582f, 0.722f)
                curveToRelative(0f, 0.48f, -0.186f, 0.718f, -0.581f, 0.718f)
                horizontalLineToRelative(-0.321f)
                close()
                moveToRelative(3.636f, 0.066f)
                lineToRelative(0.268f, 0.845f)
                horizontalLineToRelative(-0.552f)
                lineToRelative(0.27f, -0.845f)
                close()
                moveToRelative(1.327f, -0.066f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.394f, 0f, 0.582f, 0.24f, 0.582f, 0.722f)
                curveToRelative(0f, 0.48f, -0.186f, 0.718f, -0.582f, 0.718f)
                horizontalLineToRelative(-0.32f)
                close()
                moveToRelative(-0.792f, 3f)
                horizontalLineToRelative(0.32f)
                curveToRelative(0.395f, 0f, 0.582f, 0.24f, 0.582f, 0.722f)
                curveToRelative(0f, 0.48f, -0.186f, 0.718f, -0.581f, 0.718f)
                horizontalLineToRelative(-0.32f)
                close()
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
                moveTo(4.782f, 6f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.596f, 0f, 0.886f, 0.355f, 0.886f, 0.998f)
                reflectiveCurveTo(6.066f, 8f, 5.473f, 8f)
                horizontalLineToRelative(-0.69f)
                close()
                moveTo(7.82f, 7.72f)
                verticalLineTo(8f)
                horizontalLineTo(6.571f)
                verticalLineTo(6f)
                horizontalLineTo(7.82f)
                verticalLineToRelative(0.28f)
                horizontalLineToRelative(-0.917f)
                verticalLineToRelative(0.57f)
                horizontalLineToRelative(0.863f)
                verticalLineToRelative(0.268f)
                horizontalLineToRelative(-0.863f)
                verticalLineToRelative(0.602f)
                close()
                moveToRelative(0.397f, 0.28f)
                horizontalLineToRelative(-0.34f)
                lineToRelative(0.688f, -2f)
                horizontalLineToRelative(0.371f)
                lineToRelative(0.689f, 2f)
                horizontalLineToRelative(-0.352f)
                lineToRelative(-0.177f, -0.554f)
                horizontalLineToRelative(-0.702f)
                lineTo(8.216f, 8f)
                close()
                moveToRelative(1.53f, -2f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.596f, 0f, 0.886f, 0.355f, 0.886f, 0.998f)
                reflectiveCurveTo(11.03f, 8f, 10.436f, 8f)
                horizontalLineToRelative(-0.69f)
                close()
                moveToRelative(-2.923f, 4.72f)
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
                verticalLineToRelative(0.602f)
                close()
                moveToRelative(0.572f, 0.28f)
                horizontalLineToRelative(-0.32f)
                verticalLineTo(9f)
                horizontalLineToRelative(0.294f)
                lineToRelative(0.933f, 1.436f)
                horizontalLineToRelative(0.014f)
                verticalLineTo(9f)
                horizontalLineToRelative(0.32f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.292f)
                lineToRelative(-0.936f, -1.44f)
                horizontalLineToRelative(-0.013f)
                close()
                moveToRelative(1.56f, -2f)
                horizontalLineToRelative(0.69f)
                curveToRelative(0.596f, 0f, 0.886f, 0.355f, 0.886f, 0.998f)
                reflectiveCurveTo(10.238f, 11f, 9.645f, 11f)
                horizontalLineToRelative(-0.69f)
                close()
            }
        }.build()
        
        return _SignDeadEnd!!
    }

private var _SignDeadEnd: ImageVector? = null

