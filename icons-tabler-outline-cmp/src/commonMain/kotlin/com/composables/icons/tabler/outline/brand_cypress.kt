package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCypress: ImageVector
    get() {
        if (_BrandCypress != null) return _BrandCypress!!
        
        _BrandCypress = ImageVector.Builder(
            name = "brand-cypress",
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
                moveTo(19.48f, 17.007f)
                arcToRelative(9f, 9f, 0f, true, false, -7.48f, 3.993f)
                curveToRelative(0.896f, 0f, 1.691f, -0.573f, 1.974f, -1.423f)
                lineToRelative(3.526f, -10.577f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.5f, 9f)
                lineToRelative(2f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.764f, 9.411f)
                arcToRelative(3f, 3f, 0f, true, false, -0.023f, 5.19f)
            }
        }.build()
        
        return _BrandCypress!!
    }

private var _BrandCypress: ImageVector? = null

