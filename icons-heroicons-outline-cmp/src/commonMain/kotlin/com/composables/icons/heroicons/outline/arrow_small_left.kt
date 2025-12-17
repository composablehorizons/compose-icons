package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowSmallLeft: ImageVector
    get() {
        if (_ArrowSmallLeft != null) return _ArrowSmallLeft!!
        
        _ArrowSmallLeft = ImageVector.Builder(
            name = "arrow-small-left",
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
                moveTo(19.5f, 12f)
                horizontalLineToRelative(-15f)
                moveToRelative(0f, 0f)
                lineToRelative(6.75f, 6.75f)
                moveTo(4.5f, 12f)
                lineToRelative(6.75f, -6.75f)
            }
        }.build()
        
        return _ArrowSmallLeft!!
    }

private var _ArrowSmallLeft: ImageVector? = null

