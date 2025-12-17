package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Disc: ImageVector
    get() {
        if (_Disc != null) return _Disc!!
        
        _Disc = ImageVector.Builder(
            name = "disc",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 3.34f)
                arcToRelative(10f, 10f, 0f, true, true, -15f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10f, 10f, 0f, false, true, 14.995f, -8.336f)
                moveToRelative(0f, 7.66f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                arcToRelative(4f, 4f, 0f, false, true, -4f, 4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, 2f)
                arcToRelative(6f, 6f, 0f, false, false, 6f, -6f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                moveToRelative(-5f, -1f)
                arcToRelative(2f, 2f, 0f, false, false, -1.995f, 1.85f)
                lineToRelative(-0.005f, 0.15f)
                arcToRelative(2f, 2f, 0f, true, false, 2f, -2f)
                moveToRelative(0f, -4f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                arcToRelative(1f, 1f, 0f, false, false, 2f, 0f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _Disc!!
    }

private var _Disc: ImageVector? = null

