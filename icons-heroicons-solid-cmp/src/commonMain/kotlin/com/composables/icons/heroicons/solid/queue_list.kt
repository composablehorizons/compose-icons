package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.QueueList: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.625f, 3.75f)
                arcToRelative(2.625f, 2.625f, 0f, true, false, 0f, 5.25f)
                horizontalLineToRelative(12.75f)
                arcToRelative(2.625f, 2.625f, 0f, false, false, 0f, -5.25f)
                horizontalLineTo(5.625f)
                close()
                moveTo(3.75f, 11.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(3.75f)
                close()
                moveTo(3f, 15.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(3.75f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(3.75f)
                close()
            }
        }.build()
        
        return _QueueList!!
    }

private var _QueueList: ImageVector? = null

