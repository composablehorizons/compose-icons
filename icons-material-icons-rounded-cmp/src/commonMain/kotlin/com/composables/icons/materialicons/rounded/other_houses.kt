package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Other_houses: ImageVector
    get() {
        if (_Other_houses != null) return _Other_houses!!
        
        _Other_houses = ImageVector.Builder(
            name = "other_houses",
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
                moveTo(1.61f, 12.19f)
                curveToRelative(0.34f, 0.44f, 0.96f, 0.52f, 1.4f, 0.19f)
                lineTo(4f, 11.62f)
                verticalLineTo(20f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(14f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8.38f)
                lineToRelative(0.99f, 0.76f)
                curveToRelative(0.44f, 0.34f, 1.07f, 0.25f, 1.4f, -0.19f)
                curveToRelative(0.34f, -0.44f, 0.25f, -1.07f, -0.19f, -1.4f)
                lineToRelative(-9.6f, -7.33f)
                curveToRelative(-0.36f, -0.27f, -0.86f, -0.27f, -1.21f, 0f)
                lineToRelative(-9.6f, 7.33f)
                curveTo(1.36f, 11.13f, 1.27f, 11.76f, 1.61f, 12.19f)
                close()
                moveTo(8f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(9f, 14.55f, 8.55f, 15f, 8f, 15f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(13f, 14.55f, 12.55f, 15f, 12f, 15f)
                close()
                moveTo(16f, 15f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveTo(17f, 14.55f, 16.55f, 15f, 16f, 15f)
                close()
            }
        }.build()
        
        return _Other_houses!!
    }

private var _Other_houses: ImageVector? = null

