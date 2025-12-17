package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignTurnRight: ImageVector
    get() {
        if (_SignTurnRight != null) return _SignTurnRight!!
        
        _SignTurnRight = ImageVector.Builder(
            name = "sign-turn-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
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
                moveTo(9f, 8.466f)
                verticalLineTo(7f)
                horizontalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6f, 8.5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(8.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 7.5f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(4.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0f, 0.384f)
                lineTo(9.41f, 8.658f)
                arcTo(0.25f, 0.25f, 0f, false, true, 9f, 8.466f)
            }
        }.build()
        
        return _SignTurnRight!!
    }

private var _SignTurnRight: ImageVector? = null

