package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.DirectionArrows: ImageVector
    get() {
        if (_DirectionArrows != null) return _DirectionArrows!!
        
        _DirectionArrows = ImageVector.Builder(
            name = "direction-arrows",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(5.523f, 0f, 10f, 4.477f, 10f, 10f)
                arcToRelative(10f, 10f, 0f, false, true, -20f, 0f)
                lineToRelative(0.004f, -0.28f)
                curveToRelative(0.148f, -5.393f, 4.566f, -9.72f, 9.996f, -9.72f)
                moveToRelative(-0.293f, 13.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 1.414f)
                lineToRelative(1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(1f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                lineToRelative(-0.094f, -0.083f)
                arcToRelative(1f, 1f, 0f, false, false, -1.32f, 0.083f)
                lineToRelative(-0.293f, 0.292f)
                close()
                moveToRelative(-3f, -5f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 0f)
                lineToRelative(0.083f, -0.094f)
                arcToRelative(1f, 1f, 0f, false, false, -0.083f, -1.32f)
                lineToRelative(-0.292f, -0.293f)
                lineToRelative(0.292f, -0.293f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                moveToRelative(8f, 0f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0.083f, 1.32f)
                lineToRelative(0.292f, 0.292f)
                lineToRelative(-0.292f, 0.294f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(1f, -1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                close()
                moveToRelative(-4f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-1f, 1f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.414f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1f, 1f, 0f, false, false, 1.32f, -0.083f)
                lineToRelative(0.293f, -0.292f)
                lineToRelative(0.293f, 0.292f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, -1.414f)
                close()
            }
        }.build()
        
        return _DirectionArrows!!
    }

private var _DirectionArrows: ImageVector? = null

