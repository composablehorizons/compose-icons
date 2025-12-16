package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Container: ImageVector
    get() {
        if (_Container != null) return _Container!!
        
        _Container = ImageVector.Builder(
            name = "container",
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
                moveTo(22f, 7.7f)
                curveToRelative(0f, -0.6f, -0.4f, -1.2f, -0.8f, -1.5f)
                lineToRelative(-6.3f, -3.9f)
                arcToRelative(1.72f, 1.72f, 0f, false, false, -1.7f, 0f)
                lineToRelative(-10.3f, 6f)
                curveToRelative(-0.5f, 0.2f, -0.9f, 0.8f, -0.9f, 1.4f)
                verticalLineToRelative(6.6f)
                curveToRelative(0f, 0.5f, 0.4f, 1.2f, 0.8f, 1.5f)
                lineToRelative(6.3f, 3.9f)
                arcToRelative(1.72f, 1.72f, 0f, false, false, 1.7f, 0f)
                lineToRelative(10.3f, -6f)
                curveToRelative(0.5f, -0.3f, 0.9f, -1f, 0.9f, -1.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 21.9f)
                verticalLineTo(14f)
                lineTo(2.1f, 9.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 14f)
                lineToRelative(11.9f, -6.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 19.8f)
                verticalLineToRelative(-8.1f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 17.5f)
                verticalLineTo(9.4f)
            }
        }.build()
        
        return _Container!!
    }

private var _Container: ImageVector? = null

