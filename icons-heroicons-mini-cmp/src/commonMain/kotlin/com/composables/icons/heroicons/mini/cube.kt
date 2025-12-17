package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Cube: ImageVector
    get() {
        if (_Cube != null) return _Cube!!
        
        _Cube = ImageVector.Builder(
            name = "cube",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.362f, 1.093f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.724f, 0f)
                lineTo(2.523f, 5.018f)
                lineTo(10f, 9.143f)
                lineToRelative(7.477f, -4.125f)
                lineToRelative(-7.115f, -3.925f)
                close()
                moveTo(18f, 6.443f)
                lineToRelative(-7.25f, 4f)
                verticalLineToRelative(8.25f)
                lineToRelative(6.862f, -3.786f)
                arcTo(0.75f, 0.75f, 0f, false, false, 18f, 14.25f)
                verticalLineTo(6.443f)
                close()
                moveTo(9.25f, 18.693f)
                verticalLineToRelative(-8.25f)
                lineToRelative(-7.25f, -4f)
                verticalLineToRelative(7.807f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.388f, 0.657f)
                lineToRelative(6.862f, 3.786f)
                close()
            }
        }.build()
        
        return _Cube!!
    }

private var _Cube: ImageVector? = null

