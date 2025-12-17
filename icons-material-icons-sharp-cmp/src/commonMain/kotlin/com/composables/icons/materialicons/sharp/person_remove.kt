package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Person_remove: ImageVector
    get() {
        if (_Person_remove != null) return _Person_remove!!
        
        _Person_remove = ImageVector.Builder(
            name = "person_remove",
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
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(14f, 8f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    reflectiveCurveTo(6f, 5.79f, 6f, 8f)
                    reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                    reflectiveCurveTo(14f, 10.21f, 14f, 8f)
                    close()
                    moveTo(17f, 10f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(6f)
                    verticalLineToRelative(-2f)
                    horizontalLineTo(17f)
                    close()
                    moveTo(2f, 18f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                    reflectiveCurveTo(2f, 15.34f, 2f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Person_remove!!
    }

private var _Person_remove: ImageVector? = null

