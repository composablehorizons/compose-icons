package com.composables.icons.fontawesome.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Brands.SnapchatSquare: ImageVector
    get() {
        if (_SnapchatSquare != null) return _SnapchatSquare!!
        
        _SnapchatSquare = ImageVector.Builder(
            name = "snapchat-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(400f, 32f)
                horizontalLineTo(48f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                close()
                moveToRelative(-6.5f, 314.9f)
                curveToRelative(-3.5f, 8.1f, -18.1f, 14f, -44.8f, 18.2f)
                curveToRelative(-1.4f, 1.9f, -2.5f, 9.8f, -4.3f, 15.9f)
                curveToRelative(-1.1f, 3.7f, -3.7f, 5.9f, -8.1f, 5.9f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-6.2f, 0f, -12.8f, -2.9f, -25.8f, -2.9f)
                curveToRelative(-17.6f, 0f, -23.7f, 4f, -37.4f, 13.7f)
                curveToRelative(-14.5f, 10.3f, -28.4f, 19.1f, -49.2f, 18.2f)
                curveToRelative(-21f, 1.6f, -38.6f, -11.2f, -48.5f, -18.2f)
                curveToRelative(-13.8f, -9.7f, -19.8f, -13.7f, -37.4f, -13.7f)
                curveToRelative(-12.5f, 0f, -20.4f, 3.1f, -25.8f, 3.1f)
                curveToRelative(-5.4f, 0f, -7.5f, -3.3f, -8.3f, -6f)
                curveToRelative(-1.8f, -6.1f, -2.9f, -14.1f, -4.3f, -16f)
                curveToRelative(-13.8f, -2.1f, -44.8f, -7.5f, -45.5f, -21.4f)
                curveToRelative(-0.2f, -3.6f, 2.3f, -6.8f, 5.9f, -7.4f)
                curveToRelative(46.3f, -7.6f, 67.1f, -55.1f, 68f, -57.1f)
                curveToRelative(0f, -0.1f, 0.1f, -0.2f, 0.2f, -0.3f)
                curveToRelative(2.5f, -5f, 3f, -9.2f, 1.6f, -12.5f)
                curveToRelative(-3.4f, -7.9f, -17.9f, -10.7f, -24f, -13.2f)
                curveToRelative(-15.8f, -6.2f, -18f, -13.4f, -17f, -18.3f)
                curveToRelative(1.6f, -8.5f, 14.4f, -13.8f, 21.9f, -10.3f)
                curveToRelative(5.9f, 2.8f, 11.2f, 4.2f, 15.7f, 4.2f)
                curveToRelative(3.3f, 0f, 5.5f, -0.8f, 6.6f, -1.4f)
                curveToRelative(-1.4f, -23.9f, -4.7f, -58f, 3.8f, -77.1f)
                curveTo(159.1f, 100f, 206.7f, 96f, 220.7f, 96f)
                curveToRelative(0.6f, 0f, 6.1f, -0.1f, 6.7f, -0.1f)
                curveToRelative(34.7f, 0f, 68f, 17.8f, 84.3f, 54.3f)
                curveToRelative(8.5f, 19.1f, 5.2f, 53.1f, 3.8f, 77.1f)
                curveToRelative(1.1f, 0.6f, 2.9f, 1.3f, 5.7f, 1.4f)
                curveToRelative(4.3f, -0.2f, 9.2f, -1.6f, 14.7f, -4.2f)
                curveToRelative(4f, -1.9f, 9.6f, -1.6f, 13.6f, 0f)
                curveToRelative(6.3f, 2.3f, 10.3f, 6.8f, 10.4f, 11.9f)
                curveToRelative(0.1f, 6.5f, -5.7f, 12.1f, -17.2f, 16.6f)
                curveToRelative(-1.4f, 0.6f, -3.1f, 1.1f, -4.9f, 1.7f)
                curveToRelative(-6.5f, 2.1f, -16.4f, 5.2f, -19f, 11.5f)
                curveToRelative(-1.4f, 3.3f, -0.8f, 7.5f, 1.6f, 12.5f)
                curveToRelative(0.1f, 0.1f, 0.1f, 0.2f, 0.2f, 0.3f)
                curveToRelative(0.9f, 2f, 21.7f, 49.5f, 68f, 57.1f)
                curveToRelative(4f, 1f, 7.1f, 5.5f, 4.9f, 10.8f)
                close()
            }
        }.build()
        
        return _SnapchatSquare!!
    }

private var _SnapchatSquare: ImageVector? = null

