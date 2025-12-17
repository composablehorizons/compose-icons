package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyMonero: ImageVector
    get() {
        if (_CurrencyMonero != null) return _CurrencyMonero!!
        
        _CurrencyMonero = ImageVector.Builder(
            name = "currency-monero",
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
                moveTo(3f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11f)
                lineToRelative(6f, 7f)
                lineToRelative(6f, -7f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(3f)
            }
        }.build()
        
        return _CurrencyMonero!!
    }

private var _CurrencyMonero: ImageVector? = null

