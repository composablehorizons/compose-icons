package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.QueueList: ImageVector
    get() {
        if (_QueueList != null) return _QueueList!!
        
        _QueueList = ImageVector.Builder(
            name = "queue-list",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4.5f, 2f)
                horizontalLineToRelative(11f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 5f)
                horizontalLineToRelative(-11f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 4.5f)
                close()
                moveTo(2.75f, 9.083f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 12.663f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(2.75f)
                close()
                moveTo(2.75f, 16.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                horizontalLineTo(2.75f)
                close()
            }
        }.build()
        
        return _QueueList!!
    }

private var _QueueList: ImageVector? = null

