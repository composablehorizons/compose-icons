package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CurrencyDinar: ImageVector
    get() {
        if (_CurrencyDinar != null) return _CurrencyDinar!!
        
        _CurrencyDinar = ImageVector.Builder(
            name = "currency-dinar",
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
                moveTo(14f, 20.01f)
                verticalLineToRelative(-0.01f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 13f)
                lineToRelative(2.386f, -0.9f)
                arcToRelative(1f, 1f, 0f, false, false, -0.095f, -1.902f)
                lineToRelative(-1.514f, -0.404f)
                arcToRelative(1f, 1f, 0f, false, true, -0.102f, -1.9f)
                lineToRelative(2.325f, -0.894f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 14f)
                verticalLineToRelative(1f)
                arcToRelative(3f, 3f, 0f, false, false, 3f, 3f)
                horizontalLineToRelative(4.161f)
                arcToRelative(3f, 3f, 0f, false, false, 2.983f, -3.32f)
                lineToRelative(-1.144f, -10.68f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 17f)
                lineToRelative(1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 1.649f, -3.131f)
                lineToRelative(-2.653f, -3.869f)
            }
        }.build()
        
        return _CurrencyDinar!!
    }

private var _CurrencyDinar: ImageVector? = null

