package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.SpeakerXMark: ImageVector
    get() {
        if (_SpeakerXMark != null) return _SpeakerXMark!!
        
        _SpeakerXMark = ImageVector.Builder(
            name = "speaker-x-mark",
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
                moveTo(17.78f, 9.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineTo(18.44f, 12f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, 1.06f)
                lineToRelative(1.72f, -1.72f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(20.56f, 12f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, -1.06f)
                lineToRelative(-1.72f, 1.72f)
                lineToRelative(-1.72f, -1.72f)
                close()
            }
        }.build()
        
        return _SpeakerXMark!!
    }

private var _SpeakerXMark: ImageVector? = null

