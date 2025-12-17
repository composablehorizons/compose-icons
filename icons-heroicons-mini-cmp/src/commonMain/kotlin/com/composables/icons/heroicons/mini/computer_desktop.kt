package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ComputerDesktop: ImageVector
    get() {
        if (_ComputerDesktop != null) return _ComputerDesktop!!
        
        _ComputerDesktop = ImageVector.Builder(
            name = "computer-desktop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 4.25f, 2f)
                horizontalLineToRelative(11.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 4.25f)
                verticalLineToRelative(8.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 15.75f, 15f)
                horizontalLineToRelative(-3.105f)
                arcToRelative(3.501f, 3.501f, 0f, false, false, 1.1f, 1.677f)
                arcTo(0.75f, 0.75f, 0f, false, true, 13.26f, 18f)
                horizontalLineTo(6.74f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.484f, -1.323f)
                arcTo(3.501f, 3.501f, 0f, false, false, 7.355f, 15f)
                horizontalLineTo(4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 2f, 12.75f)
                verticalLineToRelative(-8.5f)
                close()
                moveToRelative(1.5f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(4.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.build()
        
        return _ComputerDesktop!!
    }

private var _ComputerDesktop: ImageVector? = null

