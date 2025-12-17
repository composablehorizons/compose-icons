package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BucketOff: ImageVector
    get() {
        if (_BucketOff != null) return _BucketOff!!
        
        _BucketOff = ImageVector.Builder(
            name = "bucket-off",
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
                moveTo(5.029f, 5.036f)
                curveToRelative(-0.655f, 0.58f, -1.029f, 1.25f, -1.029f, 1.964f)
                curveToRelative(0f, 2.033f, 3.033f, 3.712f, 6.96f, 3.967f)
                moveToRelative(3.788f, -0.21f)
                curveToRelative(3.064f, -0.559f, 5.252f, -2.029f, 5.252f, -3.757f)
                curveToRelative(0f, -2.21f, -3.582f, -4f, -8f, -4f)
                curveToRelative(-1.605f, 0f, -3.1f, 0.236f, -4.352f, 0.643f)
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
                curveToRelative(0.1f, -0.3f, 0.252f, -0.812f, 0.457f, -1.535f)
                moveToRelative(0.862f, -3.146f)
                curveToRelative(0.262f, -0.975f, 0.735f, -2.76f, 1.418f, -5.354f)
                arcToRelative(7.45f, 7.45f, 0f, false, false, 0.263f, -1.965f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _BucketOff!!
    }

private var _BucketOff: ImageVector? = null

