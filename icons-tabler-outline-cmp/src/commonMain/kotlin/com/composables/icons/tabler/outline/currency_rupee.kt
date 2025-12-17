package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyRupee: ImageVector
    get() {
        if (_CurrencyRupee != null) return _CurrencyRupee!!
        
        _CurrencyRupee = ImageVector.Builder(
            name = "currency-rupee",
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
                moveTo(18f, 5f)
                horizontalLineToRelative(-11f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, false, true, 0f, 8f)
                horizontalLineToRelative(-3f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 9f)
                lineToRelative(11f, 0f)
            }
        }.build()
        
        return _CurrencyRupee!!
    }

private var _CurrencyRupee: ImageVector? = null

