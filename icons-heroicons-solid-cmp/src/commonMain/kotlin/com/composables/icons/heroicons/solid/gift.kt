package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Gift: ImageVector
    get() {
        if (_Gift != null) return _Gift!!
        
        _Gift = ImageVector.Builder(
            name = "gift",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 3.255f)
                arcToRelative(1.875f, 1.875f, 0f, true, false, 0f, 3.75f)
                horizontalLineToRelative(1.875f)
                verticalLineToRelative(4.5f)
                horizontalLineTo(3f)
                arcTo(1.875f, 1.875f, 0f, false, true, 1.125f, 9.63f)
                verticalLineToRelative(-0.75f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(3.193f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, 5.432f, -3.997f)
                arcToRelative(3.375f, 3.375f, 0f, false, true, 5.432f, 3.997f)
                horizontalLineTo(21f)
                curveToRelative(1.035f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(0.75f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineToRelative(-8.625f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(1.875f)
                arcToRelative(1.875f, 1.875f, 0f, true, false, -1.875f, -1.875f)
                verticalLineToRelative(1.875f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(5.13f)
                curveToRelative(0f, -1.036f, -0.84f, -1.875f, -1.875f, -1.875f)
                close()
                moveTo(10.875f, 13.005f)
                horizontalLineToRelative(-8.25f)
                verticalLineToRelative(6.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, 2.25f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-9f)
                close()
                moveTo(12.375f, 13.005f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(6.75f)
                arcToRelative(2.25f, 2.25f, 0f, false, false, 2.25f, -2.25f)
                verticalLineToRelative(-6.75f)
                horizontalLineToRelative(-9f)
                close()
            }
        }.build()
        
        return _Gift!!
    }

private var _Gift: ImageVector? = null

