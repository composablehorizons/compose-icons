package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Fastfood: ImageVector
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
                moveTo(1f, 21.98f)
                curveToRelative(0f, 0.56f, 0.45f, 1.01f, 1.01f, 1.01f)
                horizontalLineTo(15f)
                curveToRelative(0.56f, 0f, 1.01f, -0.45f, 1.01f, -1.01f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineToRelative(0.98f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 10.99f)
                curveToRelative(-1.42f, 0f, -3.77f, 0.46f, -4.88f, 2.01f)
                horizontalLineToRelative(9.77f)
                curveToRelative(-1.12f, -1.55f, -3.47f, -2.01f, -4.89f, -2.01f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.5f, 8.99f)
                curveTo(4.75f, 8.99f, 1f, 11f, 1f, 15f)
                horizontalLineToRelative(15f)
                curveToRelative(0f, -4f, -3.75f, -6.01f, -7.5f, -6.01f)
                close()
                moveTo(3.62f, 13f)
                curveToRelative(1.11f, -1.55f, 3.47f, -2.01f, 4.88f, -2.01f)
                reflectiveCurveToRelative(3.77f, 0.46f, 4.88f, 2.01f)
                horizontalLineTo(3.62f)
                close()
                moveTo(1f, 17f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                horizontalLineTo(1f)
                close()
                moveTo(18f, 5f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                lineToRelative(0.23f, 2f)
                horizontalLineToRelative(9.56f)
                lineToRelative(-1.4f, 14f)
                horizontalLineTo(18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.72f)
                curveToRelative(0.84f, 0f, 1.53f, -0.65f, 1.63f, -1.47f)
                lineTo(23f, 5f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.build()
        
        return _Fastfood!!
    }

private var _Fastfood: ImageVector? = null

