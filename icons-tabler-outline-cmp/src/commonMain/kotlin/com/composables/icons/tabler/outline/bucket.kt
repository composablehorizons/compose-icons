package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bucket: ImageVector
    get() {
        if (_Bucket != null) return _Bucket!!
        
        _Bucket = ImageVector.Builder(
            name = "bucket",
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
                moveTo(12f, 7f)
                moveToRelative(-8f, 0f)
                arcToRelative(8f, 4f, 0f, true, false, 16f, 0f)
                arcToRelative(8f, 4f, 0f, true, false, -16f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 7f)
                curveToRelative(0f, 0.664f, 0.088f, 1.324f, 0.263f, 1.965f)
                lineToRelative(2.737f, 10.035f)
                curveToRelative(0.5f, 1.5f, 2.239f, 2f, 5f, 2f)
                reflectiveCurveToRelative(4.5f, -0.5f, 5f, -2f)
                curveToRelative(0.333f, -1f, 1.246f, -4.345f, 2.737f, -10.035f)
                arcToRelative(7.45f, 7.45f, 0f, false, false, 0.263f, -1.965f)
            }
        }.build()
        
        return _Bucket!!
    }

private var _Bucket: ImageVector? = null

