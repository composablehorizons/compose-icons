package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowUturnLeft: ImageVector
    get() {
        if (_ArrowUturnLeft != null) return _ArrowUturnLeft!!
        
        _ArrowUturnLeft = ImageVector.Builder(
            name = "arrow-uturn-left",
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
                moveTo(9f, 15f)
                lineTo(3f, 9f)
                moveToRelative(0f, 0f)
                lineToRelative(6f, -6f)
                moveTo(3f, 9f)
                horizontalLineToRelative(12f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, 12f)
                horizontalLineToRelative(-3f)
            }
        }.build()
        
        return _ArrowUturnLeft!!
    }

private var _ArrowUturnLeft: ImageVector? = null

