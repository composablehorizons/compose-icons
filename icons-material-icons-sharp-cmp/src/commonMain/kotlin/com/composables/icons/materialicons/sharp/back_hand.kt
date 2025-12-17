package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Back_hand: ImageVector
    get() {
        if (_Back_hand != null) return _Back_hand!!
        
        _Back_hand = ImageVector.Builder(
            name = "back_hand",
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
                moveTo(2.21f, 10.47f)
                lineTo(5f, 9.36f)
                lineTo(7.25f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(2f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(1f)
                verticalLineTo(0f)
                horizontalLineTo(14f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.5f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(12f)
                horizontalLineToRelative(1f)
                verticalLineTo(4.5f)
                horizontalLineTo(21f)
                verticalLineTo(16f)
                curveToRelative(0f, 4.42f, -3.58f, 8f, -8f, 8f)
                curveToRelative(-3.26f, 0f, -6.19f, -1.99f, -7.4f, -5.02f)
                lineTo(2.21f, 10.47f)
                close()
            }
        }.build()
        
        return _Back_hand!!
    }

private var _Back_hand: ImageVector? = null

