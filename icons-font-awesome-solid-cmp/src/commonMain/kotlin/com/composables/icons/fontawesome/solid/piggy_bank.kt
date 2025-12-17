package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.PiggyBank: ImageVector
    get() {
        if (_PiggyBank != null) return _PiggyBank!!
        
        _PiggyBank = ImageVector.Builder(
            name = "piggy-bank",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(560f, 224f)
                horizontalLineToRelative(-29.5f)
                curveToRelative(-8.8f, -20f, -21.6f, -37.7f, -37.4f, -52.5f)
                lineTo(512f, 96f)
                horizontalLineToRelative(-32f)
                curveToRelative(-29.4f, 0f, -55.4f, 13.5f, -73f, 34.3f)
                curveToRelative(-7.6f, -1.1f, -15.1f, -2.3f, -23f, -2.3f)
                horizontalLineTo(256f)
                curveToRelative(-77.4f, 0f, -141.9f, 55f, -156.8f, 128f)
                horizontalLineTo(56f)
                curveToRelative(-14.8f, 0f, -26.5f, -13.5f, -23.5f, -28.8f)
                curveTo(34.7f, 215.8f, 45.4f, 208f, 57f, 208f)
                horizontalLineToRelative(1f)
                curveToRelative(3.3f, 0f, 6f, -2.7f, 6f, -6f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -3.3f, -2.7f, -6f, -6f, -6f)
                curveToRelative(-28.5f, 0f, -53.9f, 20.4f, -57.5f, 48.6f)
                curveTo(-3.9f, 258.8f, 22.7f, 288f, 56f, 288f)
                horizontalLineToRelative(40f)
                curveToRelative(0f, 52.2f, 25.4f, 98.1f, 64f, 127.3f)
                verticalLineTo(496f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(64f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-80.7f)
                curveToRelative(11.8f, -8.9f, 22.3f, -19.4f, 31.3f, -31.3f)
                horizontalLineTo(560f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(240f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-128f, 64f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                reflectiveCurveToRelative(7.2f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                close()
                moveTo(256f, 96f)
                horizontalLineToRelative(128f)
                curveToRelative(5.4f, 0f, 10.7f, 0.4f, 15.9f, 0.8f)
                curveToRelative(0f, -0.3f, 0.1f, -0.5f, 0.1f, -0.8f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                reflectiveCurveToRelative(-96f, 43f, -96f, 96f)
                curveToRelative(0f, 2.1f, 0.5f, 4.1f, 0.6f, 6.2f)
                curveToRelative(15.2f, -3.9f, 31f, -6.2f, 47.4f, -6.2f)
                close()
            }
        }.build()
        
        return _PiggyBank!!
    }

private var _PiggyBank: ImageVector? = null

