package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Local_grocery_store: ImageVector
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
                moveTo(2f, 4f)
                horizontalLineToRelative(1f)
                lineToRelative(3.6f, 7.59f)
                lineToRelative(-1.35f, 2.44f)
                curveTo(4.52f, 15.37f, 5.48f, 17f, 7f, 17f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineTo(7f)
                lineToRelative(1.1f, -2f)
                horizontalLineToRelative(7.45f)
                curveToRelative(0.75f, 0f, 1.41f, -0.41f, 1.75f, -1.03f)
                lineToRelative(3.58f, -6.49f)
                curveToRelative(0.37f, -0.66f, -0.11f, -1.48f, -0.87f, -1.48f)
                horizontalLineTo(5.21f)
                lineToRelative(-0.67f, -1.43f)
                curveToRelative(-0.16f, -0.35f, -0.52f, -0.57f, -0.9f, -0.57f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                close()
                moveToRelative(15f, 14f)
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

