package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Bars3CenterLeft: ImageVector
    get() {
        if (_Bars3CenterLeft != null) return _Bars3CenterLeft!!
        
        _Bars3CenterLeft = ImageVector.Builder(
            name = "bars-3-center-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 4.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2.75f, 4f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 4.75f)
                close()
                moveToRelative(0f, 10.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(14.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.75f, -0.75f)
                close()
                moveTo(2f, 10f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.75f, -0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineToRelative(-7.5f)
                arcTo(0.75f, 0.75f, 0f, false, true, 2f, 10f)
                close()
            }
        }.build()
        
        return _Bars3CenterLeft!!
    }

private var _Bars3CenterLeft: ImageVector? = null

