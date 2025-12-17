package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Offline_bolt: ImageVector
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
                moveTo(12f, 2.02f)
                curveToRelative(-5.51f, 0f, -9.98f, 4.47f, -9.98f, 9.98f)
                reflectiveCurveToRelative(4.47f, 9.98f, 9.98f, 9.98f)
                reflectiveCurveToRelative(9.98f, -4.47f, 9.98f, -9.98f)
                reflectiveCurveTo(17.51f, 2.02f, 12f, 2.02f)
                close()
                moveToRelative(-0.52f, 15.86f)
                verticalLineToRelative(-4.14f)
                horizontalLineTo(8.82f)
                curveToRelative(-0.37f, 0f, -0.62f, -0.4f, -0.44f, -0.73f)
                lineToRelative(3.68f, -7.17f)
                curveToRelative(0.23f, -0.47f, 0.94f, -0.3f, 0.94f, 0.23f)
                verticalLineToRelative(4.19f)
                horizontalLineToRelative(2.54f)
                curveToRelative(0.37f, 0f, 0.61f, 0.39f, 0.45f, 0.72f)
                lineToRelative(-3.56f, 7.12f)
                curveToRelative(-0.24f, 0.48f, -0.95f, 0.31f, -0.95f, -0.22f)
                close()
            }
        }.build()
        
        return _Offline_bolt!!
    }

private var _Offline_bolt: ImageVector? = null

