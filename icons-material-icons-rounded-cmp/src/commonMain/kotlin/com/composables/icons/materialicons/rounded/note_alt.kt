package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Note_alt: ImageVector
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
                    moveTo(19f, 3f)
                    horizontalLineToRelative(-4.18f)
                    curveTo(14.4f, 1.84f, 13.3f, 1f, 12f, 1f)
                    reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3f)
                    horizontalLineTo(5f)
                    curveTo(3.9f, 3f, 3f, 3.9f, 3f, 5f)
                    verticalLineToRelative(14f)
                    curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                    horizontalLineToRelative(14f)
                    curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                    verticalLineTo(5f)
                    curveTo(21f, 3.9f, 20.1f, 3f, 19f, 3f)
                    close()
                    moveTo(12f, 2.75f)
                    curveToRelative(0.41f, 0f, 0.75f, 0.34f, 0.75f, 0.75f)
                    reflectiveCurveTo(12.41f, 4.25f, 12f, 4.25f)
                    reflectiveCurveToRelative(-0.75f, -0.34f, -0.75f, -0.75f)
                    reflectiveCurveTo(11.59f, 2.75f, 12f, 2.75f)
                    close()
                    moveTo(8.9f, 17f)
                    horizontalLineTo(7.5f)
                    curveTo(7.22f, 17f, 7f, 16.78f, 7f, 16.5f)
                    verticalLineToRelative(-1.43f)
                    curveToRelative(0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f)
                    lineToRelative(5.81f, -5.81f)
                    lineToRelative(2.12f, 2.12f)
                    lineToRelative(-5.83f, 5.83f)
                    curveTo(9.16f, 16.95f, 9.03f, 17f, 8.9f, 17f)
                    close()
                    moveTo(16.85f, 9.27f)
                    lineToRelative(-1.06f, 1.06f)
                    lineToRelative(-2.12f, -2.12f)
                    lineToRelative(1.06f, -1.06f)
                    curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                    lineToRelative(1.41f, 1.41f)
                    curveTo(17.05f, 8.76f, 17.05f, 9.07f, 16.85f, 9.27f)
                    close()
                }
            }
        }.build()
        
        return _Note_alt!!
    }

private var _Note_alt: ImageVector? = null

