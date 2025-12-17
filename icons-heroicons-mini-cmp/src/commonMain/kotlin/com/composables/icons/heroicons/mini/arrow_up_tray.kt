package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUpTray: ImageVector
    get() {
        if (_ArrowUpTray != null) return _ArrowUpTray!!
        
        _ArrowUpTray = ImageVector.Builder(
            name = "arrow-up-tray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.25f, 13.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(4.636f)
                lineToRelative(2.955f, 3.129f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.09f, -1.03f)
                lineToRelative(-4.25f, -4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.09f, 0f)
                lineToRelative(-4.25f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.09f, 1.03f)
                lineTo(9.25f, 4.636f)
                verticalLineToRelative(8.614f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 4.75f, 18f)
                horizontalLineToRelative(10.5f)
                arcTo(2.75f, 2.75f, 0f, false, false, 18f, 15.25f)
                verticalLineToRelative(-2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
                horizontalLineTo(4.75f)
                curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.build()
        
        return _ArrowUpTray!!
    }

private var _ArrowUpTray: ImageVector? = null

