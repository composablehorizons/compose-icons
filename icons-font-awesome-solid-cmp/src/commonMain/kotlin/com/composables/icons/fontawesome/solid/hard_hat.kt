package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HardHat: ImageVector
    get() {
        if (_HardHat != null) return _HardHat!!
        
        _HardHat = ImageVector.Builder(
            name = "hard-hat",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(480f, 288f)
                curveToRelative(0f, -80.25f, -49.28f, -148.92f, -119.19f, -177.62f)
                lineTo(320f, 192f)
                verticalLineTo(80f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                horizontalLineToRelative(-96f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(112f)
                lineToRelative(-40.81f, -81.62f)
                curveTo(81.28f, 139.08f, 32f, 207.75f, 32f, 288f)
                verticalLineToRelative(64f)
                horizontalLineToRelative(448f)
                close()
                moveToRelative(16f, 96f)
                horizontalLineTo(16f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, 16f)
                verticalLineToRelative(32f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, 16f)
                horizontalLineToRelative(480f)
                arcToRelative(16f, 16f, 0f, false, false, 16f, -16f)
                verticalLineToRelative(-32f)
                arcToRelative(16f, 16f, 0f, false, false, -16f, -16f)
                close()
            }
        }.build()
        
        return _HardHat!!
    }

private var _HardHat: ImageVector? = null

