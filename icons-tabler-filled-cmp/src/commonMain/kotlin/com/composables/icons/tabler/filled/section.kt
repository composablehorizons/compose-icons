package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Section: ImageVector
    get() {
        if (_Section != null) return _Section!!
        
        _Section = ImageVector.Builder(
            name = "section",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20.01f, 19f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(-16f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.127f, -1.993f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.127f, -1.993f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(4f, -16f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(-16f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.127f, -1.993f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, 2f)
                arcToRelative(1f, 1f, 0f, false, true, -0.127f, -1.993f)
                close()
                moveToRelative(4f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 0.117f, 1.993f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, true, -0.117f, -1.993f)
                close()
                moveToRelative(3.99f, 0f)
                arcToRelative(1f, 1f, 0f, false, true, 1f, 1f)
                arcToRelative(1f, 1f, 0f, true, true, -2f, 0.01f)
                curveToRelative(0f, -0.562f, 0.448f, -1.01f, 1f, -1.01f)
                moveToRelative(3f, 4f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(6f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineToRelative(-14f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, -2f)
                verticalLineToRelative(-6f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, -2f)
                close()
            }
        }.build()
        
        return _Section!!
    }

private var _Section: ImageVector? = null

