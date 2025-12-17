package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.Bolt: ImageVector
    get() {
        if (_Bolt != null) return _Bolt!!
        
        _Bolt = ImageVector.Builder(
            name = "bolt",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.58f, 1.077f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.405f, 0.82f)
                lineTo(9.165f, 6f)
                horizontalLineToRelative(4.085f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.567f, 1.241f)
                lineToRelative(-6.5f, 7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.302f, -0.638f)
                lineTo(6.835f, 10f)
                horizontalLineTo(2.75f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -0.567f, -1.241f)
                lineToRelative(6.5f, -7.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0.897f, -0.182f)
                close()
            }
        }.build()
        
        return _Bolt!!
    }

private var _Bolt: ImageVector? = null

