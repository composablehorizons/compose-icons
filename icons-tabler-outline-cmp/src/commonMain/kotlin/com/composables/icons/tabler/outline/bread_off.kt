package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BreadOff: ImageVector
    get() {
        if (_BreadOff != null) return _BreadOff!!
        
        _BreadOff = ImageVector.Builder(
            name = "bread-off",
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
                moveTo(8f, 4f)
                lineToRelative(10f, 0.005f)
                verticalLineToRelative(-0.005f)
                arcToRelative(3f, 3f, 0f, false, true, 2f, 5.235f)
                verticalLineToRelative(6.765f)
                moveToRelative(-0.59f, 3.418f)
                curveToRelative(-0.36f, 0.36f, -0.86f, 0.582f, -1.41f, 0.582f)
                horizontalLineToRelative(-12f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-8.764f)
                arcToRelative(3f, 3f, 0f, false, true, 0.418f, -4.785f)
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
        
        return _BreadOff!!
    }

private var _BreadOff: ImageVector? = null

