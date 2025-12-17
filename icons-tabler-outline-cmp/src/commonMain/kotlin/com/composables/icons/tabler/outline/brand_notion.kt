package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandNotion: ImageVector
    get() {
        if (_BrandNotion != null) return _BrandNotion!!
        
        _BrandNotion = ImageVector.Builder(
            name = "brand-notion",
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
                moveTo(11f, 17.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(0.5f)
                lineToRelative(4f, 6f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-6.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.077f, 20.071f)
                lineToRelative(-11.53f, 0.887f)
                arcToRelative(1f, 1f, 0f, false, true, -0.876f, -0.397f)
                lineToRelative(-2.471f, -3.294f)
                arcToRelative(1f, 1f, 0f, false, true, -0.2f, -0.6f)
                verticalLineToRelative(-10.741f)
                arcToRelative(1f, 1f, 0f, false, true, 0.923f, -0.997f)
                lineToRelative(11.389f, -0.876f)
                arcToRelative(2f, 2f, 0f, false, true, 1.262f, 0.33f)
                lineToRelative(1.535f, 1.023f)
                arcToRelative(2f, 2f, 0f, false, true, 0.891f, 1.664f)
                verticalLineToRelative(12.004f)
                arcToRelative(1f, 1f, 0f, false, true, -0.923f, 0.997f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4.5f, 5.5f)
                lineToRelative(2.5f, 2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 7f)
                lineToRelative(-13f, 1f)
                verticalLineToRelative(12.5f)
            }
        }.build()
        
        return _BrandNotion!!
    }

private var _BrandNotion: ImageVector? = null

