package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.ArrowLongDown: ImageVector
    get() {
        if (_ArrowLongDown != null) return _ArrowLongDown!!
        
        _ArrowLongDown = ImageVector.Builder(
            name = "arrow-long-down",
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
                moveTo(15.75f, 17.25f)
                lineTo(12f, 21f)
                moveToRelative(0f, 0f)
                lineToRelative(-3.75f, -3.75f)
                moveTo(12f, 21f)
                verticalLineTo(3f)
            }
        }.build()
        
        return _ArrowLongDown!!
    }

private var _ArrowLongDown: ImageVector? = null

