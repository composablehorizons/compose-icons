package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowPath: ImageVector
    get() {
        if (_ArrowPath != null) return _ArrowPath!!
        
        _ArrowPath = ImageVector.Builder(
            name = "arrow-path",
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
                moveTo(16.023f, 9.348f)
                horizontalLineToRelative(4.992f)
                verticalLineToRelative(-0.001f)
                moveTo(2.985f, 19.644f)
                verticalLineToRelative(-4.992f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(4.992f)
                moveToRelative(-4.993f, 0f)
                lineToRelative(3.181f, 3.183f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, 13.803f, -3.7f)
                moveTo(4.031f, 9.865f)
                arcToRelative(8.25f, 8.25f, 0f, false, true, 13.803f, -3.7f)
                lineToRelative(3.181f, 3.182f)
                moveToRelative(0f, -4.991f)
                verticalLineToRelative(4.99f)
            }
        }.build()
        
        return _ArrowPath!!
    }

private var _ArrowPath: ImageVector? = null

