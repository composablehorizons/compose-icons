package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Plugin: ImageVector
    get() {
        if (_Plugin != null) return _Plugin!!
        
        _Plugin = ImageVector.Builder(
            name = "plugin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 8f)
                arcToRelative(7f, 7f, 0f, true, true, 2.898f, 5.673f)
                curveToRelative(-0.167f, -0.121f, -0.216f, -0.406f, -0.002f, -0.62f)
                lineToRelative(1.8f, -1.8f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, 4.572f, -0.328f)
                lineToRelative(1.414f, -1.415f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0f, -0.707f)
                lineToRelative(-0.707f, -0.707f)
                lineToRelative(1.559f, -1.563f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.708f, -0.706f)
                lineToRelative(-1.559f, 1.562f)
                lineToRelative(-1.414f, -1.414f)
                lineToRelative(1.56f, -1.562f)
                arcToRelative(0.5f, 0.5f, 0f, true, false, -0.707f, -0.706f)
                lineToRelative(-1.56f, 1.56f)
                lineToRelative(-0.707f, -0.706f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.707f, 0f)
                lineTo(5.318f, 5.975f)
                arcToRelative(3.5f, 3.5f, 0f, false, false, -0.328f, 4.571f)
                lineToRelative(-1.8f, 1.8f)
                curveToRelative(-0.58f, 0.58f, -0.62f, 1.6f, 0.121f, 2.137f)
                arcTo(8f, 8f, 0f, true, false, 0f, 8f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 1f, 0f)
            }
        }.build()
        
        return _Plugin!!
    }

private var _Plugin: ImageVector? = null

