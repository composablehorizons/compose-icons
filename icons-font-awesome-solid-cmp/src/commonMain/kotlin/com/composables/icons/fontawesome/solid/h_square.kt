package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.HSquare: ImageVector
    get() {
        if (_HSquare != null) return _HSquare!!
        
        _HSquare = ImageVector.Builder(
            name = "h-square",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 448f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(448f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, -21.49f, 48f, -48f, 48f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, -21.49f, -48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, 21.49f, -48f, 48f, -48f)
                horizontalLineToRelative(352f)
                curveToRelative(26.51f, 0f, 48f, 21.49f, 48f, 48f)
                close()
                moveToRelative(-112f, 48f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.837f, 0f, -16f, 7.163f, -16f, 16f)
                verticalLineToRelative(80f)
                horizontalLineTo(160f)
                verticalLineToRelative(-80f)
                curveToRelative(0f, -8.837f, -7.163f, -16f, -16f, -16f)
                horizontalLineToRelative(-32f)
                curveToRelative(-8.837f, 0f, -16f, 7.163f, -16f, 16f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 8.837f, 7.163f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(80f)
                curveToRelative(0f, 8.837f, 7.163f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.837f, 0f, 16f, -7.163f, 16f, -16f)
                verticalLineTo(144f)
                curveToRelative(0f, -8.837f, -7.163f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _HSquare!!
    }

private var _HSquare: ImageVector? = null

