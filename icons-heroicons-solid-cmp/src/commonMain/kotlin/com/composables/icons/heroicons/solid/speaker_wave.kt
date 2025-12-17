package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.SpeakerWave: ImageVector
    get() {
        if (_SpeakerWave != null) return _SpeakerWave!!
        
        _SpeakerWave = ImageVector.Builder(
            name = "speaker-wave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 4.06f)
                curveToRelative(0f, -1.336f, -1.616f, -2.005f, -2.56f, -1.06f)
                lineToRelative(-4.5f, 4.5f)
                horizontalLineTo(4.508f)
                curveToRelative(-1.141f, 0f, -2.318f, 0.664f, -2.66f, 1.905f)
                arcTo(9.76f, 9.76f, 0f, false, false, 1.5f, 12f)
                curveToRelative(0f, 0.898f, 0.121f, 1.768f, 0.35f, 2.595f)
                curveToRelative(0.341f, 1.24f, 1.518f, 1.905f, 2.659f, 1.905f)
                horizontalLineToRelative(1.93f)
                lineToRelative(4.5f, 4.5f)
                curveToRelative(0.945f, 0.945f, 2.561f, 0.276f, 2.561f, -1.06f)
                verticalLineTo(4.06f)
                close()
                moveTo(18.584f, 5.106f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                curveToRelative(3.808f, 3.807f, 3.808f, 9.98f, 0f, 13.788f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                arcToRelative(8.25f, 8.25f, 0f, false, false, 0f, -11.668f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.932f, 7.757f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.061f, 0f)
                arcToRelative(6f, 6f, 0f, false, true, 0f, 8.486f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.061f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, 0f, -6.364f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _SpeakerWave!!
    }

private var _SpeakerWave: ImageVector? = null

