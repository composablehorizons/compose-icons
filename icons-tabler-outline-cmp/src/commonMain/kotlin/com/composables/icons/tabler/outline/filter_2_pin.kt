package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Filter2Pin: ImageVector
    get() {
        if (_Filter2Pin != null) return _Filter2Pin!!
        
        _Filter2Pin = ImageVector.Builder(
            name = "filter-2-pin",
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
                moveTo(4f, 6f)
                horizontalLineToRelative(16f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(6f, 12f)
                horizontalLineToRelative(10f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(9f, 18f)
                horizontalLineToRelative(3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(19f, 18f)
                verticalLineToRelative(0.01f)
                moveToRelative(2.121f, 2.111f)
                curveToRelative(0.42f, -0.419f, 0.706f, -0.954f, 0.821f, -1.536f)
                curveToRelative(0.116f, -0.582f, 0.056f, -1.185f, -0.17f, -1.733f)
                curveToRelative(-0.227f, -0.548f, -0.611f, -1.017f, -1.105f, -1.347f)
                curveToRelative(-0.493f, -0.33f, -1.073f, -0.506f, -1.667f, -0.506f)
                curveToRelative(-0.593f, 0f, -1.173f, 0.176f, -1.667f, 0.506f)
                curveToRelative(-0.493f, 0.33f, -0.878f, 0.798f, -1.105f, 1.347f)
                curveToRelative(-0.227f, 0.548f, -0.286f, 1.151f, -0.17f, 1.733f)
                curveToRelative(0.116f, 0.582f, 0.402f, 1.116f, 0.821f, 1.536f)
                curveToRelative(0.418f, 0.419f, 1.125f, 1.045f, 2.121f, 1.879f)
                curveToRelative(1.051f, -0.89f, 1.759f, -1.516f, 2.121f, -1.879f)
                close()
            }
        }.build()
        
        return _Filter2Pin!!
    }

private var _Filter2Pin: ImageVector? = null

