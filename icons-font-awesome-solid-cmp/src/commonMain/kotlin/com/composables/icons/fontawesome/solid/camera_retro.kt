package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.CameraRetro: ImageVector
    get() {
        if (_CameraRetro != null) return _CameraRetro!!
        
        _CameraRetro = ImageVector.Builder(
            name = "camera-retro",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(48f, 32f)
                curveTo(21.5f, 32f, 0f, 53.5f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.5f, -21.5f, -48f, -48f, -48f)
                horizontalLineTo(48f)
                close()
                moveToRelative(0f, 32f)
                horizontalLineToRelative(106f)
                curveToRelative(3.3f, 0f, 6f, 2.7f, 6f, 6f)
                verticalLineToRelative(20f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                horizontalLineTo(38f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.8f, 7.2f, -16f, 16f, -16f)
                close()
                moveToRelative(426f, 96f)
                horizontalLineTo(38f)
                curveToRelative(-3.3f, 0f, -6f, -2.7f, -6f, -6f)
                verticalLineToRelative(-36f)
                curveToRelative(0f, -3.3f, 2.7f, -6f, 6f, -6f)
                horizontalLineToRelative(138f)
                lineToRelative(30.2f, -45.3f)
                curveToRelative(1.1f, -1.7f, 3f, -2.7f, 5f, -2.7f)
                horizontalLineTo(464f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                verticalLineToRelative(74f)
                curveToRelative(0f, 3.3f, -2.7f, 6f, -6f, 6f)
                close()
                moveTo(256f, 424f)
                curveToRelative(-66.2f, 0f, -120f, -53.8f, -120f, -120f)
                reflectiveCurveToRelative(53.8f, -120f, 120f, -120f)
                reflectiveCurveToRelative(120f, 53.8f, 120f, 120f)
                reflectiveCurveToRelative(-53.8f, 120f, -120f, 120f)
                close()
                moveToRelative(0f, -208f)
                curveToRelative(-48.5f, 0f, -88f, 39.5f, -88f, 88f)
                reflectiveCurveToRelative(39.5f, 88f, 88f, 88f)
                reflectiveCurveToRelative(88f, -39.5f, 88f, -88f)
                reflectiveCurveToRelative(-39.5f, -88f, -88f, -88f)
                close()
                moveToRelative(-48f, 104f)
                curveToRelative(-8.8f, 0f, -16f, -7.2f, -16f, -16f)
                curveToRelative(0f, -35.3f, 28.7f, -64f, 64f, -64f)
                curveToRelative(8.8f, 0f, 16f, 7.2f, 16f, 16f)
                reflectiveCurveToRelative(-7.2f, 16f, -16f, 16f)
                curveToRelative(-17.6f, 0f, -32f, 14.4f, -32f, 32f)
                curveToRelative(0f, 8.8f, -7.2f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _CameraRetro!!
    }

private var _CameraRetro: ImageVector? = null

