package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.HeartsOff: ImageVector
    get() {
        if (_HeartsOff != null) return _HeartsOff!!
        
        _HeartsOff = ImageVector.Builder(
            name = "hearts-off",
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
                moveTo(14.017f, 18f)
                lineToRelative(-2.017f, 2f)
                lineToRelative(-7.5f, -7.428f)
                arcToRelative(5f, 5f, 0f, false, true, 0.49f, -7.586f)
                moveToRelative(3.01f, -1f)
                arcToRelative(5f, 5f, 0f, false, true, 4f, 2.018f)
                arcToRelative(5f, 5f, 0f, false, true, 8.153f, 5.784f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(11.814f, 11.814f)
                arcToRelative(2.81f, 2.81f, 0f, false, false, -0.007f, 3.948f)
                lineToRelative(4.182f, 4.238f)
                lineToRelative(2.01f, -2.021f)
                moveToRelative(1.977f, -1.99f)
                lineToRelative(0.211f, -0.212f)
                arcToRelative(2.81f, 2.81f, 0f, false, false, 0f, -3.948f)
                arcToRelative(2.747f, 2.747f, 0f, false, false, -3.91f, -0.007f)
                lineToRelative(-0.283f, 0.178f)
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
        
        return _HeartsOff!!
    }

private var _HeartsOff: ImageVector? = null

