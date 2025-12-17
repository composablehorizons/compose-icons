package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.UserMinus: ImageVector
    get() {
        if (_UserMinus != null) return _UserMinus!!
        
        _UserMinus = ImageVector.Builder(
            name = "user-minus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.375f, 2.25f)
                arcToRelative(4.125f, 4.125f, 0f, true, false, 0f, 8.25f)
                arcToRelative(4.125f, 4.125f, 0f, false, false, 0f, -8.25f)
                close()
                moveTo(10.375f, 12f)
                arcToRelative(7.125f, 7.125f, 0f, false, false, -7.124f, 7.247f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.363f, 0.63f)
                arcToRelative(13.067f, 13.067f, 0f, false, false, 6.761f, 1.873f)
                curveToRelative(2.472f, 0f, 4.786f, -0.684f, 6.76f, -1.873f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.364f, -0.63f)
                lineToRelative(0.001f, -0.12f)
                verticalLineToRelative(-0.002f)
                arcTo(7.125f, 7.125f, 0f, false, false, 10.375f, 12f)
                close()
                moveTo(16f, 9.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.build()
        
        return _UserMinus!!
    }

private var _UserMinus: ImageVector? = null

