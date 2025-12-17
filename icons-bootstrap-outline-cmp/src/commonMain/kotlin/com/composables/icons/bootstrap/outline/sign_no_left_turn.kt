package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignNoLeftTurn: ImageVector
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
                moveTo(0f, 8f)
                arcToRelative(8f, 8f, 0f, true, false, 16f, 0f)
                arcTo(8f, 8f, 0f, false, false, 0f, 8f)
                moveToRelative(3.416f, 5.29f)
                lineToRelative(5.988f, -5.987f)
                curveToRelative(0.362f, 0.274f, 0.596f, 0.708f, 0.596f, 1.197f)
                verticalLineTo(11f)
                horizontalLineToRelative(1f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.765f, -0.344f, -1.45f, -0.885f, -1.908f)
                lineToRelative(3.176f, -3.176f)
                arcToRelative(7f, 7f, 0f, false, true, -9.874f, 9.874f)
                close()
                moveToRelative(-0.707f, -0.706f)
                arcToRelative(7f, 7f, 0f, false, true, 9.874f, -9.874f)
                lineTo(9.196f, 6.097f)
                arcTo(2.5f, 2.5f, 0f, false, false, 8.5f, 6f)
                horizontalLineTo(7f)
                verticalLineTo(4.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.41f, -0.192f)
                lineTo(4.23f, 6.308f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0f, 0.384f)
                lineToRelative(2.36f, 1.966f)
                lineToRelative(0.026f, 0.02f)
                close()
                moveTo(8.293f, 7f)
                lineTo(7f, 8.293f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _SignNoLeftTurn!!
    }

private var _SignNoLeftTurn: ImageVector? = null

