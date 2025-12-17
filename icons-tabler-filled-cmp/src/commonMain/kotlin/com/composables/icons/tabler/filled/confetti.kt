package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Confetti: ImageVector
    get() {
        if (_Confetti != null) return _Confetti!!
        
        _Confetti = ImageVector.Builder(
            name = "confetti",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveToRelative(7.53f, -1.243f)
                arcToRelative(1f, 1f, 0f, true, true, 1.94f, 0.486f)
                lineToRelative(-0.5f, 2f)
                arcToRelative(1f, 1f, 0f, true, true, -1.94f, -0.486f)
                close()
                moveToRelative(6.47f, 1.243f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                moveToRelative(-8.81f, 4.293f)
                lineToRelative(6.517f, 6.518f)
                arcToRelative(1f, 1f, 0f, false, true, -0.29f, 1.617f)
                lineToRelative(-9.573f, 4.387f)
                arcToRelative(2f, 2f, 0f, false, true, -2.661f, -2.652f)
                lineToRelative(4.39f, -9.58f)
                arcToRelative(1f, 1f, 0f, false, true, 1.616f, -0.29f)
                moveToRelative(7.517f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 1.414f)
                lineToRelative(-1f, 1f)
                arcToRelative(1f, 1f, 0f, false, true, -1.414f, -1.414f)
                lineToRelative(1f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 1.414f, 0f)
                moveToRelative(4.05f, 3.237f)
                arcToRelative(1f, 1f, 0f, false, true, 0.486f, 1.94f)
                lineToRelative(-2f, 0.5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.486f, -1.94f)
                close()
                moveToRelative(-2.756f, 7.47f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                arcToRelative(1f, 1f, 0f, false, true, 1.993f, -0.117f)
                lineToRelative(0.007f, 0.117f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
            }
        }.build()
        
        return _Confetti!!
    }

private var _Confetti: ImageVector? = null

