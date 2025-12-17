package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Add_location_alt: ImageVector
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
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 4.8f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.41f)
                curveToRelative(0.06f, 0.39f, 0.09f, 0.79f, 0.09f, 1.2f)
                curveToRelative(0f, 2.57f, -2.1f, 5.79f, -6.16f, 9.51f)
                lineTo(12f, 21.01f)
                lineToRelative(-0.34f, -0.31f)
                curveTo(7.6f, 16.99f, 5.5f, 13.77f, 5.5f, 11.2f)
                curveToRelative(0f, -3.84f, 2.82f, -6.7f, 6.5f, -6.7f)
                curveTo(12.7f, 4.5f, 13.37f, 4.6f, 14f, 4.8f)
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
                horizontalLineTo(20f)
                close()
                moveTo(12f, 13f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveTo(13.1f, 13f, 12f, 13f)
                close()
                moveTo(14f, 3.25f)
                verticalLineToRelative(2.08f)
                curveTo(13.38f, 5.11f, 12.7f, 5f, 12f, 5f)
                curveToRelative(-3.35f, 0f, -6f, 2.57f, -6f, 6.2f)
                curveToRelative(0f, 2.34f, 1.95f, 5.44f, 6f, 9.14f)
                curveToRelative(4.05f, -3.7f, 6f, -6.79f, 6f, -9.14f)
                curveToRelative(0f, -0.41f, -0.03f, -0.81f, -0.1f, -1.2f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.05f, 0.39f, 0.08f, 0.79f, 0.08f, 1.2f)
                curveToRelative(0f, 3.32f, -2.67f, 7.25f, -8f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8f, -8.48f, -8f, -11.8f)
                curveTo(4f, 6.22f, 7.8f, 3f, 12f, 3f)
                curveTo(12.68f, 3f, 13.35f, 3.08f, 14f, 3.25f)
                close()
            }
        }.build()
        
        return _Add_location_alt!!
    }

private var _Add_location_alt: ImageVector? = null

