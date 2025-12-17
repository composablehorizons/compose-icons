package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.MarkerTip: ImageVector
    get() {
        if (_MarkerTip != null) return _MarkerTip!!
        
        _MarkerTip = ImageVector.Builder(
            name = "marker-tip",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcTo(8f, 8f, 0f, true, true, 0f, 8f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                moveToRelative(-4.5f, 6.064f)
                lineToRelative(-1.281f, -4.696f)
                arcTo(0.5f, 0.5f, 0f, false, false, 9.736f, 9f)
                horizontalLineTo(6.264f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.483f, 0.368f)
                lineToRelative(-1.28f, 4.696f)
                arcTo(6.97f, 6.97f, 0f, false, false, 8f, 15f)
                curveToRelative(1.275f, 0f, 2.47f, -0.34f, 3.5f, -0.936f)
                moveToRelative(0.873f, -0.598f)
                arcToRelative(7f, 7f, 0f, true, false, -8.746f, 0f)
                lineToRelative(1.19f, -4.36f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.31f, -1.1f)
                lineToRelative(1.155f, -3.851f)
                curveToRelative(0.213f, -0.713f, 1.223f, -0.713f, 1.436f, 0f)
                lineToRelative(1.156f, 3.851f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.31f, 1.1f)
                close()
            }
        }.build()
        
        return _MarkerTip!!
    }

private var _MarkerTip: ImageVector? = null

