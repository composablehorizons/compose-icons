package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.ColorPicker: ImageVector
    get() {
        if (_ColorPicker != null) return _ColorPicker!!
        
        _ColorPicker = ImageVector.Builder(
            name = "color-picker",
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
                moveTo(11f, 7f)
                lineToRelative(6f, 6f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(4f, 16f)
                lineToRelative(11.7f, -11.7f)
                arcToRelative(1f, 1f, 0f, false, true, 1.4f, 0f)
                lineToRelative(2.6f, 2.6f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.4f)
                lineToRelative(-11.7f, 11.7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
            }
        }.build()
        
        return _ColorPicker!!
    }

private var _ColorPicker: ImageVector? = null

