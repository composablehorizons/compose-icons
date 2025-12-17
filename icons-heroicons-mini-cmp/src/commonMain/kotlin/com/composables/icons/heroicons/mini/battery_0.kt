package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Battery0: ImageVector
    get() {
        if (_Battery0 != null) return _Battery0!!
        
        _Battery0 = ImageVector.Builder(
            name = "battery-0",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1f, 7.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 3.25f, 5f)
                horizontalLineToRelative(12.5f)
                arcTo(2.25f, 2.25f, 0f, false, true, 18f, 7.25f)
                verticalLineToRelative(1.085f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1f, 1.415f)
                verticalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1f, 1.415f)
                verticalLineToRelative(1.085f)
                arcTo(2.25f, 2.25f, 0f, false, true, 15.75f, 15f)
                horizontalLineTo(3.25f)
                arcTo(2.25f, 2.25f, 0f, false, true, 1f, 12.75f)
                verticalLineToRelative(-5.5f)
                close()
                moveToRelative(2.25f, -0.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, -0.75f)
                horizontalLineTo(3.25f)
                close()
            }
        }.build()
        
        return _Battery0!!
    }

private var _Battery0: ImageVector? = null

