package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.TimelineEvent: ImageVector
    get() {
        if (_TimelineEvent != null) return _TimelineEvent!!
        
        _TimelineEvent = ImageVector.Builder(
            name = "timeline-event",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 17f)
                curveToRelative(1.306f, 0f, 2.418f, 0.835f, 2.83f, 2f)
                horizontalLineToRelative(5.17f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-5.171f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, -5.658f, 0f)
                horizontalLineToRelative(-5.171f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(5.17f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, 2.83f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-2.586f)
                lineToRelative(-1.707f, 1.707f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.083f)
                lineToRelative(-0.094f, -0.083f)
                lineToRelative(-1.708f, -1.707f)
                horizontalLineToRelative(-2.585f)
                arcToRelative(2f, 2f, 0f, false, true, -1.995f, -1.85f)
                lineToRelative(-0.005f, -0.15f)
                verticalLineToRelative(-8f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(10f)
                close()
            }
        }.build()
        
        return _TimelineEvent!!
    }

private var _TimelineEvent: ImageVector? = null

