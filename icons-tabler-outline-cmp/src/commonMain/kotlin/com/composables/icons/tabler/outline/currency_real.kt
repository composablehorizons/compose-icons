package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyReal: ImageVector
    get() {
        if (_CurrencyReal != null) return _CurrencyReal!!
        
        _CurrencyReal = ImageVector.Builder(
            name = "currency-real",
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
                moveTo(21f, 6f)
                horizontalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                horizontalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                horizontalLineToRelative(-4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 18f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, 6f)
                horizontalLineToRelative(-3f)
                curveToRelative(5.5f, 0f, 5f, 4f, 6f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 6f)
                verticalLineToRelative(-2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 20f)
                verticalLineToRelative(-2f)
            }
        }.build()
        
        return _CurrencyReal!!
    }

private var _CurrencyReal: ImageVector? = null

