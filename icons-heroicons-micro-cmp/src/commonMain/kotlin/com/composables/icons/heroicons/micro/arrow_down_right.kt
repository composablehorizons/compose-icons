package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.ArrowDownRight: ImageVector
    get() {
        if (_ArrowDownRight != null) return _ArrowDownRight!!
        
        _ArrowDownRight = ImageVector.Builder(
            name = "arrow-down-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4.22f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.06f)
                lineToRelative(5.22f, 5.22f)
                horizontalLineTo(5.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                horizontalLineToRelative(5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineToRelative(-5.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.5f, 0f)
                verticalLineToRelative(3.69f)
                lineTo(5.28f, 4.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -1.06f, 0f)
                close()
            }
        }.build()
        
        return _ArrowDownRight!!
    }

private var _ArrowDownRight: ImageVector? = null

