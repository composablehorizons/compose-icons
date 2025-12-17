package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandTidal: ImageVector
    get() {
        if (_BrandTidal != null) return _BrandTidal!!
        
        _BrandTidal = ImageVector.Builder(
            name = "brand-tidal",
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
                moveTo(5.333f, 6f)
                lineToRelative(3.334f, 3.25f)
                lineToRelative(3.333f, -3.25f)
                lineToRelative(3.333f, 3.25f)
                lineToRelative(3.334f, -3.25f)
                lineToRelative(3.333f, 3.25f)
                lineToRelative(-3.333f, 3.25f)
                lineToRelative(-3.334f, -3.25f)
                lineToRelative(-3.333f, 3.25f)
                lineToRelative(3.333f, 3.25f)
                lineToRelative(-3.333f, 3.25f)
                lineToRelative(-3.333f, -3.25f)
                lineToRelative(3.333f, -3.25f)
                lineToRelative(-3.333f, -3.25f)
                lineToRelative(-3.334f, 3.25f)
                lineToRelative(-3.333f, -3.25f)
                close()
            }
        }.build()
        
        return _BrandTidal!!
    }

private var _BrandTidal: ImageVector? = null

