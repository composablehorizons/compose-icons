package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Share: ImageVector
    get() {
        if (_Share != null) return _Share!!
        
        _Share = ImageVector.Builder(
            name = "share",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.75f, 4.5f)
                arcToRelative(3f, 3f, 0f, true, true, 0.825f, 2.066f)
                lineToRelative(-8.421f, 4.679f)
                arcToRelative(3.002f, 3.002f, 0f, false, true, 0f, 1.51f)
                lineToRelative(8.421f, 4.679f)
                arcToRelative(3f, 3f, 0f, true, true, -0.729f, 1.31f)
                lineToRelative(-8.421f, -4.678f)
                arcToRelative(3f, 3f, 0f, true, true, 0f, -4.132f)
                lineToRelative(8.421f, -4.679f)
                arcToRelative(3f, 3f, 0f, false, true, -0.096f, -0.755f)
                close()
            }
        }.build()
        
        return _Share!!
    }

private var _Share: ImageVector? = null

