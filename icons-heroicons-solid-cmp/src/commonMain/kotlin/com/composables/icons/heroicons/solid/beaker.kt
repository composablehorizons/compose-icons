package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Beaker: ImageVector
    get() {
        if (_Beaker != null) return _Beaker!!
        
        _Beaker = ImageVector.Builder(
            name = "beaker",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 3.798f)
                verticalLineToRelative(5.02f)
                arcToRelative(3f, 3f, 0f, false, true, -0.879f, 2.121f)
                lineToRelative(-2.377f, 2.377f)
                arcToRelative(9.845f, 9.845f, 0f, false, true, 5.091f, 1.013f)
                arcToRelative(8.315f, 8.315f, 0f, false, false, 5.713f, 0.636f)
                lineToRelative(0.285f, -0.071f)
                lineToRelative(-3.954f, -3.955f)
                arcToRelative(3f, 3f, 0f, false, true, -0.879f, -2.121f)
                verticalLineToRelative(-5.02f)
                arcToRelative(23.614f, 23.614f, 0f, false, false, -3f, 0f)
                close()
                moveToRelative(4.5f, 0.138f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.093f, -1.495f)
                arcTo(24.837f, 24.837f, 0f, false, false, 12f, 2.25f)
                arcToRelative(25.048f, 25.048f, 0f, false, false, -3.093f, 0.191f)
                arcTo(0.75f, 0.75f, 0f, false, false, 9f, 3.936f)
                verticalLineToRelative(4.882f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -0.44f, 1.06f)
                lineToRelative(-6.293f, 6.294f)
                curveToRelative(-1.62f, 1.621f, -0.903f, 4.475f, 1.471f, 4.88f)
                curveToRelative(2.686f, 0.46f, 5.447f, 0.698f, 8.262f, 0.698f)
                curveToRelative(2.816f, 0f, 5.576f, -0.239f, 8.262f, -0.697f)
                curveToRelative(2.373f, -0.406f, 3.092f, -3.26f, 1.47f, -4.881f)
                lineTo(15.44f, 9.879f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 8.818f)
                verticalLineTo(3.936f)
                close()
            }
        }.build()
        
        return _Beaker!!
    }

private var _Beaker: ImageVector? = null

