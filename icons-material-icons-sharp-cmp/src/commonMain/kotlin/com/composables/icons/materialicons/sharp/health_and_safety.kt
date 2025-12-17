package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Health_and_safety: ImageVector
    get() {
        if (_Health_and_safety != null) return _Health_and_safety!!
        
        _Health_and_safety = ImageVector.Builder(
            name = "health_and_safety",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.5f, 13f)
                horizontalLineTo(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(7.5f)
                horizontalLineToRelative(3f)
                verticalLineTo(10f)
                horizontalLineTo(16f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-3f)
                verticalLineTo(13f)
                close()
                moveTo(12f, 2f)
                lineTo(4f, 5f)
                verticalLineToRelative(6.09f)
                curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                verticalLineTo(5f)
                lineTo(12f, 2f)
                close()
            }
        }.build()
        
        return _Health_and_safety!!
    }

private var _Health_and_safety: ImageVector? = null

