package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.RedRiver: ImageVector
    get() {
        if (_RedRiver != null) return _RedRiver!!
        
        _RedRiver = ImageVector.Builder(
            name = "red-river",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(353.2f, 32f)
                horizontalLineTo(94.8f)
                curveTo(42.4f, 32f, 0f, 74.4f, 0f, 126.8f)
                verticalLineToRelative(258.4f)
                curveTo(0f, 437.6f, 42.4f, 480f, 94.8f, 480f)
                horizontalLineToRelative(258.4f)
                curveToRelative(52.4f, 0f, 94.8f, -42.4f, 94.8f, -94.8f)
                verticalLineTo(126.8f)
                curveToRelative(0f, -52.4f, -42.4f, -94.8f, -94.8f, -94.8f)
                close()
                moveTo(144.9f, 200.9f)
                verticalLineToRelative(56.3f)
                curveToRelative(0f, 27f, -21.9f, 48.9f, -48.9f, 48.9f)
                verticalLineTo(151.9f)
                curveToRelative(0f, -13.2f, 10.7f, -23.9f, 23.9f, -23.9f)
                horizontalLineToRelative(154.2f)
                curveToRelative(0f, 27f, -21.9f, 48.9f, -48.9f, 48.9f)
                horizontalLineToRelative(-56.3f)
                curveToRelative(-12.3f, -0.6f, -24.6f, 11.6f, -24f, 24f)
                close()
                moveToRelative(176.3f, 72f)
                horizontalLineToRelative(-56.3f)
                curveToRelative(-12.3f, -0.6f, -24.6f, 11.6f, -24f, 24f)
                verticalLineToRelative(56.3f)
                curveToRelative(0f, 27f, -21.9f, 48.9f, -48.9f, 48.9f)
                verticalLineTo(247.9f)
                curveToRelative(0f, -13.2f, 10.7f, -23.9f, 23.9f, -23.9f)
                horizontalLineToRelative(154.2f)
                curveToRelative(0f, 27f, -21.9f, 48.9f, -48.9f, 48.9f)
                close()
            }
        }.build()
        
        return _RedRiver!!
    }

private var _RedRiver: ImageVector? = null

