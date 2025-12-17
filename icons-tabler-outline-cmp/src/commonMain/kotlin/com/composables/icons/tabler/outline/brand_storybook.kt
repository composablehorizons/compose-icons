package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandStorybook: ImageVector
    get() {
        if (_BrandStorybook != null) return _BrandStorybook!!
        
        _BrandStorybook = ImageVector.Builder(
            name = "brand-storybook",
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
                moveTo(5f, 4f)
                lineToRelative(0.5f, 16.5f)
                lineToRelative(13.5f, 0.5f)
                verticalLineToRelative(-18f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 15f)
                curveToRelative(0.6f, 1.5f, 1.639f, 2f, 3.283f, 2f)
                horizontalLineToRelative(-0.283f)
                curveToRelative(1.8f, 0f, 3f, -0.974f, 3f, -2.435f)
                curveToRelative(0f, -1.194f, -0.831f, -1.799f, -2.147f, -2.333f)
                lineToRelative(-1.975f, -0.802f)
                curveToRelative(-1.15f, -0.467f, -1.878f, -1.422f, -1.878f, -2.467f)
                curveToRelative(0f, -0.97f, 0.899f, -1.786f, 2.087f, -1.893f)
                lineToRelative(0.613f, -0.055f)
                curveToRelative(1.528f, -0.138f, 3f, 0.762f, 3.3f, 1.985f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 3.5f)
                verticalLineToRelative(1f)
            }
        }.build()
        
        return _BrandStorybook!!
    }

private var _BrandStorybook: ImageVector? = null

