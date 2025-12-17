package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Data_exploration: ImageVector
    get() {
        if (_Data_exploration != null) return _Data_exploration!!
        
        _Data_exploration = ImageVector.Builder(
            name = "data_exploration",
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
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveToRelative(0f, 1.33f, 0.26f, 2.61f, 0.74f, 3.77f)
                lineTo(8f, 10.5f)
                lineToRelative(3.3f, 2.78f)
                lineTo(14.58f, 10f)
                horizontalLineTo(13f)
                verticalLineTo(8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1.58f)
                lineTo(11.41f, 16f)
                lineToRelative(-3.29f, -2.79f)
                lineToRelative(-4.4f, 4.4f)
                curveTo(5.52f, 20.26f, 8.56f, 22f, 12f, 22f)
                horizontalLineToRelative(10f)
                verticalLineTo(12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(19.5f, 20.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveTo(20.05f, 20.5f, 19.5f, 20.5f)
                close()
            }
        }.build()
        
        return _Data_exploration!!
    }

private var _Data_exploration: ImageVector? = null

