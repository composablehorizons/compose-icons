package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.MoodBoy: ImageVector
    get() {
        if (_MoodBoy != null) return _MoodBoy!!
        
        _MoodBoy = ImageVector.Builder(
            name = "mood-boy",
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
                moveTo(17f, 4.5f)
                arcToRelative(9f, 9f, 0f, false, true, 3.864f, 5.89f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.29f, 4.36f)
                arcToRelative(9f, 9f, 0f, false, true, -17.137f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -0.29f, -4.36f)
                arcToRelative(9f, 9f, 0f, false, true, 3.746f, -5.81f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9.5f, 16f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 5f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8.5f, 2f)
                curveToRelative(1.5f, 1f, 2.5f, 3.5f, 2.5f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12.5f, 2f)
                curveToRelative(1.5f, 2f, 2f, 3.5f, 2f, 5f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 12f)
                lineToRelative(0.01f, 0f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15f, 12f)
                lineToRelative(0.01f, 0f)
            }
        }.build()
        
        return _MoodBoy!!
    }

private var _MoodBoy: ImageVector? = null

