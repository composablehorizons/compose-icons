package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Hiking: ImageVector
    get() {
        if (_Hiking != null) return _Hiking!!
        
        _Hiking = ImageVector.Builder(
            name = "hiking",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 5.5f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveTo(12.4f, 5.5f, 13.5f, 5.5f)
                close()
                moveTo(17.5f, 10.78f)
                curveToRelative(-1.23f, -0.37f, -2.22f, -1.17f, -2.8f, -2.18f)
                lineToRelative(-1f, -1.6f)
                curveToRelative(-0.41f, -0.65f, -1.11f, -1f, -1.84f, -1f)
                curveToRelative(-0.78f, 0f, -1.59f, 0.5f, -1.78f, 1.44f)
                reflectiveCurveTo(7f, 23f, 7f, 23f)
                horizontalLineToRelative(2.1f)
                lineToRelative(1.8f, -8f)
                lineToRelative(2.1f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.5f)
                lineToRelative(-2.1f, -2f)
                lineToRelative(0.6f, -3f)
                curveToRelative(1f, 1.15f, 2.41f, 2.01f, 4f, 2.34f)
                verticalLineTo(23f)
                horizontalLineTo(19f)
                verticalLineTo(9f)
                horizontalLineToRelative(-1.5f)
                lineTo(17.5f, 10.78f)
                close()
                moveTo(7.43f, 13.13f)
                lineToRelative(-2.12f, -0.41f)
                curveToRelative(-0.54f, -0.11f, -0.9f, -0.63f, -0.79f, -1.17f)
                lineToRelative(0.76f, -3.93f)
                curveToRelative(0.21f, -1.08f, 1.26f, -1.79f, 2.34f, -1.58f)
                lineToRelative(1.16f, 0.23f)
                lineTo(7.43f, 13.13f)
                close()
            }
        }.build()
        
        return _Hiking!!
    }

private var _Hiking: ImageVector? = null

