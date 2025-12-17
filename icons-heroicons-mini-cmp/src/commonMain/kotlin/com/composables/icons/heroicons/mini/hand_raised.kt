package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.HandRaised: ImageVector
    get() {
        if (_HandRaised != null) return _HandRaised!!
        
        _HandRaised = ImageVector.Builder(
            name = "hand-raised",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 2f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(6.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(5f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(7f)
                arcToRelative(7f, 7f, 0f, true, false, 14f, 0f)
                verticalLineTo(8f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(3.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(3f)
                arcToRelative(1f, 1f, 0f, true, false, -2f, 0f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineTo(2f)
                close()
            }
        }.build()
        
        return _HandRaised!!
    }

private var _HandRaised: ImageVector? = null

