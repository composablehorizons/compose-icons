package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Users: ImageVector
    get() {
        if (_Users != null) return _Users!!
        
        _Users = ImageVector.Builder(
            name = "users",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.5f, 6.375f)
                arcToRelative(4.125f, 4.125f, 0f, true, true, 8.25f, 0f)
                arcToRelative(4.125f, 4.125f, 0f, false, true, -8.25f, 0f)
                close()
                moveTo(14.25f, 8.625f)
                arcToRelative(3.375f, 3.375f, 0f, true, true, 6.75f, 0f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, -6.75f, 0f)
                close()
                moveTo(1.5f, 19.125f)
                arcToRelative(7.125f, 7.125f, 0f, false, true, 14.25f, 0f)
                verticalLineToRelative(0.003f)
                lineToRelative(-0.001f, 0.119f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.363f, 0.63f)
                arcToRelative(13.067f, 13.067f, 0f, false, true, -6.761f, 1.873f)
                curveToRelative(-2.472f, 0f, -4.786f, -0.684f, -6.76f, -1.873f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.364f, -0.63f)
                lineToRelative(-0.001f, -0.122f)
                close()
                moveTo(17.25f, 19.128f)
                lineToRelative(-0.001f, 0.144f)
                arcToRelative(2.25f, 2.25f, 0f, false, true, -0.233f, 0.96f)
                arcToRelative(10.088f, 10.088f, 0f, false, false, 5.06f, -1.01f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.42f, -0.643f)
                arcToRelative(4.875f, 4.875f, 0f, false, false, -6.957f, -4.611f)
                arcToRelative(8.586f, 8.586f, 0f, false, true, 1.71f, 5.157f)
                verticalLineToRelative(0.003f)
                close()
            }
        }.build()
        
        return _Users!!
    }

private var _Users: ImageVector? = null

