package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Scissors: ImageVector
    get() {
        if (_Scissors != null) return _Scissors!!
        
        _Scissors = ImageVector.Builder(
            name = "scissors",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.128f, 9.155f)
                arcToRelative(3.751f, 3.751f, 0f, true, true, 0.713f, -1.321f)
                lineToRelative(1.136f, 0.656f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.222f, 1.104f)
                lineToRelative(-0.006f, 0.007f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.032f, 0.157f)
                arcToRelative(1.421f, 1.421f, 0f, false, false, -0.113f, -0.072f)
                lineToRelative(-0.92f, -0.531f)
                close()
                moveToRelative(-4.827f, -3.53f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, 3.994f, 2.063f)
                arcToRelative(0.756f, 0.756f, 0f, false, false, -0.122f, 0.23f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -3.872f, -2.293f)
                close()
                moveTo(13.348f, 8.272f)
                arcToRelative(5.073f, 5.073f, 0f, false, false, -3.428f, 3.57f)
                arcToRelative(5.08f, 5.08f, 0f, false, false, -0.165f, 1.202f)
                arcToRelative(1.415f, 1.415f, 0f, false, true, -0.707f, 1.201f)
                lineToRelative(-0.96f, 0.554f)
                arcToRelative(3.751f, 3.751f, 0f, true, false, 0.734f, 1.309f)
                lineToRelative(13.729f, -7.926f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.181f, -1.374f)
                lineToRelative(-0.803f, -0.215f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, -2.894f, 0.05f)
                lineToRelative(-5.325f, 1.629f)
                close()
                moveToRelative(-9.223f, 7.03f)
                arcToRelative(2.25f, 2.25f, 0f, true, false, 2.25f, 3.897f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, -2.25f, -3.897f)
                close()
                moveTo(12f, 12.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.372f, 12.615f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0f)
                lineToRelative(5.43f, 3.135f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.182f, 1.374f)
                lineToRelative(-0.802f, 0.215f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, -2.894f, -0.051f)
                lineToRelative(-5.147f, -1.574f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.156f, -1.367f)
                lineToRelative(3f, -1.732f)
                close()
            }
        }.build()
        
        return _Scissors!!
    }

private var _Scissors: ImageVector? = null

