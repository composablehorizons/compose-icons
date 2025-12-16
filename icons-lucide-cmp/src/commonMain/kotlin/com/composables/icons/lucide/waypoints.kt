package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.Waypoints: ImageVector
    get() {
        if (_Waypoints != null) return _Waypoints!!
        
        _Waypoints = ImageVector.Builder(
            name = "waypoints",
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
                moveTo(14.5f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12f, 7f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9.5f, 4.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14.5f, 4.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10.2f, 6.3f)
                lineToRelative(-3.9f, 3.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 4.5f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 2f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 7f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 12f)
                horizontalLineToRelative(10f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(22f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 19.5f, 14.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 17f, 12f)
                arcTo(2.5f, 2.5f, 0f, false, true, 22f, 12f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(13.8f, 17.7f)
                lineToRelative(3.9f, -3.9f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14.5f, 19.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 12f, 22f)
                arcTo(2.5f, 2.5f, 0f, false, true, 9.5f, 19.5f)
                arcTo(2.5f, 2.5f, 0f, false, true, 14.5f, 19.5f)
                close()
            }
        }.build()
        
        return _Waypoints!!
    }

private var _Waypoints: ImageVector? = null

