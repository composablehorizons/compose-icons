package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Add_location_alt: ImageVector
    get() {
        if (_Add_location_alt != null) return _Add_location_alt!!
        
        _Add_location_alt = ImageVector.Builder(
            name = "add_location_alt",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(6f)
                horizontalLineToRelative(-3f)
                verticalLineTo(4f)
                horizontalLineToRelative(3f)
                verticalLineTo(1f)
                horizontalLineToRelative(2f)
                close()
                moveToRelative(-8f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(1f, -9.94f)
                verticalLineToRelative(2.02f)
                arcTo(6.53f, 6.53f, 0f, false, false, 12f, 5f)
                curveToRelative(-3.35f, 0f, -6f, 2.57f, -6f, 6.2f)
                curveToRelative(0f, 2.34f, 1.95f, 5.44f, 6f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6f, -6.79f, 6f, -9.14f)
                verticalLineTo(11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.2f)
                curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveTo(4f, 6.22f, 7.8f, 3f, 12f, 3f)
                curveToRelative(0.34f, 0f, 0.67f, 0.02f, 1f, 0.06f)
                close()
            }
        }.build()
        
        return _Add_location_alt!!
    }

private var _Add_location_alt: ImageVector? = null

