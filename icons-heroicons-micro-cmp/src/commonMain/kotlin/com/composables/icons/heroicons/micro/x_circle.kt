package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.XCircle: ImageVector
    get() {
        if (_XCircle != null) return _XCircle!!
        
        _XCircle = ImageVector.Builder(
            name = "x-circle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 15f)
                arcTo(7f, 7f, 0f, true, false, 8f, 1f)
                arcToRelative(7f, 7f, 0f, false, false, 0f, 14f)
                close()
                moveToRelative(2.78f, -4.22f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, -1.06f, 0f)
                lineTo(8f, 9.06f)
                lineToRelative(-1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, -1.06f, -1.06f)
                lineTo(6.94f, 8f)
                lineTo(5.22f, 6.28f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 1.06f, -1.06f)
                lineTo(8f, 6.94f)
                lineToRelative(1.72f, -1.72f)
                arcToRelative(0.75f, 0.75f, 0f, true, true, 1.06f, 1.06f)
                lineTo(9.06f, 8f)
                lineToRelative(1.72f, 1.72f)
                arcToRelative(0.75f, 0.75f, 0f, false, true, 0f, 1.06f)
                close()
            }
        }.build()
        
        return _XCircle!!
    }

private var _XCircle: ImageVector? = null

