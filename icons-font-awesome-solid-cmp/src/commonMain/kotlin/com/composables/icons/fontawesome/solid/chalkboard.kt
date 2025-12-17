package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Chalkboard: ImageVector
    get() {
        if (_Chalkboard != null) return _Chalkboard!!
        
        _Chalkboard = ImageVector.Builder(
            name = "chalkboard",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(96f, 64f)
                horizontalLineToRelative(448f)
                verticalLineToRelative(352f)
                horizontalLineToRelative(64f)
                verticalLineTo(40f)
                curveToRelative(0f, -22.06f, -17.94f, -40f, -40f, -40f)
                horizontalLineTo(72f)
                curveTo(49.94f, 0f, 32f, 17.94f, 32f, 40f)
                verticalLineToRelative(376f)
                horizontalLineToRelative(64f)
                verticalLineTo(64f)
                close()
                moveToRelative(528f, 384f)
                horizontalLineTo(480f)
                verticalLineToRelative(-64f)
                horizontalLineTo(288f)
                verticalLineToRelative(64f)
                horizontalLineTo(16f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _Chalkboard!!
    }

private var _Chalkboard: ImageVector? = null

