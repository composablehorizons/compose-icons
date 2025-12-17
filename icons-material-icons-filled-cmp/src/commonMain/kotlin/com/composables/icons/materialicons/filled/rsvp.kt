package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Rsvp: ImageVector
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
                        moveTo(16f, 9f)
                        horizontalLineToRelative(1.5f)
                        lineToRelative(-1.75f, 6f)
                        horizontalLineToRelative(-1.5f)
                        lineTo(12.5f, 9f)
                        horizontalLineTo(14f)
                        lineToRelative(1f, 3.43f)
                        lineTo(16f, 9f)
                        close()
                        moveTo(5.1f, 12.9f)
                        lineTo(6f, 15f)
                        horizontalLineTo(4.5f)
                        lineToRelative(-0.85f, -2f)
                        horizontalLineTo(2.5f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(1f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(3.5f)
                        curveTo(5.35f, 9f, 6f, 9.65f, 6f, 10.5f)
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
                        verticalLineToRelative(2f)
                        horizontalLineTo(18f)
                        verticalLineTo(9f)
                        horizontalLineToRelative(3.5f)
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
                        moveTo(11.5f, 9f)
                        verticalLineToRelative(1.5f)
                        horizontalLineToRelative(-3f)
                        verticalLineToRelative(0.75f)
                        horizontalLineToRelative(2f)
                        curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                        verticalLineTo(14f)
                        curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                        horizontalLineTo(7f)
                        verticalLineToRelative(-1.5f)
                        horizontalLineToRelative(3f)
                        verticalLineToRelative(-0.75f)
                        horizontalLineTo(7.75f)
                        curveTo(7.34f, 12.75f, 7f, 12.41f, 7f, 12f)
                        verticalLineToRelative(-2f)
                        curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                        horizontalLineTo(11.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Rsvp!!
    }

private var _Rsvp: ImageVector? = null

