package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Offline_bolt: ImageVector
    get() {
        if (_Offline_bolt != null) return _Offline_bolt!!
        
        _Offline_bolt = ImageVector.Builder(
            name = "offline_bolt",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 4.02f)
                curveTo(7.6f, 4.02f, 4.02f, 7.6f, 4.02f, 12f)
                reflectiveCurveTo(7.6f, 19.98f, 12f, 19.98f)
                reflectiveCurveToRelative(7.98f, -3.58f, 7.98f, -7.98f)
                reflectiveCurveTo(16.4f, 4.02f, 12f, 4.02f)
                close()
                moveTo(11.39f, 19f)
                verticalLineToRelative(-5.5f)
                horizontalLineTo(8.25f)
                lineToRelative(4.5f, -8.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(3f)
                lineTo(11.39f, 19f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2.02f)
                curveToRelative(-5.51f, 0f, -9.98f, 4.47f, -9.98f, 9.98f)
                reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f)
                reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f)
                reflectiveCurveTo(17.51f, 2.02f, 12f, 2.02f)
                close()
                moveToRelative(0f, 17.96f)
                curveToRelative(-4.4f, 0f, -7.98f, -3.58f, -7.98f, -7.98f)
                reflectiveCurveTo(7.6f, 4.02f, 12f, 4.02f)
                reflectiveCurveTo(19.98f, 7.6f, 19.98f, 12f)
                reflectiveCurveTo(16.4f, 19.98f, 12f, 19.98f)
                close()
                moveTo(12.75f, 5f)
                lineToRelative(-4.5f, 8.5f)
                horizontalLineToRelative(3.14f)
                verticalLineTo(19f)
                lineToRelative(4.36f, -8.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(5f)
                close()
            }
        }.build()
        
        return _Offline_bolt!!
    }

private var _Offline_bolt: ImageVector? = null

