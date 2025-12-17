package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.CursorArrowRipple: ImageVector
    get() {
        if (_CursorArrowRipple != null) return _CursorArrowRipple!!
        
        _CursorArrowRipple = ImageVector.Builder(
            name = "cursor-arrow-ripple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.038f, 4.038f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, 0f, 7.424f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 1.061f)
                arcTo(6.75f, 6.75f, 0f, true, true, 14.5f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                arcToRelative(5.25f, 5.25f, 0f, false, false, -8.962f, -3.712f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.712f, 7.136f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.814f, 0.302f)
                lineToRelative(2.984f, 4.377f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.726f, 1.164f)
                lineToRelative(-0.76f, -0.109f)
                lineToRelative(0.289f, 1.075f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.45f, 0.388f)
                lineToRelative(-0.287f, -1.075f)
                lineToRelative(-0.602f, 0.474f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.212f, -0.645f)
                lineToRelative(0.396f, -5.283f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.554f, -0.668f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.805f, 9.695f)
                arcTo(2.75f, 2.75f, 0f, true, true, 10.5f, 7.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                arcToRelative(4.25f, 4.25f, 0f, true, false, -7.255f, 3.005f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 1.06f, -1.06f)
                close()
            }
        }.build()
        
        return _CursorArrowRipple!!
    }

private var _CursorArrowRipple: ImageVector? = null

