package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Hanger2: ImageVector
    get() {
        if (_Hanger2 != null) return _Hanger2!!
        
        _Hanger2 = ImageVector.Builder(
            name = "hanger-2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 2f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, 3f)
                arcToRelative(1f, 1f, 0f, false, true, -1.993f, 0.117f)
                lineToRelative(-0.007f, -0.117f)
                arcToRelative(1f, 1f, 0f, false, false, -2f, -0.004f)
                curveToRelative(0.006f, 1.516f, 0.495f, 2.579f, 1.486f, 3.13f)
                lineToRelative(7.97f, 4.428f)
                arcToRelative(3f, 3f, 0f, false, true, 1.544f, 2.623f)
                verticalLineToRelative(0.823f)
                arcToRelative(3f, 3f, 0f, false, true, -2.824f, 2.995f)
                lineToRelative(-0.176f, 0.005f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-8f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineToRelative(-0.823f)
                arcToRelative(3f, 3f, 0f, false, true, 1.543f, -2.623f)
                lineToRelative(6.695f, -3.72f)
                curveToRelative(-0.832f, -0.976f, -1.232f, -2.296f, -1.238f, -3.834f)
                arcToRelative(3f, 3f, 0f, false, true, 3f, -3f)
                moveToRelative(0f, 8.144f)
                lineToRelative(-7.486f, 4.158f)
                arcToRelative(1f, 1f, 0f, false, false, -0.514f, 0.875f)
                verticalLineToRelative(0.823f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(0.17f)
                arcToRelative(3f, 3f, 0f, false, true, 2.83f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.306f, 0f, 2.418f, 0.835f, 2.83f, 2f)
                horizontalLineToRelative(0.17f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-0.823f)
                arcToRelative(1f, 1f, 0f, false, false, -0.515f, -0.875f)
                close()
            }
        }.build()
        
        return _Hanger2!!
    }

private var _Hanger2: ImageVector? = null

