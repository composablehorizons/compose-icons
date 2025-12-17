package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Bed: ImageVector
    get() {
        if (_Bed != null) return _Bed!!
        
        _Bed = ImageVector.Builder(
            name = "bed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(176f, 256f)
                curveToRelative(44.11f, 0f, 80f, -35.89f, 80f, -80f)
                reflectiveCurveToRelative(-35.89f, -80f, -80f, -80f)
                reflectiveCurveToRelative(-80f, 35.89f, -80f, 80f)
                reflectiveCurveToRelative(35.89f, 80f, 80f, 80f)
                close()
                moveToRelative(352f, -128f)
                horizontalLineTo(304f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(144f)
                horizontalLineTo(64f)
                verticalLineTo(80f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveTo(7.16f, 64f, 0f, 71.16f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-48f)
                horizontalLineToRelative(512f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineTo(240f)
                curveToRelative(0f, -61.86f, -50.14f, -112f, -112f, -112f)
                close()
            }
        }.build()
        
        return _Bed!!
    }

private var _Bed: ImageVector? = null

