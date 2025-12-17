package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Data_exploration: ImageVector
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
                reflectiveCurveToRelative(4.48f, 10f, 10f, 10f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-8f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-2.89f, 0f, -5.43f, -1.54f, -6.83f, -3.84f)
                lineToRelative(2.95f, -2.95f)
                lineTo(11.41f, 16f)
                lineTo(16f, 11.42f)
                verticalLineTo(13f)
                horizontalLineToRelative(2f)
                verticalLineTo(8f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.58f)
                lineToRelative(-3.28f, 3.28f)
                lineTo(8f, 10.5f)
                lineToRelative(-3.69f, 3.7f)
                curveTo(4.11f, 13.5f, 4f, 12.76f, 4f, 12f)
                curveToRelative(0f, -4.41f, 3.59f, -8f, 8f, -8f)
                reflectiveCurveToRelative(8f, 3.59f, 8f, 8f)
                reflectiveCurveTo(16.41f, 20f, 12f, 20f)
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

