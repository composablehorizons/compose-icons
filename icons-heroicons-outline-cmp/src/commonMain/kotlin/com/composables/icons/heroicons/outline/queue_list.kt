package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.QueueList: ImageVector
    get() {
        if (_QueueList != null) return _QueueList!!
        
        _QueueList = ImageVector.Builder(
            name = "queue-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(3.75f, 12f)
                horizontalLineToRelative(16.5f)
                moveToRelative(-16.5f, 3.75f)
                horizontalLineToRelative(16.5f)
                moveTo(3.75f, 19.5f)
                horizontalLineToRelative(16.5f)
                moveTo(5.625f, 4.5f)
                horizontalLineToRelative(12.75f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, 0f, 3.75f)
                horizontalLineTo(5.625f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, 0f, -3.75f)
                close()
            }
        }.build()
        
        return _QueueList!!
    }

private var _QueueList: ImageVector? = null

