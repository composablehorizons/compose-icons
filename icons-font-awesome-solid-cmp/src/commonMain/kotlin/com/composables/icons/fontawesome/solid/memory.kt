package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Memory: ImageVector
    get() {
        if (_Memory != null) return _Memory!!
        
        _Memory = ImageVector.Builder(
            name = "memory",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(640f, 130.94f)
                verticalLineTo(96f)
                curveToRelative(0f, -17.67f, -14.33f, -32f, -32f, -32f)
                horizontalLineTo(32f)
                curveTo(14.33f, 64f, 0f, 78.33f, 0f, 96f)
                verticalLineToRelative(34.94f)
                curveToRelative(18.6f, 6.61f, 32f, 24.19f, 32f, 45.06f)
                reflectiveCurveToRelative(-13.4f, 38.45f, -32f, 45.06f)
                verticalLineTo(320f)
                horizontalLineToRelative(640f)
                verticalLineToRelative(-98.94f)
                curveToRelative(-18.6f, -6.61f, -32f, -24.19f, -32f, -45.06f)
                reflectiveCurveToRelative(13.4f, -38.45f, 32f, -45.06f)
                close()
                moveTo(224f, 256f)
                horizontalLineToRelative(-64f)
                verticalLineTo(128f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(128f)
                close()
                moveToRelative(128f, 0f)
                horizontalLineToRelative(-64f)
                verticalLineTo(128f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(128f)
                close()
                moveToRelative(128f, 0f)
                horizontalLineToRelative(-64f)
                verticalLineTo(128f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(128f)
                close()
                moveTo(0f, 448f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                verticalLineTo(448f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                verticalLineTo(448f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                verticalLineTo(448f)
                horizontalLineToRelative(128f)
                verticalLineToRelative(-26.67f)
                curveToRelative(0f, -8.84f, 7.16f, -16f, 16f, -16f)
                reflectiveCurveToRelative(16f, 7.16f, 16f, 16f)
                verticalLineTo(448f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-96f)
                horizontalLineTo(0f)
                verticalLineToRelative(96f)
                close()
            }
        }.build()
        
        return _Memory!!
    }

private var _Memory: ImageVector? = null

