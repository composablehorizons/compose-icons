package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowUturnDown: ImageVector
    get() {
        if (_ArrowUturnDown != null) return _ArrowUturnDown!!
        
        _ArrowUturnDown = ImageVector.Builder(
            name = "arrow-uturn-down",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.232f, 12.207f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, 0.025f)
                lineToRelative(3.958f, 4.146f)
                verticalLineTo(6.375f)
                arcToRelative(5.375f, 5.375f, 0f, false, true, 10.75f, 0f)
                verticalLineTo(9.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(6.375f)
                arcToRelative(3.875f, 3.875f, 0f, false, false, -7.75f, 0f)
                verticalLineToRelative(10.003f)
                lineToRelative(3.957f, -4.146f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.085f, 1.036f)
                lineToRelative(-5.25f, 5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.085f, 0f)
                lineToRelative(-5.25f, -5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.025f, -1.06f)
                close()
            }
        }.build()
        
        return _ArrowUturnDown!!
    }

private var _ArrowUturnDown: ImageVector? = null

