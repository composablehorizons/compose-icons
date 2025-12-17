package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyLeu: ImageVector
    get() {
        if (_CurrencyLeu != null) return _CurrencyLeu!!
        
        _CurrencyLeu = ImageVector.Builder(
            name = "currency-leu",
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
                moveTo(17f, 18f)
                horizontalLineToRelative(-7f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-10f)
            }
        }.build()
        
        return _CurrencyLeu!!
    }

private var _CurrencyLeu: ImageVector? = null

