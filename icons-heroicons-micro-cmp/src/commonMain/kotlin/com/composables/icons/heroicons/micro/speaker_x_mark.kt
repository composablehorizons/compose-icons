package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.SpeakerXMark: ImageVector
    get() {
        if (_SpeakerXMark != null) return _SpeakerXMark!!
        
        _SpeakerXMark = ImageVector.Builder(
            name = "speaker-x-mark",
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
                moveTo(11.28f, 5.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineTo(11.44f, 8f)
                lineToRelative(-1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.22f, -1.22f)
                lineToRelative(1.22f, 1.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(13.56f, 8f)
                lineToRelative(1.22f, -1.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(12.5f, 6.94f)
                lineToRelative(-1.22f, -1.22f)
                close()
            }
        }.build()
        
        return _SpeakerXMark!!
    }

private var _SpeakerXMark: ImageVector? = null

