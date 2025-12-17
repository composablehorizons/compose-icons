package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Facebook: ImageVector
    get() {
        if (_Facebook != null) return _Facebook!!
        
        _Facebook = ImageVector.Builder(
            name = "facebook",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8.049f)
                curveToRelative(0f, -4.446f, -3.582f, -8.05f, -8f, -8.05f)
                curveTo(3.58f, 0f, -0.002f, 3.603f, -0.002f, 8.05f)
                curveToRelative(0f, 4.017f, 2.926f, 7.347f, 6.75f, 7.951f)
                verticalLineToRelative(-5.625f)
                horizontalLineToRelative(-2.03f)
                verticalLineTo(8.05f)
                horizontalLineTo(6.75f)
                verticalLineTo(6.275f)
                curveToRelative(0f, -2.017f, 1.195f, -3.131f, 3.022f, -3.131f)
                curveToRelative(0.876f, 0f, 1.791f, 0.157f, 1.791f, 0.157f)
                verticalLineToRelative(1.98f)
                horizontalLineToRelative(-1.009f)
                curveToRelative(-0.993f, 0f, -1.303f, 0.621f, -1.303f, 1.258f)
                verticalLineToRelative(1.51f)
                horizontalLineToRelative(2.218f)
                lineToRelative(-0.354f, 2.326f)
                horizontalLineTo(9.25f)
                verticalLineTo(16f)
                curveToRelative(3.824f, -0.604f, 6.75f, -3.934f, 6.75f, -7.951f)
            }
        }.build()
        
        return _Facebook!!
    }

private var _Facebook: ImageVector? = null

