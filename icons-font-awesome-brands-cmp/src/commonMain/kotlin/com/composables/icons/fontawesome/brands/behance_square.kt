package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.BehanceSquare: ImageVector
    get() {
        if (_BehanceSquare != null) return _BehanceSquare!!
        
        _BehanceSquare = ImageVector.Builder(
            name = "behance-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(186.5f, 293f)
                curveToRelative(0f, 19.3f, -14f, 25.4f, -31.2f, 25.4f)
                horizontalLineToRelative(-45.1f)
                verticalLineToRelative(-52.9f)
                horizontalLineToRelative(46f)
                curveToRelative(18.6f, 0.1f, 30.3f, 7.8f, 30.3f, 27.5f)
                close()
                moveToRelative(-7.7f, -82.3f)
                curveToRelative(0f, -17.7f, -13.7f, -21.9f, -28.9f, -21.9f)
                horizontalLineToRelative(-39.6f)
                verticalLineToRelative(44.8f)
                horizontalLineTo(153f)
                curveToRelative(15.1f, 0f, 25.8f, -6.6f, 25.8f, -22.9f)
                close()
                moveToRelative(132.3f, 23.2f)
                curveToRelative(-18.3f, 0f, -30.5f, 11.4f, -31.7f, 29.7f)
                horizontalLineToRelative(62.2f)
                curveToRelative(-1.7f, -18.5f, -11.3f, -29.7f, -30.5f, -29.7f)
                close()
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.5f, 0f, -48f, -21.5f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, 21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                close()
                moveTo(271.7f, 185f)
                horizontalLineToRelative(77.8f)
                verticalLineToRelative(-18.9f)
                horizontalLineToRelative(-77.8f)
                verticalLineTo(185f)
                close()
                moveToRelative(-43f, 110.3f)
                curveToRelative(0f, -24.1f, -11.4f, -44.9f, -35f, -51.6f)
                curveToRelative(17.2f, -8.2f, 26.2f, -17.7f, 26.2f, -37f)
                curveToRelative(0f, -38.2f, -28.5f, -47.5f, -61.4f, -47.5f)
                horizontalLineTo(68f)
                verticalLineToRelative(192f)
                horizontalLineToRelative(93.1f)
                curveToRelative(34.9f, -0.2f, 67.6f, -16.9f, 67.6f, -55.9f)
                close()
                moveTo(380f, 280.5f)
                curveToRelative(0f, -41.1f, -24.1f, -75.4f, -67.6f, -75.4f)
                curveToRelative(-42.4f, 0f, -71.1f, 31.8f, -71.1f, 73.6f)
                curveToRelative(0f, 43.3f, 27.3f, 73f, 71.1f, 73f)
                curveToRelative(33.2f, 0f, 54.7f, -14.9f, 65.1f, -46.8f)
                horizontalLineToRelative(-33.7f)
                curveToRelative(-3.7f, 11.9f, -18.6f, 18.1f, -30.2f, 18.1f)
                curveToRelative(-22.4f, 0f, -34.1f, -13.1f, -34.1f, -35.3f)
                horizontalLineToRelative(100.2f)
                curveToRelative(0.1f, -2.3f, 0.3f, -4.8f, 0.3f, -7.2f)
                close()
            }
        }.build()
        
        return _BehanceSquare!!
    }

private var _BehanceSquare: ImageVector? = null

