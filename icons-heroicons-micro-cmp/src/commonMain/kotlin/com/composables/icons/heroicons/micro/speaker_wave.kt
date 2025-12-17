package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.SpeakerWave: ImageVector
    get() {
        if (_SpeakerWave != null) return _SpeakerWave!!
        
        _SpeakerWave = ImageVector.Builder(
            name = "speaker-wave",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.557f, 2.066f)
                arcTo(0.75f, 0.75f, 0f, false, true, 8f, 2.75f)
                verticalLineToRelative(10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.248f, 0.56f)
                lineTo(3.59f, 11f)
                horizontalLineTo(2f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineTo(6f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                horizontalLineToRelative(1.59f)
                lineToRelative(3.162f, -2.81f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.805f, -0.124f)
                close()
                moveTo(12.95f, 3.05f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 0f, 7.78f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, -9.9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.828f, 5.172f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 0f, 3.536f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -5.656f)
                close()
            }
        }.build()
        
        return _SpeakerWave!!
    }

private var _SpeakerWave: ImageVector? = null

