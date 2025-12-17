package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.CircleSmall: ImageVector
    get() {
        if (_CircleSmall != null) return _CircleSmall!!
        
        _CircleSmall = ImageVector.Builder(
            name = "circle-small",
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
                moveTo(18f, 12f)
                arcTo(6f, 6f, 0f, false, true, 12f, 18f)
                arcTo(6f, 6f, 0f, false, true, 6f, 12f)
                arcTo(6f, 6f, 0f, false, true, 18f, 12f)
                close()
            }
        }.build()
        
        return _CircleSmall!!
    }

private var _CircleSmall: ImageVector? = null

