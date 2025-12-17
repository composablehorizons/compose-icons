package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.PyramidOff: ImageVector
    get() {
        if (_PyramidOff != null) return _PyramidOff!!
        
        _PyramidOff = ImageVector.Builder(
            name = "pyramid-off",
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
                moveTo(21.384f, 17.373f)
                arcToRelative(1.004f, 1.004f, 0f, false, false, -0.013f, -1.091f)
                lineToRelative(-8.54f, -13.836f)
                arcToRelative(0.999f, 0.999f, 0f, false, false, -1.664f, 0f)
                lineToRelative(-1.8f, 2.917f)
                moveToRelative(-1.531f, 2.48f)
                lineToRelative(-5.209f, 8.439f)
                arcToRelative(1.005f, 1.005f, 0f, false, false, 0.386f, 1.452f)
                lineToRelative(8.092f, 4.054f)
                arcToRelative(1.994f, 1.994f, 0f, false, false, 1.789f, 0f)
                lineToRelative(5.903f, -2.958f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 2f)
                verticalLineToRelative(6f)
                moveToRelative(0f, 4f)
                verticalLineToRelative(10f)
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
        
        return _PyramidOff!!
    }

private var _PyramidOff: ImageVector? = null

