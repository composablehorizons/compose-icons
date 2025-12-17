package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandBehance: ImageVector
    get() {
        if (_BrandBehance != null) return _BrandBehance!!
        
        _BrandBehance = ImageVector.Builder(
            name = "brand-behance",
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
                verticalLineToRelative(-12f)
                horizontalLineToRelative(4.5f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                arcToRelative(3f, 3f, 0f, false, true, 0f, 6f)
                horizontalLineToRelative(-4.5f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 12f)
                lineToRelative(4.5f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 13f)
                horizontalLineToRelative(7f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -7f, 0f)
                verticalLineToRelative(2f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 6.64f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 6f)
                lineToRelative(3f, 0f)
            }
        }.build()
        
        return _BrandBehance!!
    }

private var _BrandBehance: ImageVector? = null

