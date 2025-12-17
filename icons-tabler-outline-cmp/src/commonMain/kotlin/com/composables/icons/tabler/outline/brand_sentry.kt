package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandSentry: ImageVector
    get() {
        if (_BrandSentry != null) return _BrandSentry!!
        
        _BrandSentry = ImageVector.Builder(
            name = "brand-sentry",
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
                moveTo(3f, 18f)
                arcToRelative(1.93f, 1.93f, 0f, false, false, 0.306f, 1.076f)
                arcToRelative(2f, 2f, 0f, false, false, 1.584f, 0.924f)
                curveToRelative(0.646f, 0.033f, -0.537f, 0f, 0.11f, 0f)
                horizontalLineToRelative(3f)
                arcToRelative(4.992f, 4.992f, 0f, false, false, -3.66f, -4.81f)
                curveToRelative(0.558f, -0.973f, 1.24f, -2.149f, 2.04f, -3.531f)
                arcToRelative(9f, 9f, 0f, false, true, 5.62f, 8.341f)
                horizontalLineToRelative(4f)
                curveToRelative(0.663f, 0f, 2.337f, 0f, 3f, 0f)
                arcToRelative(2f, 2f, 0f, false, false, 1.84f, -2.75f)
                lineToRelative(-7.1f, -12.25f)
                arcToRelative(2f, 2f, 0f, false, false, -3.5f, 0f)
                lineToRelative(-1.84f, 3.176f)
                curveToRelative(4.482f, 2.05f, 7.6f, 6.571f, 7.6f, 11.824f)
            }
        }.build()
        
        return _BrandSentry!!
    }

private var _BrandSentry: ImageVector? = null

