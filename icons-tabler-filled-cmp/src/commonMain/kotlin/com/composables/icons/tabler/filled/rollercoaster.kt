package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Rollercoaster: ImageVector
    get() {
        if (_Rollercoaster != null) return _Rollercoaster!!
        
        _Rollercoaster = ImageVector.Builder(
            name = "rollercoaster",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 8f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                verticalLineToRelative(11f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-1.675f)
                quadToRelative(-0.163f, 0f, -0.325f, 0.007f)
                verticalLineToRelative(10.993f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-10.645f)
                arcToRelative(7.8f, 7.8f, 0f, false, false, -2f, 0.959f)
                verticalLineToRelative(9.686f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                verticalLineToRelative(-7.748f)
                arcToRelative(7.8f, 7.8f, 0f, false, false, -1.051f, 2.064f)
                lineToRelative(-0.735f, 2.205f)
                arcToRelative(7f, 7f, 0f, false, true, -0.213f, 0.553f)
                lineToRelative(-0.001f, 2.926f)
                arcToRelative(1f, 1f, 0f, false, true, -2f, 0f)
                lineToRelative(0.001f, -0.364f)
                arcToRelative(6.54f, 6.54f, 0f, false, true, -4.001f, 1.364f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                arcToRelative(4.55f, 4.55f, 0f, false, false, 4.316f, -3.111f)
                lineToRelative(0.735f, -2.205f)
                arcToRelative(9.775f, 9.775f, 0f, false, true, 9.274f, -6.684f)
                close()
                moveToRelative(-10.22f, -3.625f)
                lineToRelative(2f, 2.5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.18f, 1.425f)
                lineToRelative(-4f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -0.868f, 0.164f)
                lineToRelative(-1.8f, -0.5f)
                arcToRelative(1f, 1f, 0f, false, true, -0.727f, -0.864f)
                lineToRelative(-0.2f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.395f, -0.9f)
                lineToRelative(4f, -3f)
                arcToRelative(1f, 1f, 0f, false, true, 1.38f, 0.175f)
                moveToRelative(9.22f, -2.375f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-3f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Rollercoaster!!
    }

private var _Rollercoaster: ImageVector? = null

