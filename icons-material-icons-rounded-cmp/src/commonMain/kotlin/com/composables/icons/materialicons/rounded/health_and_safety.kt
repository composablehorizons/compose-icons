package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Health_and_safety: ImageVector
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
                horizontalLineToRelative(-1f)
                curveTo(8.67f, 13f, 8f, 12.33f, 8f, 11.5f)
                verticalLineToRelative(0f)
                curveTo(8f, 10.67f, 8.67f, 10f, 9.5f, 10f)
                horizontalLineToRelative(1f)
                verticalLineTo(9f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(13f)
                close()
                moveTo(11.3f, 2.26f)
                lineToRelative(-6f, 2.25f)
                curveTo(4.52f, 4.81f, 4f, 5.55f, 4f, 6.39f)
                verticalLineToRelative(4.7f)
                curveToRelative(0f, 5.05f, 3.41f, 9.76f, 8f, 10.91f)
                curveToRelative(4.59f, -1.15f, 8f, -5.86f, 8f, -10.91f)
                verticalLineToRelative(-4.7f)
                curveToRelative(0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f)
                lineToRelative(-6f, -2.25f)
                curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f)
                close()
            }
        }.build()
        
        return _Health_and_safety!!
    }

private var _Health_and_safety: ImageVector? = null

