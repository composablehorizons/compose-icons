package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignNoLeftTurn: ImageVector
    get() {
        if (_SignNoLeftTurn != null) return _SignNoLeftTurn!!
        
        _SignNoLeftTurn = ImageVector.Builder(
            name = "sign-no-left-turn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 13.292f)
                arcTo(8f, 8f, 0f, false, true, 13.293f, 2f)
                lineTo(9.195f, 6.099f)
                arcTo(2.5f, 2.5f, 0f, false, false, 8.5f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(4.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.41f, -0.192f)
                lineTo(4.23f, 6.308f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                lineToRelative(0.026f, 0.02f)
                close()
                moveToRelative(0.708f, 0.708f)
                arcTo(8f, 8f, 0f, false, false, 14f, 2.707f)
                lineToRelative(-3.885f, 3.884f)
                curveTo(10.656f, 7.05f, 11f, 7.735f, 11f, 8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.489f, -0.234f, -0.923f, -0.596f, -1.197f)
                lineToRelative(-6.696f, 6.696f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.293f, 7f)
                lineTo(7f, 8.293f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _SignNoLeftTurn!!
    }

private var _SignNoLeftTurn: ImageVector? = null

