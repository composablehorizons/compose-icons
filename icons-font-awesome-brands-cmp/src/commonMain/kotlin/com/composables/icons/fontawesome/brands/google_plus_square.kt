package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.GooglePlusSquare: ImageVector
    get() {
        if (_GooglePlusSquare != null) return _GooglePlusSquare!!
        
        _GooglePlusSquare = ImageVector.Builder(
            name = "google-plus-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(164f, 356f)
                curveToRelative(-55.3f, 0f, -100f, -44.7f, -100f, -100f)
                reflectiveCurveToRelative(44.7f, -100f, 100f, -100f)
                curveToRelative(27f, 0f, 49.5f, 9.8f, 67f, 26.2f)
                lineToRelative(-27.1f, 26.1f)
                curveToRelative(-7.4f, -7.1f, -20.3f, -15.4f, -39.8f, -15.4f)
                curveToRelative(-34.1f, 0f, -61.9f, 28.2f, -61.9f, 63.2f)
                curveToRelative(0f, 34.9f, 27.8f, 63.2f, 61.9f, 63.2f)
                curveToRelative(39.6f, 0f, 54.4f, -28.5f, 56.8f, -43.1f)
                horizontalLineTo(164f)
                verticalLineToRelative(-34.4f)
                horizontalLineToRelative(94.4f)
                curveToRelative(1f, 5f, 1.6f, 10.1f, 1.6f, 16.6f)
                curveToRelative(0f, 57.1f, -38.3f, 97.6f, -96f, 97.6f)
                close()
                moveToRelative(220f, -81.8f)
                horizontalLineToRelative(-29f)
                verticalLineToRelative(29f)
                horizontalLineToRelative(-29.2f)
                verticalLineToRelative(-29f)
                horizontalLineToRelative(-29f)
                verticalLineTo(245f)
                horizontalLineToRelative(29f)
                verticalLineToRelative(-29f)
                horizontalLineTo(355f)
                verticalLineToRelative(29f)
                horizontalLineToRelative(29f)
                verticalLineToRelative(29.2f)
                close()
            }
        }.build()
        
        return _GooglePlusSquare!!
    }

private var _GooglePlusSquare: ImageVector? = null

