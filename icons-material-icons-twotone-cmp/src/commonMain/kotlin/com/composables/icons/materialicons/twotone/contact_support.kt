package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Contact_support: ImageVector
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
                moveTo(11.5f, 3f)
                curveTo(7.36f, 3f, 4f, 6.36f, 4f, 10.5f)
                reflectiveCurveTo(7.36f, 18f, 11.5f, 18f)
                horizontalLineTo(13f)
                verticalLineToRelative(2.3f)
                curveToRelative(3.64f, -2.3f, 6f, -6.08f, 6f, -9.8f)
                curveTo(19f, 6.36f, 15.64f, 3f, 11.5f, 3f)
                close()
                moveToRelative(1f, 13.5f)
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11.5f, 1f)
                curveTo(6.26f, 1f, 2f, 5.26f, 2f, 10.5f)
                curveToRelative(0f, 5.07f, 3.99f, 9.23f, 9f, 9.49f)
                verticalLineToRelative(3.6f)
                lineToRelative(1.43f, -0.69f)
                curveTo(17.56f, 20.43f, 21f, 15.45f, 21f, 10.5f)
                curveTo(21f, 5.26f, 16.74f, 1f, 11.5f, 1f)
                close()
                moveTo(13f, 20.3f)
                verticalLineTo(18f)
                horizontalLineToRelative(-1.5f)
                curveTo(7.36f, 18f, 4f, 14.64f, 4f, 10.5f)
                reflectiveCurveTo(7.36f, 3f, 11.5f, 3f)
                reflectiveCurveTo(19f, 6.36f, 19f, 10.5f)
                curveToRelative(0f, 3.73f, -2.36f, 7.51f, -6f, 9.8f)
                close()
                moveToRelative(-2.5f, -5.8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(1f, -10.5f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 2f, -3f, 1.75f, -3f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.25f, 3f, -2.5f, 3f, -5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
            }
        }.build()
        
        return _Contact_support!!
    }

private var _Contact_support: ImageVector? = null

