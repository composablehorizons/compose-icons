package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowLeftStartOnRectangle: ImageVector
    get() {
        if (_ArrowLeftStartOnRectangle != null) return _ArrowLeftStartOnRectangle!!
        
        _ArrowLeftStartOnRectangle = ImageVector.Builder(
            name = "arrow-left-start-on-rectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 4.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 14.75f, 2f)
                horizontalLineToRelative(-5.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 7f, 4.25f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(2f)
                arcTo(2.25f, 2.25f, 0f, false, false, 9.25f, 18f)
                horizontalLineToRelative(5.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 17f, 15.75f)
                verticalLineTo(4.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(3.704f)
                lineToRelative(1.048f, -0.943f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.004f, -1.114f)
                lineToRelative(-2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.114f)
                lineToRelative(2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.004f, -1.114f)
                lineToRelative(-1.048f, -0.943f)
                horizontalLineToRelative(9.546f)
                arcTo(0.75f, 0.75f, 0f, false, false, 14f, 10f)
                close()
            }
        }.build()
        
        return _ArrowLeftStartOnRectangle!!
    }

private var _ArrowLeftStartOnRectangle: ImageVector? = null

