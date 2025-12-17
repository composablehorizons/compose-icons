package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Stack: ImageVector
    get() {
        if (_Stack != null) return _Stack!!
        
        _Stack = ImageVector.Builder(
            name = "stack",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.894f, 13.553f)
                arcToRelative(1f, 1f, 0f, false, true, -0.447f, 1.341f)
                lineToRelative(-8f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, 0f)
                lineToRelative(-8f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.894f, -1.788f)
                lineToRelative(7.553f, 3.774f)
                lineToRelative(7.554f, -3.775f)
                arcToRelative(1f, 1f, 0f, false, true, 1.341f, 0.447f)
                moveToRelative(-8.887f, -8.552f)
                quadToRelative(0.056f, 0f, 0.111f, 0.007f)
                lineToRelative(0.111f, 0.02f)
                lineToRelative(0.086f, 0.024f)
                lineToRelative(0.012f, 0.006f)
                lineToRelative(0.012f, 0.002f)
                lineToRelative(0.029f, 0.014f)
                lineToRelative(0.05f, 0.019f)
                lineToRelative(0.016f, 0.009f)
                lineToRelative(0.012f, 0.005f)
                lineToRelative(8f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.788f)
                lineToRelative(-8f, 4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, 0f)
                lineToRelative(-8f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.788f)
                lineToRelative(8f, -4f)
                lineToRelative(0.011f, -0.005f)
                lineToRelative(0.018f, -0.01f)
                lineToRelative(0.078f, -0.032f)
                lineToRelative(0.011f, -0.002f)
                lineToRelative(0.013f, -0.006f)
                lineToRelative(0.086f, -0.024f)
                lineToRelative(0.11f, -0.02f)
                lineToRelative(0.056f, -0.005f)
                close()
            }
        }.build()
        
        return _Stack!!
    }

private var _Stack: ImageVector? = null

