package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Graph: ImageVector
    get() {
        if (_Graph != null) return _Graph!!
        
        _Graph = ImageVector.Builder(
            name = "graph",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 3f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                verticalLineToRelative(12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-12f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(12f)
                close()
                moveToRelative(-2.293f, 6.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-2.293f, 2.292f)
                lineToRelative(-1.293f, -1.292f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-3f, 3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.293f, -2.292f)
                lineToRelative(1.293f, 1.292f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(2.293f, -2.292f)
                lineToRelative(1.293f, 1.292f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                lineToRelative(-2f, -2f)
                close()
            }
        }.build()
        
        return _Graph!!
    }

private var _Graph: ImageVector? = null

