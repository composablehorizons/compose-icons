package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.ChartBubble: ImageVector
    get() {
        if (_ChartBubble != null) return _ChartBubble!!
        
        _ChartBubble = ImageVector.Builder(
            name = "chart-bubble",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 12f)
                arcToRelative(4f, 4f, 0f, true, true, -3.995f, 4.2f)
                lineToRelative(-0.005f, -0.2f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4f, 4f, 0f, false, true, 3.995f, -3.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 16f)
                arcToRelative(3f, 3f, 0f, true, true, -2.995f, 3.176f)
                lineToRelative(-0.005f, -0.176f)
                lineToRelative(0.005f, -0.176f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.5f, 2f)
                arcToRelative(5.5f, 5.5f, 0f, true, true, -5.496f, 5.721f)
                lineToRelative(-0.004f, -0.221f)
                lineToRelative(0.004f, -0.221f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 5.496f, -5.279f)
                close()
            }
        }.build()
        
        return _ChartBubble!!
    }

private var _ChartBubble: ImageVector? = null

