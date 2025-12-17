package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowsUpDown: ImageVector
    get() {
        if (_ArrowsUpDown != null) return _ArrowsUpDown!!
        
        _ArrowsUpDown = ImageVector.Builder(
            name = "arrows-up-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.24f, 6.8f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -0.04f)
                lineToRelative(1.95f, -2.1f)
                verticalLineToRelative(8.59f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(4.66f)
                lineToRelative(1.95f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.1f, -1.02f)
                lineToRelative(-3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.1f, 0f)
                lineTo(2.2f, 5.74f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.04f, 1.06f)
                close()
                moveToRelative(8f, 6.4f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.04f, 1.06f)
                lineToRelative(3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.1f, 0f)
                lineToRelative(3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.1f, -1.02f)
                lineToRelative(-1.95f, 2.1f)
                verticalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(8.59f)
                lineToRelative(-1.95f, -2.1f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -0.04f)
                close()
            }
        }.build()
        
        return _ArrowsUpDown!!
    }

private var _ArrowsUpDown: ImageVector? = null

