package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Fastfood: ImageVector
    get() {
        if (_Fastfood != null) return _Fastfood!!
        
        _Fastfood = ImageVector.Builder(
            name = "fastfood",
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
                moveTo(18f, 5f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                lineToRelative(0.23f, 2.31f)
                curveTo(14.9f, 8.16f, 18f, 10.77f, 18f, 15f)
                lineToRelative(0.02f, 8f)
                horizontalLineToRelative(3.18f)
                lineTo(23f, 5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(1f, 21f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                close()
                moveTo(8.5f, 8.99f)
                curveTo(4.75f, 8.99f, 1f, 11f, 1f, 15f)
                horizontalLineToRelative(15f)
                curveToRelative(0f, -4f, -3.75f, -6.01f, -7.5f, -6.01f)
                close()
                moveTo(1f, 17f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                close()
            }
        }.build()
        
        return _Fastfood!!
    }

private var _Fastfood: ImageVector? = null

