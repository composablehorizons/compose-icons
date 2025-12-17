package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.CommandOff: ImageVector
    get() {
        if (_CommandOff != null) return _CommandOff!!
        
        _CommandOff = ImageVector.Builder(
            name = "command-off",
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
                moveTo(9f, 9f)
                verticalLineToRelative(8f)
                arcToRelative(2f, 2f, 0f, true, true, -2f, -2f)
                horizontalLineToRelative(8f)
                moveToRelative(3.411f, 3.417f)
                arcToRelative(2f, 2f, 0f, false, true, -3.411f, -1.417f)
                verticalLineToRelative(-2f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-4f)
                arcToRelative(2f, 2f, 0f, true, true, 2f, 2f)
                horizontalLineToRelative(-4f)
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(-2f)
                arcToRelative(2f, 2f, 0f, false, true, -1.417f, -3.411f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 3f)
                lineToRelative(18f, 18f)
            }
        }.build()
        
        return _CommandOff!!
    }

private var _CommandOff: ImageVector? = null

