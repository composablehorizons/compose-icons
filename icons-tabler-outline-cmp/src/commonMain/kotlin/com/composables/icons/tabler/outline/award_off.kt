package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.AwardOff: ImageVector
    get() {
        if (_AwardOff != null) return _AwardOff!!
        
        _AwardOff = ImageVector.Builder(
            name = "award-off",
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
                moveTo(16.72f, 12.704f)
                arcToRelative(6f, 6f, 0f, false, false, -8.433f, -8.418f)
                moveToRelative(-1.755f, 2.24f)
                arcToRelative(6f, 6f, 0f, false, false, 7.936f, 7.944f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 15f)
                lineToRelative(3.4f, 5.89f)
                lineToRelative(1.598f, -3.233f)
                lineToRelative(0.707f, 0.046f)
                moveToRelative(1.108f, -2.902f)
                lineToRelative(-1.617f, -2.8f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6.802f, 12f)
                lineToRelative(-3.4f, 5.89f)
                lineToRelative(3.598f, -0.233f)
                lineToRelative(1.598f, 3.232f)
                lineToRelative(3.4f, -5.889f)
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
        
        return _AwardOff!!
    }

private var _AwardOff: ImageVector? = null

