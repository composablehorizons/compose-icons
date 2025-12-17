package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.XRay: ImageVector
    get() {
        if (_XRay != null) return _XRay!!
        
        _XRay = ImageVector.Builder(
            name = "x-ray",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(240f, 384f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                reflectiveCurveToRelative(16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(160f, 32f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                reflectiveCurveToRelative(-7.2f, -16f, -16f, -16f)
                reflectiveCurveToRelative(-16f, 7.2f, -16f, 16f)
                reflectiveCurveToRelative(7.2f, 16f, 16f, 16f)
                close()
                moveTo(624f, 0f)
                horizontalLineTo(16f)
                curveTo(7.2f, 0f, 0f, 7.2f, 0f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineTo(16f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveToRelative(0f, 448f)
                horizontalLineToRelative(-48f)
                verticalLineTo(96f)
                horizontalLineTo(64f)
                verticalLineToRelative(352f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(480f, 248f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(336f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(104f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(336f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(64f)
                curveToRelative(26.5f, 0f, 48f, 21.5f, 48f, 48f)
                reflectiveCurveToRelative(-21.5f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.5f, -48f, -48f)
                verticalLineToRelative(-16f)
                horizontalLineToRelative(-64f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 26.5f, -21.5f, 48f, -48f, 48f)
                reflectiveCurveToRelative(-48f, -21.5f, -48f, -48f)
                reflectiveCurveToRelative(21.5f, -48f, 48f, -48f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(-32f)
                horizontalLineTo(200f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(-32f)
                horizontalLineTo(168f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(136f)
                verticalLineToRelative(-32f)
                horizontalLineTo(200f)
                curveToRelative(-4.4f, 0f, -8f, -3.6f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(104f)
                verticalLineToRelative(-24f)
                curveToRelative(0f, -4.4f, 3.6f, -8f, 8f, -8f)
                horizontalLineToRelative(16f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(24f)
                horizontalLineToRelative(104f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 4.4f, -3.6f, 8f, -8f, 8f)
                horizontalLineTo(336f)
                verticalLineToRelative(32f)
                horizontalLineToRelative(136f)
                curveToRelative(4.4f, 0f, 8f, 3.6f, 8f, 8f)
                verticalLineToRelative(16f)
                close()
            }
        }.build()
        
        return _XRay!!
    }

private var _XRay: ImageVector? = null

