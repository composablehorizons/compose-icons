package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandFramerMotion: ImageVector
    get() {
        if (_BrandFramerMotion != null) return _BrandFramerMotion!!
        
        _BrandFramerMotion = ImageVector.Builder(
            name = "brand-framer-motion",
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
                moveTo(12f, 12f)
                lineToRelative(-8f, -8f)
                verticalLineToRelative(16f)
                lineToRelative(16f, -16f)
                verticalLineToRelative(16f)
                lineToRelative(-4f, -4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                lineToRelative(-8f, 8f)
                lineToRelative(-4f, -4f)
            }
        }.build()
        
        return _BrandFramerMotion!!
    }

private var _BrandFramerMotion: ImageVector? = null

