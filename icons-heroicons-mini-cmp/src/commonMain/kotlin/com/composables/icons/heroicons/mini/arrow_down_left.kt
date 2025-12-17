package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowDownLeft: ImageVector
    get() {
        if (_ArrowDownLeft != null) return _ArrowDownLeft!!
        
        _ArrowDownLeft = ImageVector.Builder(
            name = "arrow-down-left",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14.78f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                lineTo(6.5f, 12.44f)
                verticalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(7.5f)
                curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.5f)
                horizontalLineTo(7.56f)
                lineToRelative(7.22f, -7.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.06f)
                close()
            }
        }.build()
        
        return _ArrowDownLeft!!
    }

private var _ArrowDownLeft: ImageVector? = null

