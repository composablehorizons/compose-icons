package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BiohazardOff: ImageVector
    get() {
        if (_BiohazardOff != null) return _BiohazardOff!!
        
        _BiohazardOff = ImageVector.Builder(
            name = "biohazard-off",
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
                moveTo(10.586f, 10.586f)
                arcToRelative(2f, 2f, 0f, true, false, 2.836f, 2.82f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.939f, 14f)
                curveToRelative(0f, 0.173f, 0.048f, 0.351f, 0.056f, 0.533f)
                verticalLineToRelative(0.217f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -4.533f, 4.745f)
                horizontalLineToRelative(-0.217f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(2.495f, 14.745f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 7.737f, -3.693f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16.745f, 19.495f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -4.69f, -5.503f)
                horizontalLineToRelative(-0.06f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.533f, 10.538f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 6.957f, 3.987f)
                verticalLineToRelative(0.217f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.295f, 10.929f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -2.988f, -3.64f)
                moveToRelative(0.66f, -3.324f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, 0.5f, -0.66f)
                lineToRelative(0.164f, -0.172f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.349f, 3.133f)
                arcToRelative(4.75f, 4.75f, 0f, false, true, -0.836f, 7.385f)
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
        
        return _BiohazardOff!!
    }

private var _BiohazardOff: ImageVector? = null

