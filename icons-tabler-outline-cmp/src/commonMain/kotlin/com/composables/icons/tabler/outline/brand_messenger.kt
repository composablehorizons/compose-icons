package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandMessenger: ImageVector
    get() {
        if (_BrandMessenger != null) return _BrandMessenger!!
        
        _BrandMessenger = ImageVector.Builder(
            name = "brand-messenger",
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
                moveTo(3f, 20f)
                lineToRelative(1.3f, -3.9f)
                arcToRelative(9f, 8f, 0f, true, true, 3.4f, 2.9f)
                lineToRelative(-4.7f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 13f)
                lineToRelative(3f, -2f)
                lineToRelative(2f, 2f)
                lineToRelative(3f, -2f)
            }
        }.build()
        
        return _BrandMessenger!!
    }

private var _BrandMessenger: ImageVector? = null

