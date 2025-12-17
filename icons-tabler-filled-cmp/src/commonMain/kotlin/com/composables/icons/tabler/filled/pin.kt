package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Pin: ImageVector
    get() {
        if (_Pin != null) return _Pin!!
        
        _Pin = ImageVector.Builder(
            name = "pin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.113f, 3.21f)
                lineToRelative(0.094f, 0.083f)
                lineToRelative(5.5f, 5.5f)
                arcToRelative(1f, 1f, 0f, false, true, -1.175f, 1.59f)
                lineToRelative(-3.172f, 3.171f)
                lineToRelative(-1.424f, 3.797f)
                arcToRelative(1f, 1f, 0f, false, true, -0.158f, 0.277f)
                lineToRelative(-0.07f, 0.08f)
                lineToRelative(-1.5f, 1.5f)
                arcToRelative(1f, 1f, 0f, false, true, -1.32f, 0.082f)
                lineToRelative(-0.095f, -0.083f)
                lineToRelative(-2.793f, -2.792f)
                lineToRelative(-3.793f, 3.792f)
                arcToRelative(1f, 1f, 0f, false, true, -1.497f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(3.792f, -3.793f)
                lineToRelative(-2.792f, -2.793f)
                arcToRelative(1f, 1f, 0f, false, true, -0.083f, -1.32f)
                lineToRelative(0.083f, -0.094f)
                lineToRelative(1.5f, -1.5f)
                arcToRelative(1f, 1f, 0f, false, true, 0.258f, -0.187f)
                lineToRelative(0.098f, -0.042f)
                lineToRelative(3.796f, -1.425f)
                lineToRelative(3.171f, -3.17f)
                arcToRelative(1f, 1f, 0f, false, true, 1.497f, -1.26f)
                close()
            }
        }.build()
        
        return _Pin!!
    }

private var _Pin: ImageVector? = null

