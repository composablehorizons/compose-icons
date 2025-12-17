package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ArrowBadgeLeft: ImageVector
    get() {
        if (_ArrowBadgeLeft != null) return _ArrowBadgeLeft!!
        
        _ArrowBadgeLeft = ImageVector.Builder(
            name = "arrow-badge-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 6f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, false, -0.78f, 0.375f)
                lineToRelative(-4f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 1.25f)
                lineToRelative(4f, 5f)
                arcToRelative(1f, 1f, 0f, false, false, 0.78f, 0.375f)
                horizontalLineToRelative(6f)
                lineToRelative(0.112f, -0.006f)
                arcToRelative(1f, 1f, 0f, false, false, 0.669f, -1.619f)
                lineToRelative(-3.501f, -4.375f)
                lineToRelative(3.5f, -4.375f)
                arcToRelative(1f, 1f, 0f, false, false, -0.78f, -1.625f)
                close()
            }
        }.build()
        
        return _ArrowBadgeLeft!!
    }

private var _ArrowBadgeLeft: ImageVector? = null

