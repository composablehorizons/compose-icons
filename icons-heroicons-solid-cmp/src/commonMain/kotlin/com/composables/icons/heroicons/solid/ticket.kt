package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Ticket: ImageVector
    get() {
        if (_Ticket != null) return _Ticket!!
        
        _Ticket = ImageVector.Builder(
            name = "ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 6.375f)
                curveToRelative(0f, -1.036f, 0.84f, -1.875f, 1.875f, -1.875f)
                horizontalLineToRelative(17.25f)
                curveToRelative(1.035f, 0f, 1.875f, 0.84f, 1.875f, 1.875f)
                verticalLineToRelative(3.026f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.375f, 0.65f)
                arcToRelative(2.249f, 2.249f, 0f, false, false, 0f, 3.898f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.375f, 0.65f)
                verticalLineToRelative(3.026f)
                curveToRelative(0f, 1.035f, -0.84f, 1.875f, -1.875f, 1.875f)
                horizontalLineTo(3.375f)
                arcTo(1.875f, 1.875f, 0f, false, true, 1.5f, 17.625f)
                verticalLineToRelative(-3.026f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.374f, -0.65f)
                arcToRelative(2.249f, 2.249f, 0f, false, false, 0f, -3.898f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.374f, -0.65f)
                verticalLineTo(6.375f)
                close()
                moveToRelative(15f, -1.125f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineTo(6f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(0.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.75f)
                close()
                moveToRelative(-0.75f, 3f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                close()
                moveToRelative(0.75f, 4.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineTo(18f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-0.75f)
                close()
                moveTo(6f, 12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineTo(12f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(6.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 6f, 12f)
                close()
                moveToRelative(0.75f, 2.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(3f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Ticket!!
    }

private var _Ticket: ImageVector? = null

