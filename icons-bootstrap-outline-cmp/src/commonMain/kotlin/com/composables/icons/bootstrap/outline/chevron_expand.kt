package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ChevronExpand: ImageVector
    get() {
        if (_ChevronExpand != null) return _ChevronExpand!!
        
        _ChevronExpand = ImageVector.Builder(
            name = "chevron-expand",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.646f, 9.146f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0f)
                lineTo(8f, 12.793f)
                lineToRelative(3.646f, -3.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.708f, 0.708f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.708f, 0f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -0.708f)
                moveToRelative(0f, -2.292f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, 0f)
                lineTo(8f, 3.207f)
                lineToRelative(3.646f, 3.647f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.708f, -0.708f)
                lineToRelative(-4f, -4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.708f, 0f)
                lineToRelative(-4f, 4f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, 0.708f)
            }
        }.build()
        
        return _ChevronExpand!!
    }

private var _ChevronExpand: ImageVector? = null

