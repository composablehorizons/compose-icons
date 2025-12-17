package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Igloo: ImageVector
    get() {
        if (_Igloo != null) return _Igloo!!
        
        _Igloo = ImageVector.Builder(
            name = "igloo",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(320f, 33.9f)
                curveToRelative(-10.5f, -1.2f, -21.2f, -1.9f, -32f, -1.9f)
                curveToRelative(-99.8f, 0f, -187.8f, 50.8f, -239.4f, 128f)
                horizontalLineTo(320f)
                verticalLineTo(33.9f)
                close()
                moveTo(96f, 192f)
                horizontalLineTo(30.3f)
                curveTo(11.1f, 230.6f, 0f, 274f, 0f, 320f)
                horizontalLineToRelative(96f)
                verticalLineTo(192f)
                close()
                moveTo(352f, 39.4f)
                verticalLineTo(160f)
                horizontalLineToRelative(175.4f)
                curveTo(487.2f, 99.9f, 424.8f, 55.9f, 352f, 39.4f)
                close()
                moveTo(480f, 320f)
                horizontalLineToRelative(96f)
                curveToRelative(0f, -46f, -11.1f, -89.4f, -30.3f, -128f)
                horizontalLineTo(480f)
                verticalLineToRelative(128f)
                close()
                moveToRelative(-64f, 64f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(128f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineToRelative(-96f)
                horizontalLineTo(411.5f)
                curveToRelative(2.6f, 10.3f, 4.5f, 20.9f, 4.5f, 32f)
                close()
                moveToRelative(32f, -192f)
                horizontalLineTo(128f)
                verticalLineToRelative(128f)
                horizontalLineToRelative(49.8f)
                curveToRelative(22.2f, -38.1f, 63f, -64f, 110.2f, -64f)
                reflectiveCurveToRelative(88f, 25.9f, 110.2f, 64f)
                horizontalLineTo(448f)
                verticalLineTo(192f)
                close()
                moveTo(0f, 448f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -11.1f, 1.9f, -21.7f, 4.5f, -32f)
                horizontalLineTo(0f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(288f, -160f)
                curveToRelative(-53f, 0f, -96f, 43f, -96f, 96f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(192f)
                verticalLineToRelative(-96f)
                curveToRelative(0f, -53f, -43f, -96f, -96f, -96f)
                close()
            }
        }.build()
        
        return _Igloo!!
    }

private var _Igloo: ImageVector? = null

