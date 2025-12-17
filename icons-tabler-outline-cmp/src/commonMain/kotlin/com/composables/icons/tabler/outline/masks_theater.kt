package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MasksTheater: ImageVector
    get() {
        if (_MasksTheater != null) return _MasksTheater!!
        
        _MasksTheater = ImageVector.Builder(
            name = "masks-theater",
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
                moveTo(13.192f, 9f)
                horizontalLineToRelative(6.616f)
                arcToRelative(2f, 2f, 0f, false, true, 1.992f, 2.183f)
                lineToRelative(-0.567f, 6.182f)
                arcToRelative(4f, 4f, 0f, false, true, -3.983f, 3.635f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4f, 4f, 0f, false, true, -3.983f, -3.635f)
                lineToRelative(-0.567f, -6.182f)
                arcToRelative(2f, 2f, 0f, false, true, 1.992f, -2.183f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 13f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 16.5f)
                curveToRelative(1f, 0.667f, 2f, 0.667f, 3f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.632f, 15.982f)
                arcToRelative(4.037f, 4.037f, 0f, false, true, -0.382f, 0.018f)
                horizontalLineToRelative(-1.5f)
                arcToRelative(4f, 4f, 0f, false, true, -3.983f, -3.635f)
                lineToRelative(-0.567f, -6.182f)
                arcToRelative(2f, 2f, 0f, false, true, 1.992f, -2.183f)
                horizontalLineToRelative(6.616f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 8f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 8f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                curveToRelative(0.764f, -0.51f, 1.528f, -0.63f, 2.291f, -0.36f)
            }
        }.build()
        
        return _MasksTheater!!
    }

private var _MasksTheater: ImageVector? = null

