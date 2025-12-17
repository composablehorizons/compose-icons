package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyGuarani: ImageVector
    get() {
        if (_CurrencyGuarani != null) return _CurrencyGuarani!!
        
        _CurrencyGuarani = ImageVector.Builder(
            name = "currency-guarani",
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
                moveTo(16.007f, 7.54f)
                arcToRelative(5.965f, 5.965f, 0f, false, false, -4.008f, -1.54f)
                arcToRelative(6f, 6f, 0f, false, false, -5.992f, 6f)
                curveToRelative(0f, 3.314f, 2.682f, 6f, 5.992f, 6f)
                arcToRelative(5.965f, 5.965f, 0f, false, false, 4f, -1.536f)
                curveToRelative(0.732f, -0.66f, 1.064f, -2.148f, 1f, -4.464f)
                horizontalLineToRelative(-5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 20f)
                verticalLineToRelative(-16f)
            }
        }.build()
        
        return _CurrencyGuarani!!
    }

private var _CurrencyGuarani: ImageVector? = null

