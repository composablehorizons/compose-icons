package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HatWizard: ImageVector
    get() {
        if (_HatWizard != null) return _HatWizard!!
        
        _HatWizard = ImageVector.Builder(
            name = "hat-wizard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(496f, 448f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(480f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
                moveToRelative(-304f, -64f)
                lineToRelative(-64f, -32f)
                lineToRelative(64f, -32f)
                lineToRelative(32f, -64f)
                lineToRelative(32f, 64f)
                lineToRelative(64f, 32f)
                lineToRelative(-64f, 32f)
                lineToRelative(-16f, 32f)
                horizontalLineToRelative(208f)
                lineToRelative(-86.41f, -201.63f)
                arcToRelative(63.955f, 63.955f, 0f, false, true, -1.89f, -45.45f)
                lineTo(416f, 0f)
                lineTo(228.42f, 107.19f)
                arcToRelative(127.989f, 127.989f, 0f, false, false, -53.46f, 59.15f)
                lineTo(64f, 416f)
                horizontalLineToRelative(144f)
                lineToRelative(-16f, -32f)
                close()
                moveToRelative(64f, -224f)
                lineToRelative(16f, -32f)
                lineToRelative(16f, 32f)
                lineToRelative(32f, 16f)
                lineToRelative(-32f, 16f)
                lineToRelative(-16f, 32f)
                lineToRelative(-16f, -32f)
                lineToRelative(-32f, -16f)
                lineToRelative(32f, -16f)
                close()
            }
        }.build()
        
        return _HatWizard!!
    }

private var _HatWizard: ImageVector? = null

