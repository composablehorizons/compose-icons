package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BluetoothOff: ImageVector
    get() {
        if (_BluetoothOff != null) return _BluetoothOff!!
        
        _BluetoothOff = ImageVector.Builder(
            name = "bluetooth-off",
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
                moveTo(16.438f, 16.45f)
                lineToRelative(-4.438f, 3.55f)
                verticalLineToRelative(-8f)
                moveToRelative(0f, -4f)
                verticalLineToRelative(-4f)
                lineToRelative(5f, 4f)
                lineToRelative(-2.776f, 2.22f)
                moveToRelative(-2.222f, 1.779f)
                lineToRelative(-5f, 4f)
            }
        }.build()
        
        return _BluetoothOff!!
    }

private var _BluetoothOff: ImageVector? = null

