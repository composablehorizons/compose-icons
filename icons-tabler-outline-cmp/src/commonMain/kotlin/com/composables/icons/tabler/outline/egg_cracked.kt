package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.EggCracked: ImageVector
    get() {
        if (_EggCracked != null) return _EggCracked!!
        
        _EggCracked = ImageVector.Builder(
            name = "egg-cracked",
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
                moveTo(19f, 14.083f)
                curveToRelative(0f, 4.154f, -2.966f, 6.74f, -7f, 6.917f)
                curveToRelative(-4.2f, 0f, -7f, -2.763f, -7f, -6.917f)
                curveToRelative(0f, -5.538f, 3.5f, -11.09f, 7f, -11.083f)
                curveToRelative(3.5f, 0.007f, 7f, 5.545f, 7f, 11.083f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 3f)
                lineToRelative(-1.5f, 5f)
                lineToRelative(3.5f, 2.5f)
                lineToRelative(-2f, 3.5f)
            }
        }.build()
        
        return _EggCracked!!
    }

private var _EggCracked: ImageVector? = null

