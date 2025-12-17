package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Radar: ImageVector
    get() {
        if (_Radar != null) return _Radar!!
        
        _Radar = ImageVector.Builder(
            name = "radar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.634f, 1.135f)
                arcTo(7f, 7f, 0f, false, true, 15f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(6f, 6f, 0f, true, false, -6.5f, 5.98f)
                verticalLineToRelative(-1.005f)
                arcTo(5f, 5f, 0f, true, true, 13f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(4f, 4f, 0f, true, false, -4.5f, 3.969f)
                verticalLineToRelative(-1.011f)
                arcTo(2.999f, 2.999f, 0f, true, true, 11f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcToRelative(2f, 2f, 0f, true, false, -2.5f, 1.936f)
                verticalLineToRelative(-1.07f)
                arcToRelative(1f, 1f, 0f, true, true, 1f, 0f)
                verticalLineTo(15.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                verticalLineToRelative(-0.518f)
                arcToRelative(7f, 7f, 0f, false, true, -0.866f, -13.847f)
            }
        }.build()
        
        return _Radar!!
    }

private var _Radar: ImageVector? = null

