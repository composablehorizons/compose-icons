package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Network_locked: ImageVector
    get() {
        if (_Network_locked != null) return _Network_locked!!
        
        _Network_locked = ImageVector.Builder(
            name = "network_locked",
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
                moveToRelative(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(22f, 16f)
                verticalLineToRelative(-0.36f)
                curveToRelative(0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                close()
                moveToRelative(-1f, 0f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                close()
                moveToRelative(-1.5f, -5f)
                curveToRelative(0.15f, 0f, 0.3f, 0.01f, 0.46f, 0.02f)
                curveToRelative(0.01f, 0f, 0.03f, 0.01f, 0.04f, 0.01f)
                verticalLineTo(1f)
                lineTo(1f, 20f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.26f)
                curveToRelative(0.22f, -0.63f, 0.58f, -1.2f, 1.06f, -1.68f)
                curveToRelative(0.85f, -0.85f, 1.98f, -1.32f, 3.18f, -1.32f)
                close()
            }
        }.build()
        
        return _Network_locked!!
    }

private var _Network_locked: ImageVector? = null

