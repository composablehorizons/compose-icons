package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Rainbow: ImageVector
    get() {
        if (_Rainbow != null) return _Rainbow!!
        
        _Rainbow = ImageVector.Builder(
            name = "rainbow",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(268.3f, 32.7f)
                curveTo(115.4f, 42.9f, 0f, 176.9f, 0f, 330.2f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                curveTo(64f, 186.8f, 180.9f, 80.3f, 317.5f, 97.9f)
                curveTo(430.4f, 112.4f, 512f, 214f, 512f, 327.8f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                curveToRelative(0f, -165.3f, -140f, -298.6f, -307.7f, -287.3f)
                close()
                moveToRelative(-5.6f, 96.9f)
                curveTo(166f, 142f, 96f, 229.1f, 96f, 326.7f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                curveToRelative(0f, -74.8f, 64.5f, -134.8f, 140.8f, -127.4f)
                curveToRelative(66.5f, 6.5f, 115.2f, 66.2f, 115.2f, 133.1f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                curveToRelative(0f, -114.2f, -100.2f, -205.4f, -217.3f, -190.4f)
                close()
                moveToRelative(6.2f, 96.3f)
                curveToRelative(-45.6f, 8.9f, -76.9f, 51.5f, -76.9f, 97.9f)
                verticalLineTo(464f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                curveToRelative(0f, -17.6f, 14.3f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.4f, 32f, 32f)
                verticalLineToRelative(144f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(320f)
                curveToRelative(0f, -59.2f, -53.8f, -106f, -115.1f, -94.1f)
                close()
            }
        }.build()
        
        return _Rainbow!!
    }

private var _Rainbow: ImageVector? = null

