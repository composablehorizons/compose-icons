package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Perm_scan_wifi: ImageVector
    get() {
        if (_Perm_scan_wifi != null) return _Perm_scan_wifi!!
        
        _Perm_scan_wifi = ImageVector.Builder(
            name = "perm_scan_wifi",
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
                moveTo(12f, 3f)
                curveTo(7.41f, 3f, 3.86f, 4.53f, 0.89f, 6.59f)
                curveToRelative(-0.49f, 0.33f, -0.59f, 1f, -0.22f, 1.46f)
                lineToRelative(9.78f, 12.04f)
                curveToRelative(0.8f, 0.98f, 2.3f, 0.99f, 3.1f, 0f)
                lineToRelative(9.78f, -12.02f)
                curveToRelative(0.37f, -0.46f, 0.27f, -1.13f, -0.22f, -1.46f)
                curveTo(20.14f, 4.54f, 16.59f, 3f, 12f, 3f)
                close()
                moveToRelative(0f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(-1f, -8f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Perm_scan_wifi!!
    }

private var _Perm_scan_wifi: ImageVector? = null

