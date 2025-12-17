package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsPdAlt: ImageVector
    get() {
        if (_CreativeCommonsPdAlt != null) return _CreativeCommonsPdAlt!!
        
        _CreativeCommonsPdAlt = ImageVector.Builder(
            name = "creative-commons-pd-alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(247.6f, 8f)
                curveTo(104.7f, 8f, 0f, 123.1f, 0f, 256f)
                curveToRelative(0f, 138.5f, 113.6f, 248f, 247.6f, 248f)
                curveTo(377.5f, 504f, 496f, 403.1f, 496f, 256f)
                curveTo(496f, 118.1f, 389.4f, 8f, 247.6f, 8f)
                close()
                moveToRelative(0.8f, 450.8f)
                curveToRelative(-112.5f, 0f, -203.7f, -93f, -203.7f, -202.8f)
                curveToRelative(0f, -105.4f, 85.5f, -203.3f, 203.7f, -203.3f)
                curveToRelative(112.6f, 0f, 202.9f, 89.5f, 202.8f, 203.3f)
                curveToRelative(0f, 121.7f, -99.6f, 202.8f, -202.8f, 202.8f)
                close()
                moveTo(316.7f, 186f)
                horizontalLineToRelative(-53.2f)
                verticalLineToRelative(137.2f)
                horizontalLineToRelative(53.2f)
                curveToRelative(21.4f, 0f, 70f, -5.1f, 70f, -68.6f)
                curveToRelative(0f, -63.4f, -48.6f, -68.6f, -70f, -68.6f)
                close()
                moveToRelative(0.8f, 108.5f)
                horizontalLineToRelative(-19.9f)
                verticalLineToRelative(-79.7f)
                lineToRelative(19.4f, -0.1f)
                curveToRelative(3.8f, 0f, 35f, -2.1f, 35f, 39.9f)
                curveToRelative(0f, 24.6f, -10.5f, 39.9f, -34.5f, 39.9f)
                close()
                moveTo(203.7f, 186f)
                horizontalLineToRelative(-68.2f)
                verticalLineToRelative(137.3f)
                horizontalLineToRelative(34.6f)
                verticalLineTo(279f)
                horizontalLineToRelative(27f)
                curveToRelative(54.1f, 0f, 57.1f, -37.5f, 57.1f, -46.5f)
                curveToRelative(0f, -31f, -16.8f, -46.5f, -50.5f, -46.5f)
                close()
                moveToRelative(-4.9f, 67.3f)
                horizontalLineToRelative(-29.2f)
                verticalLineToRelative(-41.6f)
                horizontalLineToRelative(28.3f)
                curveToRelative(30.9f, 0f, 28.8f, 41.6f, 0.9f, 41.6f)
                close()
            }
        }.build()
        
        return _CreativeCommonsPdAlt!!
    }

private var _CreativeCommonsPdAlt: ImageVector? = null

