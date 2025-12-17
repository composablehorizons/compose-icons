package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Users: ImageVector
    get() {
        if (_Users != null) return _Users!!
        
        _Users = ImageVector.Builder(
            name = "users",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 224f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                reflectiveCurveToRelative(-28.7f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                close()
                moveToRelative(448f, 0f)
                curveToRelative(35.3f, 0f, 64f, -28.7f, 64f, -64f)
                reflectiveCurveToRelative(-28.7f, -64f, -64f, -64f)
                reflectiveCurveToRelative(-64f, 28.7f, -64f, 64f)
                reflectiveCurveToRelative(28.7f, 64f, 64f, 64f)
                close()
                moveToRelative(32f, 32f)
                horizontalLineToRelative(-64f)
                curveToRelative(-17.6f, 0f, -33.5f, 7.1f, -45.1f, 18.6f)
                curveToRelative(40.3f, 22.1f, 68.9f, 62f, 75.1f, 109.4f)
                horizontalLineToRelative(66f)
                curveToRelative(17.7f, 0f, 32f, -14.3f, 32f, -32f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -35.3f, -28.7f, -64f, -64f, -64f)
                close()
                moveToRelative(-256f, 0f)
                curveToRelative(61.9f, 0f, 112f, -50.1f, 112f, -112f)
                reflectiveCurveTo(381.9f, 32f, 320f, 32f)
                reflectiveCurveTo(208f, 82.1f, 208f, 144f)
                reflectiveCurveToRelative(50.1f, 112f, 112f, 112f)
                close()
                moveToRelative(76.8f, 32f)
                horizontalLineToRelative(-8.3f)
                curveToRelative(-20.8f, 10f, -43.9f, 16f, -68.5f, 16f)
                reflectiveCurveToRelative(-47.6f, -6f, -68.5f, -16f)
                horizontalLineToRelative(-8.3f)
                curveTo(179.6f, 288f, 128f, 339.6f, 128f, 403.2f)
                verticalLineTo(432f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(288f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-28.8f)
                curveToRelative(0f, -63.6f, -51.6f, -115.2f, -115.2f, -115.2f)
                close()
                moveToRelative(-223.7f, -13.4f)
                curveTo(161.5f, 263.1f, 145.6f, 256f, 128f, 256f)
                horizontalLineTo(64f)
                curveToRelative(-35.3f, 0f, -64f, 28.7f, -64f, 64f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.7f, 14.3f, 32f, 32f, 32f)
                horizontalLineToRelative(65.9f)
                curveToRelative(6.3f, -47.4f, 34.9f, -87.3f, 75.2f, -109.4f)
                close()
            }
        }.build()
        
        return _Users!!
    }

private var _Users: ImageVector? = null

