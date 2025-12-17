package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AirTrafficControl: ImageVector
    get() {
        if (_AirTrafficControl != null) return _AirTrafficControl!!
        
        _AirTrafficControl = ImageVector.Builder(
            name = "air-traffic-control",
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
                moveTo(11f, 3f)
                horizontalLineToRelative(2f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                verticalLineToRelative(3f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(5.998f, 6f)
                horizontalLineToRelative(12.004f)
                arcToRelative(2f, 2f, 0f, false, true, 1.916f, 2.575f)
                lineToRelative(-1.8f, 6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.916f, 1.425f)
                horizontalLineToRelative(-8.404f)
                arcToRelative(2f, 2f, 0f, false, true, -1.916f, -1.425f)
                lineToRelative(-1.8f, -6f)
                arcToRelative(2f, 2f, 0f, false, true, 1.916f, -2.575f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 6f)
                lineToRelative(1.5f, 10f)
                verticalLineToRelative(5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.5f, 6f)
                lineToRelative(-1.5f, 10f)
                verticalLineToRelative(5f)
            }
        }.build()
        
        return _AirTrafficControl!!
    }

private var _AirTrafficControl: ImageVector? = null

