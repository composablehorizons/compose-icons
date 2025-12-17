package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyDollarOff: ImageVector
    get() {
        if (_CurrencyDollarOff != null) return _CurrencyDollarOff!!
        
        _CurrencyDollarOff = ImageVector.Builder(
            name = "currency-dollar-off",
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
                moveTo(16.7f, 8f)
                arcToRelative(3f, 3f, 0f, false, false, -2.7f, -2f)
                horizontalLineToRelative(-4f)
                moveToRelative(-2.557f, 1.431f)
                arcToRelative(3f, 3f, 0f, false, false, 2.557f, 4.569f)
                horizontalLineToRelative(2f)
                moveToRelative(4.564f, 4.558f)
                arcToRelative(3f, 3f, 0f, false, true, -2.564f, 1.442f)
                horizontalLineToRelative(-4f)
                arcToRelative(3f, 3f, 0f, false, true, -2.7f, -2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(3f)
                moveToRelative(0f, 12f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _CurrencyDollarOff!!
    }

private var _CurrencyDollarOff: ImageVector? = null

