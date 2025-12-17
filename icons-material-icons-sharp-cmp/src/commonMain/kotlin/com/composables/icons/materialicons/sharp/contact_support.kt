package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Contact_support: ImageVector
    get() {
        if (_Contact_support != null) return _Contact_support!!
        
        _Contact_support = ImageVector.Builder(
            name = "contact_support",
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
                moveTo(11.5f, 2f)
                curveTo(6.81f, 2f, 3f, 5.81f, 3f, 10.5f)
                reflectiveCurveTo(6.81f, 19f, 11.5f, 19f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(3f)
                curveToRelative(4.86f, -2.34f, 8f, -7f, 8f, -11.5f)
                curveTo(20f, 5.81f, 16.19f, 2f, 11.5f, 2f)
                close()
                moveToRelative(1f, 14.5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, -3.5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.25f, 3f, -3f, 3f, -5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 2.5f, -3f, 2.75f, -3f, 5f)
                close()
            }
        }.build()
        
        return _Contact_support!!
    }

private var _Contact_support: ImageVector? = null

