package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.Bluetooth: ImageVector
    get() {
        if (_Bluetooth != null) return _Bluetooth!!
        
        _Bluetooth = ImageVector.Builder(
            name = "bluetooth",
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
                moveTo(7f, 8f)
                lineToRelative(10f, 8f)
                lineToRelative(-5f, 4f)
                lineToRelative(0f, -16f)
                lineToRelative(5f, 4f)
                lineToRelative(-10f, 8f)
            }
        }.build()
        
        return _Bluetooth!!
    }

private var _Bluetooth: ImageVector? = null

