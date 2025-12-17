package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Flare: ImageVector
    get() {
        if (_Flare != null) return _Flare!!
        
        _Flare = ImageVector.Builder(
            name = "flare",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.106f, 2.553f)
                arcToRelative(1f, 1f, 0f, false, true, 1.788f, 0f)
                lineToRelative(2.851f, 5.701f)
                lineToRelative(5.702f, 2.852f)
                arcToRelative(1f, 1f, 0f, false, true, 0.11f, 1.725f)
                lineToRelative(-0.11f, 0.063f)
                lineToRelative(-5.702f, 2.851f)
                lineToRelative(-2.85f, 5.702f)
                arcToRelative(1f, 1f, 0f, false, true, -1.726f, 0.11f)
                lineToRelative(-0.063f, -0.11f)
                lineToRelative(-2.852f, -5.702f)
                lineToRelative(-5.701f, -2.85f)
                arcToRelative(1f, 1f, 0f, false, true, -0.11f, -1.726f)
                lineToRelative(0.11f, -0.063f)
                lineToRelative(5.701f, -2.852f)
                close()
            }
        }.build()
        
        return _Flare!!
    }

private var _Flare: ImageVector? = null

