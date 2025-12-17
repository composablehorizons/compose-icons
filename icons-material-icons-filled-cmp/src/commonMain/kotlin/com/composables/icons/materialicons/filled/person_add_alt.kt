package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Person_add_alt: ImageVector
    get() {
        if (_Person_add_alt != null) return _Person_add_alt!!
        
        _Person_add_alt = ImageVector.Builder(
            name = "person_add_alt",
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
                    moveTo(13f, 8f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    reflectiveCurveTo(5f, 5.79f, 5f, 8f)
                    reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                    reflectiveCurveTo(13f, 10.21f, 13f, 8f)
                    close()
                    moveTo(11f, 8f)
                    curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                    reflectiveCurveTo(7f, 9.1f, 7f, 8f)
                    reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                    reflectiveCurveTo(11f, 6.9f, 11f, 8f)
                    close()
                    moveTo(1f, 18f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                    reflectiveCurveTo(1f, 15.34f, 1f, 18f)
                    close()
                    moveTo(3f, 18f)
                    curveToRelative(0.2f, -0.71f, 3.3f, -2f, 6f, -2f)
                    curveToRelative(2.69f, 0f, 5.78f, 1.28f, 6f, 2f)
                    horizontalLineTo(3f)
                    close()
                    moveTo(20f, 15f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(-3f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Person_add_alt!!
    }

private var _Person_add_alt: ImageVector? = null

