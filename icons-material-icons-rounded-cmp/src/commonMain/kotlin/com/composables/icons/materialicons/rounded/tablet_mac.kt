package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Tablet_mac: ImageVector
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.5f, 0f)
                horizontalLineToRelative(-14f)
                curveTo(3.12f, 0f, 2f, 1.12f, 2f, 2.5f)
                verticalLineToRelative(19f)
                curveTo(2f, 22.88f, 3.12f, 24f, 4.5f, 24f)
                horizontalLineToRelative(14f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-19f)
                curveTo(21f, 1.12f, 19.88f, 0f, 18.5f, 0f)
                close()
                moveToRelative(-7f, 23f)
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

