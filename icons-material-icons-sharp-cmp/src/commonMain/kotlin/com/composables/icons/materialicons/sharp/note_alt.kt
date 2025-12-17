package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Note_alt: ImageVector
    get() {
        if (_Note_alt != null) return _Note_alt!!
        
        _Note_alt = ImageVector.Builder(
            name = "note_alt",
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
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(21f, 3f)
                    horizontalLineToRelative(-6.18f)
                    curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                    reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                    horizontalLineTo(3f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(18f)
                    verticalLineTo(3f)
                    close()
                    moveTo(12f, 2.75f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    reflectiveCurveTo(12.41f, 4.25f, 12f, 4.25f)
                    reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(11.59f, 2.75f, 12f, 2.75f)
                    close()
                    moveTo(9.1f, 17f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-2.14f)
                    lineToRelative(5.96f, -5.96f)
                    lineToRelative(2.12f, 2.12f)
                    lineTo(9.1f, 17f)
                    close()
                    moveTo(17.2f, 8.91f)
                    lineToRelative(-1.41f, 1.41f)
                    lineTo(13.66f, 8.2f)
                    lineToRelative(1.41f, -1.41f)
                    lineTo(17.2f, 8.91f)
                    close()
                }
            }
        }.build()
        
        return _Note_alt!!
    }

private var _Note_alt: ImageVector? = null

