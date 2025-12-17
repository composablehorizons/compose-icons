package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBing: ImageVector
    get() {
        if (_BrandBing != null) return _BrandBing!!
        
        _BrandBing = ImageVector.Builder(
            name = "brand-bing",
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
                moveTo(5f, 3f)
                lineToRelative(4f, 1.5f)
                verticalLineToRelative(12f)
                lineToRelative(6f, -2.5f)
                lineToRelative(-2f, -1f)
                lineToRelative(-1f, -4f)
                lineToRelative(7f, 2.5f)
                verticalLineToRelative(4.5f)
                lineToRelative(-10f, 5f)
                lineToRelative(-4f, -2f)
                close()
            }
        }.build()
        
        return _BrandBing!!
    }

private var _BrandBing: ImageVector? = null

