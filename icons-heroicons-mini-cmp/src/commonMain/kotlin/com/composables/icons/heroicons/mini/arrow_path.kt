package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowPath: ImageVector
    get() {
        if (_ArrowPath != null) return _ArrowPath!!
        
        _ArrowPath = ImageVector.Builder(
            name = "arrow-path",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.312f, 11.424f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, -9.201f, 2.466f)
                lineToRelative(-0.312f, -0.311f)
                horizontalLineToRelative(2.433f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(3.989f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(4.242f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-2.43f)
                lineToRelative(0.31f, 0.31f)
                arcToRelative(7f, 7f, 0f, false, false, 11.712f, -3.138f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.449f, -0.39f)
                close()
                moveToRelative(1.23f, -3.723f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.219f, -0.53f)
                verticalLineTo(2.929f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(5.36f)
                lineToRelative(-0.31f, -0.31f)
                arcTo(7f, 7f, 0f, false, false, 3.239f, 8.188f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.448f, 0.389f)
                arcTo(5.5f, 5.5f, 0f, false, true, 13.89f, 6.11f)
                lineToRelative(0.311f, 0.31f)
                horizontalLineToRelative(-2.432f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(4.243f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.53f, -0.219f)
                close()
            }
        }.build()
        
        return _ArrowPath!!
    }

private var _ArrowPath: ImageVector? = null

