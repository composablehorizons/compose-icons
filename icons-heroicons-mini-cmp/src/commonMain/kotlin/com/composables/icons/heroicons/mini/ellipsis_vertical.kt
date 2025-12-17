package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.EllipsisVertical: ImageVector
    get() {
        if (_EllipsisVertical != null) return _EllipsisVertical!!
        
        _EllipsisVertical = ImageVector.Builder(
            name = "ellipsis-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, -3f)
                close()
                moveTo(10f, 8.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, true, 0f, 3f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0f, -3f)
                close()
                moveTo(11.5f, 15.5f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, -3f, 0f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 3f, 0f)
                close()
            }
        }.build()
        
        return _EllipsisVertical!!
    }

private var _EllipsisVertical: ImageVector? = null

