package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Headset: ImageVector
    get() {
        if (_Headset != null) return _Headset!!
        
        _Headset = ImageVector.Builder(
            name = "headset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(192f, 208f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineToRelative(-16f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 35.35f, 28.65f, 64f, 64f, 64f)
                horizontalLineToRelative(16f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(208f)
                close()
                moveToRelative(176f, 144f)
                curveToRelative(35.35f, 0f, 64f, -28.65f, 64f, -64f)
                verticalLineToRelative(-48f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                horizontalLineToRelative(-16f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(112f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(16f)
                close()
                moveTo(256f, 0f)
                curveTo(113.18f, 0f, 4.58f, 118.83f, 0f, 256f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -114.69f, 93.31f, -208f, 208f, -208f)
                reflectiveCurveToRelative(208f, 93.31f, 208f, 208f)
                horizontalLineToRelative(-0.12f)
                curveToRelative(0.08f, 2.43f, 0.12f, 165.72f, 0.12f, 165.72f)
                curveToRelative(0f, 23.35f, -18.93f, 42.28f, -42.28f, 42.28f)
                horizontalLineTo(320f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                horizontalLineToRelative(-32f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                reflectiveCurveToRelative(21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(181.72f)
                curveToRelative(49.86f, 0f, 90.28f, -40.42f, 90.28f, -90.28f)
                verticalLineTo(256f)
                curveTo(507.42f, 118.83f, 398.82f, 0f, 256f, 0f)
                close()
            }
        }.build()
        
        return _Headset!!
    }

private var _Headset: ImageVector? = null

