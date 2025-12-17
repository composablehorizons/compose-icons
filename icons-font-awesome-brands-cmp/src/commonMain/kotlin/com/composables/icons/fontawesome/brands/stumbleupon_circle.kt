package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.StumbleuponCircle: ImageVector
    get() {
        if (_StumbleuponCircle != null) return _StumbleuponCircle!!
        
        _StumbleuponCircle = ImageVector.Builder(
            name = "stumbleupon-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(256f, 8f)
                curveTo(119f, 8f, 8f, 119f, 8f, 256f)
                reflectiveCurveToRelative(111f, 248f, 248f, 248f)
                reflectiveCurveToRelative(248f, -111f, 248f, -248f)
                reflectiveCurveTo(393f, 8f, 256f, 8f)
                close()
                moveToRelative(0f, 177.5f)
                curveToRelative(-9.8f, 0f, -17.8f, 8f, -17.8f, 17.8f)
                verticalLineToRelative(106.9f)
                curveToRelative(0f, 40.9f, -33.9f, 73.9f, -74.9f, 73.9f)
                curveToRelative(-41.4f, 0f, -74.9f, -33.5f, -74.9f, -74.9f)
                verticalLineToRelative(-46.5f)
                horizontalLineToRelative(57.3f)
                verticalLineToRelative(45.8f)
                curveToRelative(0f, 10f, 8f, 17.8f, 17.8f, 17.8f)
                reflectiveCurveToRelative(17.8f, -7.9f, 17.8f, -17.8f)
                verticalLineTo(200.1f)
                curveToRelative(0f, -40f, 34.2f, -72.1f, 74.7f, -72.1f)
                curveToRelative(40.7f, 0f, 74.7f, 32.3f, 74.7f, 72.6f)
                verticalLineToRelative(23.7f)
                lineToRelative(-34.1f, 10.1f)
                lineToRelative(-22.9f, -10.7f)
                verticalLineToRelative(-20.6f)
                curveToRelative(0.1f, -9.6f, -7.9f, -17.6f, -17.7f, -17.6f)
                close()
                moveToRelative(167.6f, 123.6f)
                curveToRelative(0f, 41.4f, -33.5f, 74.9f, -74.9f, 74.9f)
                curveToRelative(-41.2f, 0f, -74.9f, -33.2f, -74.9f, -74.2f)
                verticalLineTo(263f)
                lineToRelative(22.9f, 10.7f)
                lineToRelative(34.1f, -10.1f)
                verticalLineToRelative(47.1f)
                curveToRelative(0f, 9.8f, 8f, 17.6f, 17.8f, 17.6f)
                reflectiveCurveToRelative(17.8f, -7.9f, 17.8f, -17.6f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(57.3f)
                curveToRelative(-0.1f, 45.9f, -0.1f, 46.4f, -0.1f, 46.4f)
                close()
            }
        }.build()
        
        return _StumbleuponCircle!!
    }

private var _StumbleuponCircle: ImageVector? = null

