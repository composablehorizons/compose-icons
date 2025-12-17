package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowUpOnSquare: ImageVector
    get() {
        if (_ArrowUpOnSquare != null) return _ArrowUpOnSquare!!
        
        _ArrowUpOnSquare = ImageVector.Builder(
            name = "arrow-up-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.75f, 6f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(3.56f)
                lineTo(6.03f, 4.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(2.5f, -2.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                lineTo(8.75f, 3.56f)
                verticalLineTo(6f)
                horizontalLineTo(11f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineTo(8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(2.25f)
                verticalLineToRelative(5.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _ArrowUpOnSquare!!
    }

private var _ArrowUpOnSquare: ImageVector? = null

