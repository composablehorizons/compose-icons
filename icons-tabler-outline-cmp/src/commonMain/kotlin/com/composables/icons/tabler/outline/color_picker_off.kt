package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ColorPickerOff: ImageVector
    get() {
        if (_ColorPickerOff != null) return _ColorPickerOff!!
        
        _ColorPickerOff = ImageVector.Builder(
            name = "color-picker-off",
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
                moveTo(11f, 7f)
                lineToRelative(6f, 6f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(12f, 8f)
                lineToRelative(3.699f, -3.699f)
                arcToRelative(1f, 1f, 0f, false, true, 1.4f, 0f)
                lineToRelative(2.6f, 2.6f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.4f)
                lineToRelative(-3.702f, 3.702f)
                moveToRelative(-2f, 2f)
                lineToRelative(-6f, 6f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                lineToRelative(6f, -6f)
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
        
        return _ColorPickerOff!!
    }

private var _ColorPickerOff: ImageVector? = null

