package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowsRightLeft: ImageVector
    get() {
        if (_ArrowsRightLeft != null) return _ArrowsRightLeft!!
        
        _ArrowsRightLeft = ImageVector.Builder(
            name = "arrows-right-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.2f, 2.24f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.04f, 1.06f)
                lineToRelative(2.1f, 1.95f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(8.59f)
                lineToRelative(-2.1f, 1.95f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.02f, 1.1f)
                lineToRelative(3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.1f)
                lineToRelative(-3.5f, -3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0.04f)
                close()
                moveToRelative(-6.4f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -0.04f)
                lineToRelative(-3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.1f)
                lineToRelative(3.5f, 3.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.02f, -1.1f)
                lineToRelative(-2.1f, -1.95f)
                horizontalLineToRelative(8.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(4.66f)
                lineToRelative(2.1f, -1.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.04f, -1.06f)
                close()
            }
        }.build()
        
        return _ArrowsRightLeft!!
    }

private var _ArrowsRightLeft: ImageVector? = null

