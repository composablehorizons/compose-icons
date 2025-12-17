package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Front_hand: ImageVector
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
                moveTo(19.75f, 8f)
                curveToRelative(-0.69f, 0f, -1.25f, 0.56f, -1.25f, 1.25f)
                verticalLineTo(15f)
                horizontalLineTo(18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, -2.04f, 1.53f, -3.72f, 3.5f, -3.97f)
                lineToRelative(0f, -10.78f)
                curveTo(17.5f, 2.56f, 16.94f, 2f, 16.25f, 2f)
                curveTo(15.56f, 2f, 15f, 2.56f, 15f, 3.25f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1f)
                verticalLineTo(1.25f)
                curveTo(14f, 0.56f, 13.44f, 0f, 12.75f, 0f)
                reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f)
                verticalLineTo(11f)
                horizontalLineToRelative(-1f)
                verticalLineTo(2.75f)
                curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
                reflectiveCurveTo(8f, 2.06f, 8f, 2.75f)
                verticalLineTo(12f)
                horizontalLineTo(7f)
                verticalLineTo(5.75f)
                curveTo(7f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f)
                reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineToRelative(10f)
                curveToRelative(0f, 4.56f, 3.69f, 8.25f, 8.25f, 8.25f)
                reflectiveCurveTo(21f, 20.31f, 21f, 15.75f)
                verticalLineToRelative(-6.5f)
                curveTo(21f, 8.56f, 20.44f, 8f, 19.75f, 8f)
                close()
            }
        }.build()
        
        return _Front_hand!!
    }

private var _Front_hand: ImageVector? = null

