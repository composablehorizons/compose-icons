package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.CursorArrowRipple: ImageVector
    get() {
        if (_CursorArrowRipple != null) return _CursorArrowRipple!!
        
        _CursorArrowRipple = ImageVector.Builder(
            name = "cursor-arrow-ripple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.303f, 5.197f)
                arcTo(7.5f, 7.5f, 0f, false, false, 6.697f, 15.803f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.061f, 1.061f)
                arcTo(9f, 9f, 0f, true, true, 21f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                curveToRelative(0f, -1.92f, -0.732f, -3.839f, -2.197f, -5.303f)
                close()
                moveToRelative(-2.121f, 2.121f)
                arcToRelative(4.5f, 4.5f, 0f, false, false, -6.364f, 6.364f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                arcTo(6f, 6f, 0f, true, true, 18f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                curveToRelative(0f, -1.153f, -0.44f, -2.303f, -1.318f, -3.182f)
                close()
                moveToRelative(-3.634f, 1.314f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.82f, 0.311f)
                lineToRelative(5.228f, 7.917f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.777f, 1.148f)
                lineToRelative(-2.097f, -0.43f)
                lineToRelative(1.045f, 3.9f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.45f, 0.388f)
                lineToRelative(-1.044f, -3.899f)
                lineToRelative(-1.601f, 1.42f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.247f, -0.606f)
                lineToRelative(0.569f, -9.47f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.554f, -0.68f)
                close()
            }
        }.build()
        
        return _CursorArrowRipple!!
    }

private var _CursorArrowRipple: ImageVector? = null

