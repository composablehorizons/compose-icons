package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandPlanetscale: ImageVector
    get() {
        if (_BrandPlanetscale != null) return _BrandPlanetscale!!
        
        _BrandPlanetscale = ImageVector.Builder(
            name = "brand-planetscale",
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
                moveTo(20.993f, 11.63f)
                arcToRelative(9f, 9f, 0f, false, true, -9.362f, 9.362f)
                lineToRelative(9.362f, -9.362f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                arcToRelative(9.001f, 9.001f, 0f, false, true, 8.166f, 5.211f)
                lineToRelative(-11.955f, 11.955f)
                arcToRelative(9f, 9f, 0f, false, true, 3.789f, -17.166f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 12f)
                lineToRelative(-6f, 6f)
            }
        }.build()
        
        return _BrandPlanetscale!!
    }

private var _BrandPlanetscale: ImageVector? = null

