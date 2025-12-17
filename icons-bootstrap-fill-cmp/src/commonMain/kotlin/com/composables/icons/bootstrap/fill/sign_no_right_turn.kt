package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignNoRightTurn: ImageVector
    get() {
        if (_SignNoRightTurn != null) return _SignNoRightTurn!!
        
        _SignNoRightTurn = ImageVector.Builder(
            name = "sign-no-right-turn",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 13.292f)
                arcTo(8f, 8f, 0f, false, false, 2.707f, 2f)
                lineToRelative(4.097f, 4.098f)
                quadTo(7.137f, 6.001f, 7.5f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(4.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0f, 0.384f)
                lineTo(9.41f, 8.658f)
                lineToRelative(-0.026f, 0.02f)
                close()
                moveToRelative(-0.708f, 0.708f)
                arcTo(8f, 8f, 0f, false, true, 2f, 2.707f)
                lineToRelative(3.885f, 3.884f)
                arcTo(2.5f, 2.5f, 0f, false, false, 5f, 8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(1f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.489f, 0.234f, -0.923f, 0.596f, -1.197f)
                lineToRelative(6.696f, 6.696f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.707f, 7f)
                lineTo(9f, 8.293f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _SignNoRightTurn!!
    }

private var _SignNoRightTurn: ImageVector? = null

