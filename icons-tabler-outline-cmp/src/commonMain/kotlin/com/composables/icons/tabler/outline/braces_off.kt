package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BracesOff: ImageVector
    get() {
        if (_BracesOff != null) return _BracesOff!!
        
        _BracesOff = ImageVector.Builder(
            name = "braces-off",
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
                moveTo(5.176f, 5.177f)
                curveToRelative(-0.113f, 0.251f, -0.176f, 0.53f, -0.176f, 0.823f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.657f, -0.895f, 3f, -2f, 3f)
                curveToRelative(1.105f, 0f, 2f, 1.343f, 2f, 3f)
                verticalLineToRelative(3f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.657f, 0.895f, 3f, 2f, 3f)
                curveToRelative(-1.105f, 0f, -2f, 1.343f, -2f, 3f)
                moveToRelative(-0.176f, 3.821f)
                arcToRelative(2f, 2f, 0f, false, true, -1.824f, 1.179f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _BracesOff!!
    }

private var _BracesOff: ImageVector? = null

