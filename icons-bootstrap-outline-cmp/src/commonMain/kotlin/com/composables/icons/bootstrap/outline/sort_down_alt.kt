package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.SortDownAlt: ImageVector
    get() {
        if (_SortDownAlt != null) return _SortDownAlt!!
        
        _SortDownAlt = ImageVector.Builder(
            name = "sort-down-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.5f, 3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -1f, 0f)
                verticalLineToRelative(8.793f)
                lineToRelative(-1.146f, -1.147f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0.708f)
                lineToRelative(2f, 1.999f)
                lineToRelative(0.007f, 0.007f)
                arcToRelative(0.497f, 0.497f, 0f, false, false, 0.7f, -0.006f)
                lineToRelative(2f, -2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, -0.708f)
                lineTo(3.5f, 12.293f)
                close()
                moveToRelative(4f, 0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveToRelative(0f, 3f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
                moveTo(7f, 12.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -1f)
                horizontalLineToRelative(-7f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
            }
        }.build()
        
        return _SortDownAlt!!
    }

private var _SortDownAlt: ImageVector? = null

