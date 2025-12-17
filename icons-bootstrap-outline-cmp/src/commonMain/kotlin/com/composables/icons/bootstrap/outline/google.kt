package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Google: ImageVector
    get() {
        if (_Google != null) return _Google!!
        
        _Google = ImageVector.Builder(
            name = "google",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.545f, 6.558f)
                arcToRelative(9.4f, 9.4f, 0f, false, true, 0.139f, 1.626f)
                curveToRelative(0f, 2.434f, -0.87f, 4.492f, -2.384f, 5.885f)
                horizontalLineToRelative(0.002f)
                curveTo(11.978f, 15.292f, 10.158f, 16f, 8f, 16f)
                arcTo(8f, 8f, 0f, true, true, 8f, 0f)
                arcToRelative(7.7f, 7.7f, 0f, false, true, 5.352f, 2.082f)
                lineToRelative(-2.284f, 2.284f)
                arcTo(4.35f, 4.35f, 0f, false, false, 8f, 3.166f)
                curveToRelative(-2.087f, 0f, -3.86f, 1.408f, -4.492f, 3.304f)
                arcToRelative(4.8f, 4.8f, 0f, false, false, 0f, 3.063f)
                horizontalLineToRelative(0.003f)
                curveToRelative(0.635f, 1.893f, 2.405f, 3.301f, 4.492f, 3.301f)
                curveToRelative(1.078f, 0f, 2.004f, -0.276f, 2.722f, -0.764f)
                horizontalLineToRelative(-0.003f)
                arcToRelative(3.7f, 3.7f, 0f, false, false, 1.599f, -2.431f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3.08f)
                close()
            }
        }.build()
        
        return _Google!!
    }

private var _Google: ImageVector? = null

