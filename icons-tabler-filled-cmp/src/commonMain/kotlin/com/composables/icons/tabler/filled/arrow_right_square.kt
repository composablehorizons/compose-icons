package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowRightSquare: ImageVector
    get() {
        if (_ArrowRightSquare != null) return _ArrowRightSquare!!
        
        _ArrowRightSquare = ImageVector.Builder(
            name = "arrow-right-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.707f, 8.293f)
                lineToRelative(3f, 3f)
                quadToRelative(0.054f, 0.053f, 0.097f, 0.112f)
                lineToRelative(0.071f, 0.11f)
                lineToRelative(0.054f, 0.114f)
                lineToRelative(0.035f, 0.105f)
                lineToRelative(0.03f, 0.148f)
                lineToRelative(0.006f, 0.118f)
                lineToRelative(-0.003f, 0.075f)
                lineToRelative(-0.017f, 0.126f)
                lineToRelative(-0.03f, 0.111f)
                lineToRelative(-0.044f, 0.111f)
                lineToRelative(-0.052f, 0.098f)
                lineToRelative(-0.074f, 0.104f)
                lineToRelative(-0.073f, 0.082f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(1.292f, -1.293f)
                horizontalLineToRelative(-10.585f)
                verticalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10.585f)
                lineToRelative(-1.292f, -1.293f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
            }
        }.build()
        
        return _ArrowRightSquare!!
    }

private var _ArrowRightSquare: ImageVector? = null

