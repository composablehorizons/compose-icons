package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.CreativeCommonsBy: ImageVector
    get() {
        if (_CreativeCommonsBy != null) return _CreativeCommonsBy!!
        
        _CreativeCommonsBy = ImageVector.Builder(
            name = "creative-commons-by",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 496f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(314.9f, 194.4f)
                verticalLineToRelative(101.4f)
                horizontalLineToRelative(-28.3f)
                verticalLineToRelative(120.5f)
                horizontalLineToRelative(-77.1f)
                verticalLineTo(295.9f)
                horizontalLineToRelative(-28.3f)
                verticalLineTo(194.4f)
                curveToRelative(0f, -4.4f, 1.6f, -8.2f, 4.6f, -11.3f)
                curveToRelative(3.1f, -3.1f, 6.9f, -4.7f, 11.3f, -4.7f)
                horizontalLineTo(299f)
                curveToRelative(4.1f, 0f, 7.8f, 1.6f, 11.1f, 4.7f)
                curveToRelative(3.1f, 3.2f, 4.8f, 6.9f, 4.8f, 11.3f)
                close()
                moveToRelative(-101.5f, -63.7f)
                curveToRelative(0f, -23.3f, 11.5f, -35f, 34.5f, -35f)
                reflectiveCurveToRelative(34.5f, 11.7f, 34.5f, 35f)
                curveToRelative(0f, 23f, -11.5f, 34.5f, -34.5f, 34.5f)
                reflectiveCurveToRelative(-34.5f, -11.5f, -34.5f, -34.5f)
                close()
                moveTo(247.6f, 8f)
                curveTo(389.4f, 8f, 496f, 118.1f, 496f, 256f)
                curveToRelative(0f, 147.1f, -118.5f, 248f, -248.4f, 248f)
                curveTo(113.6f, 504f, 0f, 394.5f, 0f, 256f)
                curveTo(0f, 123.1f, 104.7f, 8f, 247.6f, 8f)
                close()
                moveToRelative(0.8f, 44.7f)
                curveTo(130.2f, 52.7f, 44.7f, 150.6f, 44.7f, 256f)
                curveToRelative(0f, 109.8f, 91.2f, 202.8f, 203.7f, 202.8f)
                curveToRelative(103.2f, 0f, 202.8f, -81.1f, 202.8f, -202.8f)
                curveToRelative(0.1f, -113.8f, -90.2f, -203.3f, -202.8f, -203.3f)
                close()
            }
        }.build()
        
        return _CreativeCommonsBy!!
    }

private var _CreativeCommonsBy: ImageVector? = null

