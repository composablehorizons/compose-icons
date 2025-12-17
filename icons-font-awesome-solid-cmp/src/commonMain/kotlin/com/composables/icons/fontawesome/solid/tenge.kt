package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tenge: ImageVector
    get() {
        if (_Tenge != null) return _Tenge!!
        
        _Tenge = ImageVector.Builder(
            name = "tenge",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(372f, 160f)
                horizontalLineTo(12f)
                curveToRelative(-6.6f, 0f, -12f, 5.4f, -12f, 12f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(140f)
                verticalLineToRelative(228f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(56f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineTo(240f)
                horizontalLineToRelative(140f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineToRelative(-56f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
                moveToRelative(0f, -128f)
                horizontalLineTo(12f)
                curveTo(5.4f, 32f, 0f, 37.4f, 0f, 44f)
                verticalLineToRelative(56f)
                curveToRelative(0f, 6.6f, 5.4f, 12f, 12f, 12f)
                horizontalLineToRelative(360f)
                curveToRelative(6.6f, 0f, 12f, -5.4f, 12f, -12f)
                verticalLineTo(44f)
                curveToRelative(0f, -6.6f, -5.4f, -12f, -12f, -12f)
                close()
            }
        }.build()
        
        return _Tenge!!
    }

private var _Tenge: ImageVector? = null

