package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Sd_card: ImageVector
    get() {
        if (_Sd_card != null) return _Sd_card!!
        
        _Sd_card = ImageVector.Builder(
            name = "sd_card",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6f, 8.83f)
                verticalLineTo(20f)
                horizontalLineToRelative(12f)
                verticalLineTo(4f)
                horizontalLineToRelative(-7.17f)
                lineTo(6f, 8.83f)
                close()
                moveTo(15f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                close()
                moveToRelative(-3f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                close()
                moveToRelative(-1f, 4f)
                horizontalLineTo(9f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 2f)
                horizontalLineToRelative(-8f)
                lineTo(4f, 8f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(12f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 18f)
                horizontalLineTo(6f)
                verticalLineTo(8.83f)
                lineTo(10.83f, 4f)
                horizontalLineTo(18f)
                verticalLineToRelative(16f)
                close()
                moveTo(9f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineTo(9f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(3f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Sd_card!!
    }

private var _Sd_card: ImageVector? = null

