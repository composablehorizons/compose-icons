package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Prescription: ImageVector
    get() {
        if (_Prescription != null) return _Prescription!!
        
        _Prescription = ImageVector.Builder(
            name = "prescription",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 384f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(301.26f, 352f)
                lineToRelative(78.06f, -78.06f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                lineToRelative(-22.63f, -22.63f)
                curveToRelative(-6.25f, -6.25f, -16.38f, -6.25f, -22.63f, 0f)
                lineTo(256f, 306.74f)
                lineToRelative(-83.96f, -83.96f)
                curveTo(219.31f, 216.8f, 256f, 176.89f, 256f, 128f)
                curveToRelative(0f, -53.02f, -42.98f, -96f, -96f, -96f)
                horizontalLineTo(16f)
                curveTo(7.16f, 32f, 0f, 39.16f, 0f, 48f)
                verticalLineToRelative(256f)
                curveToRelative(0f, 8.84f, 7.16f, 16f, 16f, 16f)
                horizontalLineToRelative(32f)
                curveToRelative(8.84f, 0f, 16f, -7.16f, 16f, -16f)
                verticalLineToRelative(-80f)
                horizontalLineToRelative(18.75f)
                lineToRelative(128f, 128f)
                lineToRelative(-78.06f, 78.06f)
                curveToRelative(-6.25f, 6.25f, -6.25f, 16.38f, 0f, 22.63f)
                lineToRelative(22.63f, 22.63f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineTo(256f, 397.25f)
                lineToRelative(78.06f, 78.06f)
                curveToRelative(6.25f, 6.25f, 16.38f, 6.25f, 22.63f, 0f)
                lineToRelative(22.63f, -22.63f)
                curveToRelative(6.25f, -6.25f, 6.25f, -16.38f, 0f, -22.63f)
                lineTo(301.26f, 352f)
                close()
                moveTo(64f, 96f)
                horizontalLineToRelative(96f)
                curveToRelative(17.64f, 0f, 32f, 14.36f, 32f, 32f)
                reflectiveCurveToRelative(-14.36f, 32f, -32f, 32f)
                horizontalLineTo(64f)
                verticalLineTo(96f)
                close()
            }
        }.build()
        
        return _Prescription!!
    }

private var _Prescription: ImageVector? = null

