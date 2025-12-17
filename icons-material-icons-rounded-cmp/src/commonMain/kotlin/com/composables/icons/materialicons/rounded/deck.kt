package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Deck: ImageVector
    get() {
        if (_Deck != null) return _Deck!!
        
        _Deck = ImageVector.Builder(
            name = "deck",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
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
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.41f, 9f)
                        curveToRelative(0.49f, 0f, 0.69f, -0.63f, 0.29f, -0.91f)
                        lineTo(13.15f, 2.8f)
                        curveToRelative(-0.69f, -0.48f, -1.61f, -0.48f, -2.29f, 0f)
                        lineTo(3.3f, 8.09f)
                        curveTo(2.9f, 8.37f, 3.1f, 9f, 3.59f, 9f)
                        horizontalLineTo(11f)
                        verticalLineToRelative(12f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineTo(9f)
                        horizontalLineTo(20.41f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(8f, 16f)
                        horizontalLineTo(4.9f)
                        lineToRelative(-0.57f, -3.02f)
                        curveToRelative(-0.1f, -0.54f, -0.62f, -0.9f, -1.17f, -0.8f)
                        curveToRelative(-0.54f, 0.1f, -0.9f, 0.62f, -0.8f, 1.17f)
                        lineTo(3f, 16.74f)
                        verticalLineTo(21f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        horizontalLineToRelative(0.01f)
                        curveToRelative(0.55f, 0f, 1f, -0.44f, 1f, -0.99f)
                        lineTo(5.02f, 18f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(3f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-4f)
                        curveTo(9f, 16.45f, 8.55f, 16f, 8f, 16f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(20.84f, 12.18f)
                        curveToRelative(-0.54f, -0.1f, -1.06f, 0.26f, -1.17f, 0.8f)
                        lineTo(19.1f, 16f)
                        horizontalLineTo(16f)
                        curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                        verticalLineToRelative(4f)
                        curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                        reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-3f)
                        horizontalLineToRelative(1.98f)
                        lineToRelative(0.02f, 3.01f)
                        curveToRelative(0f, 0.55f, 0.45f, 0.99f, 1f, 0.99f)
                        horizontalLineTo(20f)
                        curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                        verticalLineToRelative(-4.26f)
                        lineToRelative(0.64f, -3.39f)
                        curveTo(21.74f, 12.81f, 21.38f, 12.28f, 20.84f, 12.18f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Deck!!
    }

private var _Deck: ImageVector? = null

