package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Perm_scan_wifi: ImageVector
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
                moveTo(12f, 5f)
                curveToRelative(-3.26f, 0f, -6.2f, 0.85f, -9.08f, 2.65f)
                lineTo(12f, 18.83f)
                lineToRelative(9.08f, -11.16f)
                curveTo(18.18f, 5.85f, 15.25f, 5f, 12f, 5f)
                close()
                moveToRelative(1f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                close()
                moveToRelative(-2f, -8f)
                verticalLineTo(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 3f)
                curveTo(6.95f, 3f, 3.15f, 4.85f, 0f, 7.23f)
                lineTo(12f, 22f)
                lineTo(24f, 7.25f)
                curveTo(20.85f, 4.87f, 17.05f, 3f, 12f, 3f)
                close()
                moveTo(2.92f, 7.65f)
                curveTo(5.8f, 5.85f, 8.74f, 5f, 12f, 5f)
                curveToRelative(3.25f, 0f, 6.18f, 0.85f, 9.08f, 2.67f)
                lineTo(12f, 18.83f)
                lineTo(2.92f, 7.65f)
                close()
                moveTo(11f, 10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(0f, -4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Perm_scan_wifi!!
    }

private var _Perm_scan_wifi: ImageVector? = null

