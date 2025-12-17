package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Male: ImageVector
    get() {
        if (_Male != null) return _Male!!
        
        _Male = ImageVector.Builder(
            name = "male",
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
                moveTo(19f, 4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.58f)
                lineToRelative(-3.97f, 3.97f)
                curveTo(11.73f, 9.36f, 10.66f, 9f, 9.5f, 9f)
                curveTo(6.46f, 9f, 4f, 11.46f, 4f, 14.5f)
                curveTo(4f, 17.54f, 6.46f, 20f, 9.5f, 20f)
                reflectiveCurveToRelative(5.5f, -2.46f, 5.5f, -5.5f)
                curveToRelative(0f, -1.16f, -0.36f, -2.23f, -0.97f, -3.12f)
                lineTo(18f, 7.42f)
                verticalLineTo(9f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(5f)
                curveTo(20f, 4.45f, 19.55f, 4f, 19f, 4f)
                close()
                moveTo(9.5f, 18f)
                curveTo(7.57f, 18f, 6f, 16.43f, 6f, 14.5f)
                curveTo(6f, 12.57f, 7.57f, 11f, 9.5f, 11f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                curveTo(13f, 16.43f, 11.43f, 18f, 9.5f, 18f)
                close()
            }
        }.build()
        
        return _Male!!
    }

private var _Male: ImageVector? = null

