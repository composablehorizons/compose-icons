package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCupra: ImageVector
    get() {
        if (_BrandCupra != null) return _BrandCupra!!
        
        _BrandCupra = ImageVector.Builder(
            name = "brand-cupra",
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
                moveTo(4.5f, 10f)
                lineToRelative(-2.5f, -4f)
                lineToRelative(15.298f, 6.909f)
                arcToRelative(0.2f, 0.2f, 0f, false, true, 0.09f, 0.283f)
                lineToRelative(-3.388f, 5.808f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 19f)
                lineToRelative(-3.388f, -5.808f)
                arcToRelative(0.2f, 0.2f, 0f, false, true, 0.09f, -0.283f)
                lineToRelative(15.298f, -6.909f)
                lineToRelative(-2.5f, 4f)
            }
        }.build()
        
        return _BrandCupra!!
    }

private var _BrandCupra: ImageVector? = null

