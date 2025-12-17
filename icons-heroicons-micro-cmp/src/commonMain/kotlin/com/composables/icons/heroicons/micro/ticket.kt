package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Ticket: ImageVector
    get() {
        if (_Ticket != null) return _Ticket!!
        
        _Ticket = ImageVector.Builder(
            name = "ticket",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 4.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 2.5f, 3f)
                horizontalLineToRelative(11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 4.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.276f, -0.227f, 0.494f, -0.495f, 0.562f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, 3.876f)
                curveToRelative(0.268f, 0.068f, 0.495f, 0.286f, 0.495f, 0.562f)
                verticalLineToRelative(1f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-11f)
                arcTo(1.5f, 1.5f, 0f, false, true, 1f, 11.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.276f, 0.227f, -0.494f, 0.495f, -0.562f)
                arcToRelative(2f, 2f, 0f, false, false, 0f, -3.876f)
                curveTo(1.227f, 5.994f, 1f, 5.776f, 1f, 5.5f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(9f, 1.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.5f, 0f)
                verticalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.5f, 0f)
                verticalLineToRelative(-1f)
                close()
                moveToRelative(0.75f, 2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(1f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.5f, 0f)
                verticalLineToRelative(-1f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _Ticket!!
    }

private var _Ticket: ImageVector? = null

