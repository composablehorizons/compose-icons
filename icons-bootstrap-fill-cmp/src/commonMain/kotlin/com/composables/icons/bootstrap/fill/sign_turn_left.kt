package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignTurnLeft: ImageVector
    get() {
        if (_SignTurnLeft != null) return _SignTurnLeft!!
        
        _SignTurnLeft = ImageVector.Builder(
            name = "sign-turn-left",
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
                moveTo(7f, 8.466f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, -0.41f, 0.192f)
                lineTo(4.23f, 6.692f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0f, -0.384f)
                lineToRelative(2.36f, -1.966f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.41f, 0.192f)
                verticalLineTo(6f)
                horizontalLineToRelative(1.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 11f, 8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1f)
                verticalLineTo(8.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 8.5f, 7f)
                horizontalLineTo(7f)
                close()
            }
        }.build()
        
        return _SignTurnLeft!!
    }

private var _SignTurnLeft: ImageVector? = null

