package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CursorArrowRipple: ImageVector
    get() {
        if (_CursorArrowRipple != null) return _CursorArrowRipple!!
        
        _CursorArrowRipple = ImageVector.Builder(
            name = "cursor-arrow-ripple",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.111f, 11.89f)
                arcTo(5.5f, 5.5f, 0f, true, true, 15.501f, 8f)
                arcTo(0.75f, 0.75f, 0f, false, false, 17f, 8f)
                arcToRelative(7f, 7f, 0f, true, false, -11.95f, 4.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.06f, -1.06f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.232f, 6.232f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, 0f, 3.536f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, 1.06f)
                arcTo(4f, 4f, 0f, true, true, 14f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, false, -4.268f, -1.768f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.766f, 7.51f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.37f, 0.365f)
                lineToRelative(-0.492f, 6.861f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.204f, 0.65f)
                lineToRelative(1.043f, -0.799f)
                lineToRelative(0.985f, 3.678f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.45f, -0.388f)
                lineToRelative(-0.978f, -3.646f)
                lineToRelative(1.292f, 0.204f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.74f, -1.16f)
                lineToRelative(-3.874f, -5.764f)
                close()
            }
        }.build()
        
        return _CursorArrowRipple!!
    }

private var _CursorArrowRipple: ImageVector? = null

