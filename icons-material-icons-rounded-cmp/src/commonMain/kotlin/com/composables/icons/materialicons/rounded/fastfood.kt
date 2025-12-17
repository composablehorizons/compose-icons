package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Fastfood: ImageVector
    get() {
        if (_Fastfood != null) return _Fastfood!!
        
        _Fastfood = ImageVector.Builder(
            name = "fastfood",
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
                moveTo(21.9f, 5f)
                horizontalLineTo(18f)
                verticalLineTo(2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.9f)
                curveToRelative(-0.59f, 0f, -1.05f, 0.51f, -1f, 1.1f)
                lineToRelative(0.12f, 1.21f)
                curveTo(14.9f, 8.16f, 18f, 10.77f, 18f, 15f)
                lineToRelative(0.02f, 8f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.84f, 0f, 1.53f, -0.65f, 1.63f, -1.47f)
                lineTo(22.89f, 6.1f)
                curveToRelative(0.06f, -0.59f, -0.4f, -1.1f, -0.99f, -1.1f)
                close()
                moveTo(15f, 21f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(2.1f, 15f)
                horizontalLineToRelative(12.8f)
                curveToRelative(0.62f, 0f, 1.11f, -0.56f, 0.99f, -1.16f)
                curveToRelative(-0.65f, -3.23f, -4.02f, -4.85f, -7.39f, -4.85f)
                reflectiveCurveToRelative(-6.73f, 1.62f, -7.39f, 4.85f)
                curveToRelative(-0.12f, 0.6f, 0.38f, 1.16f, 0.99f, 1.16f)
                close()
                moveTo(15f, 17f)
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Fastfood!!
    }

private var _Fastfood: ImageVector? = null

