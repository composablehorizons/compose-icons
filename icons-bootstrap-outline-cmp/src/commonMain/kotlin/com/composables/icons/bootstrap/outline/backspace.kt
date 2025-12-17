package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Backspace: ImageVector
    get() {
        if (_Backspace != null) return _Backspace!!
        
        _Backspace = ImageVector.Builder(
            name = "backspace",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.83f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
                lineTo(7.975f, 8f)
                lineToRelative(-2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, 0.708f)
                lineToRelative(2.147f, -2.147f)
                lineToRelative(2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.707f, -0.708f)
                lineTo(9.39f, 8f)
                lineToRelative(2.146f, -2.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, -0.708f)
                lineTo(8.683f, 7.293f)
                lineTo(6.536f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.683f, 1f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-7.08f)
                arcToRelative(2f, 2f, 0f, false, true, -1.519f, -0.698f)
                lineTo(0.241f, 8.65f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.302f)
                lineTo(5.084f, 1.7f)
                arcTo(2f, 2f, 0f, false, true, 6.603f, 1f)
                close()
                moveToRelative(-7.08f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, -0.76f, 0.35f)
                lineTo(1f, 8f)
                lineToRelative(4.844f, 5.65f)
                arcToRelative(1f, 1f, 0f, false, false, 0.759f, 0.35f)
                horizontalLineToRelative(7.08f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

