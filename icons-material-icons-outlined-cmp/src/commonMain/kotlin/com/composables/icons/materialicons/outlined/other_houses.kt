package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Other_houses: ImageVector
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
                moveTo(18f, 19f)
                horizontalLineTo(6f)
                verticalLineToRelative(-8.9f)
                lineToRelative(6f, -4.58f)
                lineToRelative(6f, 4.58f)
                verticalLineTo(19f)
                close()
                moveTo(9f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveTo(9f, 13.45f, 9f, 14f)
                close()
                moveTo(12f, 13f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveTo(11f, 13.45f, 11.45f, 13f, 12f, 13f)
                close()
                moveTo(15f, 14f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveTo(15f, 14.55f, 15f, 14f)
                close()
            }
        }.build()
        
        return _Other_houses!!
    }

private var _Other_houses: ImageVector? = null

