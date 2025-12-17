package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyLitecoin: ImageVector
    get() {
        if (_CurrencyLitecoin != null) return _CurrencyLitecoin!!
        
        _CurrencyLitecoin = ImageVector.Builder(
            name = "currency-litecoin",
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
                moveTo(18f, 19f)
                horizontalLineToRelative(-8.194f)
                arcToRelative(2f, 2f, 0f, false, true, -1.98f, -2.283f)
                lineToRelative(1.674f, -11.717f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 9f)
                lineToRelative(-9f, 4f)
            }
        }.build()
        
        return _CurrencyLitecoin!!
    }

private var _CurrencyLitecoin: ImageVector? = null

