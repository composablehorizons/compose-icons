package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Tablet_mac: ImageVector
    get() {
        if (_Tablet_mac != null) return _Tablet_mac!!
        
        _Tablet_mac = ImageVector.Builder(
            name = "tablet_mac",
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
                moveTo(21f, 0f)
                horizontalLineTo(2f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(19f)
                verticalLineTo(0f)
                close()
                moveToRelative(-9.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
                moveToRelative(7.5f, -4f)
                horizontalLineTo(4f)
                verticalLineTo(3f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _Tablet_mac!!
    }

private var _Tablet_mac: ImageVector? = null

