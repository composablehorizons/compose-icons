package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Restaurant: ImageVector
    get() {
        if (_Restaurant != null) return _Restaurant!!
        
        _Restaurant = ImageVector.Builder(
            name = "restaurant",
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
                moveTo(16f, 6f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 4f)
                close()
                moveToRelative(-5f, 3f)
                horizontalLineTo(9f)
                verticalLineTo(2f)
                horizontalLineTo(7f)
                verticalLineToRelative(7f)
                horizontalLineTo(5f)
                verticalLineTo(2f)
                horizontalLineTo(3f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-9f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineTo(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7f)
                close()
            }
        }.build()
        
        return _Restaurant!!
    }

private var _Restaurant: ImageVector? = null

