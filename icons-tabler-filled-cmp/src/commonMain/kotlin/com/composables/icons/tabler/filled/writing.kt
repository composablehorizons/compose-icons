package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Writing: ImageVector
    get() {
        if (_Writing != null) return _Writing!!
        
        _Writing = ImageVector.Builder(
            name = "writing",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 8f)
                verticalLineToRelative(9f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, 0.707f)
                lineToRelative(-2f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.112f, 0.097f)
                lineToRelative(-0.11f, 0.071f)
                lineToRelative(-0.114f, 0.054f)
                lineToRelative(-0.105f, 0.035f)
                lineToRelative(-0.149f, 0.03f)
                lineToRelative(-0.117f, 0.006f)
                horizontalLineToRelative(-13f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, -6f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                horizontalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                horizontalLineToRelative(10.585f)
                lineToRelative(-0.292f, -0.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.293f, -0.707f)
                verticalLineToRelative(-9f)
                close()
                moveToRelative(-3f, -6f)
                curveToRelative(1.673f, 0f, 3f, 1.327f, 3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.673f, 1.327f, -3f, 3f, -3f)
            }
        }.build()
        
        return _Writing!!
    }

private var _Writing: ImageVector? = null

