package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandVolkswagen: ImageVector
    get() {
        if (_BrandVolkswagen != null) return _BrandVolkswagen!!
        
        _BrandVolkswagen = ImageVector.Builder(
            name = "brand-volkswagen",
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
                moveTo(12f, 21f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, -9f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, -9f)
                arcToRelative(9f, 9f, 0f, false, false, -9f, 9f)
                arcToRelative(9f, 9f, 0f, false, false, 9f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5f, 7f)
                lineToRelative(4.5f, 11f)
                lineToRelative(1.5f, -5f)
                horizontalLineToRelative(2f)
                lineToRelative(1.5f, 5f)
                lineToRelative(4.5f, -11f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 4f)
                lineToRelative(2f, 6f)
                horizontalLineToRelative(2f)
                lineToRelative(2f, -6f)
            }
        }.build()
        
        return _BrandVolkswagen!!
    }

private var _BrandVolkswagen: ImageVector? = null

