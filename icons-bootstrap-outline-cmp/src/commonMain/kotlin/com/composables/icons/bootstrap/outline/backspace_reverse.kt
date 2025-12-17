package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BackspaceReverse: ImageVector
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
                moveTo(9.854f, 5.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 0.708f)
                lineTo(7.707f, 8f)
                lineToRelative(2.147f, 2.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0.708f)
                lineTo(7f, 8.707f)
                lineToRelative(-2.146f, 2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, -0.708f)
                lineTo(6.293f, 8f)
                lineTo(4.146f, 5.854f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.708f, -0.708f)
                lineTo(7f, 7.293f)
                lineToRelative(2.146f, -2.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(7.08f)
                arcToRelative(2f, 2f, 0f, false, false, 1.519f, -0.698f)
                lineToRelative(4.843f, -5.651f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.302f)
                lineTo(10.6f, 1.7f)
                arcTo(2f, 2f, 0f, false, false, 9.08f, 1f)
                close()
                moveToRelative(7.08f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.76f, 0.35f)
                lineTo(14.682f, 8f)
                lineToRelative(-4.844f, 5.65f)
                arcToRelative(1f, 1f, 0f, false, true, -0.759f, 0.35f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _BackspaceReverse!!
    }

private var _BackspaceReverse: ImageVector? = null

