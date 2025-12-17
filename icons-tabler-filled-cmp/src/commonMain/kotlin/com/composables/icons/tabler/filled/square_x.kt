package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.SquareX: ImageVector
    get() {
        if (_SquareX != null) return _SquareX!!
        
        _SquareX = ImageVector.Builder(
            name = "square-x",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(14f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, -3f)
                verticalLineToRelative(-14f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, -3f)
                close()
                moveToRelative(-9.387f, 6.21f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(2.293f, 2.292f)
                lineToRelative(2.293f, -2.292f)
                arcToRelative(1f, 1f, 0f, false, true, 1.497f, 1.32f)
                lineToRelative(-0.083f, 0.094f)
                lineToRelative(-2.292f, 2.293f)
                lineToRelative(2.292f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 1.497f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-2.293f, -2.292f)
                lineToRelative(-2.293f, 2.292f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(2.292f, -2.293f)
                lineToRelative(-2.292f, -2.293f)
                arcToRelative(1f, 1f, 0f, false, true, 1.32f, -1.497f)
                close()
            }
        }.build()
        
        return _SquareX!!
    }

private var _SquareX: ImageVector? = null

