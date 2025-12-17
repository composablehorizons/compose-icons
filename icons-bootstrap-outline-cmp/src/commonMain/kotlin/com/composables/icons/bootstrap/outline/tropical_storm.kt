package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.TropicalStorm: ImageVector
    get() {
        if (_TropicalStorm != null) return _TropicalStorm!!
        
        _TropicalStorm = ImageVector.Builder(
            name = "tropical-storm",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 9.5f)
                arcToRelative(2f, 2f, 0f, true, false, 0f, -4f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 4f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.5f, 2f)
                curveToRelative(-0.9f, 0f, -1.75f, 0.216f, -2.501f, 0.6f)
                arcTo(5f, 5f, 0f, false, true, 13f, 7.5f)
                arcToRelative(6.5f, 6.5f, 0f, true, true, -13f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 1f, 0f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 8.001f, 4.9f)
                arcTo(5f, 5f, 0f, false, true, 3f, 7.5f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 13f, 0f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -1f, 0f)
                arcTo(5.5f, 5.5f, 0f, false, false, 9.5f, 2f)
                moveTo(8f, 3.5f)
                arcToRelative(4f, 4f, 0f, true, false, 0f, 8f)
                arcToRelative(4f, 4f, 0f, false, false, 0f, -8f)
            }
        }.build()
        
        return _TropicalStorm!!
    }

private var _TropicalStorm: ImageVector? = null

