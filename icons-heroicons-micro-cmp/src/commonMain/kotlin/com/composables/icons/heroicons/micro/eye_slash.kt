package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.EyeSlash: ImageVector
    get() {
        if (_EyeSlash != null) return _EyeSlash!!
        
        _EyeSlash = ImageVector.Builder(
            name = "eye-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.28f, 2.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(10.5f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                lineToRelative(-1.322f, -1.323f)
                arcToRelative(7.012f, 7.012f, 0f, false, false, 2.16f, -3.11f)
                arcToRelative(0.87f, 0.87f, 0f, false, false, 0f, -0.567f)
                arcTo(7.003f, 7.003f, 0f, false, false, 4.82f, 3.76f)
                lineToRelative(-1.54f, -1.54f)
                close()
                moveToRelative(3.196f, 3.195f)
                lineToRelative(1.135f, 1.136f)
                arcTo(1.502f, 1.502f, 0f, false, true, 9.45f, 8.389f)
                lineToRelative(1.136f, 1.135f)
                arcToRelative(3f, 3f, 0f, false, false, -4.109f, -4.109f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.812f, 10.994f)
                lineToRelative(1.816f, 1.816f)
                arcTo(7.003f, 7.003f, 0f, false, true, 1.38f, 8.28f)
                arcToRelative(0.87f, 0.87f, 0f, false, true, 0f, -0.566f)
                arcToRelative(6.985f, 6.985f, 0f, false, true, 1.113f, -2.039f)
                lineToRelative(2.513f, 2.513f)
                arcToRelative(3f, 3f, 0f, false, false, 2.806f, 2.806f)
                close()
            }
        }.build()
        
        return _EyeSlash!!
    }

private var _EyeSlash: ImageVector? = null

