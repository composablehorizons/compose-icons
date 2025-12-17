package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyRiyal: ImageVector
    get() {
        if (_CurrencyRiyal != null) return _CurrencyRiyal!!
        
        _CurrencyRiyal = ImageVector.Builder(
            name = "currency-riyal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 9f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                verticalLineToRelative(-1f)
                verticalLineToRelative(4f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                verticalLineToRelative(-2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12.01f)
                verticalLineToRelative(-0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 10f)
                verticalLineToRelative(1f)
                arcToRelative(5f, 5f, 0f, false, true, -5f, 5f)
            }
        }.build()
        
        return _CurrencyRiyal!!
    }

private var _CurrencyRiyal: ImageVector? = null

