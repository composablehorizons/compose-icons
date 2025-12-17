package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandGoogleFit: ImageVector
    get() {
        if (_BrandGoogleFit != null) return _BrandGoogleFit!!
        
        _BrandGoogleFit = ImageVector.Builder(
            name = "brand-google-fit",
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
                moveTo(12f, 8.866f)
                lineToRelative(-2.733f, -2.734f)
                arcToRelative(3.866f, 3.866f, 0f, false, false, -5.467f, 5.467f)
                lineToRelative(2.733f, 2.734f)
                lineToRelative(5.467f, 5.467f)
                lineToRelative(8.202f, -8.201f)
                arcToRelative(3.866f, 3.866f, 0f, false, false, -5.469f, -5.466f)
                lineToRelative(-8.201f, 8.2f)
            }
        }.build()
        
        return _BrandGoogleFit!!
    }

private var _BrandGoogleFit: ImageVector? = null

