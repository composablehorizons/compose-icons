package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.User: ImageVector
    get() {
        if (_User != null) return _User!!
        
        _User = ImageVector.Builder(
            name = "user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(313.6f, 304f)
                curveToRelative(-28.7f, 0f, -42.5f, 16f, -89.6f, 16f)
                curveToRelative(-47.1f, 0f, -60.8f, -16f, -89.6f, -16f)
                curveTo(60.2f, 304f, 0f, 364.2f, 0f, 438.4f)
                verticalLineTo(464f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.5f, 0f, 48f, -21.5f, 48f, -48f)
                verticalLineToRelative(-25.6f)
                curveToRelative(0f, -74.2f, -60.2f, -134.4f, -134.4f, -134.4f)
                close()
                moveTo(400f, 464f)
                horizontalLineTo(48f)
                verticalLineToRelative(-25.6f)
                curveToRelative(0f, -47.6f, 38.8f, -86.4f, 86.4f, -86.4f)
                curveToRelative(14.6f, 0f, 38.3f, 16f, 89.6f, 16f)
                curveToRelative(51.7f, 0f, 74.9f, -16f, 89.6f, -16f)
                curveToRelative(47.6f, 0f, 86.4f, 38.8f, 86.4f, 86.4f)
                verticalLineTo(464f)
                close()
                moveTo(224f, 288f)
                curveToRelative(79.5f, 0f, 144f, -64.5f, 144f, -144f)
                reflectiveCurveTo(303.5f, 0f, 224f, 0f)
                reflectiveCurveTo(80f, 64.5f, 80f, 144f)
                reflectiveCurveToRelative(64.5f, 144f, 144f, 144f)
                close()
                moveToRelative(0f, -240f)
                curveToRelative(52.9f, 0f, 96f, 43.1f, 96f, 96f)
                reflectiveCurveToRelative(-43.1f, 96f, -96f, 96f)
                reflectiveCurveToRelative(-96f, -43.1f, -96f, -96f)
                reflectiveCurveToRelative(43.1f, -96f, 96f, -96f)
                close()
            }
        }.build()
        
        return _User!!
    }

private var _User: ImageVector? = null

