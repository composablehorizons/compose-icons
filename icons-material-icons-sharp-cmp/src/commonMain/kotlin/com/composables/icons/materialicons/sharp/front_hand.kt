package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Front_hand: ImageVector
    get() {
        if (_Front_hand != null) return _Front_hand!!
        
        _Front_hand = ImageVector.Builder(
            name = "front_hand",
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
                moveTo(18.5f, 8f)
                verticalLineToRelative(7f)
                horizontalLineTo(18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -2.04f, 1.53f, -3.72f, 3.5f, -3.97f)
                verticalLineTo(2f)
                horizontalLineTo(15f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-1f)
                verticalLineTo(0f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1.5f)
                horizontalLineTo(8f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(4.5f)
                horizontalLineTo(4.5f)
                verticalLineToRelative(11.25f)
                curveToRelative(0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f)
                reflectiveCurveTo(21f, 20.31f, 21f, 15.75f)
                verticalLineTo(8f)
                horizontalLineTo(18.5f)
                close()
            }
        }.build()
        
        return _Front_hand!!
    }

private var _Front_hand: ImageVector? = null

