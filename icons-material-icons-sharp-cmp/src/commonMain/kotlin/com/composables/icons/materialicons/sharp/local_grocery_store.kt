package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Local_grocery_store: ImageVector
    get() {
        if (_Local_grocery_store != null) return _Local_grocery_store!!
        
        _Local_grocery_store = ImageVector.Builder(
            name = "local_grocery_store",
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
                moveTo(7f, 18f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveTo(5.9f, 22f, 7f, 22f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(1f, 4f)
                horizontalLineToRelative(2f)
                lineToRelative(3.6f, 7.59f)
                lineTo(3.62f, 17f)
                horizontalLineTo(19f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                lineToRelative(1.1f, -2f)
                horizontalLineToRelative(8.64f)
                lineToRelative(4.97f, -9f)
                horizontalLineTo(5.21f)
                lineToRelative(-0.94f, -2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(16f, 14f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveToRelative(0.89f, 2f, 1.99f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
            }
        }.build()
        
        return _Local_grocery_store!!
    }

private var _Local_grocery_store: ImageVector? = null

