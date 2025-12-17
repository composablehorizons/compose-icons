package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Live_help: ImageVector
    get() {
        if (_Live_help != null) return _Live_help!!
        
        _Live_help = ImageVector.Builder(
            name = "live_help",
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
                moveTo(5f, 18f)
                horizontalLineToRelative(4.83f)
                lineToRelative(0.59f, 0.59f)
                lineTo(12f, 20.17f)
                lineToRelative(1.59f, -1.59f)
                lineToRelative(0.58f, -0.58f)
                horizontalLineTo(19f)
                verticalLineTo(4f)
                horizontalLineTo(5f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(8f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(12f, 5f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                curveToRelative(0f, 2.5f, -3f, 2.75f, -3f, 5f)
                horizontalLineToRelative(-2f)
                curveToRelative(0f, -3.25f, 3f, -3f, 3f, -5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                horizontalLineTo(8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(21f, 4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineTo(5f)
                curveToRelative(-1.11f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.89f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                lineToRelative(3f, 3f)
                lineToRelative(3f, -3f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                close()
                moveToRelative(-2f, 14f)
                horizontalLineToRelative(-4.83f)
                lineToRelative(-0.59f, 0.59f)
                lineTo(12f, 20.17f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-0.58f, -0.58f)
                horizontalLineTo(5f)
                verticalLineTo(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(-8f, -3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(1f, -8f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                curveToRelative(0f, 2f, -3f, 1.75f, -3f, 5f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -2.25f, 3f, -2.5f, 3f, -5f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(8f, 6.79f, 8f, 9f)
                horizontalLineToRelative(2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
            }
        }.build()
        
        return _Live_help!!
    }

private var _Live_help: ImageVector? = null

