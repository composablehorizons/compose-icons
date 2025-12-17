package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Swatch: ImageVector
    get() {
        if (_Swatch != null) return _Swatch!!
        
        _Swatch = ImageVector.Builder(
            name = "swatch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.25f, 4.125f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(5.25f)
                curveToRelative(1.036f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineTo(17.25f)
                arcToRelative(4.5f, 4.5f, 0f, true, true, -9f, 0f)
                verticalLineTo(4.125f)
                close()
                moveToRelative(4.5f, 14.25f)
                arcToRelative(1.125f, 1.125f, 0f, true, false, 0f, -2.25f)
                arcToRelative(1.125f, 1.125f, 0f, false, false, 0f, 2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.719f, 21.75f)
                horizontalLineToRelative(9.156f)
                curveToRelative(1.036f, 0f, 1.875f, -0.84f, 1.875f, -1.875f)
                verticalLineToRelative(-5.25f)
                curveToRelative(0f, -1.036f, -0.84f, -1.875f, -1.875f, -1.875f)
                horizontalLineToRelative(-0.14f)
                lineToRelative(-8.742f, 8.743f)
                curveToRelative(-0.09f, 0.089f, -0.18f, 0.175f, -0.274f, 0.257f)
                close()
                moveTo(12.738f, 17.625f)
                lineToRelative(6.474f, -6.474f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, 0f, -2.651f)
                lineTo(15.5f, 4.787f)
                arcToRelative(1.875f, 1.875f, 0f, false, false, -2.651f, 0f)
                lineToRelative(-0.1f, 0.099f)
                verticalLineTo(17.25f)
                curveToRelative(0f, 0.126f, -0.003f, 0.251f, -0.01f, 0.375f)
                close()
            }
        }.build()
        
        return _Swatch!!
    }

private var _Swatch: ImageVector? = null

