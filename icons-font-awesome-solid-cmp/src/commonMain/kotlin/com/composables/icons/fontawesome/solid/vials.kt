package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Vials: ImageVector
    get() {
        if (_Vials != null) return _Vials!!
        
        _Vials = ImageVector.Builder(
            name = "vials",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 640f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(72f, 64f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 44.1f, 35.9f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.9f, 80f, -80f)
                verticalLineTo(64f)
                horizontalLineToRelative(24f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(8f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                horizontalLineTo(72f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                close()
                moveToRelative(72f, 0f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-64f)
                verticalLineTo(64f)
                close()
                moveToRelative(480f, 384f)
                horizontalLineTo(16f)
                curveToRelative(-8.8f, 0f, -16f, 7.2f, -16f, 16f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 8.8f, 7.2f, 16f, 16f, 16f)
                horizontalLineToRelative(608f)
                curveToRelative(8.8f, 0f, 16f, -7.2f, 16f, -16f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -8.8f, -7.2f, -16f, -16f, -16f)
                close()
                moveTo(360f, 64f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(240f)
                curveToRelative(0f, 44.1f, 35.9f, 80f, 80f, 80f)
                reflectiveCurveToRelative(80f, -35.9f, 80f, -80f)
                verticalLineTo(64f)
                horizontalLineToRelative(24f)
                curveToRelative(4.4f, 0f, 8f, -3.6f, 8f, -8f)
                verticalLineTo(8f)
                curveToRelative(0f, -4.4f, -3.6f, -8f, -8f, -8f)
                horizontalLineTo(360f)
                curveToRelative(-4.4f, 0f, -8f, 3.6f, -8f, 8f)
                verticalLineToRelative(48f)
                curveToRelative(0f, 4.4f, 3.6f, 8f, 8f, 8f)
                close()
                moveToRelative(72f, 0f)
                horizontalLineToRelative(64f)
                verticalLineToRelative(96f)
                horizontalLineToRelative(-64f)
                verticalLineTo(64f)
                close()
            }
        }.build()
        
        return _Vials!!
    }

private var _Vials: ImageVector? = null

