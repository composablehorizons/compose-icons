package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.FonticonsFi: ImageVector
    get() {
        if (_FonticonsFi != null) return _FonticonsFi!!
        
        _FonticonsFi = ImageVector.Builder(
            name = "fonticons-fi",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(114.4f, 224f)
                horizontalLineToRelative(92.4f)
                lineToRelative(-15.2f, 51.2f)
                horizontalLineToRelative(-76.4f)
                verticalLineTo(433f)
                curveToRelative(0f, 8f, -2.8f, 9.2f, 4.4f, 10f)
                lineToRelative(59.6f, 5.6f)
                verticalLineTo(483f)
                horizontalLineTo(0f)
                verticalLineToRelative(-35.2f)
                lineToRelative(29.2f, -2.8f)
                curveToRelative(7.2f, -0.8f, 9.2f, -3.2f, 9.2f, -10.8f)
                verticalLineTo(278.4f)
                curveToRelative(0f, -3.2f, -4f, -3.2f, -8f, -3.2f)
                horizontalLineTo(0f)
                verticalLineTo(224f)
                horizontalLineToRelative(38.4f)
                verticalLineToRelative(-28.8f)
                curveToRelative(0f, -68f, 36.4f, -96f, 106f, -96f)
                curveToRelative(46.8f, 0f, 88.8f, 11.2f, 88.8f, 72.4f)
                lineToRelative(-69.6f, 8.4f)
                curveToRelative(0.4f, -25.6f, -6f, -31.6f, -22.4f, -31.6f)
                curveToRelative(-25.2f, 0f, -26f, 13.6f, -26f, 37.6f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 3.2f, -4.8f, 6f, -0.8f, 6f)
                close()
                moveTo(384f, 483f)
                horizontalLineTo(243.2f)
                verticalLineToRelative(-34.4f)
                lineToRelative(28f, -3.6f)
                curveToRelative(7.2f, -0.8f, 10.4f, -2.4f, 10.4f, -10f)
                verticalLineTo(287f)
                curveToRelative(0f, -5.6f, -4f, -9.2f, -9.2f, -10.8f)
                lineToRelative(-33.2f, -8.8f)
                lineToRelative(9.2f, -40.4f)
                horizontalLineToRelative(110f)
                verticalLineToRelative(208f)
                curveToRelative(0f, 8f, -3.6f, 8.8f, 4f, 10f)
                lineToRelative(21.6f, 3.6f)
                verticalLineTo(483f)
                close()
                moveToRelative(-30f, -347.2f)
                lineToRelative(12.4f, 45.6f)
                lineToRelative(-10f, 10f)
                lineToRelative(-42.8f, -22.8f)
                lineToRelative(-42.8f, 22.8f)
                lineToRelative(-10f, -10f)
                lineToRelative(12.4f, -45.6f)
                lineToRelative(-30f, -36.4f)
                lineToRelative(4.8f, -10f)
                horizontalLineToRelative(38f)
                lineTo(307.2f, 51f)
                horizontalLineTo(320f)
                lineToRelative(21.2f, 38.4f)
                horizontalLineToRelative(38f)
                lineToRelative(4.8f, 13.2f)
                lineToRelative(-30f, 33.2f)
                close()
            }
        }.build()
        
        return _FonticonsFi!!
    }

private var _FonticonsFi: ImageVector? = null

