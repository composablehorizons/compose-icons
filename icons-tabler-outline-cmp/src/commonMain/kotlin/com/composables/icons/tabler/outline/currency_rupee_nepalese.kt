package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyRupeeNepalese: ImageVector
    get() {
        if (_CurrencyRupeeNepalese != null) return _CurrencyRupeeNepalese!!
        
        _CurrencyRupeeNepalese = ImageVector.Builder(
            name = "currency-rupee-nepalese",
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
                moveTo(15f, 5f)
                horizontalLineToRelative(-11f)
                horizontalLineToRelative(3f)
                arcToRelative(4f, 4f, 0f, true, true, 0f, 8f)
                horizontalLineToRelative(-3f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 17f)
                lineToRelative(-4.586f, -4.414f)
                arcToRelative(2f, 2f, 0f, false, false, -2.828f, 2.828f)
                lineToRelative(0.707f, 0.707f)
            }
        }.build()
        
        return _CurrencyRupeeNepalese!!
    }

private var _CurrencyRupeeNepalese: ImageVector? = null

