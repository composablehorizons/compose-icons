package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Tag: ImageVector
    get() {
        if (_Tag != null) return _Tag!!
        
        _Tag = ImageVector.Builder(
            name = "tag",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.25f, 2.25f)
                arcToRelative(3f, 3f, 0f, false, false, -3f, 3f)
                verticalLineToRelative(4.318f)
                arcToRelative(3f, 3f, 0f, false, false, 0.879f, 2.121f)
                lineToRelative(9.58f, 9.581f)
                curveToRelative(0.92f, 0.92f, 2.39f, 1.186f, 3.548f, 0.428f)
                arcToRelative(18.849f, 18.849f, 0f, false, false, 5.441f, -5.44f)
                curveToRelative(0.758f, -1.16f, 0.492f, -2.629f, -0.428f, -3.548f)
                lineToRelative(-9.58f, -9.581f)
                arcToRelative(3f, 3f, 0f, false, false, -2.122f, -0.879f)
                horizontalLineTo(5.25f)
                close()
                moveTo(6.375f, 7.5f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, -2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, 2.25f)
                close()
            }
        }.build()
        
        return _Tag!!
    }

private var _Tag: ImageVector? = null

