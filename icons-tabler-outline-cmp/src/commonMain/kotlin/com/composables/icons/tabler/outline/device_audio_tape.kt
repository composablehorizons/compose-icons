package com.composables.icons.tabler.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Outline.DeviceAudioTape: ImageVector
    get() {
        if (_DeviceAudioTape != null) return _DeviceAudioTape!!
        
        _DeviceAudioTape = ImageVector.Builder(
            name = "device-audio-tape",
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
                moveTo(3f, 5f)
                moveToRelative(0f, 2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                horizontalLineToRelative(14f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color.Transparent),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(3f, 17f)
                lineToRelative(4f, -3f)
                horizontalLineToRelative(10f)
                lineToRelative(4f, 3f)
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(8f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7.5f, 10f)
                arcTo(0.5f, 0.5f, 0f, false, true, 7f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 8f, 9.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)),
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(17f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16.5f, 10f)
                arcTo(0.5f, 0.5f, 0f, false, true, 16f, 9.5f)
                arcTo(0.5f, 0.5f, 0f, false, true, 17f, 9.5f)
                close()
            }
        }.build()
        
        return _DeviceAudioTape!!
    }

private var _DeviceAudioTape: ImageVector? = null

