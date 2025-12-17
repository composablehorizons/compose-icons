package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Restroom: ImageVector
    get() {
        if (_Restroom != null) return _Restroom!!
        
        _Restroom = ImageVector.Builder(
            name = "restroom",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(128f, 128f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                reflectiveCurveTo(163.3f, 0f, 128f, 0f)
                reflectiveCurveTo(64f, 28.7f, 64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                close()
                moveToRelative(384f, 0f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                reflectiveCurveTo(547.3f, 0f, 512f, 0f)
                reflectiveCurveToRelative(-64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                close()
                moveToRelative(127.3f, 226.5f)
                lineToRelative(-45.6f, -185.8f)
                curveToRelative(-3.3f, -13.5f, -15.5f, -23f, -29.8f, -24.2f)
                curveToRelative(-15f, 9.7f, -32.8f, 15.5f, -52f, 15.5f)
                curveToRelative(-19.2f, 0f, -37f, -5.8f, -52f, -15.5f)
                curveToRelative(-14.3f, 1.2f, -26.5f, 10.7f, -29.8f, 24.2f)
                lineToRelative(-45.6f, 185.8f)
                curveTo(381f, 369.6f, 393f, 384f, 409.2f, 384f)
                horizontalLineTo(464f)
                verticalLineToRelative(104f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(48f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(384f)
                horizontalLineToRelative(54.8f)
                curveToRelative(16.2f, 0f, 28.2f, -14.4f, 24.5f, -29.5f)
                close()
                moveTo(336f, 0f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(480f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(180.1f, 144.4f)
                curveToRelative(-15f, 9.8f, -32.9f, 15.6f, -52.1f, 15.6f)
                curveToRelative(-19.2f, 0f, -37.1f, -5.8f, -52.1f, -15.6f)
                curveTo(51.3f, 146.5f, 32f, 166.9f, 32f, 192f)
                verticalLineToRelative(136f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(136f)
                curveToRelative(0f, 13.3f, 10.7f, 24f, 24f, 24f)
                horizontalLineToRelative(80f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(352f)
                horizontalLineToRelative(8f)
                curveToRelative(13.3f, 0f, 24f, -10.7f, 24f, -24f)
                verticalLineTo(192f)
                curveToRelative(0f, -25.1f, -19.3f, -45.5f, -43.9f, -47.6f)
                close()
            }
        }.build()
        
        return _Restroom!!
    }

private var _Restroom: ImageVector? = null

