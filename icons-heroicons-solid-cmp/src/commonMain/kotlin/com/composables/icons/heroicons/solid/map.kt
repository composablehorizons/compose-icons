package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Map: ImageVector
    get() {
        if (_Map != null) return _Map!!
        
        _Map = ImageVector.Builder(
            name = "map",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.161f, 2.58f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, 1.678f, 0f)
                lineToRelative(4.993f, 2.498f)
                curveToRelative(0.106f, 0.052f, 0.23f, 0.052f, 0.336f, 0f)
                lineToRelative(3.869f, -1.935f)
                arcTo(1.875f, 1.875f, 0f, false, true, 21.75f, 4.82f)
                verticalLineToRelative(12.485f)
                curveToRelative(0f, 0.71f, -0.401f, 1.36f, -1.037f, 1.677f)
                lineToRelative(-4.875f, 2.437f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -1.676f, 0f)
                lineToRelative(-4.994f, -2.497f)
                arcToRelative(0.375f, 0.375f, 0f, false, false, -0.336f, 0f)
                lineToRelative(-3.868f, 1.935f)
                arcTo(1.875f, 1.875f, 0f, false, true, 2.25f, 19.18f)
                verticalLineTo(6.695f)
                curveToRelative(0f, -0.71f, 0.401f, -1.36f, 1.036f, -1.677f)
                lineToRelative(4.875f, -2.437f)
                close()
                moveTo(9f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineTo(15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(6.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 9f, 6f)
                close()
                moveToRelative(6.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineTo(9f)
                close()
            }
        }.build()
        
        return _Map!!
    }

private var _Map: ImageVector? = null

