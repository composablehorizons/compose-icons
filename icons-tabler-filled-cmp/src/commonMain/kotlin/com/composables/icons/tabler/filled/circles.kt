package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Circles: ImageVector
    get() {
        if (_Circles != null) return _Circles!!
        
        _Circles = ImageVector.Builder(
            name = "circles",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 12f)
                arcToRelative(5f, 5f, 0f, true, true, -4.995f, 5.217f)
                lineToRelative(-0.005f, -0.217f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, false, true, 4.995f, -4.783f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.5f, 12f)
                arcToRelative(5f, 5f, 0f, true, true, -4.995f, 5.217f)
                lineToRelative(-0.005f, -0.217f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, false, true, 4.995f, -4.783f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(5f, 5f, 0f, true, true, -4.995f, 5.217f)
                lineToRelative(-0.005f, -0.217f)
                lineToRelative(0.005f, -0.217f)
                arcToRelative(5f, 5f, 0f, false, true, 4.995f, -4.783f)
                close()
            }
        }.build()
        
        return _Circles!!
    }

private var _Circles: ImageVector? = null

