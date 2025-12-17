package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Shop: ImageVector
    get() {
        if (_Shop != null) return _Shop!!
        
        _Shop = ImageVector.Builder(
            name = "shop",
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
                verticalLineTo(4f)
                curveToRelative(0f, -1.11f, -0.89f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.11f, 0f, -2f, 0.89f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(13f)
                curveToRelative(0f, 1.11f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.11f, 0f, 2f, -0.89f, 2f, -2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(-6f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                close()
                moveToRelative(10f, 15f)
                horizontalLineTo(4f)
                verticalLineTo(8f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(11f)
                close()
                moveTo(9f, 18f)
                lineToRelative(7.5f, -5f)
                lineTo(9f, 9f)
                close()
            }
        }.build()
        
        return _Shop!!
    }

private var _Shop: ImageVector? = null

