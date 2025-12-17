package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Signal: ImageVector
    get() {
        if (_Signal != null) return _Signal!!
        
        _Signal = ImageVector.Builder(
            name = "signal",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 8f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.68f, 5.26f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                arcToRelative(3.875f, 3.875f, 0f, false, true, 0f, 5.48f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                arcToRelative(2.375f, 2.375f, 0f, false, false, 0f, -3.36f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(-3.36f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                arcToRelative(2.375f, 2.375f, 0f, false, false, 0f, 3.36f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                arcToRelative(3.875f, 3.875f, 0f, false, true, 0f, -5.48f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.89f, 3.05f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, 9.9f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 0f, -7.78f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveToRelative(-7.78f, 0f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 0f, 7.78f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                arcToRelative(7f, 7f, 0f, false, true, 0f, -9.9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
            }
        }.build()
        
        return _Signal!!
    }

private var _Signal: ImageVector? = null

