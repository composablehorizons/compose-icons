package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SignNoRightTurn: ImageVector
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
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-3.416f, 5.29f)
                lineTo(6.596f, 7.304f)
                arcTo(1.5f, 1.5f, 0f, false, false, 6f, 8.5f)
                verticalLineTo(11f)
                horizontalLineTo(5f)
                verticalLineTo(8.5f)
                curveToRelative(0f, -0.765f, 0.344f, -1.45f, 0.885f, -1.908f)
                lineTo(2.709f, 3.416f)
                arcToRelative(7f, 7f, 0f, false, false, 9.874f, 9.874f)
                close()
                moveToRelative(0.707f, -0.706f)
                arcTo(7f, 7f, 0f, false, false, 3.417f, 2.71f)
                lineToRelative(3.388f, 3.388f)
                quadTo(7.137f, 6.001f, 7.5f, 6f)
                horizontalLineTo(9f)
                verticalLineTo(4.534f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.41f, -0.192f)
                lineToRelative(2.36f, 1.966f)
                curveToRelative(0.12f, 0.1f, 0.12f, 0.284f, 0f, 0.384f)
                lineTo(9.41f, 8.658f)
                lineToRelative(-0.026f, 0.02f)
                close()
                moveTo(7.707f, 7f)
                lineTo(9f, 8.293f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _SignNoRightTurn!!
    }

private var _SignNoRightTurn: ImageVector? = null

