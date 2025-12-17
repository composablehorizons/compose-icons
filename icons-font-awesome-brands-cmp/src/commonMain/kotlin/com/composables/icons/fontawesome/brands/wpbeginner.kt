package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Wpbeginner: ImageVector
    get() {
        if (_Wpbeginner != null) return _Wpbeginner!!
        
        _Wpbeginner = ImageVector.Builder(
            name = "wpbeginner",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(462.799f, 322.374f)
                curveTo(519.01f, 386.682f, 466.961f, 480f, 370.944f, 480f)
                curveToRelative(-39.602f, 0f, -78.824f, -17.687f, -100.142f, -50.04f)
                curveToRelative(-6.887f, 0.356f, -22.702f, 0.356f, -29.59f, 0f)
                curveTo(219.848f, 462.381f, 180.588f, 480f, 141.069f, 480f)
                curveToRelative(-95.49f, 0f, -148.348f, -92.996f, -91.855f, -157.626f)
                curveTo(-29.925f, 190.523f, 80.479f, 32f, 256.006f, 32f)
                curveToRelative(175.632f, 0f, 285.87f, 158.626f, 206.793f, 290.374f)
                close()
                moveToRelative(-339.647f, -82.972f)
                horizontalLineToRelative(41.529f)
                verticalLineToRelative(-58.075f)
                horizontalLineToRelative(-41.529f)
                verticalLineToRelative(58.075f)
                close()
                moveToRelative(217.18f, 86.072f)
                verticalLineToRelative(-23.839f)
                curveToRelative(-60.506f, 20.915f, -132.355f, 9.198f, -187.589f, -33.971f)
                lineToRelative(0.246f, 24.897f)
                curveToRelative(51.101f, 46.367f, 131.746f, 57.875f, 187.343f, 32.913f)
                close()
                moveToRelative(-150.753f, -86.072f)
                horizontalLineToRelative(166.058f)
                verticalLineToRelative(-58.075f)
                horizontalLineTo(189.579f)
                verticalLineToRelative(58.075f)
                close()
            }
        }.build()
        
        return _Wpbeginner!!
    }

private var _Wpbeginner: ImageVector? = null

