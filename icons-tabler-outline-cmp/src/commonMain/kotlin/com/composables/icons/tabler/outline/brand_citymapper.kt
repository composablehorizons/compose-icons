package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandCitymapper: ImageVector
    get() {
        if (_BrandCitymapper != null) return _BrandCitymapper!!
        
        _BrandCitymapper = ImageVector.Builder(
            name = "brand-citymapper",
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
                moveTo(3f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, -1f, 1.013f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                verticalLineToRelative(-0.013f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(21f, 11f)
                arcToRelative(1f, 1f, 0f, true, true, -1f, 1.013f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                verticalLineToRelative(-0.013f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 12f)
                horizontalLineToRelative(8f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13f, 9f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
        }.build()
        
        return _BrandCitymapper!!
    }

private var _BrandCitymapper: ImageVector? = null

