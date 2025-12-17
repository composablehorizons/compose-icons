package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Keyframe: ImageVector
    get() {
        if (_Keyframe != null) return _Keyframe!!
        
        _Keyframe = ImageVector.Builder(
            name = "keyframe",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4f)
                arcToRelative(2.599f, 2.599f, 0f, false, false, -2f, 0.957f)
                lineToRelative(-4.355f, 5.24f)
                arcToRelative(2.847f, 2.847f, 0f, false, false, -0.007f, 3.598f)
                lineToRelative(4.368f, 5.256f)
                curveToRelative(0.499f, 0.6f, 1.225f, 0.949f, 1.994f, 0.949f)
                arcToRelative(2.599f, 2.599f, 0f, false, false, 2f, -0.957f)
                lineToRelative(4.355f, -5.24f)
                arcToRelative(2.847f, 2.847f, 0f, false, false, 0.007f, -3.598f)
                lineToRelative(-4.368f, -5.256f)
                arcToRelative(2.593f, 2.593f, 0f, false, false, -1.994f, -0.949f)
                close()
            }
        }.build()
        
        return _Keyframe!!
    }

private var _Keyframe: ImageVector? = null

