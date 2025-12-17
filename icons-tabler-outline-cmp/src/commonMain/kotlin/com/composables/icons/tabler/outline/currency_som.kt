package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencySom: ImageVector
    get() {
        if (_CurrencySom != null) return _CurrencySom!!
        
        _CurrencySom = ImageVector.Builder(
            name = "currency-som",
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
                moveTo(10f, 18f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                horizontalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, -6f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _CurrencySom!!
    }

private var _CurrencySom: ImageVector? = null

