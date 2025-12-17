package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Food_bank: ImageVector
    get() {
        if (_Food_bank != null) return _Food_bank!!
        
        _Food_bank = ImageVector.Builder(
            name = "food_bank",
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
                moveTo(10.8f, 3.9f)
                lineToRelative(-6f, 4.5f)
                curveTo(4.3f, 8.78f, 4f, 9.37f, 4f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-9f)
                curveToRelative(0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f)
                lineToRelative(-6f, -4.5f)
                curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f)
                close()
                moveTo(12.5f, 12.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineTo(14f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(10f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineTo(10f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(0f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineTo(12.5f)
                close()
                moveTo(14.5f, 18f)
                lineTo(14.5f, 18f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.88f, 0.57f, -1.63f, 1.36f, -1.89f)
                curveTo(14.67f, 9.5f, 15f, 9.75f, 15f, 10.09f)
                verticalLineToRelative(7.41f)
                curveTo(15f, 17.78f, 14.78f, 18f, 14.5f, 18f)
                close()
            }
        }.build()
        
        return _Food_bank!!
    }

private var _Food_bank: ImageVector? = null

