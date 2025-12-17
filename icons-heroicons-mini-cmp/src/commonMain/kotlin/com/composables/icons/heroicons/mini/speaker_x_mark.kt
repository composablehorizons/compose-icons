package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.SpeakerXMark: ImageVector
    get() {
        if (_SpeakerXMark != null) return _SpeakerXMark!!
        
        _SpeakerXMark = ImageVector.Builder(
            name = "speaker-x-mark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.047f, 3.062f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.453f, 0.688f)
                verticalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.264f, 0.546f)
                lineTo(5.203f, 13f)
                horizontalLineTo(2.667f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.7f, -0.48f)
                arcTo(6.985f, 6.985f, 0f, false, true, 1.5f, 10f)
                curveToRelative(0f, -0.887f, 0.165f, -1.737f, 0.468f, -2.52f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.7f, -0.48f)
                horizontalLineToRelative(2.535f)
                lineToRelative(4.033f, -3.796f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.811f, -0.142f)
                close()
                moveTo(13.78f, 7.22f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, -1.06f, 1.06f)
                lineTo(14.44f, 10f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.06f)
                lineToRelative(1.72f, -1.72f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineTo(16.56f, 10f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, -1.06f)
                lineTo(15.5f, 8.94f)
                lineToRelative(-1.72f, -1.72f)
                close()
            }
        }.build()
        
        return _SpeakerXMark!!
    }

private var _SpeakerXMark: ImageVector? = null

