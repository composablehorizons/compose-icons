package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Person_add_alt: ImageVector
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
                    moveTo(15.39f, 14.56f)
                    curveTo(13.71f, 13.7f, 11.53f, 13f, 9f, 13f)
                    curveToRelative(-2.53f, 0f, -4.71f, 0.7f, -6.39f, 1.56f)
                    curveTo(1.61f, 15.07f, 1f, 16.1f, 1f, 17.22f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-2.78f)
                    curveTo(17f, 16.1f, 16.39f, 15.07f, 15.39f, 14.56f)
                    close()
                    moveTo(9f, 12f)
                    curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                    curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                    reflectiveCurveTo(5f, 5.79f, 5f, 8f)
                    curveTo(5f, 10.21f, 6.79f, 12f, 9f, 12f)
                    close()
                    moveTo(20f, 9f)
                    verticalLineTo(7f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(2f)
                    horizontalLineToRelative(-2f)
                    curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(2f)
                    curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                    horizontalLineToRelative(0f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(-2f)
                    horizontalLineToRelative(2f)
                    curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                    verticalLineToRelative(0f)
                    curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                    horizontalLineTo(20f)
                    close()
                }
            }
        }.build()
        
        return _Person_add_alt!!
    }

private var _Person_add_alt: ImageVector? = null

