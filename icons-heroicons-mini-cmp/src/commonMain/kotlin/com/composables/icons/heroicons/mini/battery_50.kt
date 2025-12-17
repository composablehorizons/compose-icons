package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Battery50: ImageVector
    get() {
        if (_Battery50 != null) return _Battery50!!
        
        _Battery50 = ImageVector.Builder(
            name = "battery-50",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.75f, 8f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineTo(9.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-2.5f)
                arcTo(0.75f, 0.75f, 0f, false, false, 9.5f, 8f)
                horizontalLineTo(4.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.25f, 5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 1f, 7.25f)
                verticalLineToRelative(5.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 3.25f, 15f)
                horizontalLineToRelative(12.5f)
                arcTo(2.25f, 2.25f, 0f, false, false, 18f, 12.75f)
                verticalLineToRelative(-1.085f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 1f, -1.415f)
                verticalLineToRelative(-0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1f, -1.415f)
                verticalLineTo(7.25f)
                arcTo(2.25f, 2.25f, 0f, false, false, 15.75f, 5f)
                horizontalLineTo(3.25f)
                close()
                moveTo(2.5f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(12.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, 0.75f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, 0.75f)
                horizontalLineTo(3.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.build()
        
        return _Battery50!!
    }

private var _Battery50: ImageVector? = null

