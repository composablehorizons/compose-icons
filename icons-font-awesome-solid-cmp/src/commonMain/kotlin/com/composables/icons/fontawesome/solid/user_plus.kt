package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserPlus: ImageVector
    get() {
        if (_UserPlus != null) return _UserPlus!!
        
        _UserPlus = ImageVector.Builder(
            name = "user-plus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(624f, 208f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(-64f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(64f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-64f)
                horizontalLineToRelative(64f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(-400f, 48f)
                curveToRelative(70.7f, 0f, 128f, -57.3f, 128f, -128f)
                reflectiveCurveTo(294.7f, 0f, 224f, 0f)
                reflectiveCurveTo(96f, 57.3f, 96f, 128f)
                reflectiveCurveToRelative(57.3f, 128f, 128f, 128f)
                close()
                moveToRelative(89.6f, 32f)
                horizontalLineToRelative(-16.7f)
                curveToRelative(-22.2f, 10.2f, -46.9f, 16f, -72.9f, 16f)
                reflectiveCurveToRelative(-50.6f, -5.8f, -72.9f, -16f)
                horizontalLineToRelative(-16.7f)
                curveTo(60.2f, 288f, 0f, 348.2f, 0f, 422.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-41.6f)
                curveToRelative(0f, -74.2f, -60.2f, -134.4f, -134.4f, -134.4f)
                close()
            }
        }.build()
        
        return _UserPlus!!
    }

private var _UserPlus: ImageVector? = null

