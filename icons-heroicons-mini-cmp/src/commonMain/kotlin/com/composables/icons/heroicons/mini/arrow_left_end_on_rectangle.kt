package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowLeftEndOnRectangle: ImageVector
    get() {
        if (_ArrowLeftEndOnRectangle != null) return _ArrowLeftEndOnRectangle!!
        
        _ArrowLeftEndOnRectangle = ImageVector.Builder(
            name = "arrow-left-end-on-rectangle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 4.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 5.25f, 2f)
                horizontalLineToRelative(5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 13f, 4.25f)
                verticalLineToRelative(2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(11.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-2f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(2f)
                arcTo(2.25f, 2.25f, 0f, false, true, 10.75f, 18f)
                horizontalLineToRelative(-5.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3f, 15.75f)
                verticalLineTo(4.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(8.704f)
                lineToRelative(1.048f, -0.943f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.004f, -1.114f)
                lineToRelative(-2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.114f)
                lineToRelative(2.5f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.004f, -1.114f)
                lineToRelative(-1.048f, -0.943f)
                horizontalLineToRelative(9.546f)
                arcTo(0.75f, 0.75f, 0f, false, false, 19f, 10f)
                close()
            }
        }.build()
        
        return _ArrowLeftEndOnRectangle!!
    }

private var _ArrowLeftEndOnRectangle: ImageVector? = null

