package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Contact_support: ImageVector
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
                moveTo(11f, 23.59f)
                verticalLineToRelative(-3.6f)
                curveToRelative(-5.01f, -0.26f, -9f, -4.42f, -9f, -9.49f)
                curveTo(2f, 5.26f, 6.26f, 1f, 11.5f, 1f)
                reflectiveCurveTo(21f, 5.26f, 21f, 10.5f)
                curveToRelative(0f, 4.95f, -3.44f, 9.93f, -8.57f, 12.4f)
                lineToRelative(-1.43f, 0.69f)
                close()
                moveTo(11.5f, 3f)
                curveTo(7.36f, 3f, 4f, 6.36f, 4f, 10.5f)
                reflectiveCurveTo(7.36f, 18f, 11.5f, 18f)
                horizontalLineTo(13f)
                verticalLineToRelative(2.3f)
                curveToRelative(3.64f, -2.3f, 6f, -6.08f, 6f, -9.8f)
                curveTo(19f, 6.36f, 15.64f, 3f, 11.5f, 3f)
                close()
                moveToRelative(-1f, 11.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(2f, -1.5f)
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

