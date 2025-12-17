package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shop_two: ImageVector
    get() {
        if (_Shop_two != null) return _Shop_two!!
        
        _Shop_two = ImageVector.Builder(
            name = "shop_two",
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
                moveTo(3f, 9f)
                horizontalLineTo(1f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-2f)
                horizontalLineTo(3f)
                verticalLineTo(9f)
                close()
                moveToRelative(15f, -4f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(5f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(18f)
                verticalLineTo(5f)
                horizontalLineToRelative(-5f)
                close()
                moveToRelative(-6f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(3f)
                close()
                moveToRelative(0f, 12f)
                verticalLineTo(8f)
                lineToRelative(5.5f, 3f)
                lineToRelative(-5.5f, 4f)
                close()
            }
        }.build()
        
        return _Shop_two!!
    }

private var _Shop_two: ImageVector? = null

