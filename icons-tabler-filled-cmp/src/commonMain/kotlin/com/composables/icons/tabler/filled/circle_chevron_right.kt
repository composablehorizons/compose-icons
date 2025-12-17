package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.CircleChevronRight: ImageVector
    get() {
        if (_CircleChevronRight != null) return _CircleChevronRight!!
        
        _CircleChevronRight = ImageVector.Builder(
            name = "circle-chevron-right",
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
                curveToRelative(0f, -5.523f, 4.477f, -10f, 10f, -10f)
                moveToRelative(-0.293f, 6.293f)
                arcToRelative(1f, 1f, 0f, false, false, -1.414f, 0f)
                lineToRelative(-0.083f, 0.094f)
                arcToRelative(1f, 1f, 0f, false, false, 0.083f, 1.32f)
                lineToRelative(2.292f, 2.293f)
                lineToRelative(-2.292f, 2.293f)
                arcToRelative(1f, 1f, 0f, false, false, 1.414f, 1.414f)
                lineToRelative(3f, -3f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -1.414f)
                close()
            }
        }.build()
        
        return _CircleChevronRight!!
    }

private var _CircleChevronRight: ImageVector? = null

