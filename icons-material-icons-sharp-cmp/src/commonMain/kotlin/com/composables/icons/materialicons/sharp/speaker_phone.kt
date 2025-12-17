package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Speaker_phone: ImageVector
    get() {
        if (_Speaker_phone != null) return _Speaker_phone!!
        
        _Speaker_phone = ImageVector.Builder(
            name = "speaker_phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7f, 7.07f)
                lineTo(8.43f, 8.5f)
                curveToRelative(0.91f, -0.91f, 2.18f, -1.48f, 3.57f, -1.48f)
                reflectiveCurveToRelative(2.66f, 0.57f, 3.57f, 1.48f)
                lineTo(17f, 7.07f)
                curveTo(15.72f, 5.79f, 13.95f, 5f, 12f, 5f)
                reflectiveCurveToRelative(-3.72f, 0.79f, -5f, 2.07f)
                close()
                moveTo(12f, 1f)
                curveTo(8.98f, 1f, 6.24f, 2.23f, 4.25f, 4.21f)
                lineToRelative(1.41f, 1.41f)
                curveTo(7.28f, 4f, 9.53f, 3f, 12f, 3f)
                reflectiveCurveToRelative(4.72f, 1f, 6.34f, 2.62f)
                lineToRelative(1.41f, -1.41f)
                curveTo(17.76f, 2.23f, 15.02f, 1f, 12f, 1f)
                close()
                moveToRelative(3.99f, 9.01f)
                lineTo(8f, 10f)
                verticalLineToRelative(11.99f)
                horizontalLineToRelative(7.99f)
                verticalLineTo(10.01f)
                close()
                moveTo(15f, 20f)
                horizontalLineTo(9f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(8f)
                close()
            }
        }.build()
        
        return _Speaker_phone!!
    }

private var _Speaker_phone: ImageVector? = null

