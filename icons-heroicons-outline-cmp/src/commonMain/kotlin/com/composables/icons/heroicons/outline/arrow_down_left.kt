package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowDownLeft: ImageVector
    get() {
        if (_ArrowDownLeft != null) return _ArrowDownLeft!!
        
        _ArrowDownLeft = ImageVector.Builder(
            name = "arrow-down-left",
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
                moveTo(19.5f, 4.5f)
                lineToRelative(-15f, 15f)
                moveToRelative(0f, 0f)
                horizontalLineToRelative(11.25f)
                moveToRelative(-11.25f, 0f)
                verticalLineTo(8.25f)
            }
        }.build()
        
        return _ArrowDownLeft!!
    }

private var _ArrowDownLeft: ImageVector? = null

