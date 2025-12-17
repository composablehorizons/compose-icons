package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUturnUp: ImageVector
    get() {
        if (_ArrowUturnUp != null) return _ArrowUturnUp!!
        
        _ArrowUturnUp = ImageVector.Builder(
            name = "arrow-uturn-up",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.768f, 7.793f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, -0.025f)
                lineTo(12.75f, 3.622f)
                verticalLineToRelative(10.003f)
                arcToRelative(5.375f, 5.375f, 0f, false, true, -10.75f, 0f)
                verticalLineTo(10.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(2.875f)
                arcToRelative(3.875f, 3.875f, 0f, false, false, 7.75f, 0f)
                verticalLineTo(3.622f)
                lineTo(7.293f, 7.768f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.086f, -1.036f)
                lineToRelative(5.25f, -5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.085f, 0f)
                lineToRelative(5.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.024f, 1.06f)
                close()
            }
        }.build()
        
        return _ArrowUturnUp!!
    }

private var _ArrowUturnUp: ImageVector? = null

