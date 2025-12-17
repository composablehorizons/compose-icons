package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Speedboat: ImageVector
    get() {
        if (_Speedboat != null) return _Speedboat!!
        
        _Speedboat = ImageVector.Builder(
            name = "speedboat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 7f)
                arcToRelative(1f, 1f, 0f, false, true, 0.832f, 0.445f)
                lineToRelative(1.702f, 2.555f)
                horizontalLineToRelative(5.466f)
                arcToRelative(1f, 1f, 0f, false, true, 0.833f, 1.554f)
                lineToRelative(-3.1f, 4.66f)
                arcToRelative(4f, 4f, 0f, false, true, -3.333f, 1.786f)
                horizontalLineToRelative(-14.4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.936f, -1.351f)
                lineToRelative(1.5f, -4f)
                arcToRelative(1f, 1f, 0f, false, true, 0.936f, -0.649f)
                horizontalLineToRelative(1.756f)
                lineToRelative(0.9f, -3f)
                horizontalLineToRelative(-0.156f)
                arcToRelative(1f, 1f, 0f, false, true, -0.993f, -0.883f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
                moveToRelative(-6.657f, 5f)
                horizontalLineToRelative(1.887f)
                curveToRelative(0.383f, 0f, 0.762f, -0.074f, 1.12f, -0.219f)
                lineToRelative(3.557f, -1.418f)
                quadToRelative(0.186f, -0.075f, 0.377f, -0.135f)
                lineToRelative(-0.82f, -1.228f)
                horizontalLineToRelative(-5.22f)
                close()
            }
        }.build()
        
        return _Speedboat!!
    }

private var _Speedboat: ImageVector? = null

