package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Phone: ImageVector
    get() {
        if (_Phone != null) return _Phone!!
        
        _Phone = ImageVector.Builder(
            name = "phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(1.5f, 4.5f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                horizontalLineToRelative(1.372f)
                curveToRelative(0.86f, 0f, 1.61f, 0.586f, 1.819f, 1.42f)
                lineToRelative(1.105f, 4.423f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, -0.694f, 1.955f)
                lineToRelative(-1.293f, 0.97f)
                curveToRelative(-0.135f, 0.101f, -0.164f, 0.249f, -0.126f, 0.352f)
                arcToRelative(11.285f, 11.285f, 0f, false, false, 6.697f, 6.697f)
                curveToRelative(0.103f, 0.038f, 0.25f, 0.009f, 0.352f, -0.126f)
                lineToRelative(0.97f, -1.293f)
                arcToRelative(1.875f, 1.875f, 0f, false, true, 1.955f, -0.694f)
                lineToRelative(4.423f, 1.105f)
                curveToRelative(0.834f, 0.209f, 1.42f, 0.959f, 1.42f, 1.82f)
                verticalLineTo(19.5f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-2.25f)
                curveTo(8.552f, 22.5f, 1.5f, 15.448f, 1.5f, 6.75f)
                verticalLineTo(4.5f)
                close()
            }
        }.build()
        
        return _Phone!!
    }

private var _Phone: ImageVector? = null

