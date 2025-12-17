package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.SpeakerWave: ImageVector
    get() {
        if (_SpeakerWave != null) return _SpeakerWave!!
        
        _SpeakerWave = ImageVector.Builder(
            name = "speaker-wave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 3.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.264f, -0.546f)
                lineTo(5.203f, 7f)
                horizontalLineTo(2.667f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.7f, 0.48f)
                arcTo(6.985f, 6.985f, 0f, false, false, 1.5f, 10f)
                curveToRelative(0f, 0.887f, 0.165f, 1.737f, 0.468f, 2.52f)
                curveToRelative(0.111f, 0.29f, 0.39f, 0.48f, 0.7f, 0.48f)
                horizontalLineToRelative(2.535f)
                lineToRelative(4.033f, 3.796f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.264f, -0.546f)
                verticalLineTo(3.75f)
                close()
                moveTo(16.45f, 5.05f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.061f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 0f, 7.778f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, -9.899f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.329f, 7.172f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.061f, 1.06f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 3.536f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -5.656f)
                close()
            }
        }.build()
        
        return _SpeakerWave!!
    }

private var _SpeakerWave: ImageVector? = null

