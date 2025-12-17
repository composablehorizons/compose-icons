package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.Backspace: ImageVector
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
                moveTo(15.683f, 3f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineToRelative(-7.08f)
                arcToRelative(2f, 2f, 0f, false, false, -1.519f, 0.698f)
                lineTo(0.241f, 7.35f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.302f)
                lineToRelative(4.843f, 5.65f)
                arcTo(2f, 2f, 0f, false, false, 6.603f, 15f)
                horizontalLineToRelative(7.08f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                close()
                moveTo(5.829f, 5.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, -0.708f)
                lineToRelative(2.147f, 2.147f)
                lineToRelative(2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.707f, 0.708f)
                lineTo(9.39f, 8f)
                lineToRelative(2.146f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0.708f)
                lineTo(8.683f, 8.707f)
                lineToRelative(-2.147f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, -0.708f)
                lineTo(7.976f, 8f)
                close()
            }
        }.build()
        
        return _Backspace!!
    }

private var _Backspace: ImageVector? = null

