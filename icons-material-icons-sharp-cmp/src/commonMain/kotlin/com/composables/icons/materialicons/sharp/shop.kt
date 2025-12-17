package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Shop: ImageVector
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
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(20f)
                verticalLineTo(6f)
                horizontalLineToRelative(-6f)
                close()
                moveToRelative(-6f, -2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(4f)
                close()
                moveTo(9f, 18f)
                verticalLineTo(9f)
                lineToRelative(7.5f, 4f)
                lineTo(9f, 18f)
                close()
            }
        }.build()
        
        return _Shop!!
    }

private var _Shop: ImageVector? = null

