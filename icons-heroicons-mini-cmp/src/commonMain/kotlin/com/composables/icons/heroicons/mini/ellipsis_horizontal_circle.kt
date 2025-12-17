package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.EllipsisHorizontalCircle: ImageVector
    get() {
        if (_EllipsisHorizontalCircle != null) return _EllipsisHorizontalCircle!!
        
        _EllipsisHorizontalCircle = ImageVector.Builder(
            name = "ellipsis-horizontal-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, 16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, -16f, 0f)
                close()
                moveToRelative(8f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
                moveToRelative(-3f, -1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 2f, 0f)
                close()
                moveToRelative(7f, 1f)
                arcToRelative(1f, 1f, 0f, true, false, 0f, -2f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                close()
            }
        }.build()
        
        return _EllipsisHorizontalCircle!!
    }

private var _EllipsisHorizontalCircle: ImageVector? = null

