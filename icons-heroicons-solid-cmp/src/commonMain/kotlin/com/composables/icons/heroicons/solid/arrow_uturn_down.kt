package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.ArrowUturnDown: ImageVector
    get() {
        if (_ArrowUturnDown != null) return _ArrowUturnDown!!
        
        _ArrowUturnDown = ImageVector.Builder(
            name = "arrow-uturn-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15f, 3.75f)
                arcTo(5.25f, 5.25f, 0f, false, false, 9.75f, 9f)
                verticalLineToRelative(10.19f)
                lineToRelative(4.72f, -4.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineToRelative(-6f, 6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineToRelative(-6f, -6f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, -1.06f)
                lineToRelative(4.72f, 4.72f)
                verticalLineTo(9f)
                arcToRelative(6.75f, 6.75f, 0f, false, true, 13.5f, 0f)
                verticalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.9f, -2.35f, -5.25f, -5.25f, -5.25f)
                close()
            }
        }.build()
        
        return _ArrowUturnDown!!
    }

private var _ArrowUturnDown: ImageVector? = null

