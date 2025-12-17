package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.PlayCircle: ImageVector
    get() {
        if (_PlayCircle != null) return _PlayCircle!!
        
        _PlayCircle = ImageVector.Builder(
            name = "play-circle",
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
                moveToRelative(-0.847f, -9.766f)
                arcTo(0.75f, 0.75f, 0f, false, false, 6f, 5.866f)
                verticalLineToRelative(4.268f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 1.153f, 0.633f)
                lineToRelative(3.353f, -2.134f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, -1.266f)
                lineTo(7.153f, 5.234f)
                close()
            }
        }.build()
        
        return _PlayCircle!!
    }

private var _PlayCircle: ImageVector? = null

