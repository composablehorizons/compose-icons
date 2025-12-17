package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Duo: ImageVector
    get() {
        if (_Duo != null) return _Duo!!
        
        _Duo = ImageVector.Builder(
            name = "duo",
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
                moveTo(20f, 2f)
                horizontalLineToRelative(-8f)
                curveTo(6.38f, 2f, 2f, 6.66f, 2f, 12.28f)
                curveTo(2f, 17.5f, 6.49f, 22f, 11.72f, 22f)
                curveTo(17.39f, 22f, 22f, 17.62f, 22f, 12f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-3f, 13f)
                lineToRelative(-3f, -2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                lineToRelative(3f, -2f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Duo!!
    }

private var _Duo: ImageVector? = null

