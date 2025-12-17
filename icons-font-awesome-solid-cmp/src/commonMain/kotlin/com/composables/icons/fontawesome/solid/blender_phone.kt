package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.BlenderPhone: ImageVector
    get() {
        if (_BlenderPhone != null) return _BlenderPhone!!
        
        _BlenderPhone = ImageVector.Builder(
            name = "blender-phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(392f, 64f)
                horizontalLineToRelative(166.54f)
                lineTo(576f, 0f)
                horizontalLineTo(192f)
                verticalLineToRelative(352f)
                horizontalLineToRelative(288f)
                lineToRelative(17.46f, -64f)
                horizontalLineTo(392f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(114.18f)
                lineToRelative(17.46f, -64f)
                horizontalLineTo(392f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineToRelative(-16f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                horizontalLineToRelative(140.36f)
                lineToRelative(17.46f, -64f)
                horizontalLineTo(392f)
                curveToRelative(-4.42f, 0f, -8f, -3.58f, -8f, -8f)
                verticalLineTo(72f)
                curveToRelative(0f, -4.42f, 3.58f, -8f, 8f, -8f)
                close()
                moveTo(158.8f, 335.01f)
                lineToRelative(-25.78f, -63.26f)
                curveToRelative(-2.78f, -6.81f, -9.8f, -10.99f, -17.24f, -10.26f)
                lineToRelative(-45.03f, 4.42f)
                curveToRelative(-17.28f, -46.94f, -17.65f, -99.78f, 0f, -147.72f)
                lineToRelative(45.03f, 4.42f)
                curveToRelative(7.43f, 0.73f, 14.46f, -3.46f, 17.24f, -10.26f)
                lineToRelative(25.78f, -63.26f)
                curveToRelative(3.02f, -7.39f, 0.2f, -15.85f, -6.68f, -20.07f)
                lineToRelative(-39.28f, -24.1f)
                curveTo(98.51f, -3.87f, 80.09f, -0.5f, 68.95f, 11.97f)
                curveToRelative(-92.57f, 103.6f, -92f, 259.55f, 2.1f, 362.49f)
                curveToRelative(9.87f, 10.8f, 29.12f, 12.48f, 41.65f, 4.8f)
                lineToRelative(39.41f, -24.18f)
                curveToRelative(6.89f, -4.22f, 9.7f, -12.67f, 6.69f, -20.07f)
                close()
                moveTo(480f, 384f)
                horizontalLineTo(192f)
                curveToRelative(-35.35f, 0f, -64f, 28.65f, -64f, 64f)
                verticalLineToRelative(32f)
                curveToRelative(0f, 17.67f, 14.33f, 32f, 32f, 32f)
                horizontalLineToRelative(352f)
                curveToRelative(17.67f, 0f, 32f, -14.33f, 32f, -32f)
                verticalLineToRelative(-32f)
                curveToRelative(0f, -35.35f, -28.65f, -64f, -64f, -64f)
                close()
                moveToRelative(-144f, 96f)
                curveToRelative(-17.67f, 0f, -32f, -14.33f, -32f, -32f)
                reflectiveCurveToRelative(14.33f, -32f, 32f, -32f)
                reflectiveCurveToRelative(32f, 14.33f, 32f, 32f)
                reflectiveCurveToRelative(-14.33f, 32f, -32f, 32f)
                close()
            }
        }.build()
        
        return _BlenderPhone!!
    }

private var _BlenderPhone: ImageVector? = null

