package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowUpTray: ImageVector
    get() {
        if (_ArrowUpTray != null) return _ArrowUpTray!!
        
        _ArrowUpTray = ImageVector.Builder(
            name = "arrow-up-tray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.47f, 2.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(4.5f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineToRelative(-3.22f, -3.22f)
                verticalLineTo(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(4.81f)
                lineTo(8.03f, 8.03f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(4.5f, -4.5f)
                close()
                moveTo(3f, 15.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(2.25f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, 1.5f)
                horizontalLineToRelative(13.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(2.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineTo(5.25f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _ArrowUpTray!!
    }

private var _ArrowUpTray: ImageVector? = null

