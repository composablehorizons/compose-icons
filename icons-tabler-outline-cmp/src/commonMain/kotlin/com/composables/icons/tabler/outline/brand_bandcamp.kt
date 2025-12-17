package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBandcamp: ImageVector
    get() {
        if (_BrandBandcamp != null) return _BrandBandcamp!!
        
        _BrandBandcamp = ImageVector.Builder(
            name = "brand-bandcamp",
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
                moveTo(8.5f, 6f)
                horizontalLineToRelative(13.5f)
                lineToRelative(-7f, 12f)
                horizontalLineToRelative(-13f)
                close()
            }
        }.build()
        
        return _BrandBandcamp!!
    }

private var _BrandBandcamp: ImageVector? = null

