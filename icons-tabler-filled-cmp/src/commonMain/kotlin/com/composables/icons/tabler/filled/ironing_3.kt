package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Ironing3: ImageVector
    get() {
        if (_Ironing3 != null) return _Ironing3!!
        
        _Ironing3 = ImageVector.Builder(
            name = "ironing-3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.459f, 5f)
                arcToRelative(4f, 4f, 0f, false, true, 3.945f, 3.343f)
                lineToRelative(1.387f, 8.329f)
                arcToRelative(2f, 2f, 0f, false, true, -1.971f, 2.328f)
                horizontalLineToRelative(-16.82f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                arcToRelative(8f, 8f, 0f, false, true, 8f, -8f)
                horizontalLineToRelative(8.652f)
                lineToRelative(-0.22f, -1.329f)
                arcToRelative(2f, 2f, 0f, false, false, -1.811f, -1.665f)
                lineToRelative(-0.162f, -0.006f)
                horizontalLineToRelative(-7.459f)
                arcToRelative(1f, 1f, 0f, true, true, 0f, -2f)
                close()
                moveToRelative(-4.449f, 9f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
                moveToRelative(6f, 0f)
                horizontalLineToRelative(-0.01f)
                arcToRelative(1f, 1f, 0f, false, false, -0.117f, 1.993f)
                lineToRelative(0.127f, 0.007f)
                arcToRelative(1f, 1f, 0f, false, false, 0f, -2f)
            }
        }.build()
        
        return _Ironing3!!
    }

private var _Ironing3: ImageVector? = null

