package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.Python: ImageVector
    get() {
        if (_Python != null) return _Python!!
        
        _Python = ImageVector.Builder(
            name = "python",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(439.8f, 200.5f)
                curveToRelative(-7.7f, -30.9f, -22.3f, -54.2f, -53.4f, -54.2f)
                horizontalLineToRelative(-40.1f)
                verticalLineToRelative(47.4f)
                curveToRelative(0f, 36.8f, -31.2f, 67.8f, -66.8f, 67.8f)
                horizontalLineTo(172.7f)
                curveToRelative(-29.2f, 0f, -53.4f, 25f, -53.4f, 54.3f)
                verticalLineToRelative(101.8f)
                curveToRelative(0f, 29f, 25.2f, 46f, 53.4f, 54.3f)
                curveToRelative(33.8f, 9.9f, 66.3f, 11.7f, 106.8f, 0f)
                curveToRelative(26.9f, -7.8f, 53.4f, -23.5f, 53.4f, -54.3f)
                verticalLineToRelative(-40.7f)
                horizontalLineTo(226.2f)
                verticalLineToRelative(-13.6f)
                horizontalLineToRelative(160.2f)
                curveToRelative(31.1f, 0f, 42.6f, -21.7f, 53.4f, -54.2f)
                curveToRelative(11.2f, -33.5f, 10.7f, -65.7f, 0f, -108.6f)
                close()
                moveTo(286.2f, 404f)
                curveToRelative(11.1f, 0f, 20.1f, 9.1f, 20.1f, 20.3f)
                curveToRelative(0f, 11.3f, -9f, 20.4f, -20.1f, 20.4f)
                curveToRelative(-11f, 0f, -20.1f, -9.2f, -20.1f, -20.4f)
                curveToRelative(0.1f, -11.3f, 9.1f, -20.3f, 20.1f, -20.3f)
                close()
                moveTo(167.8f, 248.1f)
                horizontalLineToRelative(106.8f)
                curveToRelative(29.7f, 0f, 53.4f, -24.5f, 53.4f, -54.3f)
                verticalLineTo(91.9f)
                curveToRelative(0f, -29f, -24.4f, -50.7f, -53.4f, -55.6f)
                curveToRelative(-35.8f, -5.9f, -74.7f, -5.6f, -106.8f, 0.1f)
                curveToRelative(-45.2f, 8f, -53.4f, 24.7f, -53.4f, 55.6f)
                verticalLineToRelative(40.7f)
                horizontalLineToRelative(106.9f)
                verticalLineToRelative(13.6f)
                horizontalLineToRelative(-147f)
                curveToRelative(-31.1f, 0f, -58.3f, 18.7f, -66.8f, 54.2f)
                curveToRelative(-9.8f, 40.7f, -10.2f, 66.1f, 0f, 108.6f)
                curveToRelative(7.6f, 31.6f, 25.7f, 54.2f, 56.8f, 54.2f)
                horizontalLineTo(101f)
                verticalLineToRelative(-48.8f)
                curveToRelative(0f, -35.3f, 30.5f, -66.4f, 66.8f, -66.4f)
                close()
                moveToRelative(-6.7f, -142.6f)
                curveToRelative(-11.1f, 0f, -20.1f, -9.1f, -20.1f, -20.3f)
                curveToRelative(0.1f, -11.3f, 9f, -20.4f, 20.1f, -20.4f)
                curveToRelative(11f, 0f, 20.1f, 9.2f, 20.1f, 20.4f)
                reflectiveCurveToRelative(-9f, 20.3f, -20.1f, 20.3f)
                close()
            }
        }.build()
        
        return _Python!!
    }

private var _Python: ImageVector? = null

