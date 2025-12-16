package com.composables.icons.lucide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Lucide.BluetoothSearching: ImageVector
    get() {
        if (_BluetoothSearching != null) return _BluetoothSearching!!
        
        _BluetoothSearching = ImageVector.Builder(
            name = "bluetooth-searching",
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
                moveTo(7f, 7f)
                lineToRelative(10f, 10f)
                lineToRelative(-5f, 5f)
                verticalLineTo(2f)
                lineToRelative(5f, 5f)
                lineTo(7f, 17f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.83f, 14.83f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -5.66f)
            }
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(18f, 12f)
                horizontalLineToRelative(0.01f)
            }
        }.build()
        
        return _BluetoothSearching!!
    }

private var _BluetoothSearching: ImageVector? = null

