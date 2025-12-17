package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Signal: ImageVector
    get() {
        if (_Signal != null) return _Signal!!
        
        _Signal = ImageVector.Builder(
            name = "signal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.364f, 3.636f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 0f, 10.607f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, 1.061f)
                arcToRelative(9f, 9f, 0f, false, false, 0f, -12.728f)
                close()
                moveTo(4.697f, 4.697f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.061f, -1.061f)
                arcToRelative(9f, 9f, 0f, false, false, 0f, 12.728f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                arcToRelative(7.5f, 7.5f, 0f, false, true, 0f, -10.607f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.475f, 6.464f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, 7.072f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.061f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, -4.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(7.525f, 6.464f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 0f, 4.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.06f)
                arcToRelative(5f, 5f, 0f, false, true, 0f, -7.07f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveTo(11f, 10f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
        }.build()
        
        return _Signal!!
    }

private var _Signal: ImageVector? = null

