package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.RepeatOff: ImageVector
    get() {
        if (_RepeatOff != null) return _RepeatOff!!
        
        _RepeatOff = ImageVector.Builder(
            name = "repeat-off",
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
                moveTo(4f, 12f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.336f, 0.873f, -2.468f, 2.08f, -2.856f)
                moveToRelative(3.92f, -0.144f)
                horizontalLineToRelative(10f)
                moveToRelative(-3f, -3f)
                lineToRelative(3f, 3f)
                lineToRelative(-3f, 3f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20f, 12f)
                verticalLineToRelative(3f)
                arcToRelative(3f, 3f, 0f, false, true, -0.133f, 0.886f)
                moveToRelative(-1.99f, 1.984f)
                arcToRelative(3f, 3f, 0f, false, true, -0.877f, 0.13f)
                horizontalLineToRelative(-13f)
                moveToRelative(3f, 3f)
                lineToRelative(-3f, -3f)
                lineToRelative(3f, -3f)
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
        
        return _RepeatOff!!
    }

private var _RepeatOff: ImageVector? = null

