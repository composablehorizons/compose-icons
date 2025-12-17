package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Tint: ImageVector
    get() {
        if (_Tint != null) return _Tint!!
        
        _Tint = ImageVector.Builder(
            name = "tint",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 352f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(205.22f, 22.09f)
                curveToRelative(-7.94f, -28.78f, -49.44f, -30.12f, -58.44f, 0f)
                curveTo(100.01f, 179.85f, 0f, 222.72f, 0f, 333.91f)
                curveTo(0f, 432.35f, 78.72f, 512f, 176f, 512f)
                reflectiveCurveToRelative(176f, -79.65f, 176f, -178.09f)
                curveToRelative(0f, -111.75f, -99.79f, -153.34f, -146.78f, -311.82f)
                close()
                moveTo(176f, 448f)
                curveToRelative(-61.75f, 0f, -112f, -50.25f, -112f, -112f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                curveToRelative(0f, 44.11f, 35.89f, 80f, 80f, 80f)
                curveToRelative(8.84f, 0f, 16f, 7.16f, 16f, 16f)
                reflectiveCurveToRelative(-7.16f, 16f, -16f, 16f)
                close()
            }
        }.build()
        
        return _Tint!!
    }

private var _Tint: ImageVector? = null

