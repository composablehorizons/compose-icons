package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Rsvp: ImageVector
    get() {
        if (_Rsvp != null) return _Rsvp!!
        
        _Rsvp = ImageVector.Builder(
            name = "rsvp",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(16.54f, 9f)
                        lineTo(16.54f, 9f)
                        curveToRelative(0.48f, 0f, 0.83f, 0.46f, 0.69f, 0.92f)
                        lineToRelative(-1.27f, 4.36f)
                        curveTo(15.84f, 14.71f, 15.44f, 15f, 15f, 15f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.44f, 0f, -0.84f, -0.29f, -0.96f, -0.72f)
                        lineToRelative(-1.27f, -4.36f)
                        curveTo(12.63f, 9.46f, 12.98f, 9f, 13.46f, 9f)
                        horizontalLineToRelative(0f)
                        curveToRelative(0.32f, 0f, 0.6f, 0.21f, 0.69f, 0.52f)
                        lineTo(15f, 12.43f)
                        lineToRelative(0.85f, -2.91f)
                        curveTo(15.94f, 9.21f, 16.22f, 9f, 16.54f, 9f)
                        close()
                        moveTo(5.1f, 12.9f)
                        lineToRelative(0.49f, 1.14f)
                        curveTo(5.78f, 14.49f, 5.45f, 15f, 4.96f, 15f)
                        horizontalLineToRelative(0f)
                        curveToRelative(-0.28f, 0f, -0.53f, -0.17f, -0.63f, -0.42f)
                        lineTo(3.65f, 13f)
                        horizontalLineTo(2.5f)
                        verticalLineToRelative(1.31f)
                        curveTo(2.5f, 14.69f, 2.19f, 15f, 1.81f, 15f)
                        horizontalLineTo(1.69f)
                        curveTo(1.31f, 15f, 1f, 14.69f, 1f, 14.31f)
                        verticalLineTo(10f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(2.5f)
                        curveTo(5.33f, 9f, 6f, 9.67f, 6f, 10.5f)
                        verticalLineToRelative(1f)
                        curveTo(6f, 12.1f, 5.6f, 12.65f, 5.1f, 12.9f)
                        close()
                        moveTo(4.5f, 10.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(10.5f)
                        close()
                        moveTo(21.5f, 13f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1.25f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        lineToRelative(0f, 0f)
                        curveTo(18.34f, 15f, 18f, 14.66f, 18f, 14.25f)
                        verticalLineTo(10f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(2.5f)
                        curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                        verticalLineToRelative(1f)
                        curveTo(23f, 12.33f, 22.33f, 13f, 21.5f, 13f)
                        close()
                        moveTo(21.5f, 10.5f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(1f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(10.5f)
                        close()
                        moveTo(11.5f, 9.75f)
                        lineTo(11.5f, 9.75f)
                        curveToRelative(0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f)
                        horizontalLineTo(8.5f)
                        verticalLineToRelative(0.75f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(14f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(7.75f)
                        curveTo(7.34f, 15f, 7f, 14.66f, 7f, 14.25f)
                        verticalLineToRelative(0f)
                        curveToRelative(0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f)
                        horizontalLineTo(10f)
                        verticalLineToRelative(-0.75f)
                        horizontalLineTo(7.75f)
                        curveTo(7.34f, 12.75f, 7f, 12.41f, 7f, 12f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineToRelative(2.75f)
                        curveTo(11.16f, 9f, 11.5f, 9.34f, 11.5f, 9.75f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Rsvp!!
    }

private var _Rsvp: ImageVector? = null

