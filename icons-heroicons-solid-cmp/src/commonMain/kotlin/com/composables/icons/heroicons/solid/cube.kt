package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Cube: ImageVector
    get() {
        if (_Cube != null) return _Cube!!
        
        _Cube = ImageVector.Builder(
            name = "cube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12.378f, 1.602f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.756f, 0f)
                lineTo(3f, 6.632f)
                lineToRelative(9f, 5.25f)
                lineToRelative(9f, -5.25f)
                lineToRelative(-8.622f, -5.03f)
                close()
                moveTo(21.75f, 7.93f)
                lineToRelative(-9f, 5.25f)
                verticalLineToRelative(9f)
                lineToRelative(8.628f, -5.032f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.372f, -0.648f)
                verticalLineTo(7.93f)
                close()
                moveTo(11.25f, 22.18f)
                verticalLineToRelative(-9f)
                lineToRelative(-9f, -5.25f)
                verticalLineToRelative(8.57f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.372f, 0.648f)
                lineToRelative(8.628f, 5.033f)
                close()
            }
        }.build()
        
        return _Cube!!
    }

private var _Cube: ImageVector? = null

