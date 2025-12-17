package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Loupe: ImageVector
    get() {
        if (_Loupe != null) return _Loupe!!
        
        _Loupe = ImageVector.Builder(
            name = "loupe",
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
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineTo(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineTo(7f)
                close()
                moveToRelative(-0.27f, -4.97f)
                curveToRelative(-6.08f, -0.44f, -11.14f, 4.62f, -10.7f, 10.7f)
                curveToRelative(0.38f, 5.28f, 5f, 9.27f, 10.29f, 9.27f)
                horizontalLineTo(22f)
                verticalLineToRelative(-9.68f)
                curveToRelative(0f, -5.3f, -3.98f, -9.91f, -9.27f, -10.29f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveToRelative(3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveToRelative(-3.59f, 8f, -8f, 8f)
                close()
            }
        }.build()
        
        return _Loupe!!
    }

private var _Loupe: ImageVector? = null

