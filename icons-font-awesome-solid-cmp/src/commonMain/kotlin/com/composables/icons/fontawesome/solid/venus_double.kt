package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.VenusDouble: ImageVector
    get() {
        if (_VenusDouble != null) return _VenusDouble!!
        
        _VenusDouble = ImageVector.Builder(
            name = "venus-double",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(288f, 176f)
                curveToRelative(0f, -79.5f, -64.5f, -144f, -144f, -144f)
                reflectiveCurveTo(0f, 96.5f, 0f, 176f)
                curveToRelative(0f, 68.5f, 47.9f, 125.9f, 112f, 140.4f)
                verticalLineTo(368f)
                horizontalLineTo(76f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(36f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(40f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-36f)
                horizontalLineToRelative(36f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                horizontalLineToRelative(-36f)
                verticalLineToRelative(-51.6f)
                curveToRelative(64.1f, -14.5f, 112f, -71.9f, 112f, -140.4f)
                close()
                moveToRelative(-224f, 0f)
                curveToRelative(0f, -44.1f, 35.9f, -80f, 80f, -80f)
                reflectiveCurveToRelative(80f, 35.9f, 80f, 80f)
                reflectiveCurveToRelative(-35.9f, 80f, -80f, 80f)
                reflectiveCurveToRelative(-80f, -35.9f, -80f, -80f)
                close()
                moveToRelative(336f, 140.4f)
                verticalLineTo(368f)
                horizontalLineToRelative(36f)
                curveToRelative(6.6f, 0f, 12f, 5.4f, 12f, 12f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-36f)
                verticalLineToRelative(36f)
                curveToRelative(0f, 6.6f, -5.4f, 12f, -12f, 12f)
                horizontalLineToRelative(-40f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-36f)
                horizontalLineToRelative(-36f)
                curveToRelative(-6.6f, 0f, -12f, -5.4f, -12f, -12f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -6.6f, 5.4f, -12f, 12f, -12f)
                horizontalLineToRelative(36f)
                verticalLineToRelative(-51.6f)
                curveToRelative(-21.2f, -4.8f, -40.6f, -14.3f, -57.2f, -27.3f)
                curveToRelative(14f, -16.7f, 25f, -36f, 32.1f, -57.1f)
                curveToRelative(14.5f, 14.8f, 34.7f, 24f, 57.1f, 24f)
                curveToRelative(44.1f, 0f, 80f, -35.9f, 80f, -80f)
                reflectiveCurveToRelative(-35.9f, -80f, -80f, -80f)
                curveToRelative(-22.3f, 0f, -42.6f, 9.2f, -57.1f, 24f)
                curveToRelative(-7.1f, -21.1f, -18f, -40.4f, -32.1f, -57.1f)
                curveTo(303.4f, 43.6f, 334.3f, 32f, 368f, 32f)
                curveToRelative(79.5f, 0f, 144f, 64.5f, 144f, 144f)
                curveToRelative(0f, 68.5f, -47.9f, 125.9f, -112f, 140.4f)
                close()
            }
        }.build()
        
        return _VenusDouble!!
    }

private var _VenusDouble: ImageVector? = null

