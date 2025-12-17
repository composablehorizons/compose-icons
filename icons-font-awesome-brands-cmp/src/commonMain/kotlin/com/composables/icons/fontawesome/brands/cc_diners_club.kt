package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CcDinersClub: ImageVector
    get() {
        if (_CcDinersClub != null) return _CcDinersClub!!
        
        _CcDinersClub = ImageVector.Builder(
            name = "cc-diners-club",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(239.7f, 79.9f)
                curveToRelative(-96.9f, 0f, -175.8f, 78.6f, -175.8f, 175.8f)
                curveToRelative(0f, 96.9f, 78.9f, 175.8f, 175.8f, 175.8f)
                curveToRelative(97.2f, 0f, 175.8f, -78.9f, 175.8f, -175.8f)
                curveToRelative(0f, -97.2f, -78.6f, -175.8f, -175.8f, -175.8f)
                close()
                moveToRelative(-39.9f, 279.6f)
                curveToRelative(-41.7f, -15.9f, -71.4f, -56.4f, -71.4f, -103.8f)
                reflectiveCurveToRelative(29.7f, -87.9f, 71.4f, -104.1f)
                verticalLineToRelative(207.9f)
                close()
                moveToRelative(79.8f, 0.3f)
                verticalLineTo(151.6f)
                curveToRelative(41.7f, 16.2f, 71.4f, 56.7f, 71.4f, 104.1f)
                reflectiveCurveToRelative(-29.7f, 87.9f, -71.4f, 104.1f)
                close()
                moveTo(528f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(480f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveTo(329.7f, 448f)
                horizontalLineToRelative(-90.3f)
                curveToRelative(-106.2f, 0f, -193.8f, -85.5f, -193.8f, -190.2f)
                curveTo(45.6f, 143.2f, 133.2f, 64f, 239.4f, 64f)
                horizontalLineToRelative(90.3f)
                curveToRelative(105f, 0f, 200.7f, 79.2f, 200.7f, 193.8f)
                curveToRelative(0f, 104.7f, -95.7f, 190.2f, -200.7f, 190.2f)
                close()
            }
        }.build()
        
        return _CcDinersClub!!
    }

private var _CcDinersClub: ImageVector? = null

