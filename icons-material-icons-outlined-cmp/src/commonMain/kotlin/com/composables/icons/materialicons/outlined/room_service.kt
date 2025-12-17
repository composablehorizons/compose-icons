package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Room_service: ImageVector
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
                moveTo(18.98f, 17f)
                horizontalLineTo(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-2f)
                close()
                moveTo(21f, 16f)
                curveToRelative(-0.27f, -4.07f, -3.25f, -7.4f, -7.16f, -8.21f)
                curveToRelative(0.1f, -0.24f, 0.16f, -0.51f, 0.16f, -0.79f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                curveToRelative(0f, 0.28f, 0.06f, 0.55f, 0.16f, 0.79f)
                curveTo(6.25f, 8.6f, 3.27f, 11.93f, 3f, 16f)
                horizontalLineToRelative(18f)
                close()
                moveToRelative(-9f, -6.42f)
                curveToRelative(2.95f, 0f, 5.47f, 1.83f, 6.5f, 4.41f)
                horizontalLineToRelative(-13f)
                curveToRelative(1.03f, -2.58f, 3.55f, -4.41f, 6.5f, -4.41f)
                close()
            }
        }.build()
        
        return _Room_service!!
    }

private var _Room_service: ImageVector? = null

