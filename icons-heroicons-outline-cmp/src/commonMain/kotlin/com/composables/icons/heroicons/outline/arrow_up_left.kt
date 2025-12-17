package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowUpLeft: ImageVector
    get() {
        if (_ArrowUpLeft != null) return _ArrowUpLeft!!
        
        _ArrowUpLeft = ImageVector.Builder(
            name = "arrow-up-left",
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
                moveTo(19.5f, 19.5f)
                lineToRelative(-15f, -15f)
                moveToRelative(0f, 0f)
                verticalLineToRelative(11.25f)
                moveToRelative(0f, -11.25f)
                horizontalLineToRelative(11.25f)
            }
        }.build()
        
        return _ArrowUpLeft!!
    }

private var _ArrowUpLeft: ImageVector? = null

