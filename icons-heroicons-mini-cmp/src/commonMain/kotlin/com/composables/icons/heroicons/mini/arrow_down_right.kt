package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) return _ArrowDownRight!!
        
        _ArrowDownRight = ImageVector.Builder(
            name = "arrow-down-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.28f, 5.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 1.06f)
                lineToRelative(7.22f, 7.22f)
                horizontalLineTo(6.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(7.5f)
                arcToRelative(0.747f, 0.747f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(5.69f)
                lineTo(6.28f, 5.22f)
                close()
            }
        }.build()
        
        return _ArrowDownRight!!
    }

private var _ArrowDownRight: ImageVector? = null

