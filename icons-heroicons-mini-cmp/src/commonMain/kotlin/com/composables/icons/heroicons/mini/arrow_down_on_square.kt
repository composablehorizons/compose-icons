package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowDownOnSquare: ImageVector
    get() {
        if (_ArrowDownOnSquare != null) return _ArrowDownOnSquare!!
        
        _ArrowDownOnSquare = ImageVector.Builder(
            name = "arrow-down-on-square",
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
                verticalLineToRelative(5.296f)
                lineToRelative(1.943f, -2.048f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.114f, 1.004f)
                lineToRelative(-3.25f, 3.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.114f, 0f)
                lineToRelative(-3.25f, -3.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.114f, -1.004f)
                lineToRelative(1.943f, 2.048f)
                verticalLineTo(7f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(1.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
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
            }
        }.build()
        
        return _ArrowDownOnSquare!!
    }

private var _ArrowDownOnSquare: ImageVector? = null

