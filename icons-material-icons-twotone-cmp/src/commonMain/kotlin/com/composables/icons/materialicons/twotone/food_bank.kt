package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Food_bank: ImageVector
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
                moveTo(12f, 5.5f)
                lineToRelative(6f, 4.5f)
                verticalLineToRelative(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(-9f)
                lineTo(12f, 5.5f)
                moveTo(11.5f, 9.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                horizontalLineTo(11.5f)
                close()
                moveTo(13f, 11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineTo(18f)
                horizontalLineToRelative(1f)
                verticalLineTo(9.5f)
                curveTo(13.9f, 9.5f, 13f, 10.4f, 13f, 11.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 5.5f)
                lineToRelative(6f, 4.5f)
                verticalLineToRelative(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(-9f)
                lineTo(12f, 5.5f)
                moveTo(12f, 3f)
                lineTo(4f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(16f)
                verticalLineTo(9f)
                lineTo(12f, 3f)
                lineTo(12f, 3f)
                close()
                moveTo(11.5f, 9.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                horizontalLineTo(9.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-3f)
                horizontalLineTo(11.5f)
                close()
                moveTo(13f, 11.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineTo(18f)
                horizontalLineToRelative(1f)
                verticalLineTo(9.5f)
                curveTo(13.9f, 9.5f, 13f, 10.4f, 13f, 11.5f)
                close()
            }
        }.build()
        
        return _Food_bank!!
    }

private var _Food_bank: ImageVector? = null

