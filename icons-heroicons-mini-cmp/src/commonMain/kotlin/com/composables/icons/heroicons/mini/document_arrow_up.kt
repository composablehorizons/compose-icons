package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.DocumentArrowUp: ImageVector
    get() {
        if (_DocumentArrowUp != null) return _DocumentArrowUp!!
        
        _DocumentArrowUp = ImageVector.Builder(
            name = "document-arrow-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 2f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3f, 3.5f)
                verticalLineToRelative(13f)
                arcTo(1.5f, 1.5f, 0f, false, false, 4.5f, 18f)
                horizontalLineToRelative(11f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1.5f, -1.5f)
                verticalLineTo(7.621f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.44f, -1.06f)
                lineToRelative(-4.12f, -4.122f)
                arcTo(1.5f, 1.5f, 0f, false, false, 11.378f, 2f)
                horizontalLineTo(4.5f)
                close()
                moveToRelative(4.75f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2.546f)
                lineToRelative(0.943f, 1.048f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.114f, -1.004f)
                lineToRelative(-2.25f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.114f, 0f)
                lineToRelative(-2.25f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.114f, 1.004f)
                lineToRelative(0.943f, -1.048f)
                verticalLineToRelative(2.546f)
                close()
            }
        }.build()
        
        return _DocumentArrowUp!!
    }

private var _DocumentArrowUp: ImageVector? = null

