package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Elementor: ImageVector
    get() {
        if (_Elementor != null) return _Elementor!!
        
        _Elementor = ImageVector.Builder(
            name = "elementor",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(425.6f, 32f)
                horizontalLineTo(22.4f)
                curveTo(10f, 32f, 0f, 42f, 0f, 54.4f)
                verticalLineToRelative(403.2f)
                curveTo(0f, 470f, 10f, 480f, 22.4f, 480f)
                horizontalLineToRelative(403.2f)
                curveToRelative(12.4f, 0f, 22.4f, -10f, 22.4f, -22.4f)
                verticalLineTo(54.4f)
                curveTo(448f, 42f, 438f, 32f, 425.6f, 32f)
                moveTo(164.3f, 355.5f)
                horizontalLineToRelative(-39.8f)
                verticalLineToRelative(-199f)
                horizontalLineToRelative(39.8f)
                verticalLineToRelative(199f)
                close()
                moveToRelative(159.3f, 0f)
                horizontalLineTo(204.1f)
                verticalLineToRelative(-39.8f)
                horizontalLineToRelative(119.5f)
                verticalLineToRelative(39.8f)
                close()
                moveToRelative(0f, -79.6f)
                horizontalLineTo(204.1f)
                verticalLineToRelative(-39.8f)
                horizontalLineToRelative(119.5f)
                verticalLineToRelative(39.8f)
                close()
                moveToRelative(0f, -79.7f)
                horizontalLineTo(204.1f)
                verticalLineToRelative(-39.8f)
                horizontalLineToRelative(119.5f)
                verticalLineToRelative(39.8f)
                close()
            }
        }.build()
        
        return _Elementor!!
    }

private var _Elementor: ImageVector? = null

