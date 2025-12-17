package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyXrp: ImageVector
    get() {
        if (_CurrencyXrp != null) return _CurrencyXrp!!
        
        _CurrencyXrp = ImageVector.Builder(
            name = "currency-xrp",
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
                moveTo(5f, 5f)
                lineToRelative(3.585f, 3.585f)
                arcToRelative(4.83f, 4.83f, 0f, false, false, 6.83f, 0f)
                lineToRelative(3.585f, -3.585f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 19f)
                lineToRelative(3.585f, -3.585f)
                arcToRelative(4.83f, 4.83f, 0f, false, true, 6.83f, 0f)
                lineToRelative(3.585f, 3.584f)
            }
        }.build()
        
        return _CurrencyXrp!!
    }

private var _CurrencyXrp: ImageVector? = null

