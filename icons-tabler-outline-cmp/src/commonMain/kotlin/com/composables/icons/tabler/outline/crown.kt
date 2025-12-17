package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Crown: ImageVector
    get() {
        if (_Crown != null) return _Crown!!
        
        _Crown = ImageVector.Builder(
            name = "crown",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 6f)
                lineToRelative(4f, 6f)
                lineToRelative(5f, -4f)
                lineToRelative(-2f, 10f)
                horizontalLineToRelative(-14f)
                lineToRelative(-2f, -10f)
                lineToRelative(5f, 4f)
                close()
            }
        }.build()
        
        return _Crown!!
    }

private var _Crown: ImageVector? = null

