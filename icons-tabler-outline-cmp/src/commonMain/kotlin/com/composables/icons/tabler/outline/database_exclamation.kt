package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DatabaseExclamation: ImageVector
    get() {
        if (_DatabaseExclamation != null) return _DatabaseExclamation!!
        
        _DatabaseExclamation = ImageVector.Builder(
            name = "database-exclamation",
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
                moveTo(4f, 6f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                reflectiveCurveToRelative(8f, -1.343f, 8f, -3f)
                reflectiveCurveToRelative(-3.582f, -3f, -8f, -3f)
                reflectiveCurveToRelative(-8f, 1.343f, -8f, 3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 6f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                curveToRelative(1.118f, 0f, 2.182f, -0.086f, 3.148f, -0.241f)
                moveToRelative(4.852f, -2.759f)
                verticalLineToRelative(-6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 12f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.657f, 3.582f, 3f, 8f, 3f)
                curveToRelative(1.064f, 0f, 2.079f, -0.078f, 3.007f, -0.22f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 16f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 22f)
                verticalLineToRelative(0.01f)
            }
        }.build()
        
        return _DatabaseExclamation!!
    }

private var _DatabaseExclamation: ImageVector? = null

