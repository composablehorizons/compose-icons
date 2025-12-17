package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Perm_scan_wifi: ImageVector
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
                moveToRelative(1f, 13f)
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
        }.build()
        
        return _Perm_scan_wifi!!
    }

private var _Perm_scan_wifi: ImageVector? = null

