package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowUturnDown: ImageVector
    get() {
        if (_ArrowUturnDown != null) return _ArrowUturnDown!!
        
        _ArrowUturnDown = ImageVector.Builder(
            name = "arrow-uturn-down",
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
                moveTo(15f, 15f)
                lineToRelative(-6f, 6f)
                moveToRelative(0f, 0f)
                lineToRelative(-6f, -6f)
                moveToRelative(6f, 6f)
                verticalLineTo(9f)
                arcToRelative(6f, 6f, 0f, false, true, 12f, 0f)
                verticalLineToRelative(3f)
            }
        }.build()
        
        return _ArrowUturnDown!!
    }

private var _ArrowUturnDown: ImageVector? = null

