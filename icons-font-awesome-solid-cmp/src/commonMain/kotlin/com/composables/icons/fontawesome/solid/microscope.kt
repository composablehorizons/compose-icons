package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Microscope: ImageVector
    get() {
        if (_Microscope != null) return _Microscope!!
        
        _Microscope = ImageVector.Builder(
            name = "microscope",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(160f, 320f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(40f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(12f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineTo(64f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.84f, -7.16f, -16f, -16f, -16f)
                horizontalLineToRelative(-64f)
                curveToRelative(-8.84f, 0f, -16f, 7.16f, -16f, 16f)
                verticalLineToRelative(16f)
                curveToRelative(-17.67f, 0f, -32f, 14.33f, -32f, 32f)
                verticalLineToRelative(224f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                close()
                moveToRelative(304f, 128f)
                horizontalLineToRelative(-1.29f)
                curveTo(493.24f, 413.99f, 512f, 369.2f, 512f, 320f)
                curveToRelative(0f, -105.88f, -86.12f, -192f, -192f, -192f)
                verticalLineToRelative(64f)
                curveToRelative(70.58f, 0f, 128f, 57.42f, 128f, 128f)
                reflectiveCurveToRelative(-57.42f, 128f, -128f, 128f)
                horizontalLineTo(48f)
                curveToRelative(-26.51f, 0f, -48f, 21.49f, -48f, 48f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(480f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveToRelative(-360f, -32f)
                horizontalLineToRelative(208f)
                curveToRelative(4.42f, 0f, 8f, -3.58f, 8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                horizontalLineTo(104f)
                curveToRelative(-4.42f, 0f, -8f, 3.58f, -8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.42f, 3.58f, 8f, 8f, 8f)
                close()
            }
        }.build()
        
        return _Microscope!!
    }

private var _Microscope: ImageVector? = null

