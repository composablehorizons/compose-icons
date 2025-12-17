package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandAlpineJs: ImageVector
    get() {
        if (_BrandAlpineJs != null) return _BrandAlpineJs!!
        
        _BrandAlpineJs = ImageVector.Builder(
            name = "brand-alpine-js",
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
                moveTo(3f, 11.5f)
                lineToRelative(4.5f, 4.5f)
                horizontalLineToRelative(9f)
                lineToRelative(-9f, -9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.5f, 16f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-4.5f, 4.5f)
            }
        }.build()
        
        return _BrandAlpineJs!!
    }

private var _BrandAlpineJs: ImageVector? = null

