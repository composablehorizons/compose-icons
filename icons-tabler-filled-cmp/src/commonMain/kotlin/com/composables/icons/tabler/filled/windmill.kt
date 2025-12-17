package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Windmill: ImageVector
    get() {
        if (_Windmill != null) return _Windmill!!
        
        _Windmill = ImageVector.Builder(
            name = "windmill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                curveToRelative(3.292f, 0f, 6f, 2.435f, 6f, 5.5f)
                curveToRelative(0f, 1.337f, -0.515f, 2.554f, -1.369f, 3.5f)
                horizontalLineToRelative(4.369f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                curveToRelative(0f, 3.292f, -2.435f, 6f, -5.5f, 6f)
                curveToRelative(-1.336f, 0f, -2.553f, -0.515f, -3.5f, -1.368f)
                verticalLineToRelative(4.368f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                curveToRelative(-3.292f, 0f, -6f, -2.435f, -6f, -5.5f)
                curveToRelative(0f, -1.336f, 0.515f, -2.553f, 1.368f, -3.5f)
                horizontalLineToRelative(-4.368f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                curveToRelative(0f, -3.292f, 2.435f, -6f, 5.5f, -6f)
                curveToRelative(1.337f, 0f, 2.554f, 0.515f, 3.5f, 1.369f)
                verticalLineToRelative(-4.369f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Windmill!!
    }

private var _Windmill: ImageVector? = null

