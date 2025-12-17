package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Pennant2: ImageVector
    get() {
        if (_Pennant2 != null) return _Pennant2!!
        
        _Pennant2 = ImageVector.Builder(
            name = "pennant-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(14f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, 0.993f, 0.883f)
                lineToRelative(0.007f, 0.117f)
                verticalLineToRelative(17f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.117f, 0.007f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                lineToRelative(0.117f, -0.007f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-7.351f)
                lineToRelative(-8.406f, -3.735f)
                curveToRelative(-0.752f, -0.335f, -0.79f, -1.365f, -0.113f, -1.77f)
                lineToRelative(0.113f, -0.058f)
                lineToRelative(8.406f, -3.736f)
                verticalLineToRelative(-0.35f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, -1f)
                close()
            }
        }.build()
        
        return _Pennant2!!
    }

private var _Pennant2: ImageVector? = null

