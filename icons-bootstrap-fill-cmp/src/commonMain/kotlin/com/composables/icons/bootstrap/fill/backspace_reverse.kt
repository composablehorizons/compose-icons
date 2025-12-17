package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.BackspaceReverse: ImageVector
    get() {
        if (_BackspaceReverse != null) return _BackspaceReverse!!
        
        _BackspaceReverse = ImageVector.Builder(
            name = "backspace-reverse",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 3f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7.08f)
                arcToRelative(2f, 2f, 0f, false, true, 1.519f, 0.698f)
                lineToRelative(4.843f, 5.651f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.302f)
                lineTo(10.6f, 14.3f)
                arcToRelative(2f, 2f, 0f, false, true, -1.52f, 0.7f)
                horizontalLineTo(2f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
                moveToRelative(9.854f, 2.854f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, -0.708f)
                lineTo(7f, 7.293f)
                lineTo(4.854f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, 0.708f)
                lineTo(6.293f, 8f)
                lineToRelative(-2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0.708f)
                lineTo(7f, 8.707f)
                lineToRelative(2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineTo(7.707f, 8f)
                close()
            }
        }.build()
        
        return _BackspaceReverse!!
    }

private var _BackspaceReverse: ImageVector? = null

