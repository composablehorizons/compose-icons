package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Note_alt: ImageVector
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
                        moveTo(19f, 19f)
                        horizontalLineTo(5f)
                        verticalLineTo(5f)
                        horizontalLineToRelative(14f)
                        verticalLineTo(19f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(15.08f, 11.03f)
                        lineTo(12.96f, 8.91f)
                        lineTo(7f, 14.86f)
                        lineTo(7f, 17f)
                        lineTo(9.1f, 17f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(16.85f, 9.27f)
                        curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                        lineToRelative(-1.41f, -1.41f)
                        curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                        lineToRelative(-1.06f, 1.06f)
                        lineToRelative(2.12f, 2.12f)
                        lineTo(16.85f, 9.27f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Note_alt!!
    }

private var _Note_alt: ImageVector? = null

