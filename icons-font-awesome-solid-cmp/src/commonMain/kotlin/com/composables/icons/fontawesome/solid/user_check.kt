package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.UserCheck: ImageVector
    get() {
        if (_UserCheck != null) return _UserCheck!!
        
        _UserCheck = ImageVector.Builder(
            name = "user-check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(224f, 256f)
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
                moveToRelative(323f, -128.4f)
                lineToRelative(-27.8f, -28.1f)
                curveToRelative(-4.6f, -4.7f, -12.1f, -4.7f, -16.8f, -0.1f)
                lineToRelative(-104.8f, 104f)
                lineToRelative(-45.5f, -45.8f)
                curveToRelative(-4.6f, -4.7f, -12.1f, -4.7f, -16.8f, -0.1f)
                lineToRelative(-28.1f, 27.9f)
                curveToRelative(-4.7f, 4.6f, -4.7f, 12.1f, -0.1f, 16.8f)
                lineToRelative(81.7f, 82.3f)
                curveToRelative(4.6f, 4.7f, 12.1f, 4.7f, 16.8f, 0.1f)
                lineToRelative(141.3f, -140.2f)
                curveToRelative(4.6f, -4.7f, 4.7f, -12.2f, 0.1f, -16.8f)
                close()
            }
        }.build()
        
        return _UserCheck!!
    }

private var _UserCheck: ImageVector? = null

