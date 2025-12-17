package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Helicopter: ImageVector
    get() {
        if (_Helicopter != null) return _Helicopter!!
        
        _Helicopter = ImageVector.Builder(
            name = "helicopter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 5f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                curveToRelative(4.642f, 0f, 8f, 2.218f, 8f, 6f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                horizontalLineToRelative(-8f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.652f, 0f, -3f, -1.348f, -3f, -3f)
                verticalLineToRelative(-1.001f)
                lineToRelative(-6f, 0.001f)
                arcToRelative(1f, 1f, 0f, false, true, -0.894f, -0.553f)
                lineToRelative(-1f, -2f)
                arcToRelative(1f, 1f, 0f, false, true, 1.788f, -0.894f)
                lineToRelative(0.724f, 1.447f)
                lineToRelative(5.382f, -0.001f)
                lineToRelative(0.005f, -0.175f)
                arcToRelative(3f, 3f, 0f, false, true, 2.995f, -2.824f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                close()
                moveToRelative(-3.999f, 5.174f)
                lineToRelative(-0.001f, 1.826f)
                horizontalLineToRelative(3.36f)
                curveToRelative(-0.665f, -0.906f, -1.825f, -1.539f, -3.359f, -1.826f)
            }
        }.build()
        
        return _Helicopter!!
    }

private var _Helicopter: ImageVector? = null

