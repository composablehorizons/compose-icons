package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.CursorArrowRays: ImageVector
    get() {
        if (_CursorArrowRays != null) return _CursorArrowRays!!
        
        _CursorArrowRays = ImageVector.Builder(
            name = "cursor-arrow-rays",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 10f, 1f)
                close()
                moveTo(5.05f, 3.05f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                lineToRelative(1.062f, 1.06f)
                arcTo(0.75f, 0.75f, 0f, true, true, 6.11f, 5.173f)
                lineTo(5.05f, 4.11f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.06f)
                close()
                moveTo(14.95f, 3.05f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                lineToRelative(-1.06f, 1.062f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.062f, -1.061f)
                lineToRelative(1.061f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
                moveTo(3f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 3f, 8f)
                close()
                moveTo(14f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-1.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 14f, 8f)
                close()
                moveTo(7.172f, 10.828f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.061f)
                lineTo(6.11f, 12.95f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -1.06f)
                lineToRelative(1.06f, -1.06f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0f)
                close()
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
        
        return _CursorArrowRays!!
    }

private var _CursorArrowRays: ImageVector? = null

