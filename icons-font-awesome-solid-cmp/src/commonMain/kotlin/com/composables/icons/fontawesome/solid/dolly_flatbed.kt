package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.DollyFlatbed: ImageVector
    get() {
        if (_DollyFlatbed != null) return _DollyFlatbed!!
        
        _DollyFlatbed = ImageVector.Builder(
            name = "dolly-flatbed",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(208f, 320f)
                horizontalLineToRelative(384f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(48f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(448f)
                verticalLineToRelative(128f)
                lineToRelative(-48f, -32f)
                lineToRelative(-48f, 32f)
                verticalLineTo(32f)
                horizontalLineTo(208f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                close()
                moveToRelative(416f, 64f)
                horizontalLineTo(128f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                horizontalLineTo(16f)
                curveTo(7.2f, 0f, 0f, 7.2f, 0f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(48f)
                verticalLineToRelative(368f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(82.9f)
                curveToRelative(-1.8f, 5f, -2.9f, 10.4f, -2.9f, 16f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                curveToRelative(0f, -5.6f, -1.2f, -11f, -2.9f, -16f)
                horizontalLineTo(451f)
                curveToRelative(-1.8f, 5f, -2.9f, 10.4f, -2.9f, 16f)
                curveToRelative(0f, 26.5f, 21.5f, 48f, 48f, 48f)
                reflectiveCurveToRelative(48f, -21.5f, 48f, -48f)
                curveToRelative(0f, -5.6f, -1.2f, -11f, -2.9f, -16f)
                horizontalLineTo(624f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
            }
        }.build()
        
        return _DollyFlatbed!!
    }

private var _DollyFlatbed: ImageVector? = null

