package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Baby: ImageVector
    get() {
        if (_Baby != null) return _Baby!!
        
        _Baby = ImageVector.Builder(
            name = "baby",
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
                moveTo(10f, 16f)
                curveToRelative(0.5f, 0.3f, 1.2f, 0.5f, 2f, 0.5f)
                reflectiveCurveToRelative(1.5f, -0.2f, 2f, -0.5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                horizontalLineToRelative(0.01f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19.38f, 6.813f)
                arcTo(9f, 9f, 0f, false, true, 20.8f, 10.2f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, 3.6f)
                arcToRelative(9f, 9f, 0f, false, true, -17.6f, 0f)
                arcToRelative(2f, 2f, 0f, false, true, 0f, -3.6f)
                arcTo(9f, 9f, 0f, false, true, 12f, 3f)
                curveToRelative(2f, 0f, 3.5f, 1.1f, 3.5f, 2.5f)
                reflectiveCurveToRelative(-0.9f, 2.5f, -2f, 2.5f)
                curveToRelative(-0.8f, 0f, -1.5f, -0.4f, -1.5f, -1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _Baby!!
    }

private var _Baby: ImageVector? = null

