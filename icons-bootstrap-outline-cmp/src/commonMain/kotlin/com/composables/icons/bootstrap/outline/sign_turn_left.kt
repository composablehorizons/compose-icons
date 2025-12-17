package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignTurnLeft: ImageVector
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
                moveTo(11f, 8.5f)
                arcTo(2.5f, 2.5f, 0f, false, false, 8.5f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(4.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.41f, -0.192f)
                lineTo(4.23f, 6.308f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                arcTo(0.25f, 0.25f, 0f, false, false, 7f, 8.466f)
                verticalLineTo(7f)
                horizontalLineToRelative(1.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 10f, 8.5f)
                verticalLineTo(11f)
                horizontalLineToRelative(1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.95f, 0.435f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0f)
                lineToRelative(6.515f, 6.516f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.519f, 0f, 2.098f)
                lineTo(9.05f, 15.565f)
                curveToRelative(-0.58f, 0.58f, -1.519f, 0.58f, -2.098f, 0f)
                lineTo(0.435f, 9.05f)
                arcToRelative(1.48f, 1.48f, 0f, false, true, 0f, -2.098f)
                close()
                moveToRelative(1.4f, 0.7f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, -0.7f, 0f)
                lineTo(1.134f, 7.65f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0f, 0.7f)
                lineToRelative(6.516f, 6.516f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0.7f, 0f)
                lineToRelative(6.516f, -6.516f)
                arcToRelative(0.495f, 0.495f, 0f, false, false, 0f, -0.7f)
                lineTo(8.35f, 1.134f)
                close()
            }
        }.build()
        
        return _SignTurnLeft!!
    }

private var _SignTurnLeft: ImageVector? = null

