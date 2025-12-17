package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bars: ImageVector
    get() {
        if (_Bars != null) return _Bars!!
        
        _Bars = ImageVector.Builder(
            name = "bars",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 132f)
                horizontalLineToRelative(416f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineTo(76f)
                curveToRelative(0f, -8.837f, -7.163f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveTo(7.163f, 60f, 0f, 67.163f, 0f, 76f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 8.837f, 7.163f, 16f, 16f, 16f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(416f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -8.837f, -7.163f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveToRelative(-8.837f, 0f, -16f, 7.163f, -16f, 16f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 8.837f, 7.163f, 16f, 16f, 16f)
                close()
                moveToRelative(0f, 160f)
                horizontalLineToRelative(416f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineToRelative(-40f)
                curveToRelative(0f, -8.837f, -7.163f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveToRelative(-8.837f, 0f, -16f, 7.163f, -16f, 16f)
                verticalLineToRelative(40f)
                curveToRelative(0f, 8.837f, 7.163f, 16f, 16f, 16f)
                close()
            }
        }.build()
        
        return _Bars!!
    }

private var _Bars: ImageVector? = null

