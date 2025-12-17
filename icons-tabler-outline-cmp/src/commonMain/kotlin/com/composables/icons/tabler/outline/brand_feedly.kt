package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandFeedly: ImageVector
    get() {
        if (_BrandFeedly != null) return _BrandFeedly!!
        
        _BrandFeedly = ImageVector.Builder(
            name = "brand-feedly",
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
                moveTo(7.833f, 12.278f)
                lineToRelative(4.445f, -4.445f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.055f, 14.5f)
                lineToRelative(2.223f, -2.222f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.278f, 16.722f)
                lineToRelative(0.555f, -0.555f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.828f, 14.828f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -5.656f)
                lineToRelative(-5f, -5f)
                arcToRelative(4f, 4f, 0f, false, false, -5.656f, 0f)
                lineToRelative(-5f, 5f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, 5.656f)
                lineToRelative(6.171f, 6.172f)
                horizontalLineToRelative(3.314f)
                lineToRelative(6.171f, -6.172f)
                close()
            }
        }.build()
        
        return _BrandFeedly!!
    }

private var _BrandFeedly: ImageVector? = null

