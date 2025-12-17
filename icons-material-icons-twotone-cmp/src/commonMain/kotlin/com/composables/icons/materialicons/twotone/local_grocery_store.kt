package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_grocery_store: ImageVector
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
                moveTo(8.53f, 11f)
                horizontalLineToRelative(7.02f)
                lineToRelative(2.76f, -5f)
                horizontalLineTo(6.16f)
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
                moveToRelative(10f, 0f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveToRelative(0.89f, 2f, 1.99f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-1.45f, -5f)
                curveToRelative(0.75f, 0f, 1.41f, -0.41f, 1.75f, -1.03f)
                lineToRelative(3.58f, -6.49f)
                curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f)
                horizontalLineTo(5.21f)
                lineToRelative(-0.94f, -2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineToRelative(3.6f, 7.59f)
                lineToRelative(-1.35f, 2.44f)
                curveTo(4.52f, 15.37f, 5.48f, 17f, 7f, 17f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                lineToRelative(1.1f, -2f)
                horizontalLineToRelative(7.45f)
                close()
                moveTo(6.16f, 6f)
                horizontalLineToRelative(12.15f)
                lineToRelative(-2.76f, 5f)
                horizontalLineTo(8.53f)
                lineTo(6.16f, 6f)
                close()
            }
        }.build()
        
        return _Local_grocery_store!!
    }

private var _Local_grocery_store: ImageVector? = null

