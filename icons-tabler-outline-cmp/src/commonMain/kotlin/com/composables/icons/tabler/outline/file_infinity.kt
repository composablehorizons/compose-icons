package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.FileInfinity: ImageVector
    get() {
        if (_FileInfinity != null) return _FileInfinity!!
        
        _FileInfinity = ImageVector.Builder(
            name = "file-infinity",
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
                moveTo(15.536f, 17.586f)
                arcToRelative(2.123f, 2.123f, 0f, false, false, -2.929f, 0f)
                arcToRelative(1.951f, 1.951f, 0f, false, false, 0f, 2.828f)
                curveToRelative(0.809f, 0.781f, 2.12f, 0.781f, 2.929f, 0f)
                curveToRelative(0.809f, -0.781f, -0.805f, 0.778f, 0f, 0f)
                lineToRelative(1.46f, -1.41f)
                lineToRelative(1.46f, -1.419f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.54f, 17.582f)
                lineToRelative(1.46f, 1.42f)
                lineToRelative(1.46f, 1.41f)
                curveToRelative(0.809f, 0.78f, -0.805f, -0.779f, 0f, 0f)
                reflectiveCurveToRelative(2.12f, 0.781f, 2.929f, 0f)
                arcToRelative(1.951f, 1.951f, 0f, false, false, 0f, -2.828f)
                arcToRelative(2.123f, 2.123f, 0f, false, false, -2.929f, 0f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 3f)
                verticalLineToRelative(4f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(4f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 21f)
                horizontalLineToRelative(-2.5f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(7f)
                lineToRelative(5f, 5f)
                verticalLineToRelative(6f)
            }
        }.build()
        
        return _FileInfinity!!
    }

private var _FileInfinity: ImageVector? = null

