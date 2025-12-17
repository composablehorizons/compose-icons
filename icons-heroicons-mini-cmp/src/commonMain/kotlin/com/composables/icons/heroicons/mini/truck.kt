package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Truck: ImageVector
    get() {
        if (_Truck != null) return _Truck!!
        
        _Truck = ImageVector.Builder(
            name = "truck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 3f)
                curveToRelative(-1.051f, 0f, -2.093f, 0.04f, -3.125f, 0.117f)
                arcTo(1.49f, 1.49f, 0f, false, false, 2f, 4.607f)
                verticalLineTo(10.5f)
                horizontalLineToRelative(9f)
                verticalLineTo(4.606f)
                curveToRelative(0f, -0.771f, -0.59f, -1.43f, -1.375f, -1.489f)
                arcTo(41.568f, 41.568f, 0f, false, false, 6.5f, 3f)
                close()
                moveTo(2f, 12f)
                verticalLineToRelative(2.5f)
                arcTo(1.5f, 1.5f, 0f, false, false, 3.5f, 16f)
                horizontalLineToRelative(0.041f)
                arcToRelative(3f, 3f, 0f, false, true, 5.918f, 0f)
                horizontalLineToRelative(0.791f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0.75f, -0.75f)
                verticalLineTo(12f)
                horizontalLineTo(2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.5f, 18f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                close()
                moveTo(13.25f, 5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, -0.75f, 0.75f)
                verticalLineToRelative(8.514f)
                arcToRelative(3.001f, 3.001f, 0f, false, true, 4.893f, 1.44f)
                curveToRelative(0.37f, -0.275f, 0.61f, -0.719f, 0.595f, -1.227f)
                arcToRelative(24.905f, 24.905f, 0f, false, false, -1.784f, -8.549f)
                arcTo(1.486f, 1.486f, 0f, false, false, 14.823f, 5f)
                horizontalLineTo(13.25f)
                close()
                moveTo(14.5f, 18f)
                arcToRelative(1.5f, 1.5f, 0f, true, false, 0f, -3f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, 0f, 3f)
                close()
            }
        }.build()
        
        return _Truck!!
    }

private var _Truck: ImageVector? = null

