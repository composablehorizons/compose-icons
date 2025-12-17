package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.PaperAirplane: ImageVector
    get() {
        if (_PaperAirplane != null) return _PaperAirplane!!
        
        _PaperAirplane = ImageVector.Builder(
            name = "paper-airplane",
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
                moveTo(6f, 12f)
                lineTo(3.269f, 3.125f)
                arcTo(59.769f, 59.769f, 0f, false, true, 21.485f, 12f)
                arcTo(59.768f, 59.768f, 0f, false, true, 3.27f, 20.875f)
                lineTo(5.999f, 12f)
                close()
                moveToRelative(0f, 0f)
                horizontalLineToRelative(7.5f)
            }
        }.build()
        
        return _PaperAirplane!!
    }

private var _PaperAirplane: ImageVector? = null

