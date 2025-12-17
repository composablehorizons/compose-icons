package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Toilet: ImageVector
    get() {
        if (_Toilet != null) return _Toilet!!
        
        _Toilet = ImageVector.Builder(
            name = "toilet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(368f, 48f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveTo(7.2f, 0f, 0f, 7.2f, 0f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(156.7f)
                curveTo(11.8f, 214.8f, 0f, 226.9f, 0f, 240f)
                curveToRelative(0f, 67.2f, 34.6f, 126.2f, 86.8f, 160.5f)
                lineToRelative(-21.4f, 70.2f)
                curveTo(59.1f, 491.2f, 74.5f, 512f, 96f, 512f)
                horizontalLineToRelative(192f)
                curveToRelative(21.5f, 0f, 36.9f, -20.8f, 30.6f, -41.3f)
                lineToRelative(-21.4f, -70.2f)
                curveTo(349.4f, 366.2f, 384f, 307.2f, 384f, 240f)
                curveToRelative(0f, -13.1f, -11.8f, -25.2f, -32f, -35.3f)
                verticalLineTo(48f)
                horizontalLineToRelative(16f)
                close()
                moveTo(80f, 72f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(48f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(88f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineTo(72f)
                close()
                moveToRelative(112f, 200f)
                curveToRelative(-77.1f, 0f, -139.6f, -14.3f, -139.6f, -32f)
                reflectiveCurveToRelative(62.5f, -32f, 139.6f, -32f)
                reflectiveCurveToRelative(139.6f, 14.3f, 139.6f, 32f)
                reflectiveCurveToRelative(-62.5f, 32f, -139.6f, 32f)
                close()
            }
        }.build()
        
        return _Toilet!!
    }

private var _Toilet: ImageVector? = null

