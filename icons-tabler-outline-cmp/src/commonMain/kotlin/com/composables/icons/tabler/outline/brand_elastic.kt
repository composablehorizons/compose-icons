package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandElastic: ImageVector
    get() {
        if (_BrandElastic != null) return _BrandElastic!!
        
        _BrandElastic = ImageVector.Builder(
            name = "brand-elastic",
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
                moveTo(14f, 2f)
                arcToRelative(5f, 5f, 0f, false, true, 5f, 5f)
                curveToRelative(0f, 0.712f, -0.232f, 1.387f, -0.5f, 2f)
                curveToRelative(1.894f, 0.042f, 3.5f, 1.595f, 3.5f, 3.5f)
                curveToRelative(0f, 1.869f, -1.656f, 3.4f, -3.5f, 3.5f)
                curveToRelative(0.333f, 0.625f, 0.5f, 1.125f, 0.5f, 1.5f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -2.5f, 2.5f)
                curveToRelative(-0.787f, 0f, -1.542f, -0.432f, -2f, -1f)
                curveToRelative(-0.786f, 1.73f, -2.476f, 3f, -4.5f, 3f)
                arcToRelative(5f, 5f, 0f, false, true, -4.583f, -7f)
                arcToRelative(3.5f, 3.5f, 0f, false, true, -0.11f, -6.992f)
                lineToRelative(0.195f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2f, -4f)
                curveToRelative(0.787f, 0f, 1.542f, 0.432f, 2f, 1f)
                curveToRelative(0.786f, -1.73f, 2.476f, -3f, 4.5f, -3f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 9f)
                lineToRelative(-3f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 5f)
                lineToRelative(-1f, 4f)
                lineToRelative(1f, 2f)
                lineToRelative(5f, 2f)
                lineToRelative(4f, -4f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18.499f, 16f)
                lineToRelative(-3f, -0.5f)
                lineToRelative(-1f, -2.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 19f)
                lineToRelative(1f, -3.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.417f, 15f)
                lineToRelative(4.083f, -4f)
            }
        }.build()
        
        return _BrandElastic!!
    }

private var _BrandElastic: ImageVector? = null

