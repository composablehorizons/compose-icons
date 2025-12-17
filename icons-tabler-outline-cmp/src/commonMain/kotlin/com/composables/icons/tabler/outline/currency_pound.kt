package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyPound: ImageVector
    get() {
        if (_CurrencyPound != null) return _CurrencyPound!!
        
        _CurrencyPound = ImageVector.Builder(
            name = "currency-pound",
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
                moveTo(17f, 18.5f)
                arcToRelative(6f, 6f, 0f, false, true, -5f, 0f)
                arcToRelative(6f, 6f, 0f, false, false, -5f, 0.5f)
                arcToRelative(3f, 3f, 0f, false, false, 2f, -2.5f)
                verticalLineToRelative(-7.5f)
                arcToRelative(4f, 4f, 0f, false, true, 7.45f, -2f)
                moveToRelative(-2.55f, 6f)
                horizontalLineToRelative(-7f)
            }
        }.build()
        
        return _CurrencyPound!!
    }

private var _CurrencyPound: ImageVector? = null

