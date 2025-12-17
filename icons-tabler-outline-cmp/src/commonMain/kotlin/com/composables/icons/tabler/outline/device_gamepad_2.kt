package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DeviceGamepad2: ImageVector
    get() {
        if (_DeviceGamepad2 != null) return _DeviceGamepad2!!
        
        _DeviceGamepad2 = ImageVector.Builder(
            name = "device-gamepad-2",
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
                moveTo(12f, 5f)
                horizontalLineToRelative(3.5f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 10f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-4.015f, 4.227f)
                arcToRelative(2.3f, 2.3f, 0f, false, true, -3.923f, -2.035f)
                lineToRelative(1.634f, -8.173f)
                arcToRelative(5f, 5f, 0f, false, true, 4.904f, -4.019f)
                horizontalLineToRelative(3.4f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 15f)
                lineToRelative(4.07f, 4.284f)
                arcToRelative(2.3f, 2.3f, 0f, false, false, 3.925f, -2.023f)
                lineToRelative(-1.6f, -8.232f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 9f)
                verticalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(7f, 10f)
                horizontalLineToRelative(2f)
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(14f, 10f)
                horizontalLineToRelative(2f)
            }
        }.build()
        
        return _DeviceGamepad2!!
    }

private var _DeviceGamepad2: ImageVector? = null

