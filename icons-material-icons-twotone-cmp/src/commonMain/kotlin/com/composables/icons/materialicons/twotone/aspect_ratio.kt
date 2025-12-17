package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Aspect_ratio: ImageVector
    get() {
        if (_Aspect_ratio != null) return _Aspect_ratio!!
        
        _Aspect_ratio = ImageVector.Builder(
            name = "aspect_ratio",
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
                moveTo(3f, 19.01f)
                horizontalLineToRelative(18f)
                verticalLineTo(4.99f)
                horizontalLineTo(3f)
                verticalLineToRelative(14.02f)
                close()
                moveTo(14f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                close()
                moveTo(5f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(3f)
                horizontalLineTo(5f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 3f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 16.01f)
                horizontalLineTo(3f)
                verticalLineTo(4.99f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(14.02f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(3f)
                verticalLineTo(7f)
                horizontalLineTo(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(12f, 3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                close()
            }
        }.build()
        
        return _Aspect_ratio!!
    }

private var _Aspect_ratio: ImageVector? = null

