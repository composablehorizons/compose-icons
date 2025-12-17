package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Octagon: ImageVector
    get() {
        if (_Octagon != null) return _Octagon!!
        
        _Octagon = ImageVector.Builder(
            name = "octagon",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.3f, 2f)
                horizontalLineToRelative(-6.6f)
                curveToRelative(-0.562f, 0f, -1.016f, 0.201f, -1.407f, 0.593f)
                lineToRelative(-4.7f, 4.7f)
                arcToRelative(1.894f, 1.894f, 0f, false, false, -0.593f, 1.407f)
                verticalLineToRelative(6.6f)
                curveToRelative(0f, 0.562f, 0.201f, 1.016f, 0.593f, 1.407f)
                lineToRelative(4.7f, 4.7f)
                curveToRelative(0.391f, 0.392f, 0.845f, 0.593f, 1.407f, 0.593f)
                horizontalLineToRelative(6.6f)
                curveToRelative(0.562f, 0f, 1.016f, -0.201f, 1.407f, -0.593f)
                lineToRelative(4.7f, -4.7f)
                curveToRelative(0.392f, -0.391f, 0.593f, -0.845f, 0.593f, -1.407f)
                verticalLineToRelative(-6.6f)
                curveToRelative(0f, -0.562f, -0.201f, -1.016f, -0.593f, -1.407f)
                lineToRelative(-4.7f, -4.7f)
                arcToRelative(1.894f, 1.894f, 0f, false, false, -1.407f, -0.593f)
                close()
            }
        }.build()
        
        return _Octagon!!
    }

private var _Octagon: ImageVector? = null

