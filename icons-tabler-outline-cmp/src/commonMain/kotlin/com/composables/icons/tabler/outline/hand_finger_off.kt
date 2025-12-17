package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HandFingerOff: ImageVector
    get() {
        if (_HandFingerOff != null) return _HandFingerOff!!
        
        _HandFingerOff = ImageVector.Builder(
            name = "hand-finger-off",
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
                moveTo(8f, 13f)
                verticalLineToRelative(-5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.06f, 4.077f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.94f, 0.423f)
                verticalLineToRelative(2.5f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.063f, 8.065f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.937f, 1.435f)
                verticalLineToRelative(0.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.06f, 10.082f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 2.94f, 0.418f)
                verticalLineToRelative(1.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 11.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 3f, 0f)
                verticalLineToRelative(4.5f)
                moveToRelative(-0.88f, 3.129f)
                arcToRelative(6f, 6f, 0f, false, true, -5.12f, 2.871f)
                horizontalLineToRelative(-2f)
                horizontalLineToRelative(0.208f)
                arcToRelative(6f, 6f, 0f, false, true, -5.012f, -2.7f)
                lineToRelative(-0.196f, -0.3f)
                curveToRelative(-0.312f, -0.479f, -1.407f, -2.388f, -3.286f, -5.728f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.536f, -2.022f)
                arcToRelative(1.867f, 1.867f, 0f, false, true, 2.28f, 0.28f)
                lineToRelative(1.47f, 1.47f)
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
        
        return _HandFingerOff!!
    }

private var _HandFingerOff: ImageVector? = null

