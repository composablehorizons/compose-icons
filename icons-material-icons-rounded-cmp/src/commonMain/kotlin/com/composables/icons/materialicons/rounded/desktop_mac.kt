package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Desktop_mac: ImageVector
    get() {
        if (_Desktop_mac != null) return _Desktop_mac!!
        
        _Desktop_mac = ImageVector.Builder(
            name = "desktop_mac",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 2f)
                horizontalLineTo(3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(7f)
                lineToRelative(-1.63f, 2.45f)
                curveToRelative(-0.44f, 0.66f, 0.03f, 1.55f, 0.83f, 1.55f)
                horizontalLineToRelative(5.6f)
                curveToRelative(0.8f, 0f, 1.28f, -0.89f, 0.83f, -1.55f)
                lineTo(14f, 18f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 12f)
                horizontalLineTo(3f)
                verticalLineTo(5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(16f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9f)
                close()
            }
        }.build()
        
        return _Desktop_mac!!
    }

private var _Desktop_mac: ImageVector? = null

