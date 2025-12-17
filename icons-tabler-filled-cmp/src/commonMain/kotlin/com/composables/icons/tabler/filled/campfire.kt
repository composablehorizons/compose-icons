package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Campfire: ImageVector
    get() {
        if (_Campfire != null) return _Campfire!!
        
        _Campfire = ImageVector.Builder(
            name = "campfire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19.757f, 16.03f)
                arcToRelative(1f, 1f, 0f, false, true, 0.597f, 1.905f)
                lineToRelative(-0.111f, 0.035f)
                lineToRelative(-16f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.597f, -1.905f)
                lineToRelative(0.111f, -0.035f)
                lineToRelative(16f, -4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.03f, 16.757f)
                arcToRelative(1f, 1f, 0f, false, true, 1.098f, -0.749f)
                lineToRelative(0.115f, 0.022f)
                lineToRelative(16f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.37f, 1.962f)
                lineToRelative(-0.116f, -0.022f)
                lineToRelative(-16f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.727f, -1.213f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.553f, 2.106f)
                curveToRelative(-4.174f, 2.086f, -6.553f, 5.358f, -6.553f, 8.894f)
                arcToRelative(5f, 5f, 0f, false, false, 10f, 0f)
                curveToRelative(0f, -1.047f, -0.188f, -1.808f, -0.606f, -2.705f)
                lineToRelative(-0.169f, -0.345f)
                lineToRelative(-0.33f, -0.647f)
                curveToRelative(-0.621f, -1.24f, -0.895f, -2.338f, -0.895f, -4.303f)
                arcToRelative(1f, 1f, 0f, false, false, -1.447f, -0.894f)
                close()
            }
        }.build()
        
        return _Campfire!!
    }

private var _Campfire: ImageVector? = null

