package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BoltOff: ImageVector
    get() {
        if (_BoltOff != null) return _BoltOff!!
        
        _BoltOff = ImageVector.Builder(
            name = "bolt-off",
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
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(15.212f, 15.21f)
                lineToRelative(-4.212f, 5.79f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-6f)
                lineToRelative(3.79f, -5.21f)
                moveToRelative(1.685f, -2.32f)
                lineToRelative(2.525f, -3.47f)
                verticalLineToRelative(6f)
                moveToRelative(1f, 1f)
                horizontalLineToRelative(5f)
                lineToRelative(-2.104f, 2.893f)
            }
        }.build()
        
        return _BoltOff!!
    }

private var _BoltOff: ImageVector? = null

