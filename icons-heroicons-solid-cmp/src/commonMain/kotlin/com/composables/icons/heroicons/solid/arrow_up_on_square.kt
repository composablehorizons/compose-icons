package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowUpOnSquare: ImageVector
    get() {
        if (_ArrowUpOnSquare != null) return _ArrowUpOnSquare!!
        
        _ArrowUpOnSquare = ImageVector.Builder(
            name = "arrow-up-on-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.47f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(3f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                lineToRelative(-1.72f, -1.72f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(4.06f)
                lineTo(9.53f, 5.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(3f, -3f)
                close()
                moveTo(11.25f, 7.5f)
                verticalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(3.75f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(9f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-9f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(3.75f)
                close()
            }
        }.build()
        
        return _ArrowUpOnSquare!!
    }

private var _ArrowUpOnSquare: ImageVector? = null

