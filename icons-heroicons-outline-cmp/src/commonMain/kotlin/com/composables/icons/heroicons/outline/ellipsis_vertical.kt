package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.EllipsisVertical: ImageVector
    get() {
        if (_EllipsisVertical != null) return _EllipsisVertical!!
        
        _EllipsisVertical = ImageVector.Builder(
            name = "ellipsis-vertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(12f, 6.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                close()
                moveTo(12f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                close()
                moveTo(12f, 18.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                close()
            }
        }.build()
        
        return _EllipsisVertical!!
    }

private var _EllipsisVertical: ImageVector? = null

