package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BrandReddit: ImageVector
    get() {
        if (_BrandReddit != null) return _BrandReddit!!
        
        _BrandReddit = ImageVector.Builder(
            name = "brand-reddit",
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
                moveTo(12f, 8f)
                curveToRelative(2.648f, 0f, 5.028f, 0.826f, 6.675f, 2.14f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.326f, 4.36f)
                curveToRelative(0f, 3.59f, -4.03f, 6.5f, -9f, 6.5f)
                curveToRelative(-4.875f, 0f, -8.845f, -2.8f, -9f, -6.294f)
                lineToRelative(-1f, -0.206f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.326f, -4.36f)
                curveToRelative(1.646f, -1.313f, 4.026f, -2.14f, 6.674f, -2.14f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineToRelative(1f, -5f)
                lineToRelative(6f, 1f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 4f)
                moveToRelative(-1f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, 2f, 0f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 13f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9f, 13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8.5f, 13f)
                arcTo(0.5f, 0.5f, 0f, false, true, 9.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 13f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15f, 13.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 14.5f, 13f)
                arcTo(0.5f, 0.5f, 0f, false, true, 15.5f, 13f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 17f)
                curveToRelative(0.667f, 0.333f, 1.333f, 0.5f, 2f, 0.5f)
                reflectiveCurveToRelative(1.333f, -0.167f, 2f, -0.5f)
            }
        }.build()
        
        return _BrandReddit!!
    }

private var _BrandReddit: ImageVector? = null

