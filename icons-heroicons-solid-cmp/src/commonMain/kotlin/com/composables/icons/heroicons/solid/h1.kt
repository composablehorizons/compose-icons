package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.H1: ImageVector
    get() {
        if (_H1 != null) return _H1!!
        
        _H1 = ImageVector.Builder(
            name = "h1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.243f, 3.743f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-6.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.5f, 0f)
                verticalLineToRelative(15.002f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                verticalLineToRelative(-6.751f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                verticalLineToRelative(-15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(17.605f, 4.964f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.396f, 0.661f)
                verticalLineToRelative(9.376f)
                horizontalLineToRelative(1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, -1.5f)
                horizontalLineToRelative(1.5f)
                verticalLineTo(10.77f)
                lineToRelative(-1.084f, 0.722f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.832f, -1.248f)
                lineToRelative(2.25f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.77f, -0.037f)
                close()
            }
        }.build()
        
        return _H1!!
    }

private var _H1: ImageVector? = null

