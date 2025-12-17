package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Person_add_alt_1: ImageVector
    get() {
        if (_Person_add_alt_1 != null) return _Person_add_alt_1!!
        
        _Person_add_alt_1 = ImageVector.Builder(
            name = "person_add_alt_1",
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
                    moveTo(15f, 10f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(3f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-3f)
                    horizontalLineToRelative(3f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(-3f)
                    verticalLineTo(7f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(3f)
                    horizontalLineTo(15f)
                    close()
                    moveTo(1f, 18f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2f)
                    curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                    reflectiveCurveTo(1f, 15.34f, 1f, 18f)
                    close()
                }
            }
        }.build()
        
        return _Person_add_alt_1!!
    }

private var _Person_add_alt_1: ImageVector? = null

