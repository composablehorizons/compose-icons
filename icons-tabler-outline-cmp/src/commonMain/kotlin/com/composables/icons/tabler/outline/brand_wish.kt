package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandWish: ImageVector
    get() {
        if (_BrandWish != null) return _BrandWish!!
        
        _BrandWish = ImageVector.Builder(
            name = "brand-wish",
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
                moveTo(2f, 6f)
                lineToRelative(5.981f, 2.392f)
                lineToRelative(-0.639f, 6.037f)
                curveToRelative(-0.18f, 0.893f, 0.06f, 1.819f, 0.65f, 2.514f)
                arcToRelative(3f, 3f, 0f, false, false, 2.381f, 1.057f)
                arcToRelative(4.328f, 4.328f, 0f, false, false, 4.132f, -3.57f)
                curveToRelative(-0.18f, 0.893f, 0.06f, 1.819f, 0.65f, 2.514f)
                arcToRelative(3f, 3f, 0f, false, false, 2.38f, 1.056f)
                arcToRelative(4.328f, 4.328f, 0f, false, false, 4.132f, -3.57f)
                lineToRelative(0.333f, -4.633f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.504f, 14.429f)
                lineToRelative(0.334f, -3f)
            }
        }.build()
        
        return _BrandWish!!
    }

private var _BrandWish: ImageVector? = null

