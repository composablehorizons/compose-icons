package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Water_damage: ImageVector
    get() {
        if (_Water_damage != null) return _Water_damage!!
        
        _Water_damage = ImageVector.Builder(
            name = "water_damage",
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
                moveTo(11.33f, 3.6f)
                lineToRelative(-8.36f, 7.53f)
                curveTo(2.63f, 11.43f, 2.84f, 12f, 3.3f, 12f)
                horizontalLineTo(5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(12f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(1.7f)
                curveToRelative(0.46f, 0f, 0.68f, -0.57f, 0.33f, -0.87f)
                lineTo(12.67f, 3.6f)
                curveTo(12.29f, 3.26f, 11.71f, 3.26f, 11.33f, 3.6f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.78f, 0.99f, -2.44f, 1.58f, -3.36f)
                curveToRelative(0.2f, -0.31f, 0.64f, -0.31f, 0.84f, 0f)
                curveTo(13.01f, 11.56f, 14f, 13.22f, 14f, 14f)
                curveTo(14f, 15.1f, 13.1f, 16f, 12f, 16f)
                close()
            }
        }.build()
        
        return _Water_damage!!
    }

private var _Water_damage: ImageVector? = null

