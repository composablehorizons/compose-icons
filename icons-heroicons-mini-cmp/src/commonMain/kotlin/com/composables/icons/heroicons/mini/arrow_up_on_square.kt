package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUpOnSquare: ImageVector
    get() {
        if (_ArrowUpOnSquare != null) return _ArrowUpOnSquare!!
        
        _ArrowUpOnSquare = ImageVector.Builder(
            name = "arrow-up-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.75f, 7f)
                horizontalLineToRelative(-3f)
                verticalLineTo(3.66f)
                lineToRelative(1.95f, 2.1f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.1f, -1.02f)
                lineToRelative(-3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.1f, 0f)
                lineTo(6.2f, 4.74f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.1f, 1.02f)
                lineToRelative(1.95f, -2.1f)
                verticalLineTo(7f)
                horizontalLineToRelative(-3f)
                arcTo(2.25f, 2.25f, 0f, false, false, 4f, 9.25f)
                verticalLineToRelative(7.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 6.25f, 19f)
                horizontalLineToRelative(7.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 16f, 16.75f)
                verticalLineToRelative(-7.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 13.75f, 7f)
                close()
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _ArrowUpOnSquare!!
    }

private var _ArrowUpOnSquare: ImageVector? = null

