package com.composables.icons.heroicons.micro

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Micro.User: ImageVector
    get() {
        if (_User != null) return _User!!
        
        _User = ImageVector.Builder(
            name = "user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
                moveTo(12.735f, 14f)
                curveToRelative(0.618f, 0f, 1.093f, -0.561f, 0.872f, -1.139f)
                arcToRelative(6.002f, 6.002f, 0f, false, false, -11.215f, 0f)
                curveToRelative(-0.22f, 0.578f, 0.254f, 1.139f, 0.872f, 1.139f)
                horizontalLineToRelative(9.47f)
                close()
            }
        }.build()
        
        return _User!!
    }

private var _User: ImageVector? = null

