package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.H2: ImageVector
    get() {
        if (_H2 != null) return _H2!!
        
        _H2 = ImageVector.Builder(
            name = "h2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.246f, 3.743f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(6.75f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(15.002f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                verticalLineToRelative(-6.751f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.5f, 0f)
                verticalLineToRelative(-15f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveTo(18.75f, 10.5f)
                curveToRelative(-0.727f, 0f, -1.441f, 0.054f, -2.138f, 0.16f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -0.223f, -1.484f)
                arcToRelative(15.867f, 15.867f, 0f, false, true, 3.635f, -0.125f)
                curveToRelative(1.149f, 0.092f, 2.153f, 0.923f, 2.348f, 2.115f)
                curveToRelative(0.084f, 0.516f, 0.128f, 1.045f, 0.128f, 1.584f)
                curveToRelative(0f, 1.065f, -0.676f, 1.927f, -1.531f, 2.354f)
                lineToRelative(-2.89f, 1.445f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -0.829f, 1.342f)
                verticalLineToRelative(0.86f)
                horizontalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 0f, 1.5f)
                horizontalLineTo(16.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-1.61f)
                arcToRelative(3f, 3f, 0f, false, true, 1.659f, -2.684f)
                lineToRelative(2.89f, -1.445f)
                curveToRelative(0.447f, -0.223f, 0.701f, -0.62f, 0.701f, -1.012f)
                arcToRelative(8.32f, 8.32f, 0f, false, false, -0.108f, -1.342f)
                curveToRelative(-0.075f, -0.457f, -0.47f, -0.82f, -0.987f, -0.862f)
                arcToRelative(14.45f, 14.45f, 0f, false, false, -1.155f, -0.046f)
                close()
            }
        }.build()
        
        return _H2!!
    }

private var _H2: ImageVector? = null

