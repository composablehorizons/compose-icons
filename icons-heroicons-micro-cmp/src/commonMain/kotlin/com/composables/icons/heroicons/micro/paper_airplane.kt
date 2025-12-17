package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PaperAirplane: ImageVector
    get() {
        if (_PaperAirplane != null) return _PaperAirplane!!
        
        _PaperAirplane = ImageVector.Builder(
            name = "paper-airplane",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.87f, 2.298f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.812f, 1.021f)
                lineTo(3.39f, 6.624f)
                arcToRelative(1f, 1f, 0f, false, false, 0.928f, 0.626f)
                horizontalLineTo(8.25f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.5f)
                horizontalLineTo(4.318f)
                arcToRelative(1f, 1f, 0f, false, false, -0.927f, 0.626f)
                lineToRelative(-1.333f, 3.305f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.811f, 1.022f)
                arcToRelative(24.89f, 24.89f, 0f, false, false, 11.668f, -5.115f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.175f)
                arcTo(24.89f, 24.89f, 0f, false, false, 2.869f, 2.298f)
                close()
            }
        }.build()
        
        return _PaperAirplane!!
    }

private var _PaperAirplane: ImageVector? = null

