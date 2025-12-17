package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Room_service: ImageVector
    get() {
        if (_Room_service != null) return _Room_service!!
        
        _Room_service = ImageVector.Builder(
            name = "room_service",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3f, 17f)
                horizontalLineToRelative(18f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                close()
                moveToRelative(10.84f, -9.21f)
                curveToRelative(0.1f, -0.24f, 0.16f, -0.51f, 0.16f, -0.79f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.28f, 0.06f, 0.55f, 0.16f, 0.79f)
                curveTo(6.25f, 8.6f, 3.27f, 11.93f, 3f, 16f)
                horizontalLineToRelative(18f)
                curveToRelative(-0.27f, -4.07f, -3.25f, -7.4f, -7.16f, -8.21f)
                close()
            }
        }.build()
        
        return _Room_service!!
    }

private var _Room_service: ImageVector? = null

