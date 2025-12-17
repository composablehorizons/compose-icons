package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Picture_in_picture_alt: ImageVector
    get() {
        if (_Picture_in_picture_alt != null) return _Picture_in_picture_alt!!
        
        _Picture_in_picture_alt = ImageVector.Builder(
            name = "picture_in_picture_alt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 11f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-6f)
                close()
                moveToRelative(-2f, 4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(4f, -12f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.88f, -2f, 1.98f)
                verticalLineTo(19f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4.98f)
                curveTo(23f, 3.88f, 22.1f, 3f, 21f, 3f)
                close()
                moveToRelative(0f, 16.02f)
                horizontalLineTo(3f)
                verticalLineTo(4.97f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.05f)
                close()
            }
        }.build()
        
        return _Picture_in_picture_alt!!
    }

private var _Picture_in_picture_alt: ImageVector? = null

