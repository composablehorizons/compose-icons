package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Other_houses: ImageVector
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
                moveTo(12f, 3f)
                lineTo(1f, 11.4f)
                lineToRelative(1.21f, 1.59f)
                lineTo(4f, 11.62f)
                verticalLineTo(21f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-9.38f)
                lineToRelative(1.79f, 1.36f)
                lineTo(23f, 11.4f)
                lineTo(12f, 3f)
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

