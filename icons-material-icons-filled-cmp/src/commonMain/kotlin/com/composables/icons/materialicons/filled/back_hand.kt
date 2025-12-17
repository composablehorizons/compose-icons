package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Back_hand: ImageVector
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
                moveTo(13f, 24f)
                curveToRelative(-3.26f, 0f, -6.19f, -1.99f, -7.4f, -5.02f)
                lineToRelative(-3.03f, -7.61f)
                curveTo(2.26f, 10.58f, 3f, 9.79f, 3.81f, 10.05f)
                lineToRelative(0.79f, 0.26f)
                curveToRelative(0.56f, 0.18f, 1.02f, 0.61f, 1.24f, 1.16f)
                lineTo(7.25f, 15f)
                horizontalLineTo(8f)
                verticalLineTo(3.25f)
                curveTo(8f, 2.56f, 8.56f, 2f, 9.25f, 2f)
                reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineTo(12f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.25f)
                curveTo(11.5f, 0.56f, 12.06f, 0f, 12.75f, 0f)
                reflectiveCurveTo(14f, 0.56f, 14f, 1.25f)
                verticalLineTo(12f)
                horizontalLineToRelative(1f)
                verticalLineTo(2.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                curveToRelative(0.69f, 0f, 1.25f, 0.56f, 1.25f, 1.25f)
                verticalLineTo(12f)
                horizontalLineToRelative(1f)
                verticalLineTo(5.75f)
                curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
                reflectiveCurveTo(21f, 5.06f, 21f, 5.75f)
                verticalLineTo(16f)
                curveTo(21f, 20.42f, 17.42f, 24f, 13f, 24f)
                close()
            }
        }.build()
        
        return _Back_hand!!
    }

private var _Back_hand: ImageVector? = null

