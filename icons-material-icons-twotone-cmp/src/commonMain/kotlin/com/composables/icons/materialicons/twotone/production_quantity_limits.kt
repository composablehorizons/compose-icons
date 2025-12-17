package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Production_quantity_limits: ImageVector
    get() {
        if (_Production_quantity_limits != null) return _Production_quantity_limits!!
        
        _Production_quantity_limits = ImageVector.Builder(
            name = "production_quantity_limits",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(10f)
                close()
                moveTo(13f, 6f)
                horizontalLineToRelative(-2f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                close()
                moveTo(7f, 18f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveTo(5.9f, 22f, 7f, 22f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(8.1f, 18f, 7f, 18f)
                close()
                moveTo(17f, 18f)
                curveToRelative(-1.1f, 0f, -1.99f, 0.9f, -1.99f, 2f)
                reflectiveCurveToRelative(0.89f, 2f, 1.99f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveTo(18.1f, 18f, 17f, 18f)
                close()
                moveTo(8.1f, 13f)
                horizontalLineToRelative(7.45f)
                curveToRelative(0.75f, 0f, 1.41f, -0.41f, 1.75f, -1.03f)
                lineTo(21f, 4.96f)
                lineTo(19.25f, 4f)
                lineToRelative(-3.7f, 7f)
                horizontalLineTo(8.53f)
                lineTo(4.27f, 2f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                lineToRelative(3.6f, 7.59f)
                lineToRelative(-1.35f, 2.44f)
                curveTo(4.52f, 15.37f, 5.48f, 17f, 7f, 17f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                horizontalLineTo(7f)
                lineTo(8.1f, 13f)
                close()
            }
        }.build()
        
        return _Production_quantity_limits!!
    }

private var _Production_quantity_limits: ImageVector? = null

