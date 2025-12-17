package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.BleachOff: ImageVector
    get() {
        if (_BleachOff != null) return _BleachOff!!
        
        _BleachOff = ImageVector.Builder(
            name = "bleach-off",
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
                moveTo(5f, 19f)
                horizontalLineToRelative(14f)
                moveToRelative(1.986f, -1.977f)
                arcToRelative(2f, 2f, 0f, false, false, -0.146f, -0.773f)
                lineToRelative(-7.1f, -12.25f)
                arcToRelative(2f, 2f, 0f, false, false, -3.5f, 0f)
                lineToRelative(-0.815f, 1.405f)
                moveToRelative(-1.488f, 2.568f)
                lineToRelative(-4.797f, 8.277f)
                arcToRelative(2f, 2f, 0f, false, false, 1.75f, 2.75f)
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
        
        return _BleachOff!!
    }

private var _BleachOff: ImageVector? = null

