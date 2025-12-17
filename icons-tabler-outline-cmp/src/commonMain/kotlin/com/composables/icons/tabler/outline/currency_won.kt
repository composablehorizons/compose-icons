package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyWon: ImageVector
    get() {
        if (_CurrencyWon != null) return _CurrencyWon!!
        
        _CurrencyWon = ImageVector.Builder(
            name = "currency-won",
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
                moveTo(4f, 6f)
                lineToRelative(3.245f, 11.358f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, 1.624f, 0.035f)
                lineToRelative(3.131f, -9.393f)
                lineToRelative(3.131f, 9.393f)
                arcToRelative(0.85f, 0.85f, 0f, false, false, 1.624f, -0.035f)
                lineToRelative(3.245f, -11.358f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 10f)
                horizontalLineToRelative(-18f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 14f)
                horizontalLineToRelative(-18f)
            }
        }.build()
        
        return _CurrencyWon!!
    }

private var _CurrencyWon: ImageVector? = null

