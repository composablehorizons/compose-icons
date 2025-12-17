package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Trophy: ImageVector
    get() {
        if (_Trophy != null) return _Trophy!!
        
        _Trophy = ImageVector.Builder(
            name = "trophy",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(552f, 64f)
                horizontalLineTo(448f)
                verticalLineTo(24f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                horizontalLineTo(152f)
                curveToRelative(-13.3f, 0f, -24f, 10.7f, -24f, 24f)
                verticalLineToRelative(40f)
                horizontalLineTo(24f)
                curveTo(10.7f, 64f, 0f, 74.7f, 0f, 88f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 35.7f, 22.5f, 72.4f, 61.9f, 100.7f)
                curveToRelative(31.5f, 22.7f, 69.8f, 37.1f, 110f, 41.7f)
                curveTo(203.3f, 338.5f, 240f, 360f, 240f, 360f)
                verticalLineToRelative(72f)
                horizontalLineToRelative(-48f)
                curveToRelative(-35.3f, 0f, -64f, 20.7f, -64f, 56f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(296f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -35.3f, -28.7f, -56f, -64f, -56f)
                horizontalLineToRelative(-48f)
                verticalLineToRelative(-72f)
                reflectiveCurveToRelative(36.7f, -21.5f, 68.1f, -73.6f)
                curveToRelative(40.3f, -4.6f, 78.6f, -19f, 110f, -41.7f)
                curveToRelative(39.3f, -28.3f, 61.9f, -65f, 61.9f, -100.7f)
                verticalLineTo(88f)
                curveToRelative(0f, -13.3f, -10.7f, -24f, -24f, -24f)
                close()
                moveTo(99.3f, 192.8f)
                curveTo(74.9f, 175.2f, 64f, 155.6f, 64f, 144f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(64.2f)
                curveToRelative(1f, 32.6f, 5.8f, 61.2f, 12.8f, 86.2f)
                curveToRelative(-15.1f, -5.2f, -29.2f, -12.4f, -41.7f, -21.4f)
                close()
                moveTo(512f, 144f)
                curveToRelative(0f, 16.1f, -17.7f, 36.1f, -35.3f, 48.8f)
                curveToRelative(-12.5f, 9f, -26.7f, 16.2f, -41.8f, 21.4f)
                curveToRelative(7f, -25f, 11.8f, -53.6f, 12.8f, -86.2f)
                horizontalLineTo(512f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Trophy!!
    }

private var _Trophy: ImageVector? = null

