package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPushover: ImageVector
    get() {
        if (_BrandPushover != null) return _BrandPushover!!
        
        _BrandPushover = ImageVector.Builder(
            name = "brand-pushover",
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
                moveTo(6.16f, 10.985f)
                curveToRelative(-0.83f, -1.935f, 1.53f, -7.985f, 8.195f, -7.985f)
                curveToRelative(3.333f, 0f, 4.645f, 1.382f, 4.645f, 3.9f)
                curveToRelative(0f, 2.597f, -2.612f, 6.1f, -9f, 6.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 6f)
                lineToRelative(-5.5f, 15f)
            }
        }.build()
        
        return _BrandPushover!!
    }

private var _BrandPushover: ImageVector? = null

